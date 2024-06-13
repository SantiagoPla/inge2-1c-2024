package inge2.dataflow.pointstoanalysis;

import soot.Unit;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.ForwardFlowAnalysis;

import java.util.HashSet;
import java.util.Set;

public class PointsToAnalysis extends ForwardFlowAnalysis<Unit, PointsToGraph> {

    private PointsToGraph lastPointsToGraph;

    public PointsToAnalysis(UnitGraph graph) {
        super(graph);
        doAnalysis();
    }

    public PointsToGraph getLastPointsToGraph() {
        return lastPointsToGraph;
    }

    /**
     * This method is called for each unit in the control flow graph.
     * @param in the input flow
     * @param unit the current node
     * @param out the returned flow
     */
    @Override
    protected void flowThrough(PointsToGraph in, Unit unit, PointsToGraph out) {
        out.copy(in);

        PointsToVisitor visitor = new PointsToVisitor(out);
        unit.apply(visitor);

        this.lastPointsToGraph = out;
    }

    @Override
    protected PointsToGraph newInitialFlow() {
        return new PointsToGraph();
    }

    /**
     * This method merges the two input flows into a single output flow.
     * @param input1 the first input flow
     * @param input2 the second input flow
     * @param output the returned flow
     */
    @Override
    protected void merge(PointsToGraph input1, PointsToGraph input2, PointsToGraph output) {
        output.copy(input1);
        output.union(input2);
    }

    @Override
    protected void copy(PointsToGraph source, PointsToGraph dest) {
        dest.copy(source);
    }

    /**
     * Este método retorna true si alguno de los objetos apuntados por leftVariableName y rightVariableName coinciden.
     * @param leftVariableName
     * @param rightVariableName
     * @return
     */
    public boolean mayAlias(String leftVariableName, String rightVariableName) {
        //para ver si las dos variables apuntan a algun mismo objeto, simplemente obtenemos los nodos a los que llegamos por cada uno y vemos si la
        //intersección de esos conjuntos es nula o no.
        Set<String>  intersection = new HashSet<String>(lastPointsToGraph.getNodesForVariable(leftVariableName));
        intersection.retainAll(lastPointsToGraph.getNodesForVariable(rightVariableName));

        return !intersection.isEmpty();

    }

    /**
     * Este método retorna true si alguno de los objetos apuntados por leftVariableName.fieldName y rightVariableName coinciden.
     * @param leftVariableName
     * @param fieldName
     * @param rightVariableName
     * @return
     */
    public boolean mayAlias(String leftVariableName, String fieldName, String rightVariableName) {
        //para ver si x e y apuntan por f a algún mismo objeto, obtenemos todos los nodos a los que podemos llegar desde la variable x por medio de f.
        //esto es, todos los nodos a los que podemos ir con la variable, y de allí ver todos los nodos a los que llegamos por f.
        //si la intersección no es nula, hay alias.
        Set<String>  intersection = new HashSet<String>(lastPointsToGraph.getReachableNodesByFieldFromVariable(leftVariableName, fieldName));
        intersection.retainAll(lastPointsToGraph.getNodesForVariable(rightVariableName));

        return !intersection.isEmpty();
    }
}
