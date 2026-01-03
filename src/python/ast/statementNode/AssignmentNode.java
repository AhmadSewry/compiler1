package python.ast.statementNode;

import python.ast.ExpressionNode;
import python.ast.expressions.IdentifierNode;
import python.ast.StatementNode;

public class AssignmentNode extends StatementNode {

    private final IdentifierNode identifier;
    private final ExpressionNode expression;

    // تمرير line و column للـ StatementNode
    public AssignmentNode(IdentifierNode identifier, ExpressionNode expression, int line, int column) {
        super(line, column);  // استدعاء constructor الأب
        this.identifier = identifier;
        this.expression = expression;
    }

    public IdentifierNode getIdentifier() {
        return identifier;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public void printTree(String indent, boolean isLast) {
        System.out.print(indent);
        System.out.println((isLast ? "└─ " : "├─ ") + "Assignment");

        String childIndent = indent + (isLast ? "   " : "│  ");
        identifier.printTree(childIndent, false);
        expression.printTree(childIndent, true);
    }
}
