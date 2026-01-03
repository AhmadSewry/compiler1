
package python.ast;

public abstract class StatementNode extends PythonAstNode {

    protected int line;
    protected int column;

    public StatementNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public abstract void printTree(String indent, boolean last);
}
