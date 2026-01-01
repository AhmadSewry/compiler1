package python.ast;

public class IdentifierNode extends ExpressionNode {

    private final String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printTree(String prefix, boolean isLast) {
        System.out.println(prefix
                + (isLast ? "└── " : "├── ")
                + "Identifier: " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}
