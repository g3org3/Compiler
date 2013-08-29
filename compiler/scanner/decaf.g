lexer grammar Decaf;

@lexer::header{
  
}

fragment ESC   	  :  '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') ;
fragment CHAR     :  ('A'..'Z' | 'a'..'z');
fragment HEXCHAR  :  ('A'..'F' | 'a'..'f');
fragment DIGIT    :  ('0'..'9');
fragment ASCCI	  :	 ('\n'..'\~');
fragment SQUOTE	  :	 ('\'');
fragment QUOTE	  :	 ('\"');
fragment BACKSLASH:  ('\\');
fragment NEWLINE  :	 ('\n');
fragment TAB	  :  ('\t');
fragment SAPCE	  :  (' ');
fragment UNDERSOCRE: ('_');

//reserved words
KWBOOLEAN	: 'boolean' ;
KWBREAK		: 'break' ;
KWCALLOUT	: 'callout' ;
KWCLASS		: 'class' ;
KWCONTINUE	: 'continue' ;
KWELSE		: 'else' ;
KWFALSE		: 'false' ;
KWFOR		: 'for' ;
KWIF		: 'if' ;
KWINT		: 'int' ;
KWRETURN	: 'return' ;
KWTRUE		: 'true' ;
KWVOID		: 'void' ;
KWFLOAT     : 'float';

//simbolos
COMMA       :   ',';
SEMI        :   ';';
LPAREN      :   '(';
RPAREN      :   ')';

//operadores
PLUS		:	'+';
MINUS		: 	'-';
MULT		: 	'*';
DIV			: 	'/';
AND			: 	'&';
OR			: 	'|';
EQ			: 	'=';
MAYORQ		:	'>';
MENORQ		:	'<';
NEG			:	'!';

//identifier
IDENTIFIER  : (SPACE CHAR* SPACE | CHAR* SPACE | SPACE CHAR* ) ;
ID 			: (CHAR)(CHAR | DIGIT)* ;

//token
TOKEN 		: (CHAR | UNDERSCORE)(CHAR)* ;

//variales
VAR         : (CHAR)(CHAR|DIGIT)*;

//string
STR 		: (QUOTE ASCCI* QUOTE) ;
LITERALSTR  : (QUOTE (ESC | ~('\\'|'"') )* QUOTE);

//char
CHR 		: (SQUOTE ASCCI SQUOTE) ;
LITERALCHAR : (SQUOTE (ESC | ~('\''|'\\') ) SQUOTE) ;

//number
NUMBER		: (DIGIT)+;
REAL		: (DIGIT)+ '.' (DIGIT)+;
HEX 		: ('0x' | '0X') (DIGIT | HEXCHAR) (DIGIT | HEXCHAR)*  ;

//comentarios
COMMENT		: (BACKSLASH BACKSLASH)(CHAR | UNICODE| DIGIT)*(NEWLINE) { skip(); };

//white spaces
WHITESPACE 	: ( TAB | SPACE | '\r' | NEWLINE)* { skip(); } ;
