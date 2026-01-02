package python.ast.expressions;

import python.ast.*;

public class IdentifierNode extends ExpressionNode {

    private final String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    //  إضافة getter
    public String getName() {
        return name;
    }

    @Override
    public void printTree(String indent, boolean isLast) {
        System.out.print(indent);
        System.out.println(
                (isLast ? "└─ " : "├─ ") + "Identifier: " + name
        );
    }
}
