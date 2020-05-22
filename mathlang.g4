grammar mathlang;

MAIN : 'MAIN';
FUNCTION : 'FUNCTION';
RETURN : 'RETURN';
PRINT : 'PRINT';

BEGIN : 'BEGIN';
END : 'END';

INT_TYPE : 'INTEGER';
FLOAT_TYPE : 'FLOAT';

CONST : 'CONST';
IF : 'IF';
ELSE : 'ELSE';
WHILE : 'WHILE';
FOR : 'FOR';
CASE : 'CASE';
DEFAULT : 'DEFAULT';

SEMICOLON : ';';
OPAR : '(';
CPAR : ')';
OANGLEBR : '<';
EQOANGLEBR : '<=';
CANGLEBR : '>';
EQCANGLEBR : '>=';
COLON : ':';


NEGATION : '!';
INCR : '++';
DECR : '--';
EQ : '==';
NEQ : '!=';
IS : 'IS';
MOD : '%' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
POW: '^';
ASSIGN : '=';

INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+;
ID: [a-zA-Z_]+;
COMMENT: '//' ~[\r\n]* -> skip;
SPACES: [ \t\r\n] -> skip;

math                    : create* function* main EOF;
main                    : MAIN BEGIN start END;
start                   : instruction*;
instruction             : create | expr | print | if_stat | while_stat | for_stat | function_call;
create                  : create_int | create_const_int | create_float | create_const_float;
create_int              : INT_TYPE ID ASSIGN expr SEMICOLON;
create_const_int        : CONST create_int;
create_float            : FLOAT_TYPE ID ASSIGN expr SEMICOLON;
create_const_float      : CONST create_float;
name_object_int         : INT                                                                   # nameObjectInt;
name_object_float       : FLOAT                                                                 # nameObjectFloat;
if_stat                 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?;
condition_block         : OPAR (NEGATION)? condition CPAR stat_block;
stat_block              : BEGIN start END;
while_stat              : WHILE condition_block;
for_stat                : FOR OPAR condition_for CPAR stat_block;
condition_for           : ID ASSIGN expr SEMICOLON condition SEMICOLON ID oper=(INCR | DECR)      # forCond;
function_call           : ID param_call SEMICOLON;
print                   : PRINT print_expr SEMICOLON;
param_call              : OPAR (arg_call)? CPAR;
stat_block_with_return  : BEGIN start return_id END;
return_id               : RETURN ID SEMICOLON;
param                   : OPAR (arg)? CPAR;
type                    : INT_TYPE | FLOAT_TYPE;

print_expr
    : ID                # printId
    | INT               # printInt
    | FLOAT             # printFloat;
condition
    : ID op=(EQ | NEQ | OANGLEBR| CANGLEBR | EQOANGLEBR | EQCANGLEBR) expr                  # equalityExpr
    | ID IS type                                                                            # checkType;
arg_call
    : ID                # paramCallArg
    | ID ', ' arg_call  # paramCallArgs;
arg
    : type ID           # paramArg
    | type ID ', ' arg  # paramArgs;
function
    : FUNCTION ID param stat_block                      # voidFunction
    | FUNCTION type ID param stat_block_with_return     # returnFunction;
expr
    : expr op=(MOD | MUL | DIV) expr                    # ModMulDiv
    | OPAR tp=(INT_TYPE | FLOAT_TYPE) CPAR expr         # typeConversion
    | expr op=(ADD | SUB) expr                          # AddSub
    | ID '(' expr ')'                                   # call
    | op=(ADD | SUB) expr                               # unary
    | OPAR expr CPAR                                    # prim
    | ID                                                # idExpr
    | name_object_int                                   # intExrp
    | name_object_float                                 # floatExpr
    | expr POW expr                                     # powExpr
    | ID ASSIGN expr SEMICOLON                          # assignExpr;

