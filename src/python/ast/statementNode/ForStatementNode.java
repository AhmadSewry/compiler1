package python.ast.statementNode;

import python.ast.StatementNode;
import java.util.List;

public class ForStatementNode extends StatementNode {

    public  final String iterator;
    private final String iterable;
    public final List<StatementNode> body;

    public ForStatementNode(String iterator, String iterable, List<StatementNode> body, int line, int column) {
        super(line, column);
        this.iterator = iterator;
        this.iterable = iterable;
        this.body = body;
    }

    public String getIterator() {
        return iterator;
    }

    public String getIterable() {
        return iterable;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    @Override
    public void printTree(String indent, boolean last) {
        System.out.print(indent);
        System.out.print(last ? "└─ " : "├─ ");
        System.out.println("ForStatement");

        indent += last ? "   " : "│  ";
        System.out.println(indent + "├─ Iterator: " + iterator);
        System.out.println(indent + "├─ Iterable: " + iterable);

        System.out.println(indent + "└─ Body");
        for (int i = 0; i < body.size(); i++) {
            body.get(i).printTree(indent + "   ", i == body.size() - 1);
        }
    }
}
