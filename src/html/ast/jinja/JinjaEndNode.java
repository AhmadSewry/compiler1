package html.ast.jinja;

public class JinjaEndNode extends JinjaNode {

    public String type;

    public JinjaEndNode(String type) {
        this.type = type;
    }

    @Override
    public void printTree(String indent, boolean last) {
        printIndent(indent, last);
        System.out.println("JinjaEnd " + type);
    }
}
