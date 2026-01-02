package python.ast;

public abstract class PythonAstNode {


    protected void printIndent(String indent, boolean last) {
        System.out.print(indent);
        System.out.print(last ? "└─ " : "├─ ");
    }

    public abstract void printTree(String indent, boolean last);
}
