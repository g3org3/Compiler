lexer grammar Decaf;


@lexer::header{
	package compiler.scanner;
	import java.util.ArrayList;
}

@members {
	private boolean activate = false;
	private ArrayList<String> strList = new ArrayList<String>();
	private ArrayList<String> debugList = new ArrayList<String>();

    public void debug(String str, int line, String text){
    	this.debug(str, line, 0, text, 0);
	}
	public void debug(String str, int line, int charpos, String text, int e){
		String er = (e==1)? charpos+" ": " ";
		if (activate)
			debugList.add("    "+line+":"+ er + str+": "+text);
		else 
			strList.add("  "+line+":"+ er + str + ": " + text);
	}
	public void set(boolean bool){
		this.activate = bool;
	}
	public ArrayList<String> getList(){
		return this.strList;
	}
	public ArrayList<String> getDebug(){
		return this.debugList;
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
fragment ALPHA		: (CHAR|UNDERSCORE);

// COMMENTS
COMMENTS 		: (('//') ~('\n'|'\r')* '\r'? '\n') {skip();};

// KEYWORDS
BOOLEAN			: 'boolean'		{debug("KW BOOLEAN", getLine(), getText()); };
BREAK			: 'break'		{debug("KW BREAK", getLine(), getText()); };
CALLOUT			: 'callout'		{debug("KW CALLOUT", getLine(), getText()); };
CLASS			: 'class'		{debug("KW CLASS", getLine(), getText()); };
CONTINUE		: 'continue'	{debug("KW CONTINUE", getLine(), getText()); };
ELSE 			: 'else'		{debug("KW ELSE", getLine(), getText()); };
FOR				: 'for'			{debug("KW FOR", getLine(), getText()); };
IF 				: 'if'			{debug("KW IF", getLine(), getText()); };
INT 			: 'int'			{debug("KW INT", getLine(), getText()); };
RETURN 			: 'return'		{debug("KW RETURN", getLine(), getText()); };
VOID 			: 'void'		{debug("KW VOID", getLine(), getText()); };
PROGRAM			: 'Program'		{debug("KW PROGRAM", getLine(), getText()); };

// BOOLEANS
TRUE 			: 'true'		{debug("BOOLEAN", getLine(), getText()); };
FALSE			: 'false'		{debug("BOOLEAN", getLine(), getText()); };

// SYMBOLS
LPAREN			: '('			{debug("LPARENTESIS", getLine(), getText()); };
RPAREN			: ')'			{debug("RPARENTESIS", getLine(), getText()); };
LBRACE			: '{'			{debug("LBRACE", getLine(), getText()); };
RBRACE			: '}'			{debug("RBRACE", getLine(), getText()); };
LBRAKET			: '['			{debug("LBRAKET", getLine(), getText()); };
RBRAKET			: ']'			{debug("RBRAKET", getLine(), getText()); };
SEMICO			: ';'			{debug("SEMICOLON", getLine(), getText()); };
COMA			: ','			{debug("COMA", getLine(), getText()); };
POINT			: '.'			{debug("POINT", getLine(), getText()); };
DPOINTS			: ':'			{debug("DPOINTS", getLine(), getText()); };

// NUMBERS
DIGIT			: '-'? NUM+			{debug("INT", getLine(), getText()); };
//NEGNUM			: '-'NUM+		{debug("INT", getLine(), getText()); };

// OPERATORS
ADD1 			: '++'			{debug("ADD 1", getLine(), getText()); };
ASSIGNADD 		: '+='			{debug("ADD ASSIG", getLine(), getText()); };
ASSIGNSUB 		: '-='			{debug("SUB ASSIG", getLine(), getText()); };
MINUS1 			: '--'			{debug("SUBSTRACT 1", getLine(), getText()); };
LTOEQ			: '<='			{debug("LESS THAN OR EQUAL", getLine(), getText()); };
GTOEQ			: '>='			{debug("GREATER THAN OR EQUAL", getLine(), getText()); };
EQUAL			: '=='			{debug("EQUAL", getLine(), getText()); };
NEQUAL			: '!='			{debug("NOT EQUAL", getLine(), getText()); };
AND 			: '&&'			{debug("AND", getLine(), getText()); };
OR  			: '||'			{debug("OR", getLine(), getText()); };

LESSTHAN		: '<'			{debug("LESS THAN", getLine(), getText()); };
GREATHAN		: '>'			{debug("GREATER THAN", getLine(), getText()); };
ASSIGN			: '='			{debug("ASSIGN", getLine(), getText()); };
ADD 			: '+'			{debug("ADD", getLine(), getText()); };
MINUS 			: '-'			{debug("SUBSTRACT", getLine(), getText()); };
MULT 			: '*'			{debug("MULTIPLY", getLine(), getText()); };
DIV				: '/'			{debug("DIVIDE", getLine(), getText()); };
MOD				: '%'			{debug("DIVIDE", getLine(), getText()); };
NOT				: '!'			{debug("NOT", getLine(), getText()); };
RAISE			: '^'			{debug("POWER", getLine(), getText()); };
ORBITWISE		: '|'			{debug("OR BITWISE", getLine(), getText()); };
ANDBITWISE		: '&'			{debug("AND BITWISE", getLine(), getText()); };

// HEXDECIMAL
HEX 			: ('0'('x'|'X') (HEXCHAR|NUM)+ )				{debug("HEXLIT", getLine(), getText()); };

// IDENTIFIER
INDENTIFIER		: (CHAR|UNDERSCORE)(CHAR|UNDERSCORE|NUM)* 		{debug("INDENTIFIER", getLine(), getText()); };

// STRINGS CHARS
STR 			: ('\"''\"'|('\"' (ASCII|ESC)+ '\"'))			{debug("STRING", getLine(), getText()); };
CHR 			: ('\'''\''|('\'' (ASCII|ESC) '\''))			{debug("CHAR", getLine(), getText()); };

// WHITESPACE
WHITESPACE		: (' '|'\b'|'\t'|'\n'|'\r')+ {skip();};


// ERROR FIX
NOTCHAR1		: ('\'' ('\b'|'\t'|'\n'|'\r') '\'') 			{debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); };
NOTCHAR2		: ('\'' ('\''|'\"') '\'') 						{debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); };
NOTCHAR3		: ('\'' '0'('X'|'x')(HEXCHAR|DIGIT)+ '\'') 		{debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); };
NOTCHAR4		: ('\'' '\\'(ASCII) '\'') 						{debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); };
NOTCHAR5		: ('\'' '\\' '\'')		 						{debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); };
NOTCHAR6		: ('\'' (ASCII)(ASCII)+ '\'')					{debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); };
NOTHEX1			: ('0'('x'|'X'))								{debug("invalid hex", getLine(), getCharPositionInLine(), getText(), 1); };
NOTHEX2			: ('0'('x'|'X') (CHAR|NUM)+ )					{debug("invalid hex", getLine(), getCharPositionInLine(), getText(), 1); };
NOTINDEN		: (CHAR|UNDERSCORE)(CHAR|UNDERSCORE|NUM|'\.')+	{debug("invalid indentifier", getLine(), getCharPositionInLine(), getText(), 1); };
QMARK			: '?'											{debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); };
NOTSTR1 		: ('\"' (ASCII|ESC)+ '\'')		 				{debug("expecting \'\"\', invalid string", getLine(), getCharPositionInLine(), getText(), 1); };
NOTSTR2 		: ('\'' (ASCII|ESC)+ '\"')		 				{debug("expecting \'\'\', invalid char", getLine(), getCharPositionInLine(), getText(), 1); };
NOTSTR3 		: ('\''|'\"')					 				{debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); };
UNICODE1		: ('\u000C')									{debug("unexpected char", getLine(), "0xC"); };
UNICODE2		: (('\u0000'..'\u001F')|'\u007F')				{debug("unexpected char", getLine(), ""); };
UNICODE3		: ('\u0020'..'\u007E')							{debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); };

