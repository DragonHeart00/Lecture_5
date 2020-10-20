grammar simpleCalc;

start   : e=expr EOF;

expr : c=CONST             # Constant
     | e1=expr op=MULDEV e2=expr  # Multiplication
     | e1=expr op=STRIG e2=expr   # Addition
     | op=STRIG e=expr 	 # Minus
     | '(' e=expr ')'      # Parenthesis
     ;

MULDEV : ('*'|'/');
STRIG : ('+'|'-');

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]+;

CONST : [0-9]+ ('.' [0-9]+)? ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : ('//' (~[\n])*) -> skip ;
MULTILINECOMMENTS :  ( '/*'  (( '*'~[/] | ~[*]  )*) '*/') -> skip; 

