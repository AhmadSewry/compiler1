lexer grammar HtmlLexer;

//////////////////////////////////////////////////////////
// FRAGMENTS
//////////////////////////////////////////////////////////
fragment ID_START : [\u0600-\u06FFa-zA-Z_];
fragment ID_PART  : [\u0600-\u06FFa-zA-Z0-9_];

//////////////////////////////////////////////////////////
// TOKENS (مرة واحدة فقط)
//////////////////////////////////////////////////////////
IDENTIFIER : ID_START ID_PART* ;
DOT        : '.' ;
WS         : [ \t\r\n]+ -> skip ;

//////////////////////////////////////////////////////////
// DEFAULT MODE
//////////////////////////////////////////////////////////
STYLE_OPEN        : '<style>' -> pushMode(CSS);
HTML_OPEN_TAG     : '<' ID_START ID_PART* '>' -> pushMode(HTML) ;
JINJA_VAR_OPEN    : '{{' -> pushMode(JINJA_VAR) ;
JINJA_BLOCK_OPEN  : '{%' -> pushMode(JINJA_BLOCK) ;
HTML_TEXT         : ~[<{]+ ;

//////////////////////////////////////////////////////////
// HTML MODE
//////////////////////////////////////////////////////////
mode HTML;

HTML_WS : [ \t\r\n]+ -> skip ;
STYLE_OPEN_IN_HTML : '<style>' -> pushMode(CSS);
HTML_CLOSE_TAG : '</' ID_START ID_PART* '>' -> popMode ;
HTML_TEXT_INNER : ~[<{]+ ;
HTML_JINJA_VAR_OPEN   : '{{' -> pushMode(JINJA_VAR) ;
HTML_JINJA_BLOCK_OPEN : '{%' -> pushMode(JINJA_BLOCK) ;

//////////////////////////////////////////////////////////
// JINJA VAR MODE {{ ... }}
//////////////////////////////////////////////////////////
mode JINJA_VAR;

JINJA_VAR_CLOSE : '}}' -> popMode ;
JINJA_VAR_WS    : [ \t\r\n]+ -> skip ;
JINJA_VAR_NAME  : IDENTIFIER ;
JINJA_VAR_DOT   : DOT ;

//////////////////////////////////////////////////////////
// JINJA BLOCK MODE {% ... %}
//////////////////////////////////////////////////////////
mode JINJA_BLOCK;

JINJA_BLOCK_CLOSE : '%}' -> popMode ;

FOR     : 'for';
IN      : 'in';
IF      : 'if';
ENDIF   : 'endif';
ENDFOR  : 'endfor';

JINJA_BLOCK_NAME  : ID_START ID_PART* ;
JINJA_BLOCK_DOT  : DOT ;
JINJA_BLOCK_WS  : [ \t\r\n]+ -> skip ;

//////////////////////////////////////////////////////////
// CSS MODE
//////////////////////////////////////////////////////////
mode CSS;

STYLE_CLOSE : '</style>' -> popMode ;

// Selectors
CSS_DOT : '.';
CSS_HASH : '#';

//Identifiers (selectors / properties / values)
CSS_IDENT : ID_START ID_PART*;

// Numbers & values
CSS_NUMBER   : [0-9]+ ('.' [0-9]+)? ;
CSS_UNIT     : 'px' | '%' | 'em' | 'rem' ;
CSS_STRING   : '"' ~["\r\n]* '"'
             | '\'' ~['\r\n]* '\''
             ;

// Symbols
CSS_COLON : ':' ;
CSS_SEMI  : ';' ;
CSS_LBRACE: '{' ;
CSS_RBRACE: '}' ;

// Whitespace
CSS_WS : [ \t\r\n]+ -> skip ;
