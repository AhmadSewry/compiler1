package python.ast;

import java.util.List;

public class ProgramNode extends PythonAstNode {

    private final List<PythonAstNode> statements;

    public ProgramNode(List<PythonAstNode> statements) {
        this.statements = statements;
    }

    public List<PythonAstNode> getStatements() {
        return statements;
    }

    @Override
    public void printTree(String indent, boolean isLast) {
        System.out.print(indent);
        System.out.println("└─ PythonProgram");

        String childIndent = indent + "   ";
        for (int i = 0; i < statements.size(); i++) {
            statements.get(i).printTree(childIndent, i == statements.size() - 1);
        }
    }
}
