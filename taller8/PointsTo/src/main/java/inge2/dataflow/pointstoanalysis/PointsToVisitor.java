package inge2.dataflow.pointstoanalysis;

import soot.jimple.*;
import soot.jimple.internal.JInstanceFieldRef;
import soot.jimple.internal.JimpleLocal;

import java.util.HashSet;
import java.util.Set;

public class PointsToVisitor extends AbstractStmtSwitch<Void> {

    private final PointsToGraph pointsToGraph;

    public PointsToVisitor(PointsToGraph pointsToGraph) {
        this.pointsToGraph = pointsToGraph;
    }

    @Override
    public void caseAssignStmt(AssignStmt stmt) {
        boolean isLeftLocal = stmt.getLeftOp() instanceof JimpleLocal;
        boolean isRightLocal = stmt.getRightOp() instanceof JimpleLocal;

        boolean isLeftField = stmt.getLeftOp() instanceof JInstanceFieldRef;
        boolean isRightField = stmt.getRightOp() instanceof JInstanceFieldRef;

        boolean isRightNew = stmt.getRightOp() instanceof AnyNewExpr;

        if (isRightNew) { // x = new A()
            processAssignToNewObject(stmt);
        } else if (isLeftLocal && isRightLocal) { // x = y
            processAssignLocalToLocal(stmt);
        } else if (isLeftField && isRightLocal) { // x.f = y
            processAssignLocalToField(stmt);
        } else if (isLeftLocal && isRightField) { // x = y.f
            processAssignFieldToLocal(stmt);
        }
    }

    private void processAssignToNewObject(AssignStmt stmt) {
        //al asignar una variable a un objeto nuevo, tenemos que agregar el nodo al grafo de ser necesario, y mapear la variable a dicho nodo.
        //eso lo podemos hacer con el método setNodesForVariable.
        String leftVariableName = stmt.getLeftOp().toString();
        String nodeName = pointsToGraph.getNodeName(stmt);

        Set<String> nodesToAssignTo = new HashSet<String>();
        nodesToAssignTo.add(nodeName);

        pointsToGraph.setNodesForVariable(leftVariableName, nodesToAssignTo);
    }

    private void processAssignLocalToLocal(AssignStmt stmt) {
        //al asignar una variable local a otra, debemos mapear a la variable de la izquierda todos los nodos a los que mapea la variable de la derecha.
        String leftVariableName = stmt.getLeftOp().toString();
        String rightVariableName = stmt.getRightOp().toString();

        pointsToGraph.setNodesForVariable(leftVariableName, pointsToGraph.getNodesForVariable(rightVariableName));
    }

    private void processAssignLocalToField(AssignStmt stmt) { //x.f = y
        //al asignar una variable local a un campo, debemos ir a cada nodo a los que mapea la variable de la izquierda (x), y asegurar que por medio de f vayan
        // a cada uno de los nodos a los que mapea la variable de la derecha (y).

        //para ello usamos addEdge, que permite agregar un eje con field fieldName desde cada nodo a los que mapea x y hacia cada nodo a los que mapea y.
        JInstanceFieldRef leftFieldRef = (JInstanceFieldRef) stmt.getLeftOp();
        String leftVariableName = leftFieldRef.getBase().toString();
        String fieldName = leftFieldRef.getField().getName();
        String rightVariableName = stmt.getRightOp().toString();

        for (String nodeX : pointsToGraph.getNodesForVariable(leftVariableName)){
            for (String nodeY : pointsToGraph.getNodesForVariable(rightVariableName))
                pointsToGraph.addEdge(nodeX, fieldName, nodeY);
        }
    }

    private void processAssignFieldToLocal(AssignStmt stmt) { //x = y.f
        //acá tenemos que mapear a x todos los nodos a los que podemos llegar por f, desde cada nodo a los que mapea y.

        //recorremos los nodos a los que mapea y, obtenemos aquellos a los que podemos ir por f, y la unión de todos esos es a donde mapeará x.
        String leftVariableName = stmt.getLeftOp().toString();
        JInstanceFieldRef rightFieldRef = (JInstanceFieldRef) stmt.getRightOp();
        String rightVariableName = rightFieldRef.getBase().toString();
        String fieldName = rightFieldRef.getField().getName();

        Set<String> nodesForLeftVarName = new HashSet<String>();
        for (String nodeY : pointsToGraph.getNodesForVariable(rightVariableName)){
            Set<String> reachableNodesFromRightVar = pointsToGraph.getReachableNodesByField(nodeY, fieldName);
            nodesForLeftVarName.addAll(reachableNodesFromRightVar);
        }
        pointsToGraph.setNodesForVariable(leftVariableName, nodesForLeftVarName);
    }
}
