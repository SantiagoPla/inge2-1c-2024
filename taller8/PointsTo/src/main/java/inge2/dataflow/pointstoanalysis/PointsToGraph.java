package inge2.dataflow.pointstoanalysis;

import soot.Unit;
import soot.jimple.AssignStmt;
import soot.tagkit.LineNumberTag;

import java.util.*;

public class PointsToGraph {

    /**
     * Nodos del grafo.
     *
     * Cada nodo representa todos los objetos creados por cada sentencia "new".
     * Es decir, tenemos un nodo por cada "new" en el programa.
     */
    public Set<String> nodes;

    /**
     * Ejes del grafo.
     *
     * Un eje (n1, f, n2) indica que el los objetos representados por el nodo n1 tienen un campo f que apunta al/los
     * objetos representados por n2.
     */
    public Set<Axis> axis;

    /**
     * Mapping de variables locales a nodos.
     * Representa el conjunto de objetos a los que puede apuntar una variable local.
     */
    public Map<String, Set<String>> mapping;

    public PointsToGraph(){
        nodes = new HashSet<>();
        axis = new HashSet<>();
        mapping = new HashMap<>();
    }

    public void clear() {
        nodes.clear();
        axis.clear();
        mapping.clear();
    }

    /**
     * Devuelve el nombre del nodo correspondiente a la sentencia <code>stmt</code>.
     * @param stmt
     * @return
     */
    public String getNodeName(AssignStmt stmt) {
        LineNumberTag lineNumberTag = (LineNumberTag) stmt.getTag("LineNumberTag");
        return String.valueOf(lineNumberTag.getLineNumber());
    }

    /**
     * Devuelve el conjunto de nodos a los que apunta la variable <code>variableName</code>.
     * @param variableName
     * @return
     */
    public Set<String> getNodesForVariable(String variableName) {
        //mapping representa la funcion que asocia variables a nodos. Lo usamos para encontrar el nodo correspondiente.
        return mapping.get(variableName);
    }

    /**
     * Setea el conjunto de nodos a los que apunta la variable <code>variableName</code>.
     * @param variableName
     * @param nodes
     */
    public void setNodesForVariable(String variableName, Set<String> nodes) {
        //agregamos los nodos pasados por parámetros a los nodos del grafo, por si no llegasen a estar.
        this.nodes.addAll(nodes);
        //le asociamos los nodos pasados por parámetro a la variable, mediante mapping.
        mapping.put(variableName, nodes);
    }

    /**
     * Agrega un eje al grafo.
     * @param leftNode
     * @param fieldName
     * @param rightNode
     */
    public void addEdge(String leftNode, String fieldName, String rightNode) {
        //agregamos el eje nuevo a axis.
        axis.add(new Axis(leftNode, fieldName, rightNode));
    }

    /**
     * Devuelve el conjunto de nodos alcanzables desde el nodo <code>node</code> por el campo <code>fieldName</code>.
     * @param node
     * @param fieldName
     * @return
     */
    public Set<String> getReachableNodesByField(String node, String fieldName) {
        //recorremos los ejes, quedándonos con el nodo derecho de aquellos tal que el nodo izquierdo y el fieldName coinciden con los pasados por parámetro.
        Set<String> reachableNodesByField = new HashSet<String>();
        for (Axis a : axis)
            if (Objects.equals(a.fieldName, fieldName) && Objects.equals(a.leftNode, node))
                reachableNodesByField.add(a.rightNode);
        return reachableNodesByField;
    }

    /**
     * Devuelve el conjunto de nodos alcanzables desde los nodos asociados variableName por el campo <code>fieldName</code>.
     * @param variableName
     * @param fieldName
     * @return
     */
    public Set<String> getReachableNodesByFieldFromVariable(String variableName, String fieldName){
        // recorremos los nodos a los que se mapea la variable, y por cada uno agregamos los nodos a los que podemos llegar con el fieldName.
        Set<String> mappingNodes = getNodesForVariable(variableName);
        Set<String> result = new HashSet<String>();
        for (String node : mappingNodes)
            result.addAll(getReachableNodesByField(node, fieldName));
        return result;
    }



    /**
     * Copia de un grafo (modifica el this).
     * @param in
     */
    public void copy(PointsToGraph in) {
        this.clear();
        in.putAll(this);
    }

    /**
     * Union de dos grafos (modifica el this).
     * this = this U in
     * @param in el grafo a unir
     */
    public void union(PointsToGraph in) {
        // unimos los nodos y los axis.
        nodes.addAll(in.nodes);
        axis.addAll(in.axis);

        //para los mappings, tenemos que agregar los mapeos de variables nuevas, y unir aquellos que ya están en el grafo.
        Set<String> inKeys = in.mapping.keySet();
        for (String k : inKeys){
            Set<String> kInValue = in.mapping.get(k);
            if (!(mapping.containsKey(k)))
                mapping.put(k, kInValue);
            else
                //referencia
                mapping.get(k).addAll(kInValue);
        }
    }

    /**
     * Metodo privado para agregar toda la información de este grafo al grafo dst.
     * @param dst el grafo destino.
     */
    private void putAll(PointsToGraph dst) {
        //para agregar tooda la info de este grafo a dst simplemente hacemos la unión, pero partiendo de dst.
        dst.union(this);
    }
}
