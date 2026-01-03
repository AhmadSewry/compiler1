package python.ast.statementNode;

import python.ast.ExpressionNode;
import python.ast.StatementNode;
import java.util.List;

public abstract class IfStatementNode extends StatementNode {

    private final ExpressionNode condition;
    private final List<StatementNode> thenBody;
    private final List<StatementNode> elseBody;

    public IfStatementNode(ExpressionNode condition, List<StatementNode> thenBody, List<StatementNode> elseBody, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.thenBody = thenBody;
        this.elseBody = elseBody;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public List<StatementNode> getThenBody() {
        return thenBody;
    }

    public List<StatementNode> getElseBody() {
        return elseBody;
    }

    @Override
    public void printTree(String indent, boolean last) {
        System.out.print(indent);
        System.out.print(last ? "└─ " : "├─ ");
        System.out.println("If");

        condition.printTree(indent + (last ? "   " : "│  "), true);

        System.out.println(indent + (last ? "   " : "│  ") + "Then:");
        for (int i = 0; i < thenBody.size(); i++) {
            thenBody.get(i).printTree(indent + (last ? "   " : "│  ") + "  ", i == thenBody.size() - 1);
        }

        if (elseBody != null) {
            System.out.println(indent + (last ? "   " : "│  ") + "Else:");
            for (int i = 0; i < elseBody.size(); i++) {
                elseBody.get(i).printTree(indent + (last ? "   " : "│  ") + "  ", i == elseBody.size() - 1);
            }
        }
    }
}
