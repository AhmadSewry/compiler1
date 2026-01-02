package python.ast;

public class LiteralNode extends ExpressionNode {

    private final Object value;

    public LiteralNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public void printTree(String prefix, boolean isLast) {
        System.out.println(prefix
                + (isLast ? "└── " : "├── ")
                + "Literal: " + value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
