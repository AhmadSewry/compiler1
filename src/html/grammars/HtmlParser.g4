parser grammar HtmlParser;

options { tokenVocab = HtmlLexer; }

@header {
package grammars;
}

// ===============================
//         START RULE
// ===============================
html_program
    : html_item* EOF
    ;

// ===============================
//         HTML ITEMS
// ===============================
html_item
    : html_tag
    | style_block
    | jinja_block
    | html_text
    ;

// ===============================
//         HTML TEXT
// ===============================
html_text
    : HTML_TEXT
    | HTML_TEXT_INNER
    ;

// ===============================
//         HTML TAG
// ===============================
html_tag
    : HTML_OPEN_TAG html_item* HTML_CLOSE_TAG
    ;

// ===============================
//         JINJA BLOCKS
// ===============================
jinja_block
    : (JINJA_VAR_OPEN | HTML_JINJA_VAR_OPEN )
      jinja_var_expr
      JINJA_VAR_CLOSE

    | (JINJA_BLOCK_OPEN | HTML_JINJA_BLOCK_OPEN)
      jinja_stmt
      JINJA_BLOCK_CLOSE
    ;

// ===============================
//         JINJA EXPRESSIONS
// ===============================
    jinja_var_expr
        : JINJA_VAR_NAME (JINJA_VAR_DOT JINJA_VAR_NAME)*
        ;
    jinja_block_expr
    : JINJA_BLOCK_NAME (JINJA_BLOCK_DOT JINJA_BLOCK_NAME)*
    ;

    jinja_name
        : JINJA_VAR_NAME
        | JINJA_BLOCK_NAME
        ;

// ===============================
//         JINJA STATEMENTS
// ===============================
    jinja_stmt
        : FOR JINJA_BLOCK_NAME IN  jinja_block_expr      # JinjaFor
        | ENDFOR                                         # JinjaEndFor
        | IF jinja_block_expr                            # JinjaIf
        | ENDIF                                          # JinjaEndIf
        ;


// ===============================
//         STYLE / CSS
// ===============================
style_block
    : STYLE_OPEN css_rule* STYLE_CLOSE
    ;

css_rule
    : css_selector CSS_LBRACE css_decl* CSS_RBRACE
    ;

css_selector
    : CSS_IDENT
    | CSS_DOT CSS_IDENT
    | CSS_HASH CSS_IDENT
    ;

css_decl
    : CSS_IDENT CSS_COLON css_value CSS_SEMI
    ;

css_value
    : css_atom+
    ;

css_atom
    : CSS_NUMBER
    | CSS_UNIT
    | CSS_STRING
    | CSS_IDENT
    ;
