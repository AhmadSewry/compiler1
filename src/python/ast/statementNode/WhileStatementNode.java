package python.ast.statementNode;

import python.ast.ExpressionNode;
import python.ast.StatementNode;
import java.util.List;

public class WhileStatementNode extends StatementNode {

    private final ExpressionNode condition;
    public final List<StatementNode> body;

    public WhileStatementNode(ExpressionNode condition, List<StatementNode> body, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    @Override
    public void printTree(String indent, boolean last) {
        System.out.print(indent);
        System.out.print(last ? "└─ " : "├─ ");
        System.out.println("WhileStatement");

        indent += last ? "   " : "│  ";
        System.out.println(indent + "├─ Condition");
        condition.printTree(indent + "│  ", false);

        System.out.println(indent + "└─ Body");
        for (int i = 0; i < body.size(); i++) {
            body.get(i).printTree(indent + "   ", i == body.size() - 1);
        }
    }
}
