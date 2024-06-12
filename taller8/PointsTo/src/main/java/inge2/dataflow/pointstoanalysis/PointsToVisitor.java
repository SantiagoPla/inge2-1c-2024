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
        String leftVariableName = stmt.getLeftOp().toString();
        String nodeName = pointsToGraph.getNodeName(stmt);

        Set<String> nodesToAssignTo = new HashSet<String>();
        nodesToAssignTo.add(nodeName);

        pointsToGraph.setNodesForVariable(leftVariableName, nodesToAssignTo);
    }

    private void processAssignLocalToLocal(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        String rightVariableName = stmt.getRightOp().toString();

        pointsToGraph.setNodesForVariable(leftVariableName, pointsToGraph.getNodesForVariable(rightVariableName));
    }

    private void processAssignLocalToField(AssignStmt stmt) { //x.f = y
        //ir a los nodos a los que mapea x, y agregarle c/uno axis por f, hacia todos los nodos que mapea y.
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
