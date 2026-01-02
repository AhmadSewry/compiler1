package python.ast;

import java.util.List;

public class ProgramNode extends PythonAstNode {

    public List<StatementNode> statements;

    public ProgramNode(List<StatementNode> statements) {
        this.statements = statements;
    }

    @Override
    public void printTree(String indent, boolean last) {
        printIndent(indent, last);
        System.out.println("PythonProgram");

        indent += last ? "   " : "│  ";
        for (int i = 0; i < statements.size(); i++) {
            statements.get(i).printTree(indent, i == statements.size() - 1);
        }
    }
}
