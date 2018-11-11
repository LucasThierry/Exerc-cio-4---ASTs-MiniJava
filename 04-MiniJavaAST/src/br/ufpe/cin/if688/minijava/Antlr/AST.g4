grammar AST;

goal: mainClass ( classDeclaration )* EOF;

DIGIT: [0-9] ;
integer: DIGIT+ ;

mainClass: 'class' identifier '{' 'public' 'static' 'Void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}';

classDeclaration: 'class' identifier ( 'extends' identifier )? '{' varDeclaration* methodDeclaration* '}';

varDeclaration: type identifier ';';

methodDeclaration: 'public' type identifier '(' ( type identifier ( ',' type identifier )* )? ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}';

type: 'int' '[' ']'|'boolean'|'int'|identifier;

statement: '{' ( statement )* '}'
|'if' '(' expression ')' statement 'else' statement
|'while' '(' expression ')' statement
|
'System.out.println' '(' expression ')' ';'
|identifier '=' expression ';'
|identifier '[' expression ']' '=' expression ';'
;

expression: expression ( '&&' | '<' | '+' | '-' | '*' ) expression
|expression '[' expression ']'
|expression '.' 'length'
|expression '.' identifier '(' ( expression ( ',' expression )* )? ')'
|integer
|'true'
|'false'
|identifier
|'this'
|'new' 'int' '[' expression ']'
|'new' identifier '(' ')'
|'!' expression
|'(' expression ')'
;

identifier: IDENTIFIER ;
