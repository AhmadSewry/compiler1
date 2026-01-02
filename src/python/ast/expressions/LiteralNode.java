package python.ast.expressions;

import python.ast.ExpressionNode;

public class LiteralNode extends ExpressionNode {

    private final String value;

    public LiteralNode(String value) {
        this.value = value;
    }

    @Override
    public void printTree(String indent, boolean isLast) {
        System.out.print(indent);
        System.out.println(
                (isLast ? "└─ " : "├─ ") + "Literal: " + value
        );
    }
}

