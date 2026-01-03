package python.visitor;

import python.ast.*;
import python.ast.statementNode.*;
import python.symbol.SymbolTable;

public class SymbolTableVisitor {

    private final SymbolTable table = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return table;
    }

    public void visit(PythonAstNode node) {
        if (node == null) return;

        // ================= PROGRAM =================
        if (node instanceof ProgramNode p) {
            table.enterScope();
            for (PythonAstNode st : p.getStatements()) {
                visit(st);
            }

        }

        // ================= SIMPLE =================
        else if (node instanceof AssignmentNode assign) {
            table.define(assign.getIdentifier().getName(), "variable");
        }

        else if (node instanceof ExprStatementNode exprStmt) {
            // عادة لا نحتاج تعريف شيء هنا، فقط زيارة التعبير إذا لزم
            // visit(exprStmt.getExpression()); // إذا أردت
        }

        else if (node instanceof PrintNode printNode) {
            // لا تعريف، فقط التعبير يمكن معالجته إذا أردت
            // visit(printNode.getExpression());
        }

        // ================= COMPOUND =================
        else if (node instanceof FunctionDefNode func) {
            table.define(func.getName(), "function"); // تعريف الدالة في السكوب الحالي
            table.enterScope();
            for (String p : func.getParameters()) {
                table.define(p, "parameter");
            }
            for (StatementNode st : func.getBody()) {
                visit(st);
            }

        }

        else if (node instanceof ForStatementNode forStmt) {
            table.enterScope();
            table.define(forStmt.iterator, "loop-variable");
            for (StatementNode st : forStmt.body) {
                visit(st);
            }

        }

        else if (node instanceof WhileStatementNode whileStmt) {
            table.enterScope();
            for (StatementNode st : whileStmt.body) {
                visit(st);
            }

        }

        else if (node instanceof IfStatementNode ifStmt) {
            table.enterScope();
            for (StatementNode st : ifStmt.getThenBody()) {
                visit(st);
            }


            if (ifStmt.getElseBody() != null) {
                table.enterScope();
                for (StatementNode st : ifStmt.getElseBody()) {
                    visit(st);
                }

            }
        }
    }
}
