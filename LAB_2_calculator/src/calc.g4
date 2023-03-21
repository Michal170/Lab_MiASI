grammar calc;

file_ : stat* EOF;

stat:
     expression  #expression_stat
    |VARIABLE PRZ expression NEWLINE #assign
    |IF '('cond=expression ')''('then=stat')' ('else' else=stat+?)? #if
    |WHILE '(' cond=expression ')' '(' then=stat ')' #while
//    |'('stat')'     #while_stat
    |NEWLINE #blank
    ;

expression
   :  expression relop expression #comparision
   |  expression  POW expression #pow
   |  expression  op=(TIMES | DIV)  expression #mul
   |  expression  op=(PLUS | MINUS) expression #plus
   |  LPAREN expression RPAREN #nawias
   |  INT # int
   |  atom #stala
   ;

atom
   : scientific
   | variable
   ;

scientific
   : SCIENTIFIC_NUMBER
   ;

variable
   : VARIABLE
   ;

relop
   : EQ
   | GT
   | LT
   ;

PRZ:
    ':='
    ;

IF
   : 'if'
   ;

WHILE : 'while'
   ;

VARIABLE
   : VALID_ID_START VALID_ID_CHAR*
   ;


fragment VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;


fragment VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;

//The NUMBER part gets its potential sign from "(PLUS | MINUS)* atom" in the expression rule
SCIENTIFIC_NUMBER
   : NUMBER (E SIGN? UNSIGNED_INTEGER)?
   ;

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

NEWLINE:
    '\r'? '\n'
    ;

INT
    :
    [0-9]+
    ;

WS
   : [ \r\n\t] + -> skip
   ;