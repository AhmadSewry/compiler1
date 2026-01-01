package html.ast.html;

public class HtmlTextNode extends HtmlAstNode {

    public String text;

    public HtmlTextNode(String text) {
        this.text = text;
    }

    @Override
    public void printTree(String indent, boolean last) {
        printIndent(indent, last);
        System.out.println("Text: \"" + text.trim() + "\"");
    }
}
