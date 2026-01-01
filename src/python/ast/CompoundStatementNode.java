package python.ast;

import java.util.List;

public class CompoundStatementNode {
}
package python.ast;

import java.util.List;

public class CompoundStatementNode extends StatementNode {

    public String type;
    public String name;
    public ExpressionNode condition;
    public List<String> parameters;
    public List<StatementNode> body;
    public List<StatementNode> elseBody;

    public CompoundStatementNode(
            String type,
            String name,
            ExpressionNode condition,
            List<String> parameters,
            List<StatementNode> body,
            List<StatementNode> elseBody
    ) {
        this.type = type;
        this.name = name;
        this.condition = condition;
        this.parameters = parameters;
        this.body = body;
        this.elseBody = elseBody;
    }

    @Override
    public void printTree(String indent, boolean isLast) {
        printNode(indent, isLast, "CompoundStatement (" + type + ")");

        String newIndent = indent + (isLast ? "    " : "│   ");

        if (name != null) {
            printNode(newIndent, false, "Name: " + name);
        }

        if (condition != null) {
            condition.printTree(newIndent, false);
        }

        if (parameters != null) {
            printNode(newIndent, false, "Params: " + parameters);
        }

        if (body != null) {
            printNode(newIndent, false, "Body");
            for (StatementNode st : body) {
                st.printTree(newIndent + "│   ", false);
            }
        }

        if (elseBody != null) {
            printNode(newIndent, true, "Else");
            for (StatementNode st : elseBody) {
                st.printTree(newIndent + "    ", true);
            }
        }
    }

    private void printNode(String newIndent, boolean b, String anElse) {
    }
}
