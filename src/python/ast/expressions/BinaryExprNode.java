package python.ast.expressions;


import python.ast.ExpressionNode;

public class BinaryExprNode extends ExpressionNode {

    private final String operator;
    private final ExpressionNode left;
    private final ExpressionNode right;

    public BinaryExprNode(String operator,
                          ExpressionNode left,
                          ExpressionNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public void printTree(String indent, boolean isLast) {
        System.out.print(indent);
        System.out.println(
                (isLast ? "└─ " : "├─ ") + "BinaryExpr (" + operator + ")"
        );

        String childIndent = indent + (isLast ? "   " : "│  ");

        left.printTree(childIndent, false);
        right.printTree(childIndent, true);
    }
}
