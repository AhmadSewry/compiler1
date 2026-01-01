package python.ast;

public class BinaryExprNode package python.ast;

public class BinaryExprNode extends ExpressionNode {

    public final ExpressionNode left;
    private final String operator;
    public final ExpressionNode right;

    public BinaryExprNode(ExpressionNode left, String operator, ExpressionNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public void printTree(String prefix, boolean isLast) {
        System.out.println(prefix
                + (isLast ? "└── " : "├── ")
                + "BinaryExpr (" + operator + ")");

        left.printTree(prefix + (isLast ? "    " : "│   "), false);
        right.printTree(prefix + (isLast ? "    " : "│   "), true);
    }
}
{
}
