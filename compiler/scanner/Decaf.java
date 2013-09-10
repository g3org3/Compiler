// $ANTLR 3.4 compiler/scanner/Decaf.g 2013-09-10 09:16:09

	package compiler.scanner;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Decaf extends Lexer {
    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int ADD1=5;
    public static final int ALPHA=6;
    public static final int AND=7;
    public static final int ANDBITWISE=8;
    public static final int ASCII=9;
    public static final int ASSIGN=10;
    public static final int ASSIGNADD=11;
    public static final int ASSIGNSUB=12;
    public static final int BOOLEAN=13;
    public static final int BREAK=14;
    public static final int CALLOUT=15;
    public static final int CHAR=16;
    public static final int CHR=17;
    public static final int CLASS=18;
    public static final int COMA=19;
    public static final int COMMENTS=20;
    public static final int CONTINUE=21;
    public static final int DIGIT=22;
    public static final int DIV=23;
    public static final int DPOINTS=24;
    public static final int ELSE=25;
    public static final int EQUAL=26;
    public static final int ESC=27;
    public static final int FALSE=28;
    public static final int FOR=29;
    public static final int GREATHAN=30;
    public static final int GTOEQ=31;
    public static final int HEX=32;
    public static final int HEXCHAR=33;
    public static final int IF=34;
    public static final int INDENTIFIER=35;
    public static final int INT=36;
    public static final int LBRACE=37;
    public static final int LBRAKET=38;
    public static final int LESSTHAN=39;
    public static final int LPAREN=40;
    public static final int LTOEQ=41;
    public static final int MINUS=42;
    public static final int MINUS1=43;
    public static final int MOD=44;
    public static final int MULT=45;
    public static final int NEQUAL=46;
    public static final int NOT=47;
    public static final int NOTCHAR1=48;
    public static final int NOTCHAR2=49;
    public static final int NOTCHAR3=50;
    public static final int NOTCHAR4=51;
    public static final int NOTCHAR5=52;
    public static final int NOTCHAR6=53;
    public static final int NOTHEX1=54;
    public static final int NOTHEX2=55;
    public static final int NOTINDEN=56;
    public static final int NOTSTR1=57;
    public static final int NOTSTR2=58;
    public static final int NOTSTR3=59;
    public static final int NUM=60;
    public static final int OR=61;
    public static final int ORBITWISE=62;
    public static final int POINT=63;
    public static final int PROGRAM=64;
    public static final int QMARK=65;
    public static final int RAISE=66;
    public static final int RBRACE=67;
    public static final int RBRAKET=68;
    public static final int RETURN=69;
    public static final int RPAREN=70;
    public static final int SEMICO=71;
    public static final int STR=72;
    public static final int TRUE=73;
    public static final int UCASE=74;
    public static final int UNDERSCORE=75;
    public static final int UNICODE1=76;
    public static final int UNICODE2=77;
    public static final int UNICODE3=78;
    public static final int VOID=79;
    public static final int WHITESPACE=80;

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



    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Decaf() {} 
    public Decaf(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Decaf(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "compiler/scanner/Decaf.g"; }

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:37:18: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // compiler/scanner/Decaf.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "ASCII"
    public final void mASCII() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:38:17: ( ( ( ' ' .. '!' ) | ( '#' .. '&' ) | ( '(' .. '[' ) | ( ']' .. '~' ) ) )
            // compiler/scanner/Decaf.g:
            {
            if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '~') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASCII"

    // $ANTLR start "UCASE"
    public final void mUCASE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:39:19: ( ( 'A' .. 'Z' ) )
            // compiler/scanner/Decaf.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UCASE"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:40:16: ( ( '0' .. '9' ) )
            // compiler/scanner/Decaf.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "HEXCHAR"
    public final void mHEXCHAR() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:41:19: ( ( 'A' .. 'F' ) | ( 'a' .. 'f' ) )
            // compiler/scanner/Decaf.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEXCHAR"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:42:15: ( ( '\\\\b' | '\\\\t' | '\\\\n' | '\\\\r' | '\\\\\\\"' | '\\\\\\'' | '\\\\\\\\' ) )
            // compiler/scanner/Decaf.g:42:17: ( '\\\\b' | '\\\\t' | '\\\\n' | '\\\\r' | '\\\\\\\"' | '\\\\\\'' | '\\\\\\\\' )
            {
            // compiler/scanner/Decaf.g:42:17: ( '\\\\b' | '\\\\t' | '\\\\n' | '\\\\r' | '\\\\\\\"' | '\\\\\\'' | '\\\\\\\\' )
            int alt1=7;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'b':
                    {
                    alt1=1;
                    }
                    break;
                case 't':
                    {
                    alt1=2;
                    }
                    break;
                case 'n':
                    {
                    alt1=3;
                    }
                    break;
                case 'r':
                    {
                    alt1=4;
                    }
                    break;
                case '\"':
                    {
                    alt1=5;
                    }
                    break;
                case '\'':
                    {
                    alt1=6;
                    }
                    break;
                case '\\':
                    {
                    alt1=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // compiler/scanner/Decaf.g:42:18: '\\\\b'
                    {
                    match("\\b"); 



                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:42:24: '\\\\t'
                    {
                    match("\\t"); 



                    }
                    break;
                case 3 :
                    // compiler/scanner/Decaf.g:42:30: '\\\\n'
                    {
                    match("\\n"); 



                    }
                    break;
                case 4 :
                    // compiler/scanner/Decaf.g:42:36: '\\\\r'
                    {
                    match("\\r"); 



                    }
                    break;
                case 5 :
                    // compiler/scanner/Decaf.g:42:42: '\\\\\\\"'
                    {
                    match("\\\""); 



                    }
                    break;
                case 6 :
                    // compiler/scanner/Decaf.g:42:49: '\\\\\\''
                    {
                    match("\\'"); 



                    }
                    break;
                case 7 :
                    // compiler/scanner/Decaf.g:42:56: '\\\\\\\\'
                    {
                    match("\\\\"); 



                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:43:21: ( '_' )
            // compiler/scanner/Decaf.g:43:23: '_'
            {
            match('_'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:44:17: ( ( CHAR | UNDERSCORE ) )
            // compiler/scanner/Decaf.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALPHA"

    // $ANTLR start "COMMENTS"
    public final void mCOMMENTS() throws RecognitionException {
        try {
            int _type = COMMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:47:12: ( ( ( '//' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' ) )
            // compiler/scanner/Decaf.g:47:14: ( ( '//' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            {
            // compiler/scanner/Decaf.g:47:14: ( ( '//' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // compiler/scanner/Decaf.g:47:15: ( '//' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            // compiler/scanner/Decaf.g:47:15: ( '//' )
            // compiler/scanner/Decaf.g:47:16: '//'
            {
            match("//"); 



            }


            // compiler/scanner/Decaf.g:47:22: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // compiler/scanner/Decaf.g:47:36: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // compiler/scanner/Decaf.g:47:36: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENTS"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:50:11: ( 'boolean' )
            // compiler/scanner/Decaf.g:50:13: 'boolean'
            {
            match("boolean"); 



            debug("KW BOOLEAN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:51:9: ( 'break' )
            // compiler/scanner/Decaf.g:51:11: 'break'
            {
            match("break"); 



            debug("KW BREAK", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CALLOUT"
    public final void mCALLOUT() throws RecognitionException {
        try {
            int _type = CALLOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:52:11: ( 'callout' )
            // compiler/scanner/Decaf.g:52:13: 'callout'
            {
            match("callout"); 



            debug("KW CALLOUT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CALLOUT"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:53:9: ( 'class' )
            // compiler/scanner/Decaf.g:53:11: 'class'
            {
            match("class"); 



            debug("KW CLASS", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:54:11: ( 'continue' )
            // compiler/scanner/Decaf.g:54:13: 'continue'
            {
            match("continue"); 



            debug("KW CONTINUE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:55:9: ( 'else' )
            // compiler/scanner/Decaf.g:55:11: 'else'
            {
            match("else"); 



            debug("KW ELSE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:56:8: ( 'for' )
            // compiler/scanner/Decaf.g:56:10: 'for'
            {
            match("for"); 



            debug("KW FOR", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:57:8: ( 'if' )
            // compiler/scanner/Decaf.g:57:10: 'if'
            {
            match("if"); 



            debug("KW IF", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:58:8: ( 'int' )
            // compiler/scanner/Decaf.g:58:10: 'int'
            {
            match("int"); 



            debug("KW INT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:59:11: ( 'return' )
            // compiler/scanner/Decaf.g:59:13: 'return'
            {
            match("return"); 



            debug("KW RETURN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:60:9: ( 'void' )
            // compiler/scanner/Decaf.g:60:11: 'void'
            {
            match("void"); 



            debug("KW VOID", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:61:11: ( 'Program' )
            // compiler/scanner/Decaf.g:61:13: 'Program'
            {
            match("Program"); 



            debug("KW PROGRAM", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:64:9: ( 'true' )
            // compiler/scanner/Decaf.g:64:11: 'true'
            {
            match("true"); 



            debug("BOOLEAN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:65:9: ( 'false' )
            // compiler/scanner/Decaf.g:65:11: 'false'
            {
            match("false"); 



            debug("BOOLEAN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:68:10: ( '(' )
            // compiler/scanner/Decaf.g:68:12: '('
            {
            match('('); 

            debug("LPARENTESIS", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:69:10: ( ')' )
            // compiler/scanner/Decaf.g:69:12: ')'
            {
            match(')'); 

            debug("RPARENTESIS", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:70:10: ( '{' )
            // compiler/scanner/Decaf.g:70:12: '{'
            {
            match('{'); 

            debug("LBRACE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:71:10: ( '}' )
            // compiler/scanner/Decaf.g:71:12: '}'
            {
            match('}'); 

            debug("RBRACE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LBRAKET"
    public final void mLBRAKET() throws RecognitionException {
        try {
            int _type = LBRAKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:72:11: ( '[' )
            // compiler/scanner/Decaf.g:72:13: '['
            {
            match('['); 

            debug("LBRAKET", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRAKET"

    // $ANTLR start "RBRAKET"
    public final void mRBRAKET() throws RecognitionException {
        try {
            int _type = RBRAKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:73:11: ( ']' )
            // compiler/scanner/Decaf.g:73:13: ']'
            {
            match(']'); 

            debug("RBRAKET", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRAKET"

    // $ANTLR start "SEMICO"
    public final void mSEMICO() throws RecognitionException {
        try {
            int _type = SEMICO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:74:10: ( ';' )
            // compiler/scanner/Decaf.g:74:12: ';'
            {
            match(';'); 

            debug("SEMICOLON", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICO"

    // $ANTLR start "COMA"
    public final void mCOMA() throws RecognitionException {
        try {
            int _type = COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:75:8: ( ',' )
            // compiler/scanner/Decaf.g:75:10: ','
            {
            match(','); 

            debug("COMA", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMA"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:76:9: ( '.' )
            // compiler/scanner/Decaf.g:76:11: '.'
            {
            match('.'); 

            debug("POINT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "DPOINTS"
    public final void mDPOINTS() throws RecognitionException {
        try {
            int _type = DPOINTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:77:11: ( ':' )
            // compiler/scanner/Decaf.g:77:13: ':'
            {
            match(':'); 

            debug("DPOINTS", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DPOINTS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:80:9: ( ( '-' )? ( NUM )+ )
            // compiler/scanner/Decaf.g:80:11: ( '-' )? ( NUM )+
            {
            // compiler/scanner/Decaf.g:80:11: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // compiler/scanner/Decaf.g:80:11: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // compiler/scanner/Decaf.g:80:16: ( NUM )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            debug("INT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ADD1"
    public final void mADD1() throws RecognitionException {
        try {
            int _type = ADD1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:84:9: ( '++' )
            // compiler/scanner/Decaf.g:84:11: '++'
            {
            match("++"); 



            debug("ADD 1", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD1"

    // $ANTLR start "ASSIGNADD"
    public final void mASSIGNADD() throws RecognitionException {
        try {
            int _type = ASSIGNADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:85:13: ( '+=' )
            // compiler/scanner/Decaf.g:85:15: '+='
            {
            match("+="); 



            debug("ADD ASSIG", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGNADD"

    // $ANTLR start "ASSIGNSUB"
    public final void mASSIGNSUB() throws RecognitionException {
        try {
            int _type = ASSIGNSUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:86:13: ( '-=' )
            // compiler/scanner/Decaf.g:86:15: '-='
            {
            match("-="); 



            debug("SUB ASSIG", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGNSUB"

    // $ANTLR start "MINUS1"
    public final void mMINUS1() throws RecognitionException {
        try {
            int _type = MINUS1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:87:11: ( '--' )
            // compiler/scanner/Decaf.g:87:13: '--'
            {
            match("--"); 



            debug("SUBSTRACT 1", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS1"

    // $ANTLR start "LTOEQ"
    public final void mLTOEQ() throws RecognitionException {
        try {
            int _type = LTOEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:88:9: ( '<=' )
            // compiler/scanner/Decaf.g:88:11: '<='
            {
            match("<="); 



            debug("LESS THAN OR EQUAL", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTOEQ"

    // $ANTLR start "GTOEQ"
    public final void mGTOEQ() throws RecognitionException {
        try {
            int _type = GTOEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:89:9: ( '>=' )
            // compiler/scanner/Decaf.g:89:11: '>='
            {
            match(">="); 



            debug("GREATER THAN OR EQUAL", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTOEQ"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:90:9: ( '==' )
            // compiler/scanner/Decaf.g:90:11: '=='
            {
            match("=="); 



            debug("EQUAL", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NEQUAL"
    public final void mNEQUAL() throws RecognitionException {
        try {
            int _type = NEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:91:10: ( '!=' )
            // compiler/scanner/Decaf.g:91:12: '!='
            {
            match("!="); 



            debug("NOT EQUAL", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQUAL"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:92:8: ( '&&' )
            // compiler/scanner/Decaf.g:92:10: '&&'
            {
            match("&&"); 



            debug("AND", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:93:8: ( '||' )
            // compiler/scanner/Decaf.g:93:10: '||'
            {
            match("||"); 



            debug("OR", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:95:11: ( '<' )
            // compiler/scanner/Decaf.g:95:13: '<'
            {
            match('<'); 

            debug("LESS THAN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHAN"

    // $ANTLR start "GREATHAN"
    public final void mGREATHAN() throws RecognitionException {
        try {
            int _type = GREATHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:96:11: ( '>' )
            // compiler/scanner/Decaf.g:96:13: '>'
            {
            match('>'); 

            debug("GREATER THAN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATHAN"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:97:10: ( '=' )
            // compiler/scanner/Decaf.g:97:12: '='
            {
            match('='); 

            debug("ASSIGN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:98:8: ( '+' )
            // compiler/scanner/Decaf.g:98:10: '+'
            {
            match('+'); 

            debug("ADD", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:99:10: ( '-' )
            // compiler/scanner/Decaf.g:99:12: '-'
            {
            match('-'); 

            debug("SUBSTRACT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:100:9: ( '*' )
            // compiler/scanner/Decaf.g:100:11: '*'
            {
            match('*'); 

            debug("MULTIPLY", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:101:8: ( '/' )
            // compiler/scanner/Decaf.g:101:10: '/'
            {
            match('/'); 

            debug("DIVIDE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:102:8: ( '%' )
            // compiler/scanner/Decaf.g:102:10: '%'
            {
            match('%'); 

            debug("DIVIDE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:103:8: ( '!' )
            // compiler/scanner/Decaf.g:103:10: '!'
            {
            match('!'); 

            debug("NOT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "RAISE"
    public final void mRAISE() throws RecognitionException {
        try {
            int _type = RAISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:104:9: ( '^' )
            // compiler/scanner/Decaf.g:104:11: '^'
            {
            match('^'); 

            debug("POWER", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RAISE"

    // $ANTLR start "ORBITWISE"
    public final void mORBITWISE() throws RecognitionException {
        try {
            int _type = ORBITWISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:105:12: ( '|' )
            // compiler/scanner/Decaf.g:105:14: '|'
            {
            match('|'); 

            debug("OR BITWISE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORBITWISE"

    // $ANTLR start "ANDBITWISE"
    public final void mANDBITWISE() throws RecognitionException {
        try {
            int _type = ANDBITWISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:106:13: ( '&' )
            // compiler/scanner/Decaf.g:106:15: '&'
            {
            match('&'); 

            debug("AND BITWISE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANDBITWISE"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:109:8: ( ( '0' ( 'x' | 'X' ) ( HEXCHAR | NUM )+ ) )
            // compiler/scanner/Decaf.g:109:10: ( '0' ( 'x' | 'X' ) ( HEXCHAR | NUM )+ )
            {
            // compiler/scanner/Decaf.g:109:10: ( '0' ( 'x' | 'X' ) ( HEXCHAR | NUM )+ )
            // compiler/scanner/Decaf.g:109:11: '0' ( 'x' | 'X' ) ( HEXCHAR | NUM )+
            {
            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:109:24: ( HEXCHAR | NUM )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'F')||(LA6_0 >= 'a' && LA6_0 <= 'f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            debug("HEXLIT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "INDENTIFIER"
    public final void mINDENTIFIER() throws RecognitionException {
        try {
            int _type = INDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:112:14: ( ( CHAR | UNDERSCORE ) ( CHAR | UNDERSCORE | NUM )* )
            // compiler/scanner/Decaf.g:112:16: ( CHAR | UNDERSCORE ) ( CHAR | UNDERSCORE | NUM )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:112:33: ( CHAR | UNDERSCORE | NUM )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            debug("INDENTIFIER", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INDENTIFIER"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:115:8: ( ( '\\\"' '\\\"' | ( '\\\"' ( ASCII | ESC )+ '\\\"' ) ) )
            // compiler/scanner/Decaf.g:115:10: ( '\\\"' '\\\"' | ( '\\\"' ( ASCII | ESC )+ '\\\"' ) )
            {
            // compiler/scanner/Decaf.g:115:10: ( '\\\"' '\\\"' | ( '\\\"' ( ASCII | ESC )+ '\\\"' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='\"') ) {
                    alt9=1;
                }
                else if ( ((LA9_1 >= ' ' && LA9_1 <= '!')||(LA9_1 >= '#' && LA9_1 <= '&')||(LA9_1 >= '(' && LA9_1 <= '~')) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // compiler/scanner/Decaf.g:115:11: '\\\"' '\\\"'
                    {
                    match('\"'); 

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:115:20: ( '\\\"' ( ASCII | ESC )+ '\\\"' )
                    {
                    // compiler/scanner/Decaf.g:115:20: ( '\\\"' ( ASCII | ESC )+ '\\\"' )
                    // compiler/scanner/Decaf.g:115:21: '\\\"' ( ASCII | ESC )+ '\\\"'
                    {
                    match('\"'); 

                    // compiler/scanner/Decaf.g:115:26: ( ASCII | ESC )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= ' ' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '~')) ) {
                            alt8=1;
                        }
                        else if ( (LA8_0=='\\') ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // compiler/scanner/Decaf.g:115:27: ASCII
                    	    {
                    	    mASCII(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // compiler/scanner/Decaf.g:115:33: ESC
                    	    {
                    	    mESC(); 


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    match('\"'); 

                    }


                    }
                    break;

            }


            debug("STRING", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "CHR"
    public final void mCHR() throws RecognitionException {
        try {
            int _type = CHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:116:8: ( ( '\\'' '\\'' | ( '\\'' ( ASCII | ESC ) '\\'' ) ) )
            // compiler/scanner/Decaf.g:116:10: ( '\\'' '\\'' | ( '\\'' ( ASCII | ESC ) '\\'' ) )
            {
            // compiler/scanner/Decaf.g:116:10: ( '\\'' '\\'' | ( '\\'' ( ASCII | ESC ) '\\'' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\'') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\'') ) {
                    alt11=1;
                }
                else if ( ((LA11_1 >= ' ' && LA11_1 <= '!')||(LA11_1 >= '#' && LA11_1 <= '&')||(LA11_1 >= '(' && LA11_1 <= '~')) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // compiler/scanner/Decaf.g:116:11: '\\'' '\\''
                    {
                    match('\''); 

                    match('\''); 

                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:116:20: ( '\\'' ( ASCII | ESC ) '\\'' )
                    {
                    // compiler/scanner/Decaf.g:116:20: ( '\\'' ( ASCII | ESC ) '\\'' )
                    // compiler/scanner/Decaf.g:116:21: '\\'' ( ASCII | ESC ) '\\''
                    {
                    match('\''); 

                    // compiler/scanner/Decaf.g:116:26: ( ASCII | ESC )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0 >= ' ' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '&')||(LA10_0 >= '(' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '~')) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0=='\\') ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }
                    switch (alt10) {
                        case 1 :
                            // compiler/scanner/Decaf.g:116:27: ASCII
                            {
                            mASCII(); 


                            }
                            break;
                        case 2 :
                            // compiler/scanner/Decaf.g:116:33: ESC
                            {
                            mESC(); 


                            }
                            break;

                    }


                    match('\''); 

                    }


                    }
                    break;

            }


            debug("CHAR", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHR"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:119:13: ( ( ' ' | '\\b' | '\\t' | '\\n' | '\\r' )+ )
            // compiler/scanner/Decaf.g:119:15: ( ' ' | '\\b' | '\\t' | '\\n' | '\\r' )+
            {
            // compiler/scanner/Decaf.g:119:15: ( ' ' | '\\b' | '\\t' | '\\n' | '\\r' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\b' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( (input.LA(1) >= '\b' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "NOTCHAR1"
    public final void mNOTCHAR1() throws RecognitionException {
        try {
            int _type = NOTCHAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:123:11: ( ( '\\'' ( '\\b' | '\\t' | '\\n' | '\\r' ) '\\'' ) )
            // compiler/scanner/Decaf.g:123:13: ( '\\'' ( '\\b' | '\\t' | '\\n' | '\\r' ) '\\'' )
            {
            // compiler/scanner/Decaf.g:123:13: ( '\\'' ( '\\b' | '\\t' | '\\n' | '\\r' ) '\\'' )
            // compiler/scanner/Decaf.g:123:14: '\\'' ( '\\b' | '\\t' | '\\n' | '\\r' ) '\\''
            {
            match('\''); 

            if ( (input.LA(1) >= '\b' && input.LA(1) <= '\n')||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            }


            debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTCHAR1"

    // $ANTLR start "NOTCHAR2"
    public final void mNOTCHAR2() throws RecognitionException {
        try {
            int _type = NOTCHAR2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:124:11: ( ( '\\'' ( '\\'' | '\\\"' ) '\\'' ) )
            // compiler/scanner/Decaf.g:124:13: ( '\\'' ( '\\'' | '\\\"' ) '\\'' )
            {
            // compiler/scanner/Decaf.g:124:13: ( '\\'' ( '\\'' | '\\\"' ) '\\'' )
            // compiler/scanner/Decaf.g:124:14: '\\'' ( '\\'' | '\\\"' ) '\\''
            {
            match('\''); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            }


            debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTCHAR2"

    // $ANTLR start "NOTCHAR3"
    public final void mNOTCHAR3() throws RecognitionException {
        try {
            int _type = NOTCHAR3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:125:11: ( ( '\\'' '0' ( 'X' | 'x' ) ( HEXCHAR | DIGIT )+ '\\'' ) )
            // compiler/scanner/Decaf.g:125:13: ( '\\'' '0' ( 'X' | 'x' ) ( HEXCHAR | DIGIT )+ '\\'' )
            {
            // compiler/scanner/Decaf.g:125:13: ( '\\'' '0' ( 'X' | 'x' ) ( HEXCHAR | DIGIT )+ '\\'' )
            // compiler/scanner/Decaf.g:125:14: '\\'' '0' ( 'X' | 'x' ) ( HEXCHAR | DIGIT )+ '\\''
            {
            match('\''); 

            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:125:31: ( HEXCHAR | DIGIT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= 'A' && LA13_0 <= 'F')||(LA13_0 >= 'a' && LA13_0 <= 'f')) ) {
                    alt13=1;
                }
                else if ( (LA13_0=='-'||(LA13_0 >= '0' && LA13_0 <= '9')) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:125:32: HEXCHAR
            	    {
            	    mHEXCHAR(); 


            	    }
            	    break;
            	case 2 :
            	    // compiler/scanner/Decaf.g:125:40: DIGIT
            	    {
            	    mDIGIT(); 


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match('\''); 

            }


            debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTCHAR3"

    // $ANTLR start "NOTCHAR4"
    public final void mNOTCHAR4() throws RecognitionException {
        try {
            int _type = NOTCHAR4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:126:11: ( ( '\\'' '\\\\' ( ASCII ) '\\'' ) )
            // compiler/scanner/Decaf.g:126:13: ( '\\'' '\\\\' ( ASCII ) '\\'' )
            {
            // compiler/scanner/Decaf.g:126:13: ( '\\'' '\\\\' ( ASCII ) '\\'' )
            // compiler/scanner/Decaf.g:126:14: '\\'' '\\\\' ( ASCII ) '\\''
            {
            match('\''); 

            match('\\'); 

            if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '~') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            }


            debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTCHAR4"

    // $ANTLR start "NOTCHAR5"
    public final void mNOTCHAR5() throws RecognitionException {
        try {
            int _type = NOTCHAR5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:127:11: ( ( '\\'' '\\\\' '\\'' ) )
            // compiler/scanner/Decaf.g:127:13: ( '\\'' '\\\\' '\\'' )
            {
            // compiler/scanner/Decaf.g:127:13: ( '\\'' '\\\\' '\\'' )
            // compiler/scanner/Decaf.g:127:14: '\\'' '\\\\' '\\''
            {
            match('\''); 

            match('\\'); 

            match('\''); 

            }


            debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTCHAR5"

    // $ANTLR start "NOTCHAR6"
    public final void mNOTCHAR6() throws RecognitionException {
        try {
            int _type = NOTCHAR6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:128:11: ( ( '\\'' ( ASCII ) ( ASCII )+ '\\'' ) )
            // compiler/scanner/Decaf.g:128:13: ( '\\'' ( ASCII ) ( ASCII )+ '\\'' )
            {
            // compiler/scanner/Decaf.g:128:13: ( '\\'' ( ASCII ) ( ASCII )+ '\\'' )
            // compiler/scanner/Decaf.g:128:14: '\\'' ( ASCII ) ( ASCII )+ '\\''
            {
            match('\''); 

            if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '~') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:128:26: ( ASCII )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= ' ' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '&')||(LA14_0 >= '(' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '~')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '~') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            match('\''); 

            }


            debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTCHAR6"

    // $ANTLR start "NOTHEX1"
    public final void mNOTHEX1() throws RecognitionException {
        try {
            int _type = NOTHEX1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:129:11: ( ( '0' ( 'x' | 'X' ) ) )
            // compiler/scanner/Decaf.g:129:13: ( '0' ( 'x' | 'X' ) )
            {
            // compiler/scanner/Decaf.g:129:13: ( '0' ( 'x' | 'X' ) )
            // compiler/scanner/Decaf.g:129:14: '0' ( 'x' | 'X' )
            {
            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


            debug("invalid hex", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTHEX1"

    // $ANTLR start "NOTHEX2"
    public final void mNOTHEX2() throws RecognitionException {
        try {
            int _type = NOTHEX2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:130:11: ( ( '0' ( 'x' | 'X' ) ( CHAR | NUM )+ ) )
            // compiler/scanner/Decaf.g:130:13: ( '0' ( 'x' | 'X' ) ( CHAR | NUM )+ )
            {
            // compiler/scanner/Decaf.g:130:13: ( '0' ( 'x' | 'X' ) ( CHAR | NUM )+ )
            // compiler/scanner/Decaf.g:130:14: '0' ( 'x' | 'X' ) ( CHAR | NUM )+
            {
            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:130:27: ( CHAR | NUM )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'A' && LA15_0 <= 'Z')||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            debug("invalid hex", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTHEX2"

    // $ANTLR start "NOTINDEN"
    public final void mNOTINDEN() throws RecognitionException {
        try {
            int _type = NOTINDEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:131:11: ( ( CHAR | UNDERSCORE ) ( CHAR | UNDERSCORE | NUM | '\\.' )+ )
            // compiler/scanner/Decaf.g:131:13: ( CHAR | UNDERSCORE ) ( CHAR | UNDERSCORE | NUM | '\\.' )+
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:131:30: ( CHAR | UNDERSCORE | NUM | '\\.' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='.'||(LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= 'A' && LA16_0 <= 'Z')||LA16_0=='_'||(LA16_0 >= 'a' && LA16_0 <= 'z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            debug("invalid indentifier", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTINDEN"

    // $ANTLR start "QMARK"
    public final void mQMARK() throws RecognitionException {
        try {
            int _type = QMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:132:9: ( '?' )
            // compiler/scanner/Decaf.g:132:11: '?'
            {
            match('?'); 

            debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QMARK"

    // $ANTLR start "NOTSTR1"
    public final void mNOTSTR1() throws RecognitionException {
        try {
            int _type = NOTSTR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:133:11: ( ( '\\\"' ( ASCII | ESC )+ '\\'' ) )
            // compiler/scanner/Decaf.g:133:13: ( '\\\"' ( ASCII | ESC )+ '\\'' )
            {
            // compiler/scanner/Decaf.g:133:13: ( '\\\"' ( ASCII | ESC )+ '\\'' )
            // compiler/scanner/Decaf.g:133:14: '\\\"' ( ASCII | ESC )+ '\\''
            {
            match('\"'); 

            // compiler/scanner/Decaf.g:133:19: ( ASCII | ESC )+
            int cnt17=0;
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= ' ' && LA17_0 <= '!')||(LA17_0 >= '#' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '~')) ) {
                    alt17=1;
                }
                else if ( (LA17_0=='\\') ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:133:20: ASCII
            	    {
            	    mASCII(); 


            	    }
            	    break;
            	case 2 :
            	    // compiler/scanner/Decaf.g:133:26: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            match('\''); 

            }


            debug("expecting \'\"\', invalid string", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTSTR1"

    // $ANTLR start "NOTSTR2"
    public final void mNOTSTR2() throws RecognitionException {
        try {
            int _type = NOTSTR2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:134:11: ( ( '\\'' ( ASCII | ESC )+ '\\\"' ) )
            // compiler/scanner/Decaf.g:134:13: ( '\\'' ( ASCII | ESC )+ '\\\"' )
            {
            // compiler/scanner/Decaf.g:134:13: ( '\\'' ( ASCII | ESC )+ '\\\"' )
            // compiler/scanner/Decaf.g:134:14: '\\'' ( ASCII | ESC )+ '\\\"'
            {
            match('\''); 

            // compiler/scanner/Decaf.g:134:19: ( ASCII | ESC )+
            int cnt18=0;
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= ' ' && LA18_0 <= '!')||(LA18_0 >= '#' && LA18_0 <= '&')||(LA18_0 >= '(' && LA18_0 <= '[')||(LA18_0 >= ']' && LA18_0 <= '~')) ) {
                    alt18=1;
                }
                else if ( (LA18_0=='\\') ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:134:20: ASCII
            	    {
            	    mASCII(); 


            	    }
            	    break;
            	case 2 :
            	    // compiler/scanner/Decaf.g:134:26: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            match('\"'); 

            }


            debug("expecting \'\'\', invalid char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTSTR2"

    // $ANTLR start "NOTSTR3"
    public final void mNOTSTR3() throws RecognitionException {
        try {
            int _type = NOTSTR3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:135:11: ( ( '\\'' | '\\\"' ) )
            // compiler/scanner/Decaf.g:135:13: ( '\\'' | '\\\"' )
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTSTR3"

    // $ANTLR start "UNICODE1"
    public final void mUNICODE1() throws RecognitionException {
        try {
            int _type = UNICODE1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:136:11: ( ( '\\u000C' ) )
            // compiler/scanner/Decaf.g:136:13: ( '\\u000C' )
            {
            // compiler/scanner/Decaf.g:136:13: ( '\\u000C' )
            // compiler/scanner/Decaf.g:136:14: '\\u000C'
            {
            match('\f'); 

            }


            debug("unexpected char", getLine(), "0xC"); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE1"

    // $ANTLR start "UNICODE2"
    public final void mUNICODE2() throws RecognitionException {
        try {
            int _type = UNICODE2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:137:11: ( ( ( '\\u0000' .. '\\u001F' ) | '\\u007F' ) )
            // compiler/scanner/Decaf.g:137:13: ( ( '\\u0000' .. '\\u001F' ) | '\\u007F' )
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\u001F')||input.LA(1)=='\u007F' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            debug("unexpected char", getLine(), ""); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE2"

    // $ANTLR start "UNICODE3"
    public final void mUNICODE3() throws RecognitionException {
        try {
            int _type = UNICODE3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:138:11: ( ( '\\u0020' .. '\\u007E' ) )
            // compiler/scanner/Decaf.g:138:13: ( '\\u0020' .. '\\u007E' )
            {
            if ( (input.LA(1) >= ' ' && input.LA(1) <= '~') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            debug("unexpected char", getLine(), getCharPositionInLine(), getText(), 1); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE3"

    public void mTokens() throws RecognitionException {
        // compiler/scanner/Decaf.g:1:8: ( COMMENTS | BOOLEAN | BREAK | CALLOUT | CLASS | CONTINUE | ELSE | FOR | IF | INT | RETURN | VOID | PROGRAM | TRUE | FALSE | LPAREN | RPAREN | LBRACE | RBRACE | LBRAKET | RBRAKET | SEMICO | COMA | POINT | DPOINTS | DIGIT | ADD1 | ASSIGNADD | ASSIGNSUB | MINUS1 | LTOEQ | GTOEQ | EQUAL | NEQUAL | AND | OR | LESSTHAN | GREATHAN | ASSIGN | ADD | MINUS | MULT | DIV | MOD | NOT | RAISE | ORBITWISE | ANDBITWISE | HEX | INDENTIFIER | STR | CHR | WHITESPACE | NOTCHAR1 | NOTCHAR2 | NOTCHAR3 | NOTCHAR4 | NOTCHAR5 | NOTCHAR6 | NOTHEX1 | NOTHEX2 | NOTINDEN | QMARK | NOTSTR1 | NOTSTR2 | NOTSTR3 | UNICODE1 | UNICODE2 | UNICODE3 )
        int alt19=69;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // compiler/scanner/Decaf.g:1:10: COMMENTS
                {
                mCOMMENTS(); 


                }
                break;
            case 2 :
                // compiler/scanner/Decaf.g:1:19: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 3 :
                // compiler/scanner/Decaf.g:1:27: BREAK
                {
                mBREAK(); 


                }
                break;
            case 4 :
                // compiler/scanner/Decaf.g:1:33: CALLOUT
                {
                mCALLOUT(); 


                }
                break;
            case 5 :
                // compiler/scanner/Decaf.g:1:41: CLASS
                {
                mCLASS(); 


                }
                break;
            case 6 :
                // compiler/scanner/Decaf.g:1:47: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 7 :
                // compiler/scanner/Decaf.g:1:56: ELSE
                {
                mELSE(); 


                }
                break;
            case 8 :
                // compiler/scanner/Decaf.g:1:61: FOR
                {
                mFOR(); 


                }
                break;
            case 9 :
                // compiler/scanner/Decaf.g:1:65: IF
                {
                mIF(); 


                }
                break;
            case 10 :
                // compiler/scanner/Decaf.g:1:68: INT
                {
                mINT(); 


                }
                break;
            case 11 :
                // compiler/scanner/Decaf.g:1:72: RETURN
                {
                mRETURN(); 


                }
                break;
            case 12 :
                // compiler/scanner/Decaf.g:1:79: VOID
                {
                mVOID(); 


                }
                break;
            case 13 :
                // compiler/scanner/Decaf.g:1:84: PROGRAM
                {
                mPROGRAM(); 


                }
                break;
            case 14 :
                // compiler/scanner/Decaf.g:1:92: TRUE
                {
                mTRUE(); 


                }
                break;
            case 15 :
                // compiler/scanner/Decaf.g:1:97: FALSE
                {
                mFALSE(); 


                }
                break;
            case 16 :
                // compiler/scanner/Decaf.g:1:103: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 17 :
                // compiler/scanner/Decaf.g:1:110: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 18 :
                // compiler/scanner/Decaf.g:1:117: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 19 :
                // compiler/scanner/Decaf.g:1:124: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 20 :
                // compiler/scanner/Decaf.g:1:131: LBRAKET
                {
                mLBRAKET(); 


                }
                break;
            case 21 :
                // compiler/scanner/Decaf.g:1:139: RBRAKET
                {
                mRBRAKET(); 


                }
                break;
            case 22 :
                // compiler/scanner/Decaf.g:1:147: SEMICO
                {
                mSEMICO(); 


                }
                break;
            case 23 :
                // compiler/scanner/Decaf.g:1:154: COMA
                {
                mCOMA(); 


                }
                break;
            case 24 :
                // compiler/scanner/Decaf.g:1:159: POINT
                {
                mPOINT(); 


                }
                break;
            case 25 :
                // compiler/scanner/Decaf.g:1:165: DPOINTS
                {
                mDPOINTS(); 


                }
                break;
            case 26 :
                // compiler/scanner/Decaf.g:1:173: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 27 :
                // compiler/scanner/Decaf.g:1:179: ADD1
                {
                mADD1(); 


                }
                break;
            case 28 :
                // compiler/scanner/Decaf.g:1:184: ASSIGNADD
                {
                mASSIGNADD(); 


                }
                break;
            case 29 :
                // compiler/scanner/Decaf.g:1:194: ASSIGNSUB
                {
                mASSIGNSUB(); 


                }
                break;
            case 30 :
                // compiler/scanner/Decaf.g:1:204: MINUS1
                {
                mMINUS1(); 


                }
                break;
            case 31 :
                // compiler/scanner/Decaf.g:1:211: LTOEQ
                {
                mLTOEQ(); 


                }
                break;
            case 32 :
                // compiler/scanner/Decaf.g:1:217: GTOEQ
                {
                mGTOEQ(); 


                }
                break;
            case 33 :
                // compiler/scanner/Decaf.g:1:223: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 34 :
                // compiler/scanner/Decaf.g:1:229: NEQUAL
                {
                mNEQUAL(); 


                }
                break;
            case 35 :
                // compiler/scanner/Decaf.g:1:236: AND
                {
                mAND(); 


                }
                break;
            case 36 :
                // compiler/scanner/Decaf.g:1:240: OR
                {
                mOR(); 


                }
                break;
            case 37 :
                // compiler/scanner/Decaf.g:1:243: LESSTHAN
                {
                mLESSTHAN(); 


                }
                break;
            case 38 :
                // compiler/scanner/Decaf.g:1:252: GREATHAN
                {
                mGREATHAN(); 


                }
                break;
            case 39 :
                // compiler/scanner/Decaf.g:1:261: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 40 :
                // compiler/scanner/Decaf.g:1:268: ADD
                {
                mADD(); 


                }
                break;
            case 41 :
                // compiler/scanner/Decaf.g:1:272: MINUS
                {
                mMINUS(); 


                }
                break;
            case 42 :
                // compiler/scanner/Decaf.g:1:278: MULT
                {
                mMULT(); 


                }
                break;
            case 43 :
                // compiler/scanner/Decaf.g:1:283: DIV
                {
                mDIV(); 


                }
                break;
            case 44 :
                // compiler/scanner/Decaf.g:1:287: MOD
                {
                mMOD(); 


                }
                break;
            case 45 :
                // compiler/scanner/Decaf.g:1:291: NOT
                {
                mNOT(); 


                }
                break;
            case 46 :
                // compiler/scanner/Decaf.g:1:295: RAISE
                {
                mRAISE(); 


                }
                break;
            case 47 :
                // compiler/scanner/Decaf.g:1:301: ORBITWISE
                {
                mORBITWISE(); 


                }
                break;
            case 48 :
                // compiler/scanner/Decaf.g:1:311: ANDBITWISE
                {
                mANDBITWISE(); 


                }
                break;
            case 49 :
                // compiler/scanner/Decaf.g:1:322: HEX
                {
                mHEX(); 


                }
                break;
            case 50 :
                // compiler/scanner/Decaf.g:1:326: INDENTIFIER
                {
                mINDENTIFIER(); 


                }
                break;
            case 51 :
                // compiler/scanner/Decaf.g:1:338: STR
                {
                mSTR(); 


                }
                break;
            case 52 :
                // compiler/scanner/Decaf.g:1:342: CHR
                {
                mCHR(); 


                }
                break;
            case 53 :
                // compiler/scanner/Decaf.g:1:346: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 54 :
                // compiler/scanner/Decaf.g:1:357: NOTCHAR1
                {
                mNOTCHAR1(); 


                }
                break;
            case 55 :
                // compiler/scanner/Decaf.g:1:366: NOTCHAR2
                {
                mNOTCHAR2(); 


                }
                break;
            case 56 :
                // compiler/scanner/Decaf.g:1:375: NOTCHAR3
                {
                mNOTCHAR3(); 


                }
                break;
            case 57 :
                // compiler/scanner/Decaf.g:1:384: NOTCHAR4
                {
                mNOTCHAR4(); 


                }
                break;
            case 58 :
                // compiler/scanner/Decaf.g:1:393: NOTCHAR5
                {
                mNOTCHAR5(); 


                }
                break;
            case 59 :
                // compiler/scanner/Decaf.g:1:402: NOTCHAR6
                {
                mNOTCHAR6(); 


                }
                break;
            case 60 :
                // compiler/scanner/Decaf.g:1:411: NOTHEX1
                {
                mNOTHEX1(); 


                }
                break;
            case 61 :
                // compiler/scanner/Decaf.g:1:419: NOTHEX2
                {
                mNOTHEX2(); 


                }
                break;
            case 62 :
                // compiler/scanner/Decaf.g:1:427: NOTINDEN
                {
                mNOTINDEN(); 


                }
                break;
            case 63 :
                // compiler/scanner/Decaf.g:1:436: QMARK
                {
                mQMARK(); 


                }
                break;
            case 64 :
                // compiler/scanner/Decaf.g:1:442: NOTSTR1
                {
                mNOTSTR1(); 


                }
                break;
            case 65 :
                // compiler/scanner/Decaf.g:1:450: NOTSTR2
                {
                mNOTSTR2(); 


                }
                break;
            case 66 :
                // compiler/scanner/Decaf.g:1:458: NOTSTR3
                {
                mNOTSTR3(); 


                }
                break;
            case 67 :
                // compiler/scanner/Decaf.g:1:466: UNICODE1
                {
                mUNICODE1(); 


                }
                break;
            case 68 :
                // compiler/scanner/Decaf.g:1:475: UNICODE2
                {
                mUNICODE2(); 


                }
                break;
            case 69 :
                // compiler/scanner/Decaf.g:1:484: UNICODE3
                {
                mUNICODE3(); 


                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\54\11\60\12\uffff\1\113\1\112\1\117\1\121\1\123\1\125"+
        "\1\127\1\131\1\133\4\uffff\1\60\2\142\10\uffff\3\60\2\uffff\6\60"+
        "\1\164\5\60\16\uffff\1\173\26\uffff\1\u0085\10\uffff\6\60\1\u0097"+
        "\1\60\1\uffff\1\u0099\4\60\1\u009e\17\uffff\1\u00a4\6\uffff\5\60"+
        "\1\u00aa\1\uffff\1\60\1\uffff\1\60\1\u00ad\1\60\1\u00af\7\uffff"+
        "\1\60\1\u00b2\1\60\1\u00b4\1\60\1\uffff\1\u00b6\1\60\1\uffff\1\60"+
        "\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\u00bd\1\60\1\uffff"+
        "\1\u00bf\1\u00c0\1\60\1\uffff\1\u00c2\2\uffff\1\u00c3\2\uffff";
    static final String DFA19_eofS =
        "\u00c4\uffff";
    static final String DFA19_minS =
        "\1\0\1\57\11\56\12\uffff\1\55\1\130\1\53\4\75\1\46\1\174\4\uffff"+
        "\1\56\1\40\1\10\10\uffff\3\56\2\uffff\14\56\16\uffff\1\60\23\uffff"+
        "\1\40\1\42\1\uffff\1\47\2\uffff\3\40\3\uffff\10\56\1\uffff\5\56"+
        "\1\60\3\uffff\7\40\1\uffff\2\40\1\uffff\5\40\1\uffff\2\40\6\56\1"+
        "\uffff\1\56\1\uffff\4\56\1\uffff\3\40\3\uffff\5\56\1\uffff\2\56"+
        "\1\uffff\1\56\2\uffff\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\2\56"+
        "\1\uffff\3\56\1\uffff\1\56\2\uffff\1\56\2\uffff";
    static final String DFA19_maxS =
        "\1\177\1\57\11\172\12\uffff\1\75\1\170\5\75\1\46\1\174\4\uffff\1"+
        "\172\2\176\10\uffff\3\172\2\uffff\14\172\16\uffff\1\172\23\uffff"+
        "\1\176\1\164\1\uffff\1\47\2\uffff\3\176\3\uffff\10\172\1\uffff\6"+
        "\172\3\uffff\7\176\1\uffff\2\176\1\uffff\5\176\1\uffff\2\176\6\172"+
        "\1\uffff\1\172\1\uffff\4\172\1\uffff\3\176\3\uffff\5\172\1\uffff"+
        "\2\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1"+
        "\uffff\2\172\1\uffff\3\172\1\uffff\1\172\2\uffff\1\172\2\uffff";
    static final String DFA19_acceptS =
        "\13\uffff\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\11\uffff"+
        "\1\52\1\54\1\56\1\32\3\uffff\1\65\1\77\1\103\1\65\1\104\1\105\1"+
        "\1\1\53\3\uffff\1\62\1\76\14\uffff\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\35\1\36\1\32\1\51\1\uffff\1\33\1\34\1\50"+
        "\1\37\1\45\1\40\1\46\1\41\1\47\1\42\1\55\1\43\1\60\1\44\1\57\1\52"+
        "\1\54\1\56\1\63\2\uffff\1\102\1\uffff\1\66\1\67\3\uffff\1\65\1\77"+
        "\1\103\10\uffff\1\11\6\uffff\1\74\1\75\1\100\7\uffff\1\64\2\uffff"+
        "\1\101\5\uffff\1\71\10\uffff\1\10\1\uffff\1\12\4\uffff\1\61\3\uffff"+
        "\1\73\1\64\1\72\5\uffff\1\7\2\uffff\1\14\1\uffff\1\16\1\70\1\uffff"+
        "\1\3\1\uffff\1\5\1\uffff\1\17\2\uffff\1\70\3\uffff\1\13\1\uffff"+
        "\1\2\1\4\1\uffff\1\15\1\6";
    static final String DFA19_specialS =
        "\u00c4\uffff}>";
    static final String[] DFA19_transitionS = {
            "\10\51\3\45\1\51\1\47\1\45\22\51\1\50\1\33\1\43\2\52\1\37\1"+
            "\34\1\44\1\13\1\14\1\36\1\27\1\22\1\25\1\23\1\1\1\26\11\41\1"+
            "\24\1\21\1\30\1\32\1\31\1\46\1\52\17\42\1\11\12\42\1\17\1\52"+
            "\1\20\1\40\1\42\1\52\1\42\1\2\1\3\1\42\1\4\1\5\2\42\1\6\10\42"+
            "\1\7\1\42\1\12\1\42\1\10\4\42\1\15\1\35\1\16\1\52\1\51",
            "\1\53",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57"+
            "\1\55\2\57\1\56\10\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\62"+
            "\12\57\1\63\2\57\1\64\13\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57"+
            "\1\65\16\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\67"+
            "\15\57\1\66\13\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57"+
            "\1\70\7\57\1\71\14\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57"+
            "\1\72\25\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57"+
            "\1\73\13\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57"+
            "\1\74\10\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57"+
            "\1\75\10\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111\2\uffff\12\112\3\uffff\1\110",
            "\1\114\37\uffff\1\114",
            "\1\115\21\uffff\1\116",
            "\1\120",
            "\1\122",
            "\1\124",
            "\1\126",
            "\1\130",
            "\1\132",
            "",
            "",
            "",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\2\140\1\137\4\140\1\uffff\64\140\1\141\42\140",
            "\3\144\2\uffff\1\144\22\uffff\2\150\1\145\4\150\1\143\10\150"+
            "\1\146\53\150\1\147\42\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57"+
            "\1\154\13\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57"+
            "\1\155\25\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57"+
            "\1\156\16\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\157"+
            "\31\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57"+
            "\1\160\14\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57"+
            "\1\161\7\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57"+
            "\1\162\10\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57"+
            "\1\163\16\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57"+
            "\1\165\6\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57"+
            "\1\166\6\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57"+
            "\1\167\21\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57"+
            "\1\170\13\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57"+
            "\1\171\5\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\172\7\uffff\6\172\24\174\6\uffff\6\172\24\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\140\1\137\4\140\1\175\64\140\1\141\42\140",
            "\1\u0082\4\uffff\1\u0083\64\uffff\1\u0084\5\uffff\1\176\13"+
            "\uffff\1\u0080\3\uffff\1\u0081\1\uffff\1\177",
            "",
            "\1\145",
            "",
            "",
            "\2\u0087\1\u0088\4\u0087\1\u0085\60\u0087\1\u0086\3\u0087\1"+
            "\u0088\33\u0087\1\u0086\6\u0087",
            "\2\u008e\1\u008f\4\u008e\1\u008a\64\u008e\1\u0090\5\u008e\1"+
            "\u0089\13\u008e\1\u008c\3\u008e\1\u008d\1\u008e\1\u008b\12\u008e",
            "\2\u0087\1\u0088\4\u0087\1\u0085\64\u0087\1\u0088\42\u0087",
            "",
            "",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57"+
            "\1\u0091\16\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u0092"+
            "\31\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57"+
            "\1\u0093\16\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57"+
            "\1\u0094\7\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57"+
            "\1\u0095\6\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57"+
            "\1\u0096\25\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57"+
            "\1\u0098\7\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57"+
            "\1\u009a\5\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57"+
            "\1\u009b\26\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57"+
            "\1\u009c\23\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57"+
            "\1\u009d\25\57",
            "\12\172\7\uffff\6\172\24\174\6\uffff\6\172\24\174",
            "",
            "",
            "",
            "\2\140\1\137\4\140\1\175\64\140\1\141\42\140",
            "\2\140\1\137\4\140\1\175\64\140\1\141\42\140",
            "\2\140\1\137\4\140\1\175\64\140\1\141\42\140",
            "\2\140\1\137\4\140\1\175\64\140\1\141\42\140",
            "\2\140\1\137\4\140\1\175\64\140\1\141\42\140",
            "\2\140\1\137\4\140\1\175\64\140\1\141\42\140",
            "\2\140\1\137\4\140\1\175\64\140\1\141\42\140",
            "",
            "\2\u0087\1\u0088\4\u0087\1\u00a2\5\u0087\1\u00a0\2\u0087\12"+
            "\u00a1\7\u0087\6\u009f\25\u0087\1\u0088\4\u0087\6\u009f\30\u0087",
            "\2\u0087\1\u0088\4\u0087\1\u00a2\64\u0087\1\u0088\42\u0087",
            "",
            "\7\u0088\1\u00a3\127\u0088",
            "\7\u0088\1\u0085\127\u0088",
            "\7\u0088\1\u00a3\127\u0088",
            "\7\u0088\1\u00a3\127\u0088",
            "\7\u0088\1\u00a3\127\u0088",
            "",
            "\7\u0088\1\u0085\127\u0088",
            "\7\u0088\1\u0085\127\u0088",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57"+
            "\1\u00a5\25\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\12\57"+
            "\1\u00a6\17\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57"+
            "\1\u00a7\13\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57"+
            "\1\u00a8\7\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57"+
            "\1\u00a9\21\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57"+
            "\1\u00ab\25\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57"+
            "\1\u00ac\10\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57"+
            "\1\u00ae\10\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\2\u0087\1\u0088\4\u0087\1\u00b0\5\u0087\1\u00a0\2\u0087\12"+
            "\u00a1\7\u0087\6\u009f\25\u0087\1\u0088\4\u0087\6\u009f\30\u0087",
            "\2\u0087\1\u0088\4\u0087\1\u00a2\10\u0087\12\u00a1\42\u0087"+
            "\1\u0088\42\u0087",
            "\2\u0087\1\u0088\4\u0087\1\u00b0\5\u0087\1\u00a0\2\u0087\12"+
            "\u00a1\7\u0087\6\u009f\25\u0087\1\u0088\4\u0087\6\u009f\30\u0087",
            "",
            "",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00b1"+
            "\31\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57"+
            "\1\u00b3\5\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57"+
            "\1\u00b5\14\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57"+
            "\1\u00b7\14\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00b8"+
            "\31\57",
            "",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57"+
            "\1\u00ba\14\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57"+
            "\1\u00bb\6\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57"+
            "\1\u00bc\5\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57"+
            "\1\u00be\15\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57"+
            "\1\u00c1\25\57",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\61\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENTS | BOOLEAN | BREAK | CALLOUT | CLASS | CONTINUE | ELSE | FOR | IF | INT | RETURN | VOID | PROGRAM | TRUE | FALSE | LPAREN | RPAREN | LBRACE | RBRACE | LBRAKET | RBRAKET | SEMICO | COMA | POINT | DPOINTS | DIGIT | ADD1 | ASSIGNADD | ASSIGNSUB | MINUS1 | LTOEQ | GTOEQ | EQUAL | NEQUAL | AND | OR | LESSTHAN | GREATHAN | ASSIGN | ADD | MINUS | MULT | DIV | MOD | NOT | RAISE | ORBITWISE | ANDBITWISE | HEX | INDENTIFIER | STR | CHR | WHITESPACE | NOTCHAR1 | NOTCHAR2 | NOTCHAR3 | NOTCHAR4 | NOTCHAR5 | NOTCHAR6 | NOTHEX1 | NOTHEX2 | NOTINDEN | QMARK | NOTSTR1 | NOTSTR2 | NOTSTR3 | UNICODE1 | UNICODE2 | UNICODE3 );";
        }
    }
 

}