package python.ast.statementNode;

import python.ast.ExpressionNode;
import python.ast.StatementNode;

public class ExprStatementNode extends StatementNode {

    private final ExpressionNode expression;

    public ExprStatementNode(
            ExpressionNode expression,
            int line,
            int column
    ) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public void printTree(String indent, boolean last) {
        System.out.print(indent);
        System.out.print(last ? "└─ " : "├─ ");
        System.out.println("ExprStatement");

        expression.printTree(
                indent + (last ? "   " : "│  "),
                true
        );
    }
}
