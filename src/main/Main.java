package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.file.Files;
import java.nio.file.Path;

// ---------- PYTHON ----------
import python.grammars.PythonLexer;
import python.grammars.PythonParser;
import python.ast.PythonAstNode;
import python.visitor.PythonAstBuilderVisitor;
import python.visitor.SymbolTableVisitor;

// ---------- HTML ----------
import html.grammars.HtmlLexer;
import html.grammars.HtmlParser;
import html.ast.html.HtmlAstNode;
import html.visitor.HtmlAstBuilderVisitor;

public class Main {

    public static void main(String[] args) throws Exception {

        // ===============================
        // PYTHON
        // ===============================
        System.out.println("=================================");
        System.out.println("PYTHON");
        System.out.println("=================================");

        String pythonCode = Files.readString(
                Path.of("flask_app/test_python.py")
        );

        CharStream pyInput = CharStreams.fromString(pythonCode);
        PythonLexer pyLexer = new PythonLexer(pyInput);
        CommonTokenStream pyTokens = new CommonTokenStream(pyLexer);
        PythonParser pyParser = new PythonParser(pyTokens);

        ParseTree pyTree = pyParser.program();

        // ---- AST ----
        PythonAstBuilderVisitor pyAstVisitor =
                new PythonAstBuilderVisitor();
        PythonAstNode pyAst = pyAstVisitor.visit(pyTree);

        System.out.println("\n--- Python AST ---");
        pyAst.printTree("", true);

        // ---- SYMBOL TABLE ----
        SymbolTableVisitor pySymbolVisitor =
                new SymbolTableVisitor();
        pySymbolVisitor.visit(pyAst);

        System.out.println("\n--- Python Symbol Table ---");
        pySymbolVisitor.getSymbolTable().print();

        // ===============================
        // HTML + JINJA
        // ===============================
        System.out.println("\n=================================");
        System.out.println("HTML + JINJA");
        System.out.println("=================================");

        String htmlCode = Files.readString(
                Path.of("flask_app/test_template.html")
        );

        CharStream htmlInput = CharStreams.fromString(htmlCode);
        HtmlLexer htmlLexer = new HtmlLexer(htmlInput);
        CommonTokenStream htmlTokens =
                new CommonTokenStream(htmlLexer);
        HtmlParser htmlParser = new HtmlParser(htmlTokens);

        ParseTree htmlTree = htmlParser.html_program();

        HtmlAstBuilderVisitor htmlAstVisitor =
                new HtmlAstBuilderVisitor();
        HtmlAstNode htmlAst = htmlAstVisitor.visit(htmlTree);

        System.out.println("\n--- HTML AST ---");
        htmlAst.printTree("",true);
    }
}
