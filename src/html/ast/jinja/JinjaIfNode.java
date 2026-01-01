package html.ast.jinja;

import html.ast.html.HtmlAstNode;
import java.util.List;

public class JinjaIfNode extends JinjaNode {

    public String condition;
    public List<HtmlAstNode> body;

    public JinjaIfNode(String condition, List<HtmlAstNode> body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public void printTree(String indent, boolean last) {
        printIndent(indent, last);
        System.out.println("JinjaIf (" + condition + ")");

        indent += last ? "   " : "│  ";
        for (int i = 0; i < body.size(); i++) {
            body.get(i).printTree(indent, i == body.size() - 1);
        }
    }
}
