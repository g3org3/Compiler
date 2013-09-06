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
			System.out.println("    "+line+": "+str+": "+text);
		else if (Decaf.x==2)
			Decaf.strList.add(line+": "+str+": "+text);
	}
	public ArrayList<String> getList(){
		return Decaf.strList;
	}
}

// FRAGMENTS
fragment CHAR   	: ('A'..'Z' | 'a'..'z');
fragment ASCII		: ((' '..'!')|('#'..'&')|('('..'[')|(']'..'~'));
fragment UCASE   	: ('A'..'Z');
fragment NUM 		: ('0'..'9');
fragment HEXCHAR 	: ('A'..'F')|('a'..'f');
fragment ESC		: ('\\b'|'\\t'|'\\n'|'\\r'|'\\\"'|'\\\''|'\\\\');
fragment UNDERSCORE	: '_';

// COMMENTS
COMMENTS 		: (('//') ~('\n'|'\r')* '\r'? '\n') {skip();};

// KEYWORDS
BOOLEAN			: 'boolean'		{ Decaf.debug("KW BOOLEAN", getLine(), getText()); };
BREAK			: 'break'		{ Decaf.debug("KW BREAK", getLine(), getText()); };
CALLOUT			: 'callout'		{ Decaf.debug("KW CALLOUT", getLine(), getText()); };
CLASS			: 'class'		{ Decaf.debug("KW CLASS", getLine(), getText()); };
CONTINUE		: 'continue'	{ Decaf.debug("KW CONTINUE", getLine(), getText()); };
ELSE 			: 'else'		{ Decaf.debug("KW ELSE", getLine(), getText()); };
FOR				: 'for'			{ Decaf.debug("KW FOR", getLine(), getText()); };
IF 				: 'if'			{ Decaf.debug("KW IF", getLine(), getText()); };
INT 			: 'int'			{ Decaf.debug("KW INT", getLine(), getText()); };
RETURN 			: 'return'		{ Decaf.debug("KW RETURN", getLine(), getText()); };
VOID 			: 'void'		{ Decaf.debug("KW VOID", getLine(), getText()); };

// BOOLEANS
TRUE 			: 'true'		{ Decaf.debug("BOOLEAN", getLine(), getText()); };
FALSE			: 'false'		{ Decaf.debug("BOOLEAN", getLine(), getText()); };

// SYMBOLS
LPAREN			: '('			{ Decaf.debug("LPARENTESIS", getLine(), getText()); };
RPAREN			: ')'			{ Decaf.debug("RPARENTESIS", getLine(), getText()); };
LBRACE			: '{'			{ Decaf.debug("LBRACE", getLine(), getText()); };
RBRACE			: '}'			{ Decaf.debug("RBRACE", getLine(), getText()); };
LBRAKET			: '['			{ Decaf.debug("LBRAKET", getLine(), getText()); };
RBRAKET			: ']'			{ Decaf.debug("RBRAKET", getLine(), getText()); };
SEMICO			: ';'			{ Decaf.debug("SEMICOLON", getLine(), getText()); };
COMA			: ','			{ Decaf.debug("COMA", getLine(), getText()); };
POINT			: '.'			{ Decaf.debug("POINT", getLine(), getText()); };
DPOINTS			: ':'			{ Decaf.debug("DPOINTS", getLine(), getText()); };

// NUMBERS
DIGIT			: NUM+			{ Decaf.debug("INT", getLine(), getText()); };
NEGNUM			: '-'NUM+		{ Decaf.debug("INT", getLine(), getText()); };

// OPERATORS
ADD1 			: '++'			{ Decaf.debug("ADD 1", getLine(), getText()); };
ASSIGNADD 		: '+='			{ Decaf.debug("ADD ASSIG", getLine(), getText()); };
ASSIGNSUB 		: '-='			{ Decaf.debug("SUB ASSIG", getLine(), getText()); };
MINUS1 			: '--'			{ Decaf.debug("SUBSTRACT 1", getLine(), getText()); };
LTOEQ			: '<='			{ Decaf.debug("LESS THAN OR EQUAL", getLine(), getText()); };
GTOEQ			: '>='			{ Decaf.debug("GREATER THAN OR EQUAL", getLine(), getText()); };
EQUAL			: '=='			{ Decaf.debug("EQUAL", getLine(), getText()); };
NEQUAL			: '!='			{ Decaf.debug("NOT EQUAL", getLine(), getText()); };
AND 			: '&&'			{ Decaf.debug("AND", getLine(), getText()); };
OR  			: '||'			{ Decaf.debug("OR", getLine(), getText()); };

LESSTHAN		: '<'			{ Decaf.debug("LESS THAN", getLine(), getText()); };
GREATHAN		: '>'			{ Decaf.debug("GREATER THAN", getLine(), getText()); };
ASSIGN			: '='			{ Decaf.debug("ASSIGN", getLine(), getText()); };
ADD 			: '+'			{ Decaf.debug("ADD", getLine(), getText()); };
MINUS 			: '-'			{ Decaf.debug("SUBSTRACT", getLine(), getText()); };
MULT 			: '*'			{ Decaf.debug("MULTIPLY", getLine(), getText()); };
DIV				: '/'			{ Decaf.debug("DIVIDE", getLine(), getText()); };
MOD				: '%'			{ Decaf.debug("DIVIDE", getLine(), getText()); };
NOT				: '!'			{ Decaf.debug("NOT", getLine(), getText()); };
RAISE			: '^'			{ Decaf.debug("POWER", getLine(), getText()); };
ORBITWISE		: '|'			{ Decaf.debug("OR BITWISE", getLine(), getText()); };
ANDBITWISE		: '&'			{ Decaf.debug("AND BITWISE", getLine(), getText()); };

// HEXDECIMAL
HEX 			: ('0'('x'|'X') (HEXCHAR|NUM)+ )				{ Decaf.debug("HEXLIT", getLine(), getText()); };

// IDENTIFIER
INDENTI			: (CHAR|UNDERSCORE)(CHAR|UNDERSCORE|NUM)* 		{ Decaf.debug("INDENTIFIER", getLine(), getText()); };

// STRINGS CHARS
STR 			: ('\"''\"'|('\"' (ASCII|ESC)+ '\"'))			{ Decaf.debug("STRING", getLine(), getText()); };
CHR 			: ('\'''\''|('\'' (ASCII|ESC) '\''))			{ Decaf.debug("CHAR", getLine(), getText()); };

// WHITESPACE
WHITESPACE		: (' '|'\b'|'\t'|'\n'|'\r')+ {skip();};


// ERROR FIX
NOTCHAR1		: ('\'' ('\b'|'\t'|'\n'|'\r') '\'') 			{ Decaf.debug("unexpected char", getLine(), getText()); };
NOTCHAR2		: ('\'' ('\''|'\"') '\'') 						{ Decaf.debug("unexpected char", getLine(), getText()); };
NOTCHAR3		: ('\'' '0'('X'|'x')(HEXCHAR|DIGIT)+ '\'') 		{ Decaf.debug("unexpected char", getLine(), getText()); };
NOTCHAR4		: ('\'' '\\'(ASCII) '\'') 						{ Decaf.debug("unexpected char", getLine(), getText()); };
NOTCHAR5		: ('\'' '\\' '\'')		 						{ Decaf.debug("unexpected char", getLine(), getText()); };
NOTCHAR6		: ('\'' (ASCII)(ASCII)+ '\'')					{ Decaf.debug("unexpected char", getLine(), getText()); };
NOTHEX1			: ('0'('x'|'X'))								{ Decaf.debug("invalid hex", getLine(), getText()); };
NOTHEX2			: ('0'('x'|'X') (CHAR|NUM)+ )					{ Decaf.debug("invalid hex", getLine(), getText()); };
NOTINDEN		: (CHAR|UNDERSCORE)(CHAR|UNDERSCORE|NUM|'\.')+	{ Decaf.debug("invalid indentifier", getLine(), getText()); };
QMARK			: '?'											{ Decaf.debug("unexpected char", getLine(), getText()); };
NOTSTR1 		: ('\"' (ASCII|ESC)+ '\'')		 				{ Decaf.debug("expecting \'\"\', invalid string", getLine(), getText()); };
NOTSTR2 		: ('\''|'\"')					 				{ Decaf.debug("unexpected char", getLine(), getText()); };
UNICODE1		: ('\u000C')									{ Decaf.debug("unexpected char", getLine(), "0xC"); };
UNICODE2		: (('\u0000'..'\u001F')|'\u007F')				{ Decaf.debug("unexpected char", getLine(), ""); };
UNICODE3		: ('\u0020'..'\u007E')							{ Decaf.debug("unexpected char", getLine(), getText()); };

