package html.ast.jinja;

import html.ast.html.HtmlAstNode;
import java.util.List;

public class JinjaForNode extends JinjaNode {

    public String variable;
    public String iterable;
    public List<HtmlAstNode> body;

    public JinjaForNode(String variable, String iterable, List<HtmlAstNode> body) {
        this.variable = variable;
        this.iterable = iterable;
        this.body = body;
    }

    @Override
    public void printTree(String indent, boolean last) {
        printIndent(indent, last);
        System.out.println("JinjaFor (" + variable + " in " + iterable + ")");

        indent += last ? "   " : "│  ";
        for (int i = 0; i < body.size(); i++) {
            body.get(i).printTree(indent, i == body.size() - 1);
        }
    }
}
