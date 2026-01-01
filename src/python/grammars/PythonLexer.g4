lexer grammar PythonLexer;

@members {
    java.util.Stack<Integer> indents = new java.util.Stack<>();
    java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();

    @Override
    public Token nextToken() {
        if (!tokens.isEmpty()) {
            return tokens.poll();
        }

        Token next = super.nextToken();

        if (next.getType() == EOF) {
            while (!indents.isEmpty()) {
                tokens.add(commonToken(DEDENT, ""));
                indents.pop();
            }
            return next;
        }

        return next;
    }

    void emitIndentDedent(int indent) {
        int prev = indents.isEmpty() ? 0 : indents.peek();

        if (indent > prev) {
            indents.push(indent);
            tokens.add(commonToken(INDENT, ""));
        } else {
            while (!indents.isEmpty() && indents.peek() > indent) {
                indents.pop();
                tokens.add(commonToken(DEDENT, ""));
            }
        }
    }

    Token commonToken(int type, String text) {
        return new CommonToken(type, text);
    }
}



// ==========================
// Whitespace & Newlines
// ==========================
NEWLINE
    : '\r'? '\n' [ \t]*
      {
          String spaces = getText().replaceAll("[^\t ]", "");
          int indent = 0;
          for (char c : spaces.toCharArray()) {
              indent += (c == '\t') ? 4 : 1;
          }
          emitIndentDedent(indent);
      }
    ;

WS
    : [ \t]+ -> skip
    ;

// ==========================
// Keywords
// ==========================
DEF : 'def';
IF  : 'if';
ELSE: 'else';
FOR : 'for';
IN  : 'in';
WHILE: 'while';
PRINT: 'print';

// ==========================
// Operators & Symbols
// ==========================
ASSIGN  : '=';
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
LPAREN  : '(';
RPAREN  : ')';
COLON   : ':';
COMMA   : ',';
DOT     : '.';
GT      : '>';
LT      : '<';
GTE     : '>=';
LTE     : '<=';
EQ      : '==';
NEQ     : '!=';


// ==========================
// Literals & Identifiers
// ==========================
NUMBER  : [0-9]+ ;
STRING  : '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'';
IDENTIFIER : [\u0600-\u06FFa-zA-Z_][\u0600-\u06FFa-zA-Z0-9_]* ;

// ==========================
// INDENT / DEDENT tokens
// ==========================
INDENT :  ;
DEDENT :  ;
