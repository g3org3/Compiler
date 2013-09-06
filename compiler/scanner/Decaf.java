// $ANTLR 3.4 compiler/scanner/Decaf.g 2013-09-05 23:25:39

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
    public static final int AND=6;
    public static final int ANDBITWISE=7;
    public static final int ASCII=8;
    public static final int ASSIGN=9;
    public static final int ASSIGNADD=10;
    public static final int ASSIGNSUB=11;
    public static final int BOOLEAN=12;
    public static final int BREAK=13;
    public static final int CALLOUT=14;
    public static final int CHAR=15;
    public static final int CHR=16;
    public static final int CLASS=17;
    public static final int COMA=18;
    public static final int COMMENTS=19;
    public static final int CONTINUE=20;
    public static final int DIGIT=21;
    public static final int DIV=22;
    public static final int DPOINTS=23;
    public static final int ELSE=24;
    public static final int EQUAL=25;
    public static final int ESC=26;
    public static final int FALSE=27;
    public static final int FOR=28;
    public static final int GREATHAN=29;
    public static final int GTOEQ=30;
    public static final int HEX=31;
    public static final int HEXCHAR=32;
    public static final int IF=33;
    public static final int INDENTI=34;
    public static final int INT=35;
    public static final int LBRACE=36;
    public static final int LBRAKET=37;
    public static final int LESSTHAN=38;
    public static final int LPAREN=39;
    public static final int LTOEQ=40;
    public static final int MINUS=41;
    public static final int MINUS1=42;
    public static final int MOD=43;
    public static final int MULT=44;
    public static final int NEGNUM=45;
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
    public static final int NUM=59;
    public static final int OR=60;
    public static final int ORBITWISE=61;
    public static final int POINT=62;
    public static final int QMARK=63;
    public static final int RAISE=64;
    public static final int RBRACE=65;
    public static final int RBRAKET=66;
    public static final int RETURN=67;
    public static final int RPAREN=68;
    public static final int SEMICO=69;
    public static final int STR=70;
    public static final int TRUE=71;
    public static final int UCASE=72;
    public static final int UNDERSCORE=73;
    public static final int UNICODE1=74;
    public static final int UNICODE2=75;
    public static final int UNICODE3=76;
    public static final int VOID=77;
    public static final int WHITESPACE=78;

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
            // compiler/scanner/Decaf.g:31:18: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
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
            // compiler/scanner/Decaf.g:32:17: ( ( ( ' ' .. '!' ) | ( '#' .. '&' ) | ( '(' .. '[' ) | ( ']' .. '~' ) ) )
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
            // compiler/scanner/Decaf.g:33:19: ( ( 'A' .. 'Z' ) )
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
            // compiler/scanner/Decaf.g:34:16: ( ( '0' .. '9' ) )
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
            // compiler/scanner/Decaf.g:35:19: ( ( 'A' .. 'F' ) | ( 'a' .. 'f' ) )
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
            // compiler/scanner/Decaf.g:36:15: ( ( '\\\\b' | '\\\\t' | '\\\\n' | '\\\\r' | '\\\\\\\"' | '\\\\\\'' | '\\\\\\\\' ) )
            // compiler/scanner/Decaf.g:36:17: ( '\\\\b' | '\\\\t' | '\\\\n' | '\\\\r' | '\\\\\\\"' | '\\\\\\'' | '\\\\\\\\' )
            {
            // compiler/scanner/Decaf.g:36:17: ( '\\\\b' | '\\\\t' | '\\\\n' | '\\\\r' | '\\\\\\\"' | '\\\\\\'' | '\\\\\\\\' )
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
                    // compiler/scanner/Decaf.g:36:18: '\\\\b'
                    {
                    match("\\b"); 



                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:36:24: '\\\\t'
                    {
                    match("\\t"); 



                    }
                    break;
                case 3 :
                    // compiler/scanner/Decaf.g:36:30: '\\\\n'
                    {
                    match("\\n"); 



                    }
                    break;
                case 4 :
                    // compiler/scanner/Decaf.g:36:36: '\\\\r'
                    {
                    match("\\r"); 



                    }
                    break;
                case 5 :
                    // compiler/scanner/Decaf.g:36:42: '\\\\\\\"'
                    {
                    match("\\\""); 



                    }
                    break;
                case 6 :
                    // compiler/scanner/Decaf.g:36:49: '\\\\\\''
                    {
                    match("\\'"); 



                    }
                    break;
                case 7 :
                    // compiler/scanner/Decaf.g:36:56: '\\\\\\\\'
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
            // compiler/scanner/Decaf.g:37:21: ( '_' )
            // compiler/scanner/Decaf.g:37:23: '_'
            {
            match('_'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "COMMENTS"
    public final void mCOMMENTS() throws RecognitionException {
        try {
            int _type = COMMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:40:12: ( ( ( '//' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' ) )
            // compiler/scanner/Decaf.g:40:14: ( ( '//' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            {
            // compiler/scanner/Decaf.g:40:14: ( ( '//' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // compiler/scanner/Decaf.g:40:15: ( '//' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            // compiler/scanner/Decaf.g:40:15: ( '//' )
            // compiler/scanner/Decaf.g:40:16: '//'
            {
            match("//"); 



            }


            // compiler/scanner/Decaf.g:40:22: (~ ( '\\n' | '\\r' ) )*
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


            // compiler/scanner/Decaf.g:40:36: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // compiler/scanner/Decaf.g:40:36: '\\r'
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
            // compiler/scanner/Decaf.g:43:11: ( 'boolean' )
            // compiler/scanner/Decaf.g:43:13: 'boolean'
            {
            match("boolean"); 



             Decaf.debug("KW BOOLEAN", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:44:9: ( 'break' )
            // compiler/scanner/Decaf.g:44:11: 'break'
            {
            match("break"); 



             Decaf.debug("KW BREAK", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:45:11: ( 'callout' )
            // compiler/scanner/Decaf.g:45:13: 'callout'
            {
            match("callout"); 



             Decaf.debug("KW CALLOUT", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:46:9: ( 'class' )
            // compiler/scanner/Decaf.g:46:11: 'class'
            {
            match("class"); 



             Decaf.debug("KW CLASS", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:47:11: ( 'continue' )
            // compiler/scanner/Decaf.g:47:13: 'continue'
            {
            match("continue"); 



             Decaf.debug("KW CONTINUE", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:48:9: ( 'else' )
            // compiler/scanner/Decaf.g:48:11: 'else'
            {
            match("else"); 



             Decaf.debug("KW ELSE", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:49:8: ( 'for' )
            // compiler/scanner/Decaf.g:49:10: 'for'
            {
            match("for"); 



             Decaf.debug("KW FOR", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:50:8: ( 'if' )
            // compiler/scanner/Decaf.g:50:10: 'if'
            {
            match("if"); 



             Decaf.debug("KW IF", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:51:8: ( 'int' )
            // compiler/scanner/Decaf.g:51:10: 'int'
            {
            match("int"); 



             Decaf.debug("KW INT", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:52:11: ( 'return' )
            // compiler/scanner/Decaf.g:52:13: 'return'
            {
            match("return"); 



             Decaf.debug("KW RETURN", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:53:9: ( 'void' )
            // compiler/scanner/Decaf.g:53:11: 'void'
            {
            match("void"); 



             Decaf.debug("KW VOID", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:56:9: ( 'true' )
            // compiler/scanner/Decaf.g:56:11: 'true'
            {
            match("true"); 



             Decaf.debug("BOOLEAN", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:57:9: ( 'false' )
            // compiler/scanner/Decaf.g:57:11: 'false'
            {
            match("false"); 



             Decaf.debug("BOOLEAN", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:60:10: ( '(' )
            // compiler/scanner/Decaf.g:60:12: '('
            {
            match('('); 

             Decaf.debug("LPARENTESIS", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:61:10: ( ')' )
            // compiler/scanner/Decaf.g:61:12: ')'
            {
            match(')'); 

             Decaf.debug("RPARENTESIS", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:62:10: ( '{' )
            // compiler/scanner/Decaf.g:62:12: '{'
            {
            match('{'); 

             Decaf.debug("LBRACE", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:63:10: ( '}' )
            // compiler/scanner/Decaf.g:63:12: '}'
            {
            match('}'); 

             Decaf.debug("RBRACE", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:64:11: ( '[' )
            // compiler/scanner/Decaf.g:64:13: '['
            {
            match('['); 

             Decaf.debug("LBRAKET", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:65:11: ( ']' )
            // compiler/scanner/Decaf.g:65:13: ']'
            {
            match(']'); 

             Decaf.debug("RBRAKET", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:66:10: ( ';' )
            // compiler/scanner/Decaf.g:66:12: ';'
            {
            match(';'); 

             Decaf.debug("SEMICOLON", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:67:8: ( ',' )
            // compiler/scanner/Decaf.g:67:10: ','
            {
            match(','); 

             Decaf.debug("COMA", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:68:9: ( '.' )
            // compiler/scanner/Decaf.g:68:11: '.'
            {
            match('.'); 

             Decaf.debug("POINT", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:69:11: ( ':' )
            // compiler/scanner/Decaf.g:69:13: ':'
            {
            match(':'); 

             Decaf.debug("DPOINTS", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:72:9: ( ( NUM )+ )
            // compiler/scanner/Decaf.g:72:11: ( NUM )+
            {
            // compiler/scanner/Decaf.g:72:11: ( NUM )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


             Decaf.debug("INT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "NEGNUM"
    public final void mNEGNUM() throws RecognitionException {
        try {
            int _type = NEGNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:73:10: ( '-' ( NUM )+ )
            // compiler/scanner/Decaf.g:73:12: '-' ( NUM )+
            {
            match('-'); 

            // compiler/scanner/Decaf.g:73:15: ( NUM )+
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


             Decaf.debug("INT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEGNUM"

    // $ANTLR start "ADD1"
    public final void mADD1() throws RecognitionException {
        try {
            int _type = ADD1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:76:9: ( '++' )
            // compiler/scanner/Decaf.g:76:11: '++'
            {
            match("++"); 



             Decaf.debug("ADD 1", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:77:13: ( '+=' )
            // compiler/scanner/Decaf.g:77:15: '+='
            {
            match("+="); 



             Decaf.debug("ADD ASSIG", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:78:13: ( '-=' )
            // compiler/scanner/Decaf.g:78:15: '-='
            {
            match("-="); 



             Decaf.debug("SUB ASSIG", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:79:11: ( '--' )
            // compiler/scanner/Decaf.g:79:13: '--'
            {
            match("--"); 



             Decaf.debug("SUBSTRACT 1", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:80:9: ( '<=' )
            // compiler/scanner/Decaf.g:80:11: '<='
            {
            match("<="); 



             Decaf.debug("LESS THAN OR EQUAL", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:81:9: ( '>=' )
            // compiler/scanner/Decaf.g:81:11: '>='
            {
            match(">="); 



             Decaf.debug("GREATER THAN OR EQUAL", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:82:9: ( '==' )
            // compiler/scanner/Decaf.g:82:11: '=='
            {
            match("=="); 



             Decaf.debug("EQUAL", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:83:10: ( '!=' )
            // compiler/scanner/Decaf.g:83:12: '!='
            {
            match("!="); 



             Decaf.debug("NOT EQUAL", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:84:8: ( '&&' )
            // compiler/scanner/Decaf.g:84:10: '&&'
            {
            match("&&"); 



             Decaf.debug("AND", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:85:8: ( '||' )
            // compiler/scanner/Decaf.g:85:10: '||'
            {
            match("||"); 



             Decaf.debug("OR", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:87:11: ( '<' )
            // compiler/scanner/Decaf.g:87:13: '<'
            {
            match('<'); 

             Decaf.debug("LESS THAN", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:88:11: ( '>' )
            // compiler/scanner/Decaf.g:88:13: '>'
            {
            match('>'); 

             Decaf.debug("GREATER THAN", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:89:10: ( '=' )
            // compiler/scanner/Decaf.g:89:12: '='
            {
            match('='); 

             Decaf.debug("ASSIGN", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:90:8: ( '+' )
            // compiler/scanner/Decaf.g:90:10: '+'
            {
            match('+'); 

             Decaf.debug("ADD", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:91:10: ( '-' )
            // compiler/scanner/Decaf.g:91:12: '-'
            {
            match('-'); 

             Decaf.debug("SUBSTRACT", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:92:9: ( '*' )
            // compiler/scanner/Decaf.g:92:11: '*'
            {
            match('*'); 

             Decaf.debug("MULTIPLY", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:93:8: ( '/' )
            // compiler/scanner/Decaf.g:93:10: '/'
            {
            match('/'); 

             Decaf.debug("DIVIDE", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:94:8: ( '%' )
            // compiler/scanner/Decaf.g:94:10: '%'
            {
            match('%'); 

             Decaf.debug("DIVIDE", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:95:8: ( '!' )
            // compiler/scanner/Decaf.g:95:10: '!'
            {
            match('!'); 

             Decaf.debug("NOT", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:96:9: ( '^' )
            // compiler/scanner/Decaf.g:96:11: '^'
            {
            match('^'); 

             Decaf.debug("POWER", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:97:12: ( '|' )
            // compiler/scanner/Decaf.g:97:14: '|'
            {
            match('|'); 

             Decaf.debug("OR BITWISE", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:98:13: ( '&' )
            // compiler/scanner/Decaf.g:98:15: '&'
            {
            match('&'); 

             Decaf.debug("AND BITWISE", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:101:8: ( ( '0' ( 'x' | 'X' ) ( HEXCHAR | NUM )+ ) )
            // compiler/scanner/Decaf.g:101:10: ( '0' ( 'x' | 'X' ) ( HEXCHAR | NUM )+ )
            {
            // compiler/scanner/Decaf.g:101:10: ( '0' ( 'x' | 'X' ) ( HEXCHAR | NUM )+ )
            // compiler/scanner/Decaf.g:101:11: '0' ( 'x' | 'X' ) ( HEXCHAR | NUM )+
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


            // compiler/scanner/Decaf.g:101:24: ( HEXCHAR | NUM )+
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


             Decaf.debug("HEXLIT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "INDENTI"
    public final void mINDENTI() throws RecognitionException {
        try {
            int _type = INDENTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:104:11: ( ( CHAR | UNDERSCORE ) ( CHAR | UNDERSCORE | NUM )* )
            // compiler/scanner/Decaf.g:104:13: ( CHAR | UNDERSCORE ) ( CHAR | UNDERSCORE | NUM )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:104:30: ( CHAR | UNDERSCORE | NUM )*
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


             Decaf.debug("INDENTIFIER", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INDENTI"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:107:8: ( ( '\\\"' '\\\"' | ( '\\\"' ( ASCII | ESC )+ '\\\"' ) ) )
            // compiler/scanner/Decaf.g:107:10: ( '\\\"' '\\\"' | ( '\\\"' ( ASCII | ESC )+ '\\\"' ) )
            {
            // compiler/scanner/Decaf.g:107:10: ( '\\\"' '\\\"' | ( '\\\"' ( ASCII | ESC )+ '\\\"' ) )
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
                    // compiler/scanner/Decaf.g:107:11: '\\\"' '\\\"'
                    {
                    match('\"'); 

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:107:20: ( '\\\"' ( ASCII | ESC )+ '\\\"' )
                    {
                    // compiler/scanner/Decaf.g:107:20: ( '\\\"' ( ASCII | ESC )+ '\\\"' )
                    // compiler/scanner/Decaf.g:107:21: '\\\"' ( ASCII | ESC )+ '\\\"'
                    {
                    match('\"'); 

                    // compiler/scanner/Decaf.g:107:26: ( ASCII | ESC )+
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
                    	    // compiler/scanner/Decaf.g:107:27: ASCII
                    	    {
                    	    mASCII(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // compiler/scanner/Decaf.g:107:33: ESC
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


             Decaf.debug("STRING", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:108:8: ( ( '\\'' '\\'' | ( '\\'' ( ASCII | ESC ) '\\'' ) ) )
            // compiler/scanner/Decaf.g:108:10: ( '\\'' '\\'' | ( '\\'' ( ASCII | ESC ) '\\'' ) )
            {
            // compiler/scanner/Decaf.g:108:10: ( '\\'' '\\'' | ( '\\'' ( ASCII | ESC ) '\\'' ) )
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
                    // compiler/scanner/Decaf.g:108:11: '\\'' '\\''
                    {
                    match('\''); 

                    match('\''); 

                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:108:20: ( '\\'' ( ASCII | ESC ) '\\'' )
                    {
                    // compiler/scanner/Decaf.g:108:20: ( '\\'' ( ASCII | ESC ) '\\'' )
                    // compiler/scanner/Decaf.g:108:21: '\\'' ( ASCII | ESC ) '\\''
                    {
                    match('\''); 

                    // compiler/scanner/Decaf.g:108:26: ( ASCII | ESC )
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
                            // compiler/scanner/Decaf.g:108:27: ASCII
                            {
                            mASCII(); 


                            }
                            break;
                        case 2 :
                            // compiler/scanner/Decaf.g:108:33: ESC
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


             Decaf.debug("CHAR", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:111:13: ( ( ' ' | '\\b' | '\\t' | '\\n' | '\\r' )+ )
            // compiler/scanner/Decaf.g:111:15: ( ' ' | '\\b' | '\\t' | '\\n' | '\\r' )+
            {
            // compiler/scanner/Decaf.g:111:15: ( ' ' | '\\b' | '\\t' | '\\n' | '\\r' )+
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
            // compiler/scanner/Decaf.g:115:11: ( ( '\\'' ( '\\b' | '\\t' | '\\n' | '\\r' ) '\\'' ) )
            // compiler/scanner/Decaf.g:115:13: ( '\\'' ( '\\b' | '\\t' | '\\n' | '\\r' ) '\\'' )
            {
            // compiler/scanner/Decaf.g:115:13: ( '\\'' ( '\\b' | '\\t' | '\\n' | '\\r' ) '\\'' )
            // compiler/scanner/Decaf.g:115:14: '\\'' ( '\\b' | '\\t' | '\\n' | '\\r' ) '\\''
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


             Decaf.debug("unexpected char", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:116:11: ( ( '\\'' ( '\\'' | '\\\"' ) '\\'' ) )
            // compiler/scanner/Decaf.g:116:13: ( '\\'' ( '\\'' | '\\\"' ) '\\'' )
            {
            // compiler/scanner/Decaf.g:116:13: ( '\\'' ( '\\'' | '\\\"' ) '\\'' )
            // compiler/scanner/Decaf.g:116:14: '\\'' ( '\\'' | '\\\"' ) '\\''
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


             Decaf.debug("unexpected char", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:117:11: ( ( '\\'' '0' ( 'X' | 'x' ) ( HEXCHAR | DIGIT )+ '\\'' ) )
            // compiler/scanner/Decaf.g:117:13: ( '\\'' '0' ( 'X' | 'x' ) ( HEXCHAR | DIGIT )+ '\\'' )
            {
            // compiler/scanner/Decaf.g:117:13: ( '\\'' '0' ( 'X' | 'x' ) ( HEXCHAR | DIGIT )+ '\\'' )
            // compiler/scanner/Decaf.g:117:14: '\\'' '0' ( 'X' | 'x' ) ( HEXCHAR | DIGIT )+ '\\''
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


            // compiler/scanner/Decaf.g:117:31: ( HEXCHAR | DIGIT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= 'A' && LA13_0 <= 'F')||(LA13_0 >= 'a' && LA13_0 <= 'f')) ) {
                    alt13=1;
                }
                else if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:117:32: HEXCHAR
            	    {
            	    mHEXCHAR(); 


            	    }
            	    break;
            	case 2 :
            	    // compiler/scanner/Decaf.g:117:40: DIGIT
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


             Decaf.debug("unexpected char", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:118:11: ( ( '\\'' '\\\\' ( ASCII ) '\\'' ) )
            // compiler/scanner/Decaf.g:118:13: ( '\\'' '\\\\' ( ASCII ) '\\'' )
            {
            // compiler/scanner/Decaf.g:118:13: ( '\\'' '\\\\' ( ASCII ) '\\'' )
            // compiler/scanner/Decaf.g:118:14: '\\'' '\\\\' ( ASCII ) '\\''
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


             Decaf.debug("unexpected char", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:119:11: ( ( '\\'' '\\\\' '\\'' ) )
            // compiler/scanner/Decaf.g:119:13: ( '\\'' '\\\\' '\\'' )
            {
            // compiler/scanner/Decaf.g:119:13: ( '\\'' '\\\\' '\\'' )
            // compiler/scanner/Decaf.g:119:14: '\\'' '\\\\' '\\''
            {
            match('\''); 

            match('\\'); 

            match('\''); 

            }


             Decaf.debug("unexpected char", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:120:11: ( ( '\\'' ( ASCII ) ( ASCII )+ '\\'' ) )
            // compiler/scanner/Decaf.g:120:13: ( '\\'' ( ASCII ) ( ASCII )+ '\\'' )
            {
            // compiler/scanner/Decaf.g:120:13: ( '\\'' ( ASCII ) ( ASCII )+ '\\'' )
            // compiler/scanner/Decaf.g:120:14: '\\'' ( ASCII ) ( ASCII )+ '\\''
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


            // compiler/scanner/Decaf.g:120:26: ( ASCII )+
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


             Decaf.debug("unexpected char", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:121:11: ( ( '0' ( 'x' | 'X' ) ) )
            // compiler/scanner/Decaf.g:121:13: ( '0' ( 'x' | 'X' ) )
            {
            // compiler/scanner/Decaf.g:121:13: ( '0' ( 'x' | 'X' ) )
            // compiler/scanner/Decaf.g:121:14: '0' ( 'x' | 'X' )
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


             Decaf.debug("invalid hex", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:122:11: ( ( '0' ( 'x' | 'X' ) ( CHAR | NUM )+ ) )
            // compiler/scanner/Decaf.g:122:13: ( '0' ( 'x' | 'X' ) ( CHAR | NUM )+ )
            {
            // compiler/scanner/Decaf.g:122:13: ( '0' ( 'x' | 'X' ) ( CHAR | NUM )+ )
            // compiler/scanner/Decaf.g:122:14: '0' ( 'x' | 'X' ) ( CHAR | NUM )+
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


            // compiler/scanner/Decaf.g:122:27: ( CHAR | NUM )+
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


             Decaf.debug("invalid hex", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:123:11: ( ( CHAR | UNDERSCORE ) ( CHAR | UNDERSCORE | NUM | '\\.' )+ )
            // compiler/scanner/Decaf.g:123:13: ( CHAR | UNDERSCORE ) ( CHAR | UNDERSCORE | NUM | '\\.' )+
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:123:30: ( CHAR | UNDERSCORE | NUM | '\\.' )+
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


             Decaf.debug("invalid indentifier", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:124:9: ( '?' )
            // compiler/scanner/Decaf.g:124:11: '?'
            {
            match('?'); 

             Decaf.debug("unexpected char", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:125:11: ( ( '\\\"' ( ASCII | ESC )+ '\\'' ) )
            // compiler/scanner/Decaf.g:125:13: ( '\\\"' ( ASCII | ESC )+ '\\'' )
            {
            // compiler/scanner/Decaf.g:125:13: ( '\\\"' ( ASCII | ESC )+ '\\'' )
            // compiler/scanner/Decaf.g:125:14: '\\\"' ( ASCII | ESC )+ '\\''
            {
            match('\"'); 

            // compiler/scanner/Decaf.g:125:19: ( ASCII | ESC )+
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
            	    // compiler/scanner/Decaf.g:125:20: ASCII
            	    {
            	    mASCII(); 


            	    }
            	    break;
            	case 2 :
            	    // compiler/scanner/Decaf.g:125:26: ESC
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


             Decaf.debug("expecting \'\"\', invalid string", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:126:11: ( ( '\\'' | '\\\"' ) )
            // compiler/scanner/Decaf.g:126:13: ( '\\'' | '\\\"' )
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\'' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             Decaf.debug("unexpected char", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTSTR2"

    // $ANTLR start "UNICODE1"
    public final void mUNICODE1() throws RecognitionException {
        try {
            int _type = UNICODE1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:127:11: ( ( '\\u000C' ) )
            // compiler/scanner/Decaf.g:127:13: ( '\\u000C' )
            {
            // compiler/scanner/Decaf.g:127:13: ( '\\u000C' )
            // compiler/scanner/Decaf.g:127:14: '\\u000C'
            {
            match('\f'); 

            }


             Decaf.debug("unexpected char", getLine(), "0xC"); 

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
            // compiler/scanner/Decaf.g:128:11: ( ( ( '\\u0000' .. '\\u001F' ) | '\\u007F' ) )
            // compiler/scanner/Decaf.g:128:13: ( ( '\\u0000' .. '\\u001F' ) | '\\u007F' )
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\u001F')||input.LA(1)=='\u007F' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             Decaf.debug("unexpected char", getLine(), ""); 

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
            // compiler/scanner/Decaf.g:129:11: ( ( '\\u0020' .. '\\u007E' ) )
            // compiler/scanner/Decaf.g:129:13: ( '\\u0020' .. '\\u007E' )
            {
            if ( (input.LA(1) >= ' ' && input.LA(1) <= '~') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             Decaf.debug("unexpected char", getLine(), getText()); 

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
        // compiler/scanner/Decaf.g:1:8: ( COMMENTS | BOOLEAN | BREAK | CALLOUT | CLASS | CONTINUE | ELSE | FOR | IF | INT | RETURN | VOID | TRUE | FALSE | LPAREN | RPAREN | LBRACE | RBRACE | LBRAKET | RBRAKET | SEMICO | COMA | POINT | DPOINTS | DIGIT | NEGNUM | ADD1 | ASSIGNADD | ASSIGNSUB | MINUS1 | LTOEQ | GTOEQ | EQUAL | NEQUAL | AND | OR | LESSTHAN | GREATHAN | ASSIGN | ADD | MINUS | MULT | DIV | MOD | NOT | RAISE | ORBITWISE | ANDBITWISE | HEX | INDENTI | STR | CHR | WHITESPACE | NOTCHAR1 | NOTCHAR2 | NOTCHAR3 | NOTCHAR4 | NOTCHAR5 | NOTCHAR6 | NOTHEX1 | NOTHEX2 | NOTINDEN | QMARK | NOTSTR1 | NOTSTR2 | UNICODE1 | UNICODE2 | UNICODE3 )
        int alt18=68;
        alt18 = dfa18.predict(input);
        switch (alt18) {
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
                // compiler/scanner/Decaf.g:1:84: TRUE
                {
                mTRUE(); 


                }
                break;
            case 14 :
                // compiler/scanner/Decaf.g:1:89: FALSE
                {
                mFALSE(); 


                }
                break;
            case 15 :
                // compiler/scanner/Decaf.g:1:95: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 16 :
                // compiler/scanner/Decaf.g:1:102: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 17 :
                // compiler/scanner/Decaf.g:1:109: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 18 :
                // compiler/scanner/Decaf.g:1:116: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 19 :
                // compiler/scanner/Decaf.g:1:123: LBRAKET
                {
                mLBRAKET(); 


                }
                break;
            case 20 :
                // compiler/scanner/Decaf.g:1:131: RBRAKET
                {
                mRBRAKET(); 


                }
                break;
            case 21 :
                // compiler/scanner/Decaf.g:1:139: SEMICO
                {
                mSEMICO(); 


                }
                break;
            case 22 :
                // compiler/scanner/Decaf.g:1:146: COMA
                {
                mCOMA(); 


                }
                break;
            case 23 :
                // compiler/scanner/Decaf.g:1:151: POINT
                {
                mPOINT(); 


                }
                break;
            case 24 :
                // compiler/scanner/Decaf.g:1:157: DPOINTS
                {
                mDPOINTS(); 


                }
                break;
            case 25 :
                // compiler/scanner/Decaf.g:1:165: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 26 :
                // compiler/scanner/Decaf.g:1:171: NEGNUM
                {
                mNEGNUM(); 


                }
                break;
            case 27 :
                // compiler/scanner/Decaf.g:1:178: ADD1
                {
                mADD1(); 


                }
                break;
            case 28 :
                // compiler/scanner/Decaf.g:1:183: ASSIGNADD
                {
                mASSIGNADD(); 


                }
                break;
            case 29 :
                // compiler/scanner/Decaf.g:1:193: ASSIGNSUB
                {
                mASSIGNSUB(); 


                }
                break;
            case 30 :
                // compiler/scanner/Decaf.g:1:203: MINUS1
                {
                mMINUS1(); 


                }
                break;
            case 31 :
                // compiler/scanner/Decaf.g:1:210: LTOEQ
                {
                mLTOEQ(); 


                }
                break;
            case 32 :
                // compiler/scanner/Decaf.g:1:216: GTOEQ
                {
                mGTOEQ(); 


                }
                break;
            case 33 :
                // compiler/scanner/Decaf.g:1:222: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 34 :
                // compiler/scanner/Decaf.g:1:228: NEQUAL
                {
                mNEQUAL(); 


                }
                break;
            case 35 :
                // compiler/scanner/Decaf.g:1:235: AND
                {
                mAND(); 


                }
                break;
            case 36 :
                // compiler/scanner/Decaf.g:1:239: OR
                {
                mOR(); 


                }
                break;
            case 37 :
                // compiler/scanner/Decaf.g:1:242: LESSTHAN
                {
                mLESSTHAN(); 


                }
                break;
            case 38 :
                // compiler/scanner/Decaf.g:1:251: GREATHAN
                {
                mGREATHAN(); 


                }
                break;
            case 39 :
                // compiler/scanner/Decaf.g:1:260: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 40 :
                // compiler/scanner/Decaf.g:1:267: ADD
                {
                mADD(); 


                }
                break;
            case 41 :
                // compiler/scanner/Decaf.g:1:271: MINUS
                {
                mMINUS(); 


                }
                break;
            case 42 :
                // compiler/scanner/Decaf.g:1:277: MULT
                {
                mMULT(); 


                }
                break;
            case 43 :
                // compiler/scanner/Decaf.g:1:282: DIV
                {
                mDIV(); 


                }
                break;
            case 44 :
                // compiler/scanner/Decaf.g:1:286: MOD
                {
                mMOD(); 


                }
                break;
            case 45 :
                // compiler/scanner/Decaf.g:1:290: NOT
                {
                mNOT(); 


                }
                break;
            case 46 :
                // compiler/scanner/Decaf.g:1:294: RAISE
                {
                mRAISE(); 


                }
                break;
            case 47 :
                // compiler/scanner/Decaf.g:1:300: ORBITWISE
                {
                mORBITWISE(); 


                }
                break;
            case 48 :
                // compiler/scanner/Decaf.g:1:310: ANDBITWISE
                {
                mANDBITWISE(); 


                }
                break;
            case 49 :
                // compiler/scanner/Decaf.g:1:321: HEX
                {
                mHEX(); 


                }
                break;
            case 50 :
                // compiler/scanner/Decaf.g:1:325: INDENTI
                {
                mINDENTI(); 


                }
                break;
            case 51 :
                // compiler/scanner/Decaf.g:1:333: STR
                {
                mSTR(); 


                }
                break;
            case 52 :
                // compiler/scanner/Decaf.g:1:337: CHR
                {
                mCHR(); 


                }
                break;
            case 53 :
                // compiler/scanner/Decaf.g:1:341: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 54 :
                // compiler/scanner/Decaf.g:1:352: NOTCHAR1
                {
                mNOTCHAR1(); 


                }
                break;
            case 55 :
                // compiler/scanner/Decaf.g:1:361: NOTCHAR2
                {
                mNOTCHAR2(); 


                }
                break;
            case 56 :
                // compiler/scanner/Decaf.g:1:370: NOTCHAR3
                {
                mNOTCHAR3(); 


                }
                break;
            case 57 :
                // compiler/scanner/Decaf.g:1:379: NOTCHAR4
                {
                mNOTCHAR4(); 


                }
                break;
            case 58 :
                // compiler/scanner/Decaf.g:1:388: NOTCHAR5
                {
                mNOTCHAR5(); 


                }
                break;
            case 59 :
                // compiler/scanner/Decaf.g:1:397: NOTCHAR6
                {
                mNOTCHAR6(); 


                }
                break;
            case 60 :
                // compiler/scanner/Decaf.g:1:406: NOTHEX1
                {
                mNOTHEX1(); 


                }
                break;
            case 61 :
                // compiler/scanner/Decaf.g:1:414: NOTHEX2
                {
                mNOTHEX2(); 


                }
                break;
            case 62 :
                // compiler/scanner/Decaf.g:1:422: NOTINDEN
                {
                mNOTINDEN(); 


                }
                break;
            case 63 :
                // compiler/scanner/Decaf.g:1:431: QMARK
                {
                mQMARK(); 


                }
                break;
            case 64 :
                // compiler/scanner/Decaf.g:1:437: NOTSTR1
                {
                mNOTSTR1(); 


                }
                break;
            case 65 :
                // compiler/scanner/Decaf.g:1:445: NOTSTR2
                {
                mNOTSTR2(); 


                }
                break;
            case 66 :
                // compiler/scanner/Decaf.g:1:453: UNICODE1
                {
                mUNICODE1(); 


                }
                break;
            case 67 :
                // compiler/scanner/Decaf.g:1:462: UNICODE2
                {
                mUNICODE2(); 


                }
                break;
            case 68 :
                // compiler/scanner/Decaf.g:1:471: UNICODE3
                {
                mUNICODE3(); 


                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\53\10\57\12\uffff\1\107\1\113\1\116\1\120\1\122\1\124"+
        "\1\126\1\130\1\132\4\uffff\1\57\2\141\10\uffff\3\57\2\uffff\6\57"+
        "\1\163\4\57\12\uffff\1\171\33\uffff\1\u0083\10\uffff\6\57\1\u0092"+
        "\1\57\1\uffff\1\u0094\3\57\1\u0098\16\uffff\1\u009c\4\uffff\5\57"+
        "\1\u00a2\1\uffff\1\57\1\uffff\1\57\1\u00a5\1\u00a6\5\uffff\1\57"+
        "\1\u00a9\1\57\1\u00ab\1\57\1\uffff\1\u00ad\1\57\3\uffff\1\57\1\uffff"+
        "\1\57\1\uffff\1\57\1\uffff\1\u00b3\1\uffff\1\u00b4\1\u00b5\1\57"+
        "\3\uffff\1\u00b7\1\uffff";
    static final String DFA18_eofS =
        "\u00b8\uffff";
    static final String DFA18_minS =
        "\1\0\1\57\10\56\12\uffff\1\130\1\55\1\53\4\75\1\46\1\174\4\uffff"+
        "\1\56\1\40\1\10\10\uffff\3\56\2\uffff\13\56\12\uffff\1\60\30\uffff"+
        "\1\40\1\42\1\uffff\1\47\2\uffff\3\40\3\uffff\10\56\1\uffff\4\56"+
        "\1\60\3\uffff\7\40\1\uffff\1\40\1\uffff\5\47\1\uffff\6\56\1\uffff"+
        "\1\56\1\uffff\3\56\1\uffff\2\40\2\uffff\5\56\1\uffff\2\56\3\uffff"+
        "\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\3\56\3\uffff"+
        "\1\56\1\uffff";
    static final String DFA18_maxS =
        "\1\177\1\57\10\172\12\uffff\1\170\6\75\1\46\1\174\4\uffff\1\172"+
        "\2\176\10\uffff\3\172\2\uffff\13\172\12\uffff\1\172\30\uffff\1\176"+
        "\1\164\1\uffff\1\47\2\uffff\3\176\3\uffff\10\172\1\uffff\5\172\3"+
        "\uffff\7\176\1\uffff\1\176\1\uffff\5\47\1\uffff\6\172\1\uffff\1"+
        "\172\1\uffff\3\172\1\uffff\2\176\2\uffff\5\172\1\uffff\2\172\3\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\3"+
        "\uffff\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\12\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\11\uffff"+
        "\1\52\1\54\1\56\1\31\3\uffff\1\65\1\77\1\102\1\65\1\103\1\104\1"+
        "\1\1\53\3\uffff\1\62\1\76\13\uffff\1\17\1\20\1\21\1\22\1\23\1\24"+
        "\1\25\1\26\1\27\1\30\1\uffff\1\31\1\35\1\36\1\32\1\51\1\33\1\34"+
        "\1\50\1\37\1\45\1\40\1\46\1\41\1\47\1\42\1\55\1\43\1\60\1\44\1\57"+
        "\1\52\1\54\1\56\1\63\2\uffff\1\101\1\uffff\1\66\1\67\3\uffff\1\65"+
        "\1\77\1\102\10\uffff\1\11\5\uffff\1\74\1\75\1\100\7\uffff\1\64\1"+
        "\uffff\1\73\5\uffff\1\71\6\uffff\1\10\1\uffff\1\12\3\uffff\1\61"+
        "\2\uffff\1\64\1\72\5\uffff\1\7\2\uffff\1\14\1\15\1\70\1\uffff\1"+
        "\3\1\uffff\1\5\1\uffff\1\16\1\uffff\1\70\3\uffff\1\13\1\2\1\4\1"+
        "\uffff\1\6";
    static final String DFA18_specialS =
        "\u00b8\uffff}>";
    static final String[] DFA18_transitionS = {
            "\10\50\3\44\1\50\1\46\1\44\22\50\1\47\1\32\1\42\2\51\1\36\1"+
            "\33\1\43\1\12\1\13\1\35\1\26\1\21\1\25\1\22\1\1\1\24\11\40\1"+
            "\23\1\20\1\27\1\31\1\30\1\45\1\51\32\41\1\16\1\51\1\17\1\37"+
            "\1\41\1\51\1\41\1\2\1\3\1\41\1\4\1\5\2\41\1\6\10\41\1\7\1\41"+
            "\1\11\1\41\1\10\4\41\1\14\1\34\1\15\1\51\1\50",
            "\1\52",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56"+
            "\1\54\2\56\1\55\10\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\61"+
            "\12\56\1\62\2\56\1\63\13\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56"+
            "\1\64\16\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\66"+
            "\15\56\1\65\13\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\5\56"+
            "\1\67\7\56\1\70\14\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56"+
            "\1\71\25\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56"+
            "\1\72\13\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56"+
            "\1\73\10\56",
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
            "\1\106\37\uffff\1\106",
            "\1\111\2\uffff\12\112\3\uffff\1\110",
            "\1\114\21\uffff\1\115",
            "\1\117",
            "\1\121",
            "\1\123",
            "\1\125",
            "\1\127",
            "\1\131",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\2\137\1\136\4\137\1\uffff\64\137\1\140\42\137",
            "\3\143\2\uffff\1\143\22\uffff\2\147\1\144\4\147\1\142\10\147"+
            "\1\145\53\147\1\146\42\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56"+
            "\1\153\13\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56"+
            "\1\154\25\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56"+
            "\1\155\16\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\156"+
            "\31\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56"+
            "\1\157\14\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56"+
            "\1\160\7\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56"+
            "\1\161\10\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56"+
            "\1\162\16\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56"+
            "\1\164\6\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56"+
            "\1\165\6\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56"+
            "\1\166\21\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56"+
            "\1\167\5\56",
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
            "\12\170\7\uffff\6\170\24\172\6\uffff\6\170\24\172",
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
            "",
            "",
            "",
            "",
            "",
            "\2\137\1\136\4\137\1\173\64\137\1\140\42\137",
            "\1\u0080\4\uffff\1\u0081\64\uffff\1\u0082\5\uffff\1\174\13"+
            "\uffff\1\176\3\uffff\1\177\1\uffff\1\175",
            "",
            "\1\144",
            "",
            "",
            "\2\u0085\1\uffff\4\u0085\1\u0083\60\u0085\1\u0084\3\u0085\1"+
            "\uffff\33\u0085\1\u0084\6\u0085",
            "\2\u008b\1\u0083\4\u008b\1\u0087\64\u008b\1\u0083\5\u008b\1"+
            "\u0086\13\u008b\1\u0089\3\u008b\1\u008a\1\u008b\1\u0088\12\u008b",
            "\2\u0085\1\uffff\4\u0085\1\u0083\64\u0085\1\uffff\42\u0085",
            "",
            "",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56"+
            "\1\u008c\16\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u008d"+
            "\31\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56"+
            "\1\u008e\16\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56"+
            "\1\u008f\7\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56"+
            "\1\u0090\6\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56"+
            "\1\u0091\25\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56"+
            "\1\u0093\7\56",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56"+
            "\1\u0095\5\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56"+
            "\1\u0096\26\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56"+
            "\1\u0097\25\56",
            "\12\170\7\uffff\6\170\24\172\6\uffff\6\170\24\172",
            "",
            "",
            "",
            "\2\137\1\136\4\137\1\173\64\137\1\140\42\137",
            "\2\137\1\136\4\137\1\173\64\137\1\140\42\137",
            "\2\137\1\136\4\137\1\173\64\137\1\140\42\137",
            "\2\137\1\136\4\137\1\173\64\137\1\140\42\137",
            "\2\137\1\136\4\137\1\173\64\137\1\140\42\137",
            "\2\137\1\136\4\137\1\173\64\137\1\140\42\137",
            "\2\137\1\136\4\137\1\173\64\137\1\140\42\137",
            "",
            "\2\u0085\1\uffff\15\u0085\12\u009a\7\u0085\6\u0099\25\u0085"+
            "\1\uffff\4\u0085\6\u0099\30\u0085",
            "",
            "\1\u009b",
            "\1\u0083",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56"+
            "\1\u009d\25\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\12\56"+
            "\1\u009e\17\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56"+
            "\1\u009f\13\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56"+
            "\1\u00a0\7\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56"+
            "\1\u00a1\21\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56"+
            "\1\u00a3\25\56",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56"+
            "\1\u00a4\10\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\2\u0085\1\uffff\4\u0085\1\u00a7\10\u0085\12\u009a\7\u0085"+
            "\6\u0099\25\u0085\1\uffff\4\u0085\6\u0099\30\u0085",
            "\2\u0085\1\uffff\4\u0085\1\u00a7\10\u0085\12\u009a\7\u0085"+
            "\6\u0099\25\u0085\1\uffff\4\u0085\6\u0099\30\u0085",
            "",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00a8"+
            "\31\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56"+
            "\1\u00aa\5\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56"+
            "\1\u00ac\14\56",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56"+
            "\1\u00ae\14\56",
            "",
            "",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56"+
            "\1\u00b0\14\56",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56"+
            "\1\u00b1\6\56",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56"+
            "\1\u00b2\5\56",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56"+
            "\1\u00b6\25\56",
            "",
            "",
            "",
            "\1\60\1\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENTS | BOOLEAN | BREAK | CALLOUT | CLASS | CONTINUE | ELSE | FOR | IF | INT | RETURN | VOID | TRUE | FALSE | LPAREN | RPAREN | LBRACE | RBRACE | LBRAKET | RBRAKET | SEMICO | COMA | POINT | DPOINTS | DIGIT | NEGNUM | ADD1 | ASSIGNADD | ASSIGNSUB | MINUS1 | LTOEQ | GTOEQ | EQUAL | NEQUAL | AND | OR | LESSTHAN | GREATHAN | ASSIGN | ADD | MINUS | MULT | DIV | MOD | NOT | RAISE | ORBITWISE | ANDBITWISE | HEX | INDENTI | STR | CHR | WHITESPACE | NOTCHAR1 | NOTCHAR2 | NOTCHAR3 | NOTCHAR4 | NOTCHAR5 | NOTCHAR6 | NOTHEX1 | NOTHEX2 | NOTINDEN | QMARK | NOTSTR1 | NOTSTR2 | UNICODE1 | UNICODE2 | UNICODE3 );";
        }
    }
 

}