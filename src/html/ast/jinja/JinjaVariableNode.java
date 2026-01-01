package html.ast.jinja;

public class JinjaVariableNode extends JinjaNode {

    public String expression;

    public JinjaVariableNode(String expression) {
        this.expression = expression;
    }

    @Override
    public void printTree(String indent, boolean last) {
        printIndent(indent, last);
        System.out.println("JinjaVariable {{ " + expression + " }}");
    }
}
