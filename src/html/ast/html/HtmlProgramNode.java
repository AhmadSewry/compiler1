package html.ast.html;

import java.util.List;

public class HtmlProgramNode extends HtmlAstNode {

    public List<HtmlAstNode> children;

    public HtmlProgramNode(List<HtmlAstNode> children) {
        this.children = children;
    }

    @Override
    public void printTree(String indent, boolean last) {
        printIndent(indent, last);
        System.out.println("HtmlProgram");

        indent += last ? "   " : "│  ";
        for (int i = 0; i < children.size(); i++) {
            children.get(i).printTree(indent, i == children.size() - 1);
        }
    }
}
