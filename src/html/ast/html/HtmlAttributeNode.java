package html.ast.html;

public abstract class HtmlAttributeNode extends HtmlAstNode   {
    public String name;
    public String value;

    public HtmlAttributeNode(String name, String value) {
        this.name = name;
        this.value = value;
    }
}

