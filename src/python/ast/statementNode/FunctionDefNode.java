package python.ast.statementNode;

import python.ast.StatementNode;
import java.util.List;

public abstract class FunctionDefNode extends StatementNode {

    private final String name;
    private final List<String> parameters;
    private final List<StatementNode> body;

    public FunctionDefNode(String name, List<String> parameters, List<StatementNode> body, int line, int column) {
        super(line, column);
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    @Override
    public void printTree(String indent, boolean last) {
        System.out.print(indent);
        System.out.print(last ? "└─ " : "├─ ");
        System.out.println("FunctionDef: " + name);

        System.out.println(indent + (last ? "   " : "│  ") + "Params: " + parameters);

        for (int i = 0; i < body.size(); i++) {
            body.get(i).printTree(indent + (last ? "   " : "│  "), i == body.size() - 1);
        }
    }
}
