grammar arithmetic;

file_ : stat*  EOF;

stat:   expression NEWLINE                      # printExpr
    |   ID EQ expression             # assign
//    |   ID EQ expression NEWLINE                # assign
//    |   expression                              # expr
    |   NEWLINE                                 # blank
    ;

expression
   :  expression  op=POW expression             # pow
   |  expression  op=(TIMES | DIV)  expression  # mul_div
   |  expression  op=(PLUS | MINUS) expression  # plus_min
   |  INT                                       # int
   |  ID                                        # id
   |  LPAREN expression RPAREN                  # paren
//   |  (PLUS | MINUS)* atom                      #plmn_atom
   ;

//atom
//   : scientific
//   | variable
//   | INT
//   | ID
//   ;

//scientific
//   : SCIENTIFIC_NUMBER
//   ;
//
//variable
//   : VARIABLE
//   ;

relop
   : EQ
   | GT
   | LT
   ;


//VARIABLE
//   : VALID_ID_START VALID_ID_CHAR*
//   ;


fragment VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;


fragment VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;

//The NUMBER part gets its potential sign from "(PLUS | MINUS)* atom" in the expression rule
//SCIENTIFIC_NUMBER
//   : NUMBER (E SIGN? UNSIGNED_INTEGER)?
//   ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment UNSIGNED_INTEGER
   : ('0' .. '9')+
   ;


fragment E
   : 'E' | 'e'
   ;


fragment SIGN
   : ('+' | '-')
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


TIMES
   : '*'
   ;

ID
    :   [a-zA-Z]+
    ;

DIV
   : '/'
   ;


GT
   : '>'
   ;


LT
   : '<'
   ;


EQ
   : '='
   ;


POINT
   : '.'
   ;


POW
   : '^'
   ;

NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)

INT
    :
    [0-9]+
    ;

WS
   : [ \t] + -> skip
   ;
