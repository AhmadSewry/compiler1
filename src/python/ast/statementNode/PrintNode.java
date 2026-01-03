package python.ast.statementNode;

import python.ast.ExpressionNode;
import python.ast.StatementNode;

public class PrintNode extends StatementNode {

    private final ExpressionNode expression;

    public PrintNode(ExpressionNode expression, int line, int column) {
        super(line, column);  // مهم ل StatementNode
        this.expression = expression;
    }

    @Override
    public void printTree(String indent, boolean isLast) {
        System.out.print(indent);
        System.out.println((isLast ? "└─ " : "├─ ") + "Print");

        String childIndent = indent + (isLast ? "   " : "│  ");
        expression.printTree(childIndent, true);
    }
}
