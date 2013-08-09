lexer grammar DecafLexer;

@lexer::header{
  package compiler.scanner;
}

// 
fragment DIGIT : '0'..'9';
fragment LETRA : 'a'..'z'|'A'..'Z'|'_';


//ignoramos espacios en blanco

WHITESPACE 	: 	( '\t' | ' ' | '\r' | '\n')+ { skip(); } ;
COMMENTS	:	( '//' + expresion);