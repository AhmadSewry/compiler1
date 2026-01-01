parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

program
    : statements? EOF
    ;

statements
    : statement+
    ;

statement
    : simpleStatement
    | compoundStatement
    ;

simpleStatement
    : assignment
    | printStmt
    | exprStmt
    ;

compoundStatement
    : funcDef
    | forStmt
    | ifStmt
    | whileStmt
    ;

funcDef
    : DEF IDENTIFIER LPAREN paramList? RPAREN COLON NEWLINE
      INDENT statements DEDENT
      # FunctionDefNode
    ;

forStmt
    : FOR IDENTIFIER IN IDENTIFIER COLON NEWLINE
      INDENT statements DEDENT
      # ForStatementNode
    ;

ifStmt
    : IF expr COLON NEWLINE
      INDENT statements DEDENT
      (ELSE COLON NEWLINE INDENT statements DEDENT)?
      # IfStatementNode
    ;

whileStmt
    : WHILE expr COLON NEWLINE
      INDENT statements DEDENT
      # WhileStatementNode
    ;

assignment
    : IDENTIFIER ASSIGN expr NEWLINE
      # AssignmentNode
    ;

printStmt
    : PRINT LPAREN expr RPAREN NEWLINE
      # PrintNode
    ;

exprStmt
    : expr NEWLINE
      # ExprStatementNode
    ;

paramList
    : IDENTIFIER (COMMA IDENTIFIER)*
      # ParameterListNode
    ;

expr
    : expr op=(GT|LT|GTE|LTE|EQ|NEQ) expr   # Compare
    | expr op=(PLUS|MINUS) expr            # AddSub
    | expr op=(MULT|DIV) expr              # MulDiv
    | NUMBER                               # Number
    | STRING                               # String
    | IDENTIFIER                           # Identifier
    | LPAREN expr RPAREN                   # Parenthesized
    ;
