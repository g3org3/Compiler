lexer grammar DecafLexer;

@lexer::header{
  
}

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

//identifier
IDENTIFIER  : (SPACE CHAR* SPACE | CHAR* SPACE | SPACE CHAR* ) ;
ID 			: (CHAR)(UNDERSCORE (CHAR | DIGIT) )* ;

//token
TOKEN 		: (CHAR | UNDERSCORE)(CHAR)* ;

//string
STRING		: (QUOTE ASCCI* QUOTE) ;

//char
ASCIICHAR	: (ASCCI) ;
LITERALCHAR : (SQUOTE ASCCI SQUOTE) ;

//number
INT 		: (DECIMAL | HEX) ;
DECIMAL     : (DIGIT) (DIGIT)* ;
HEX 		: ('0x' (DIGIT | HEXCHAR) (DIGIT | HEXCHAR)* ) ;

//comentarios
COMMENT		: (BACKSLASH BACKSLASH)(CHAR | UNICODE| DIGIT)*(NEWLINE) { skip(); };

//white spaces
WHITESPACE 	: ( TAB | SPACE | '\r' | NEWLINE)* { skip(); } ;
