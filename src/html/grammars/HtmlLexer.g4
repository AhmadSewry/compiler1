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
HTML_OPEN_TAG     : '<' ID_START ID_PART* '>' -> pushMode(HTML) ;
JINJA_VAR_OPEN    : '{{' -> pushMode(JINJA_VAR) ;
JINJA_BLOCK_OPEN  : '{%' -> pushMode(JINJA_BLOCK) ;
HTML_TEXT         : ~[<{]+ ;

//////////////////////////////////////////////////////////
// HTML MODE
//////////////////////////////////////////////////////////
mode HTML;

HTML_WS : [ \t\r\n]+ -> skip ;
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
