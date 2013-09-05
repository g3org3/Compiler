lexer grammar Decaf;


@lexer::header{
	package compiler.scanner;
	import java.util.ArrayList;
}

@members {
	public static int x;
	public static ArrayList<String> strList;

	public Decaf(CharStream input, int a) {
        this(input, new RecognizerSharedState());
        Decaf.x = a;
        Decaf.strList = new ArrayList<String>(1);
    }

	public static void debug(String str, int line, String text){
		if (Decaf.x==1)
			System.out.println("    line:"+line+": "+str+" "+text);
		else if (Decaf.x==2)
			Decaf.strList.add(line+": "+str+" "+text);
	}
	public ArrayList<String> getList(){
		return Decaf.strList;
	}
}
fragment PERC		: ('%');
fragment ESC   	  	: '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') ;
fragment CHAR     	: ('A'..'Z' | 'a'..'z');
fragment HEXCHAR  	: ('A'..'F' | 'a'..'f');
fragment DIGIT    	: ('0'..'9');
fragment ASCCI	  	: (' '..'!')|('#'..'&')|('('..'.')|('0'..'~');
fragment CHAR2		: ('a'|'c'..'e'|'g'..'m'|'p'..'q'|'s'|'u'..'z'|'A'|'C'..'E'|'G'..'M'|'P'..'Q'|'S'|'U'..'Z');
fragment SQUOTE	  	: ('\'');
fragment QUOTE	  	: ('\"');
fragment BACKSLASH	: ('\\');
fragment NEWLINE  	: ('\n');
fragment TAB	  	: ('\t');
fragment SPACE	  	: (' ');
fragment UNDERSCORE	: ('_');
fragment UNICODE	: ('_');
fragment WHITE 		: (SPACE | TAB | '\r' | NEWLINE | '\b');
fragment WHITESPACE1: (SPACE | TAB | '\r');
fragment POINT		: ('.' | ':' | ';'|',');
fragment CHARS 		: (CHAR|DIGIT|SPACE|ESC);

//comentarios
COMMENT		: ('//') ~('\r'|'\n')* (NEWLINE) {skip();};

//ERRORES
MISMATCH	: ('\'\'\'') {Decaf.debug("unexpected char:1", getLine(), getText());};
WRONGCHAR	: ('\'' ('0x'|'0X')(DIGIT|HEXCHAR)(DIGIT|HEXCHAR)* '\'') {Decaf.debug("unexpected char:2", getLine(), getText());};
WRONGBACK	: ('\'\\'(DIGIT|CHAR2)+'\''){Decaf.debug("unexpected char:3", getLine(), getText());};
WRONGQUOTE	: ('\''('\"')+'\''){Decaf.debug("unexpected char:4", getLine(), getText());};
LONGCHR 	: (SQUOTE (ASCCI)(ASCCI)+ SQUOTE){Decaf.debug("unexpected char:5", getLine(), getText());};
NOQUOTE		: ('\'\\\''){Decaf.debug("unexpected char:6", getLine(), getText());};
NOHEX		: ('0x'){Decaf.debug("unexpected hex:", getLine(), getText());};
INVALID		: ((UNDERSCORE) (CHAR|DIGIT|UNDERSCORE)*){Decaf.debug("invalid:", getLine(), getText());};
INVALID1	: (CHAR* '.' CHAR*){Decaf.debug("invalid:", getLine(), getText());};


// FIX
NEGATIVE	: ('-' (DIGIT)(DIGIT)*){Decaf.debug("NUMBER", getLine(), getText());};


//reserved words
KWBOOLEAN	: 'boolean' 	{ Decaf.debug("KW: BOOLEAN", getLine(), getText()); } ;
KWBREAK		: 'break' 		{ Decaf.debug("KW: BREAK", getLine(), getText()); } ;
KWCALLOUT	: 'callout' 	{ Decaf.debug("KW: CALLOUT", getLine(), getText()); } ;
KWCLASS		: 'class' 		{ Decaf.debug("KW: CLASS", getLine(), getText()); } ;
KWCONTINUE	: 'continue' 	{ Decaf.debug("KW: CONTINUE", getLine(), getText()); } ;
KWELSE		: 'else' 		{ Decaf.debug("KW: ELSE", getLine(), getText()); } ;
KWFALSE		: 'false' 		{ Decaf.debug("KW: FALSE", getLine(), getText()); } ;
KWFOR		: 'for' 		{ Decaf.debug("KW: FOR", getLine(), getText()); } ;
KWFORPAR	: 'forpar' 		{ Decaf.debug("KW: FORPAR", getLine(), getText()); } ;
KWIF		: 'if' 			{ Decaf.debug("KW: IF", getLine(), getText()); } ;
KWINT		: 'int' 		{ Decaf.debug("KW: INT", getLine(), getText()); } ;
KWRETURN	: 'return' 		{ Decaf.debug("KW: RETURN", getLine(), getText()); } ;
KWTRUE		: 'true' 		{ Decaf.debug("KW: TRUE", getLine(), getText()); } ;
KWVOID		: 'void' 		{ Decaf.debug("KW: VOID", getLine(), getText()); } ;
KWFLOAT     : 'float'		{ Decaf.debug("KW: FLOAT ", getLine(), getText()); } ;
fragment PROGRAM: ('A'..'Z' ('A'..'Z'|'a'..'z')*);

//simbolos
COMMA       :   ',' { Decaf.debug("COMMA", getLine(), getText()); } ;
SEMI        :   ';' { Decaf.debug("SEMI", getLine(), getText()); } ;
LPAREN      :   '(' { Decaf.debug("LPAREN", getLine(), getText()); } ;
RPAREN      :   ')' { Decaf.debug("RPAREN", getLine(), getText()); } ;
LBRAKE      :   '[' { Decaf.debug("LBRAKE", getLine(), getText()); } ;
RBRAKE      :   ']' { Decaf.debug("RBRAKE", getLine(), getText()); } ;
LBRACE      :   '{' { Decaf.debug("LBRACE", getLine(), getText()); } ;
RBRACE      :   '}' { Decaf.debug("RBRACE", getLine(), getText()); } ;	

//operadores
PLUS		:	'+' { Decaf.debug("PLUS", getLine(), getText()); } ;
MINUS		: 	'-' { Decaf.debug("MINUS", getLine(), getText()); } ;
MULT		: 	'*' { Decaf.debug("MULT", getLine(), getText()); } ;
DIV			: 	'/' { Decaf.debug("DIV", getLine(), getText()); } ;
AND			: 	'&' { Decaf.debug("AND", getLine(), getText()); } ;
OR			: 	'|' { Decaf.debug("OR", getLine(), getText()); } ;
EQ			: 	'=' { Decaf.debug("EQ", getLine(), getText()); } ;
MAYORQ		:	'>' { Decaf.debug("MAYORQ", getLine(), getText()); } ;
MENORQ		:	'<' { Decaf.debug("MENORQ", getLine(), getText()); } ;
NEG			:	'!' { Decaf.debug("NEG", getLine(), getText()); } ;

fragment OPERADORES :	('+'|'-'|'*'|'/'|'&'|'|'|'='|'>'|'<'|'!');
//identifier

//token
//TOKEN 		: (CHAR | UNDERSCORE)(CHAR)* { Decaf.debug("TOKEN", getLine(), getText()); } ;

//variales
VAR         : (CHAR)(CHAR|DIGIT)* { Decaf.debug("VAR", getLine(), getText()); } ;

//string
STR 		: (QUOTE ASCCI* QUOTE) { Decaf.debug("STR", getLine(), getText()); } ;
LITERALSTR  : (QUOTE (ESC | ~('\\'|'"') )* QUOTE) { Decaf.debug("STR", getLine(), getText()); } ;

//char
CHR 		: (SQUOTE ASCCI SQUOTE) { Decaf.debug("CHARLITERAL", getLine(), getText()); } ;
LITERALCHAR : (SQUOTE (ESC | ~('\''|'\\') ) SQUOTE) { Decaf.debug("CHARLITERAL", getLine(), getText()); } ;

//number
NUMBER		: (DIGIT)+ { Decaf.debug("NUMBER", getLine(), getText()); } ;
REAL		: (DIGIT)+ '.' (DIGIT)+ { Decaf.debug("REAL", getLine(), getText()); } ;
HEX 		: ('0x' | '0X') (DIGIT | HEXCHAR) (DIGIT | HEXCHAR)*  { Decaf.debug("HEX", getLine(), getText()); } ;



//white spaces
WHITESPACE 	: ( TAB | SPACE | '\r' |NEWLINE ) { skip(); } ;
FIX         : (~(ASCCI)) {Decaf.debug("invalid:", getLine(), getText());};
//IFTAB		: (TAB)* {Decaf.debug("\t", getLine(), getText());};
//IFSPACE		: (SPACE)* {Decaf.debug(" ");};
//IFBKS		: ('\r')* {Decaf.debug("\r");};
//IFNEWLINE	: (NEWLINE)* {Decaf.debug("\n");};

