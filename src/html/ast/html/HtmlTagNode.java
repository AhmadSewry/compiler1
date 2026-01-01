package html.ast.html;

import java.util.List;

public class HtmlTagNode extends HtmlAstNode {

    public String tagName;
    public List<HtmlAstNode> children;

    public HtmlTagNode(String tagName, List<HtmlAstNode> children, List<HtmlAstNode> htmlAstNodes) {
        this.tagName = tagName;
        this.children = children;
    }

    @Override
    public void printTree(String indent, boolean last) {
        printIndent(indent, last);
        System.out.println("HtmlTag <" + tagName + ">");

        indent += last ? "   " : "│  ";
        for (int i = 0; i < children.size(); i++) {
            children.get(i).printTree(indent, i == children.size() - 1);
        }
    }
}
