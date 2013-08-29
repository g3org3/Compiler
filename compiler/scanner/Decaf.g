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
KWBOOLEAN	: 'boolean' 	{ Decaf.jimmy("KWBOOLEAN"); } ;
KWBREAK		: 'break' 		{ Decaf.jimmy("KWBREAK"); } ;
KWCALLOUT	: 'callout' 	{ Decaf.jimmy("KWCALLOUT"); } ;
KWCLASS		: 'class' 		{ Decaf.jimmy("KWCLASS"); } ;
KWCONTINUE	: 'continue' 	{ Decaf.jimmy("KWCONTINUE"); } ;
KWELSE		: 'else' 		{ Decaf.jimmy("KWELSE"); } ;
KWFALSE		: 'false' 		{ Decaf.jimmy("KWFALSE"); } ;
KWFOR		: 'for' 		{ Decaf.jimmy("KWFOR"); } ;
KWIF		: 'if' 			{ Decaf.jimmy("KWIF"); } ;
KWINT		: 'int' 		{ Decaf.jimmy("KWINT"); } ;
KWRETURN	: 'return' 		{ Decaf.jimmy("KWRETURN"); } ;
KWTRUE		: 'true' 		{ Decaf.jimmy("KWTRUE"); } ;
KWVOID		: 'void' 		{ Decaf.jimmy("KWVOID"); } ;
KWFLOAT     : 'float'		{ Decaf.jimmy("KWFLOAT "); } ;

//simbolos
COMMA       :   ',' { Decaf.jimmy("COMMA"); } ;
SEMI        :   ';' { Decaf.jimmy("SEMI"); } ;
LPAREN      :   '(' { Decaf.jimmy("LPAREN"); } ;
RPAREN      :   ')' { Decaf.jimmy("RPAREN"); } ;

//operadores
PLUS		:	'+' { Decaf.jimmy("PLUS"); } ;
MINUS		: 	'-' { Decaf.jimmy("MINUS"); } ;
MULT		: 	'*' { Decaf.jimmy("MULT"); } ;
DIV			: 	'/' { Decaf.jimmy("DIV"); } ;
AND			: 	'&' { Decaf.jimmy("AND"); } ;
OR			: 	'|' { Decaf.jimmy("OR"); } ;
EQ			: 	'=' { Decaf.jimmy("EQ"); } ;
MAYORQ		:	'>' { Decaf.jimmy("MAYORQ"); } ;
MENORQ		:	'<' { Decaf.jimmy("MENORQ"); } ;
NEG			:	'!' { Decaf.jimmy("NEG"); } ;

//identifier
IDENTIFIER  : (SPACE CHAR* SPACE | CHAR* SPACE | SPACE CHAR* ) { Decaf.jimmy("IDENTIFIER"); } ;
ID 			: (CHAR)(CHAR | DIGIT)* { Decaf.jimmy("ID"); } ;

//token
TOKEN 		: (CHAR | UNDERSCORE)(CHAR)* { Decaf.jimmy("TOKEN"); } ;

//variales
VAR         : (CHAR)(CHAR|DIGIT)* { Decaf.jimmy("VAR"); } ;

//string
STR 		: (QUOTE ASCCI* QUOTE) { Decaf.jimmy("STR"); } ;
LITERALSTR  : (QUOTE (ESC | ~('\\'|'"') )* QUOTE) { Decaf.jimmy("LITERALSTR"); } ;

//char
CHR 		: (SQUOTE ASCCI SQUOTE) { Decaf.jimmy("CHR"); } ;
LITERALCHAR : (SQUOTE (ESC | ~('\''|'\\') ) SQUOTE) { Decaf.jimmy("LITERALCHAR"); } ;

//number
NUMBER		: (DIGIT)+ { Decaf.jimmy("NUMBER"); } ;
REAL		: (DIGIT)+ '.' (DIGIT)+ { Decaf.jimmy("REAL"); } ;
HEX 		: ('0x' | '0X') (DIGIT | HEXCHAR) (DIGIT | HEXCHAR)*  { Decaf.jimmy("HEX"); } ;

//comentarios
COMMENT		: (BACKSLASH BACKSLASH)(CHAR | UNICODE| DIGIT)*(NEWLINE) { skip(); };

//white spaces
WHITESPACE 	: ( TAB | SPACE | '\r' | NEWLINE)* { skip(); } ;
