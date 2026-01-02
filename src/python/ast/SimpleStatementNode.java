package python.ast;

public class SimpleStatementNode extends StatementNode {

    public String type;
    public String variable;
    public ExpressionNode expression;

    public SimpleStatementNode(String type, String variable, ExpressionNode expression) {
        this.type = type;
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public void printTree(String indent, boolean isLast) {
        printNode(indent, isLast, "SimpleStatement (" + type + ")");

        String newIndent = indent + (isLast ? "    " : "│   ");

        if (variable != null) {
            printNode(newIndent, false, "Var: " + variable);
        }

        if (expression != null) {
            expression.printTree(newIndent, true);
        }
    }

    private void printNode(String indent, boolean isLast, String s) {
    }
}
