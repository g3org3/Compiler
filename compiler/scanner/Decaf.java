// $ANTLR 3.4 compiler/scanner/Decaf.g 2013-09-04 20:16:53

	package compiler.scanner;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Decaf extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int ASCCI=5;
    public static final int BACKSLASH=6;
    public static final int CHAR=7;
    public static final int CHARS=8;
    public static final int CHR=9;
    public static final int COMMA=10;
    public static final int COMMENT=11;
    public static final int DIGIT=12;
    public static final int DIV=13;
    public static final int EQ=14;
    public static final int ESC=15;
    public static final int HEX=16;
    public static final int HEXCHAR=17;
    public static final int INVALID=18;
    public static final int INVALID1=19;
    public static final int KWBOOLEAN=20;
    public static final int KWBREAK=21;
    public static final int KWCALLOUT=22;
    public static final int KWCLASS=23;
    public static final int KWCONTINUE=24;
    public static final int KWELSE=25;
    public static final int KWFALSE=26;
    public static final int KWFLOAT=27;
    public static final int KWFOR=28;
    public static final int KWFORPAR=29;
    public static final int KWIF=30;
    public static final int KWINT=31;
    public static final int KWRETURN=32;
    public static final int KWTRUE=33;
    public static final int KWVOID=34;
    public static final int LITERALCHAR=35;
    public static final int LITERALSTR=36;
    public static final int LONGCHR=37;
    public static final int LPAREN=38;
    public static final int MAYORQ=39;
    public static final int MENORQ=40;
    public static final int MINUS=41;
    public static final int MISMATCH=42;
    public static final int MULT=43;
    public static final int NEG=44;
    public static final int NEGATIVE=45;
    public static final int NEWLINE=46;
    public static final int NOHEX=47;
    public static final int NOQUOTE=48;
    public static final int NUMBER=49;
    public static final int OPERADORES=50;
    public static final int OR=51;
    public static final int PLUS=52;
    public static final int POINT=53;
    public static final int QUOTE=54;
    public static final int REAL=55;
    public static final int RPAREN=56;
    public static final int SEMI=57;
    public static final int SPACE=58;
    public static final int SQUOTE=59;
    public static final int STR=60;
    public static final int TAB=61;
    public static final int UNDERSCORE=62;
    public static final int UNICODE=63;
    public static final int VAR=64;
    public static final int WHITESPACE=65;
    public static final int WHITESPACE1=66;
    public static final int WRONGBACK=67;
    public static final int WRONGCHAR=68;
    public static final int WRONGQUOTE=69;

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

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:29:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // compiler/scanner/Decaf.g:29:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
    // $ANTLR end "ESC"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:30:20: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
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

    // $ANTLR start "HEXCHAR"
    public final void mHEXCHAR() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:31:20: ( ( 'A' .. 'F' | 'a' .. 'f' ) )
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:32:20: ( ( '0' .. '9' ) )
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
    // $ANTLR end "DIGIT"

    // $ANTLR start "ASCCI"
    public final void mASCCI() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:33:19: ( ( ' ' .. '!' ) | ( '#' .. '&' ) | ( '(' .. '.' ) | ( '0' .. '~' ) )
            // compiler/scanner/Decaf.g:
            {
            if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '~') ) {
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
    // $ANTLR end "ASCCI"

    // $ANTLR start "SQUOTE"
    public final void mSQUOTE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:34:20: ( ( '\\'' ) )
            // compiler/scanner/Decaf.g:34:22: ( '\\'' )
            {
            // compiler/scanner/Decaf.g:34:22: ( '\\'' )
            // compiler/scanner/Decaf.g:34:23: '\\''
            {
            match('\''); 

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQUOTE"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:35:19: ( ( '\\\"' ) )
            // compiler/scanner/Decaf.g:35:21: ( '\\\"' )
            {
            // compiler/scanner/Decaf.g:35:21: ( '\\\"' )
            // compiler/scanner/Decaf.g:35:22: '\\\"'
            {
            match('\"'); 

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:36:20: ( ( '\\\\' ) )
            // compiler/scanner/Decaf.g:36:22: ( '\\\\' )
            {
            // compiler/scanner/Decaf.g:36:22: ( '\\\\' )
            // compiler/scanner/Decaf.g:36:23: '\\\\'
            {
            match('\\'); 

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:37:20: ( ( '\\n' ) )
            // compiler/scanner/Decaf.g:37:22: ( '\\n' )
            {
            if ( input.LA(1)=='\n' ) {
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
    // $ANTLR end "NEWLINE"

    // $ANTLR start "TAB"
    public final void mTAB() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:38:17: ( ( '\\t' ) )
            // compiler/scanner/Decaf.g:38:19: ( '\\t' )
            {
            if ( input.LA(1)=='\t' ) {
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
    // $ANTLR end "TAB"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:39:19: ( ( ' ' ) )
            // compiler/scanner/Decaf.g:39:21: ( ' ' )
            {
            if ( input.LA(1)==' ' ) {
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
    // $ANTLR end "SPACE"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:40:21: ( ( '_' ) )
            // compiler/scanner/Decaf.g:40:23: ( '_' )
            {
            if ( input.LA(1)=='_' ) {
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
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "UNICODE"
    public final void mUNICODE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:41:18: ( ( '_' ) )
            // compiler/scanner/Decaf.g:41:20: ( '_' )
            {
            // compiler/scanner/Decaf.g:41:20: ( '_' )
            // compiler/scanner/Decaf.g:41:21: '_'
            {
            match('_'); 

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE"

    // $ANTLR start "WHITESPACE1"
    public final void mWHITESPACE1() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:42:21: ( ( SPACE | TAB | '\\r' ) )
            // compiler/scanner/Decaf.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
    // $ANTLR end "WHITESPACE1"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:43:17: ( ( '.' | ':' | ';' | ',' ) )
            // compiler/scanner/Decaf.g:
            {
            if ( input.LA(1)==','||input.LA(1)=='.'||(input.LA(1) >= ':' && input.LA(1) <= ';') ) {
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
    // $ANTLR end "POINT"

    // $ANTLR start "CHARS"
    public final void mCHARS() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:44:18: ( ( CHAR | DIGIT | SPACE | ESC ) )
            // compiler/scanner/Decaf.g:44:20: ( CHAR | DIGIT | SPACE | ESC )
            {
            // compiler/scanner/Decaf.g:44:20: ( CHAR | DIGIT | SPACE | ESC )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt1=1;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt1=2;
                }
                break;
            case ' ':
                {
                alt1=3;
                }
                break;
            case '\\':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // compiler/scanner/Decaf.g:44:21: CHAR
                    {
                    mCHAR(); 


                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:44:26: DIGIT
                    {
                    mDIGIT(); 


                    }
                    break;
                case 3 :
                    // compiler/scanner/Decaf.g:44:32: SPACE
                    {
                    mSPACE(); 


                    }
                    break;
                case 4 :
                    // compiler/scanner/Decaf.g:44:38: ESC
                    {
                    mESC(); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:47:10: ( ( '//' ) (~ ( '\\r' | '\\n' ) )* ( NEWLINE ) )
            // compiler/scanner/Decaf.g:47:12: ( '//' ) (~ ( '\\r' | '\\n' ) )* ( NEWLINE )
            {
            // compiler/scanner/Decaf.g:47:12: ( '//' )
            // compiler/scanner/Decaf.g:47:13: '//'
            {
            match("//"); 



            }


            // compiler/scanner/Decaf.g:47:19: (~ ( '\\r' | '\\n' ) )*
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


            if ( input.LA(1)=='\n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
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
    // $ANTLR end "COMMENT"

    // $ANTLR start "MISMATCH"
    public final void mMISMATCH() throws RecognitionException {
        try {
            int _type = MISMATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:50:10: ( ( '\\'\\'\\'' ) )
            // compiler/scanner/Decaf.g:50:12: ( '\\'\\'\\'' )
            {
            // compiler/scanner/Decaf.g:50:12: ( '\\'\\'\\'' )
            // compiler/scanner/Decaf.g:50:13: '\\'\\'\\''
            {
            match("'''"); 



            }


            Decaf.debug("unexpected char:", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MISMATCH"

    // $ANTLR start "WRONGCHAR"
    public final void mWRONGCHAR() throws RecognitionException {
        try {
            int _type = WRONGCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:51:11: ( ( '\\'' ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* '\\'' ) )
            // compiler/scanner/Decaf.g:51:13: ( '\\'' ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* '\\'' )
            {
            // compiler/scanner/Decaf.g:51:13: ( '\\'' ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* '\\'' )
            // compiler/scanner/Decaf.g:51:14: '\\'' ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* '\\''
            {
            match('\''); 

            // compiler/scanner/Decaf.g:51:19: ( '0x' | '0X' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='x') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='X') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // compiler/scanner/Decaf.g:51:20: '0x'
                    {
                    match("0x"); 



                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:51:25: '0X'
                    {
                    match("0X"); 



                    }
                    break;

            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:51:45: ( DIGIT | HEXCHAR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'F')||(LA4_0 >= 'a' && LA4_0 <= 'f')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
                }
            } while (true);


            match('\''); 

            }


            Decaf.debug("unexpected char:", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRONGCHAR"

    // $ANTLR start "WRONGBACK"
    public final void mWRONGBACK() throws RecognitionException {
        try {
            int _type = WRONGBACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:52:11: ( ( '\\'\\\\' ( CHAR | DIGIT ) '\\'' ) )
            // compiler/scanner/Decaf.g:52:13: ( '\\'\\\\' ( CHAR | DIGIT ) '\\'' )
            {
            // compiler/scanner/Decaf.g:52:13: ( '\\'\\\\' ( CHAR | DIGIT ) '\\'' )
            // compiler/scanner/Decaf.g:52:14: '\\'\\\\' ( CHAR | DIGIT ) '\\''
            {
            match("'\\"); 



            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            }


            Decaf.debug("unexpected char:", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRONGBACK"

    // $ANTLR start "WRONGQUOTE"
    public final void mWRONGQUOTE() throws RecognitionException {
        try {
            int _type = WRONGQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:53:12: ( ( '\\'' ( '\\\"' )+ '\\'' ) )
            // compiler/scanner/Decaf.g:53:14: ( '\\'' ( '\\\"' )+ '\\'' )
            {
            // compiler/scanner/Decaf.g:53:14: ( '\\'' ( '\\\"' )+ '\\'' )
            // compiler/scanner/Decaf.g:53:15: '\\'' ( '\\\"' )+ '\\''
            {
            match('\''); 

            // compiler/scanner/Decaf.g:53:19: ( '\\\"' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\"') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:53:20: '\\\"'
            	    {
            	    match('\"'); 

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


            match('\''); 

            }


            Decaf.debug("unexpected char:", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRONGQUOTE"

    // $ANTLR start "LONGCHR"
    public final void mLONGCHR() throws RecognitionException {
        try {
            int _type = LONGCHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:54:10: ( ( SQUOTE ( CHARS ) ( CHARS )+ SQUOTE ) )
            // compiler/scanner/Decaf.g:54:12: ( SQUOTE ( CHARS ) ( CHARS )+ SQUOTE )
            {
            // compiler/scanner/Decaf.g:54:12: ( SQUOTE ( CHARS ) ( CHARS )+ SQUOTE )
            // compiler/scanner/Decaf.g:54:13: SQUOTE ( CHARS ) ( CHARS )+ SQUOTE
            {
            mSQUOTE(); 


            // compiler/scanner/Decaf.g:54:20: ( CHARS )
            // compiler/scanner/Decaf.g:54:21: CHARS
            {
            mCHARS(); 


            }


            // compiler/scanner/Decaf.g:54:27: ( CHARS )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==' '||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='\\'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:54:28: CHARS
            	    {
            	    mCHARS(); 


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


            mSQUOTE(); 


            }


            Decaf.debug("unexpected char:", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONGCHR"

    // $ANTLR start "NOQUOTE"
    public final void mNOQUOTE() throws RecognitionException {
        try {
            int _type = NOQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:55:10: ( ( '\\'\\\\\\'' ) )
            // compiler/scanner/Decaf.g:55:12: ( '\\'\\\\\\'' )
            {
            // compiler/scanner/Decaf.g:55:12: ( '\\'\\\\\\'' )
            // compiler/scanner/Decaf.g:55:13: '\\'\\\\\\''
            {
            match("'\\'"); 



            }


            Decaf.debug("unexpected char:", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOQUOTE"

    // $ANTLR start "NOHEX"
    public final void mNOHEX() throws RecognitionException {
        try {
            int _type = NOHEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:56:8: ( ( '0x' ) )
            // compiler/scanner/Decaf.g:56:10: ( '0x' )
            {
            // compiler/scanner/Decaf.g:56:10: ( '0x' )
            // compiler/scanner/Decaf.g:56:11: '0x'
            {
            match("0x"); 



            }


            Decaf.debug("unexpected hex:", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOHEX"

    // $ANTLR start "INVALID"
    public final void mINVALID() throws RecognitionException {
        try {
            int _type = INVALID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:57:10: ( ( ( UNDERSCORE ) ( CHAR | DIGIT | UNDERSCORE )* ) )
            // compiler/scanner/Decaf.g:57:12: ( ( UNDERSCORE ) ( CHAR | DIGIT | UNDERSCORE )* )
            {
            // compiler/scanner/Decaf.g:57:12: ( ( UNDERSCORE ) ( CHAR | DIGIT | UNDERSCORE )* )
            // compiler/scanner/Decaf.g:57:13: ( UNDERSCORE ) ( CHAR | DIGIT | UNDERSCORE )*
            {
            if ( input.LA(1)=='_' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:57:26: ( CHAR | DIGIT | UNDERSCORE )*
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


            }


            Decaf.debug("invalid:", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVALID"

    // $ANTLR start "INVALID1"
    public final void mINVALID1() throws RecognitionException {
        try {
            int _type = INVALID1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:58:10: ( ( ( CHAR )* '.' ( CHAR )* ) )
            // compiler/scanner/Decaf.g:58:12: ( ( CHAR )* '.' ( CHAR )* )
            {
            // compiler/scanner/Decaf.g:58:12: ( ( CHAR )* '.' ( CHAR )* )
            // compiler/scanner/Decaf.g:58:13: ( CHAR )* '.' ( CHAR )*
            {
            // compiler/scanner/Decaf.g:58:13: ( CHAR )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= 'A' && LA8_0 <= 'Z')||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
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
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('.'); 

            // compiler/scanner/Decaf.g:58:23: ( CHAR )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            Decaf.debug("invalid:", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVALID1"

    // $ANTLR start "NEGATIVE"
    public final void mNEGATIVE() throws RecognitionException {
        try {
            int _type = NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:61:10: ( ( '-' ( DIGIT ) ( DIGIT )* ) )
            // compiler/scanner/Decaf.g:61:12: ( '-' ( DIGIT ) ( DIGIT )* )
            {
            // compiler/scanner/Decaf.g:61:12: ( '-' ( DIGIT ) ( DIGIT )* )
            // compiler/scanner/Decaf.g:61:13: '-' ( DIGIT ) ( DIGIT )*
            {
            match('-'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:61:24: ( DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
                }
            } while (true);


            }


            Decaf.debug("NUMBER", getLine(), getText());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEGATIVE"

    // $ANTLR start "KWBOOLEAN"
    public final void mKWBOOLEAN() throws RecognitionException {
        try {
            int _type = KWBOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:65:11: ( 'boolean' )
            // compiler/scanner/Decaf.g:65:13: 'boolean'
            {
            match("boolean"); 



             Decaf.debug("KW: BOOLEAN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWBOOLEAN"

    // $ANTLR start "KWBREAK"
    public final void mKWBREAK() throws RecognitionException {
        try {
            int _type = KWBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:66:10: ( 'break' )
            // compiler/scanner/Decaf.g:66:12: 'break'
            {
            match("break"); 



             Decaf.debug("KW: BREAK", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWBREAK"

    // $ANTLR start "KWCALLOUT"
    public final void mKWCALLOUT() throws RecognitionException {
        try {
            int _type = KWCALLOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:67:11: ( 'callout' )
            // compiler/scanner/Decaf.g:67:13: 'callout'
            {
            match("callout"); 



             Decaf.debug("KW: CALLOUT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWCALLOUT"

    // $ANTLR start "KWCLASS"
    public final void mKWCLASS() throws RecognitionException {
        try {
            int _type = KWCLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:68:10: ( 'class' )
            // compiler/scanner/Decaf.g:68:12: 'class'
            {
            match("class"); 



             Decaf.debug("KW: CLASS", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWCLASS"

    // $ANTLR start "KWCONTINUE"
    public final void mKWCONTINUE() throws RecognitionException {
        try {
            int _type = KWCONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:69:12: ( 'continue' )
            // compiler/scanner/Decaf.g:69:14: 'continue'
            {
            match("continue"); 



             Decaf.debug("KW: CONTINUE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWCONTINUE"

    // $ANTLR start "KWELSE"
    public final void mKWELSE() throws RecognitionException {
        try {
            int _type = KWELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:70:9: ( 'else' )
            // compiler/scanner/Decaf.g:70:11: 'else'
            {
            match("else"); 



             Decaf.debug("KW: ELSE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWELSE"

    // $ANTLR start "KWFALSE"
    public final void mKWFALSE() throws RecognitionException {
        try {
            int _type = KWFALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:71:10: ( 'false' )
            // compiler/scanner/Decaf.g:71:12: 'false'
            {
            match("false"); 



             Decaf.debug("KW: FALSE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWFALSE"

    // $ANTLR start "KWFOR"
    public final void mKWFOR() throws RecognitionException {
        try {
            int _type = KWFOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:72:8: ( 'for' )
            // compiler/scanner/Decaf.g:72:10: 'for'
            {
            match("for"); 



             Decaf.debug("KW: FOR", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWFOR"

    // $ANTLR start "KWFORPAR"
    public final void mKWFORPAR() throws RecognitionException {
        try {
            int _type = KWFORPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:73:10: ( 'forpar' )
            // compiler/scanner/Decaf.g:73:12: 'forpar'
            {
            match("forpar"); 



             Decaf.debug("KW: FORPAR", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWFORPAR"

    // $ANTLR start "KWIF"
    public final void mKWIF() throws RecognitionException {
        try {
            int _type = KWIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:74:7: ( 'if' )
            // compiler/scanner/Decaf.g:74:9: 'if'
            {
            match("if"); 



             Decaf.debug("KW: IF", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWIF"

    // $ANTLR start "KWINT"
    public final void mKWINT() throws RecognitionException {
        try {
            int _type = KWINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:75:8: ( 'int' )
            // compiler/scanner/Decaf.g:75:10: 'int'
            {
            match("int"); 



             Decaf.debug("KW: INT", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWINT"

    // $ANTLR start "KWRETURN"
    public final void mKWRETURN() throws RecognitionException {
        try {
            int _type = KWRETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:76:10: ( 'return' )
            // compiler/scanner/Decaf.g:76:12: 'return'
            {
            match("return"); 



             Decaf.debug("KW: RETURN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWRETURN"

    // $ANTLR start "KWTRUE"
    public final void mKWTRUE() throws RecognitionException {
        try {
            int _type = KWTRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:77:9: ( 'true' )
            // compiler/scanner/Decaf.g:77:11: 'true'
            {
            match("true"); 



             Decaf.debug("KW: TRUE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWTRUE"

    // $ANTLR start "KWVOID"
    public final void mKWVOID() throws RecognitionException {
        try {
            int _type = KWVOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:78:9: ( 'void' )
            // compiler/scanner/Decaf.g:78:11: 'void'
            {
            match("void"); 



             Decaf.debug("KW: VOID", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWVOID"

    // $ANTLR start "KWFLOAT"
    public final void mKWFLOAT() throws RecognitionException {
        try {
            int _type = KWFLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:79:13: ( 'float' )
            // compiler/scanner/Decaf.g:79:15: 'float'
            {
            match("float"); 



             Decaf.debug("KW: FLOAT ", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KWFLOAT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:82:13: ( ',' )
            // compiler/scanner/Decaf.g:82:17: ','
            {
            match(','); 

             Decaf.debug("COMMA", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:83:13: ( ';' )
            // compiler/scanner/Decaf.g:83:17: ';'
            {
            match(';'); 

             Decaf.debug("SEMI", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:84:13: ( '(' )
            // compiler/scanner/Decaf.g:84:17: '('
            {
            match('('); 

             Decaf.debug("LPAREN", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:85:13: ( ')' )
            // compiler/scanner/Decaf.g:85:17: ')'
            {
            match(')'); 

             Decaf.debug("RPAREN", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:88:7: ( '+' )
            // compiler/scanner/Decaf.g:88:9: '+'
            {
            match('+'); 

             Decaf.debug("PLUS", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:89:8: ( '-' )
            // compiler/scanner/Decaf.g:89:11: '-'
            {
            match('-'); 

             Decaf.debug("MINUS", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:90:7: ( '*' )
            // compiler/scanner/Decaf.g:90:10: '*'
            {
            match('*'); 

             Decaf.debug("MULT", getLine(), getText()); 

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
            // compiler/scanner/Decaf.g:91:7: ( '/' )
            // compiler/scanner/Decaf.g:91:10: '/'
            {
            match('/'); 

             Decaf.debug("DIV", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:92:7: ( '&' )
            // compiler/scanner/Decaf.g:92:10: '&'
            {
            match('&'); 

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
            // compiler/scanner/Decaf.g:93:6: ( '|' )
            // compiler/scanner/Decaf.g:93:9: '|'
            {
            match('|'); 

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

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:94:6: ( '=' )
            // compiler/scanner/Decaf.g:94:9: '='
            {
            match('='); 

             Decaf.debug("EQ", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "MAYORQ"
    public final void mMAYORQ() throws RecognitionException {
        try {
            int _type = MAYORQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:95:9: ( '>' )
            // compiler/scanner/Decaf.g:95:11: '>'
            {
            match('>'); 

             Decaf.debug("MAYORQ", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAYORQ"

    // $ANTLR start "MENORQ"
    public final void mMENORQ() throws RecognitionException {
        try {
            int _type = MENORQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:96:9: ( '<' )
            // compiler/scanner/Decaf.g:96:11: '<'
            {
            match('<'); 

             Decaf.debug("MENORQ", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MENORQ"

    // $ANTLR start "NEG"
    public final void mNEG() throws RecognitionException {
        try {
            int _type = NEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:97:7: ( '!' )
            // compiler/scanner/Decaf.g:97:9: '!'
            {
            match('!'); 

             Decaf.debug("NEG", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEG"

    // $ANTLR start "OPERADORES"
    public final void mOPERADORES() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:99:21: ( ( '+' | '-' | '*' | '/' | '&' | '|' | '=' | '>' | '<' | '!' ) )
            // compiler/scanner/Decaf.g:
            {
            if ( input.LA(1)=='!'||input.LA(1)=='&'||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1) >= '<' && input.LA(1) <= '>')||input.LA(1)=='|' ) {
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
    // $ANTLR end "OPERADORES"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:106:13: ( ( CHAR ) ( CHAR | DIGIT )* )
            // compiler/scanner/Decaf.g:106:15: ( CHAR ) ( CHAR | DIGIT )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:106:21: ( CHAR | DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
                }
            } while (true);


             Decaf.debug("VAR", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:109:7: ( ( QUOTE ( ASCCI )* QUOTE ) )
            // compiler/scanner/Decaf.g:109:9: ( QUOTE ( ASCCI )* QUOTE )
            {
            // compiler/scanner/Decaf.g:109:9: ( QUOTE ( ASCCI )* QUOTE )
            // compiler/scanner/Decaf.g:109:10: QUOTE ( ASCCI )* QUOTE
            {
            mQUOTE(); 


            // compiler/scanner/Decaf.g:109:16: ( ASCCI )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= ' ' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '&')||(LA12_0 >= '(' && LA12_0 <= '.')||(LA12_0 >= '0' && LA12_0 <= '~')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '~') ) {
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
            	    break loop12;
                }
            } while (true);


            mQUOTE(); 


            }


             Decaf.debug("STR", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "LITERALSTR"
    public final void mLITERALSTR() throws RecognitionException {
        try {
            int _type = LITERALSTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:111:13: ( ( QUOTE ( ESC |~ ( '\\\\' | '\"' ) )* QUOTE ) )
            // compiler/scanner/Decaf.g:111:15: ( QUOTE ( ESC |~ ( '\\\\' | '\"' ) )* QUOTE )
            {
            // compiler/scanner/Decaf.g:111:15: ( QUOTE ( ESC |~ ( '\\\\' | '\"' ) )* QUOTE )
            // compiler/scanner/Decaf.g:111:16: QUOTE ( ESC |~ ( '\\\\' | '\"' ) )* QUOTE
            {
            mQUOTE(); 


            // compiler/scanner/Decaf.g:111:22: ( ESC |~ ( '\\\\' | '\"' ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    alt13=1;
                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:111:23: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 2 :
            	    // compiler/scanner/Decaf.g:111:29: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop13;
                }
            } while (true);


            mQUOTE(); 


            }


             Decaf.debug("STR", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LITERALSTR"

    // $ANTLR start "CHR"
    public final void mCHR() throws RecognitionException {
        try {
            int _type = CHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:114:7: ( ( SQUOTE ASCCI SQUOTE ) )
            // compiler/scanner/Decaf.g:114:9: ( SQUOTE ASCCI SQUOTE )
            {
            // compiler/scanner/Decaf.g:114:9: ( SQUOTE ASCCI SQUOTE )
            // compiler/scanner/Decaf.g:114:10: SQUOTE ASCCI SQUOTE
            {
            mSQUOTE(); 


            mASCCI(); 


            mSQUOTE(); 


            }


             Decaf.debug("CHARLITERAL", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHR"

    // $ANTLR start "LITERALCHAR"
    public final void mLITERALCHAR() throws RecognitionException {
        try {
            int _type = LITERALCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:115:13: ( ( SQUOTE ( ESC |~ ( '\\'' | '\\\\' ) ) SQUOTE ) )
            // compiler/scanner/Decaf.g:115:15: ( SQUOTE ( ESC |~ ( '\\'' | '\\\\' ) ) SQUOTE )
            {
            // compiler/scanner/Decaf.g:115:15: ( SQUOTE ( ESC |~ ( '\\'' | '\\\\' ) ) SQUOTE )
            // compiler/scanner/Decaf.g:115:16: SQUOTE ( ESC |~ ( '\\'' | '\\\\' ) ) SQUOTE
            {
            mSQUOTE(); 


            // compiler/scanner/Decaf.g:115:23: ( ESC |~ ( '\\'' | '\\\\' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\\') ) {
                alt14=1;
            }
            else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '&')||(LA14_0 >= '(' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // compiler/scanner/Decaf.g:115:24: ESC
                    {
                    mESC(); 


                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:115:30: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mSQUOTE(); 


            }


             Decaf.debug("CHARLITERAL", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LITERALCHAR"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:118:9: ( ( DIGIT )+ )
            // compiler/scanner/Decaf.g:118:11: ( DIGIT )+
            {
            // compiler/scanner/Decaf.g:118:11: ( DIGIT )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


             Decaf.debug("NUMBER", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:119:7: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // compiler/scanner/Decaf.g:119:9: ( DIGIT )+ '.' ( DIGIT )+
            {
            // compiler/scanner/Decaf.g:119:9: ( DIGIT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            match('.'); 

            // compiler/scanner/Decaf.g:119:22: ( DIGIT )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


             Decaf.debug("REAL", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:120:7: ( ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* )
            // compiler/scanner/Decaf.g:120:9: ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )*
            {
            // compiler/scanner/Decaf.g:120:9: ( '0x' | '0X' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='0') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='x') ) {
                    alt18=1;
                }
                else if ( (LA18_1=='X') ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // compiler/scanner/Decaf.g:120:10: '0x'
                    {
                    match("0x"); 



                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:120:17: '0X'
                    {
                    match("0X"); 



                    }
                    break;

            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:120:41: ( DIGIT | HEXCHAR )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'F')||(LA19_0 >= 'a' && LA19_0 <= 'f')) ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    break loop19;
                }
            } while (true);


             Decaf.debug("HEX", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:125:13: ( ( TAB | SPACE | '\\r' | NEWLINE ) )
            // compiler/scanner/Decaf.g:125:15: ( TAB | SPACE | '\\r' | NEWLINE )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
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
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // compiler/scanner/Decaf.g:1:8: ( COMMENT | MISMATCH | WRONGCHAR | WRONGBACK | WRONGQUOTE | LONGCHR | NOQUOTE | NOHEX | INVALID | INVALID1 | NEGATIVE | KWBOOLEAN | KWBREAK | KWCALLOUT | KWCLASS | KWCONTINUE | KWELSE | KWFALSE | KWFOR | KWFORPAR | KWIF | KWINT | KWRETURN | KWTRUE | KWVOID | KWFLOAT | COMMA | SEMI | LPAREN | RPAREN | PLUS | MINUS | MULT | DIV | AND | OR | EQ | MAYORQ | MENORQ | NEG | VAR | STR | LITERALSTR | CHR | LITERALCHAR | NUMBER | REAL | HEX | WHITESPACE )
        int alt20=49;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // compiler/scanner/Decaf.g:1:10: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 2 :
                // compiler/scanner/Decaf.g:1:18: MISMATCH
                {
                mMISMATCH(); 


                }
                break;
            case 3 :
                // compiler/scanner/Decaf.g:1:27: WRONGCHAR
                {
                mWRONGCHAR(); 


                }
                break;
            case 4 :
                // compiler/scanner/Decaf.g:1:37: WRONGBACK
                {
                mWRONGBACK(); 


                }
                break;
            case 5 :
                // compiler/scanner/Decaf.g:1:47: WRONGQUOTE
                {
                mWRONGQUOTE(); 


                }
                break;
            case 6 :
                // compiler/scanner/Decaf.g:1:58: LONGCHR
                {
                mLONGCHR(); 


                }
                break;
            case 7 :
                // compiler/scanner/Decaf.g:1:66: NOQUOTE
                {
                mNOQUOTE(); 


                }
                break;
            case 8 :
                // compiler/scanner/Decaf.g:1:74: NOHEX
                {
                mNOHEX(); 


                }
                break;
            case 9 :
                // compiler/scanner/Decaf.g:1:80: INVALID
                {
                mINVALID(); 


                }
                break;
            case 10 :
                // compiler/scanner/Decaf.g:1:88: INVALID1
                {
                mINVALID1(); 


                }
                break;
            case 11 :
                // compiler/scanner/Decaf.g:1:97: NEGATIVE
                {
                mNEGATIVE(); 


                }
                break;
            case 12 :
                // compiler/scanner/Decaf.g:1:106: KWBOOLEAN
                {
                mKWBOOLEAN(); 


                }
                break;
            case 13 :
                // compiler/scanner/Decaf.g:1:116: KWBREAK
                {
                mKWBREAK(); 


                }
                break;
            case 14 :
                // compiler/scanner/Decaf.g:1:124: KWCALLOUT
                {
                mKWCALLOUT(); 


                }
                break;
            case 15 :
                // compiler/scanner/Decaf.g:1:134: KWCLASS
                {
                mKWCLASS(); 


                }
                break;
            case 16 :
                // compiler/scanner/Decaf.g:1:142: KWCONTINUE
                {
                mKWCONTINUE(); 


                }
                break;
            case 17 :
                // compiler/scanner/Decaf.g:1:153: KWELSE
                {
                mKWELSE(); 


                }
                break;
            case 18 :
                // compiler/scanner/Decaf.g:1:160: KWFALSE
                {
                mKWFALSE(); 


                }
                break;
            case 19 :
                // compiler/scanner/Decaf.g:1:168: KWFOR
                {
                mKWFOR(); 


                }
                break;
            case 20 :
                // compiler/scanner/Decaf.g:1:174: KWFORPAR
                {
                mKWFORPAR(); 


                }
                break;
            case 21 :
                // compiler/scanner/Decaf.g:1:183: KWIF
                {
                mKWIF(); 


                }
                break;
            case 22 :
                // compiler/scanner/Decaf.g:1:188: KWINT
                {
                mKWINT(); 


                }
                break;
            case 23 :
                // compiler/scanner/Decaf.g:1:194: KWRETURN
                {
                mKWRETURN(); 


                }
                break;
            case 24 :
                // compiler/scanner/Decaf.g:1:203: KWTRUE
                {
                mKWTRUE(); 


                }
                break;
            case 25 :
                // compiler/scanner/Decaf.g:1:210: KWVOID
                {
                mKWVOID(); 


                }
                break;
            case 26 :
                // compiler/scanner/Decaf.g:1:217: KWFLOAT
                {
                mKWFLOAT(); 


                }
                break;
            case 27 :
                // compiler/scanner/Decaf.g:1:225: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 28 :
                // compiler/scanner/Decaf.g:1:231: SEMI
                {
                mSEMI(); 


                }
                break;
            case 29 :
                // compiler/scanner/Decaf.g:1:236: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 30 :
                // compiler/scanner/Decaf.g:1:243: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 31 :
                // compiler/scanner/Decaf.g:1:250: PLUS
                {
                mPLUS(); 


                }
                break;
            case 32 :
                // compiler/scanner/Decaf.g:1:255: MINUS
                {
                mMINUS(); 


                }
                break;
            case 33 :
                // compiler/scanner/Decaf.g:1:261: MULT
                {
                mMULT(); 


                }
                break;
            case 34 :
                // compiler/scanner/Decaf.g:1:266: DIV
                {
                mDIV(); 


                }
                break;
            case 35 :
                // compiler/scanner/Decaf.g:1:270: AND
                {
                mAND(); 


                }
                break;
            case 36 :
                // compiler/scanner/Decaf.g:1:274: OR
                {
                mOR(); 


                }
                break;
            case 37 :
                // compiler/scanner/Decaf.g:1:277: EQ
                {
                mEQ(); 


                }
                break;
            case 38 :
                // compiler/scanner/Decaf.g:1:280: MAYORQ
                {
                mMAYORQ(); 


                }
                break;
            case 39 :
                // compiler/scanner/Decaf.g:1:287: MENORQ
                {
                mMENORQ(); 


                }
                break;
            case 40 :
                // compiler/scanner/Decaf.g:1:294: NEG
                {
                mNEG(); 


                }
                break;
            case 41 :
                // compiler/scanner/Decaf.g:1:298: VAR
                {
                mVAR(); 


                }
                break;
            case 42 :
                // compiler/scanner/Decaf.g:1:302: STR
                {
                mSTR(); 


                }
                break;
            case 43 :
                // compiler/scanner/Decaf.g:1:306: LITERALSTR
                {
                mLITERALSTR(); 


                }
                break;
            case 44 :
                // compiler/scanner/Decaf.g:1:317: CHR
                {
                mCHR(); 


                }
                break;
            case 45 :
                // compiler/scanner/Decaf.g:1:321: LITERALCHAR
                {
                mLITERALCHAR(); 


                }
                break;
            case 46 :
                // compiler/scanner/Decaf.g:1:333: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 47 :
                // compiler/scanner/Decaf.g:1:340: REAL
                {
                mREAL(); 


                }
                break;
            case 48 :
                // compiler/scanner/Decaf.g:1:345: HEX
                {
                mHEX(); 


                }
                break;
            case 49 :
                // compiler/scanner/Decaf.g:1:349: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\1\40\1\uffff\1\54\1\uffff\1\61\1\uffff\1\63\10\61\15\uffff"+
        "\1\54\14\uffff\1\116\3\uffff\3\61\3\uffff\7\61\1\130\4\61\5\uffff"+
        "\1\141\11\uffff\7\61\1\155\1\61\1\uffff\1\157\3\61\1\137\7\uffff"+
        "\5\61\1\173\2\61\1\uffff\1\61\1\uffff\1\61\1\u0080\1\u0081\3\uffff"+
        "\1\61\1\u0084\1\61\1\u0086\1\61\1\uffff\1\u0088\1\61\1\u008a\1\61"+
        "\3\uffff\1\61\1\uffff\1\61\1\uffff\1\61\1\uffff\1\u008f\1\uffff"+
        "\1\u0090\1\u0091\1\u0092\1\61\4\uffff\1\u0094\1\uffff";
    static final String DFA20_eofS =
        "\u0095\uffff";
    static final String DFA20_minS =
        "\1\11\1\57\1\0\1\56\1\uffff\1\56\1\uffff\1\60\10\56\14\uffff\1\0"+
        "\1\56\4\uffff\1\42\1\40\1\42\3\40\1\47\1\uffff\1\60\3\uffff\3\56"+
        "\3\uffff\14\56\1\40\1\uffff\1\0\1\uffff\2\40\1\uffff\3\40\5\uffff"+
        "\11\56\1\uffff\4\56\2\0\3\uffff\2\40\1\uffff\10\56\1\uffff\1\56"+
        "\1\uffff\3\56\1\40\1\uffff\1\40\5\56\1\uffff\4\56\3\uffff\1\56\1"+
        "\uffff\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\4\56\4\uffff\1\56"+
        "\1\uffff";
    static final String DFA20_maxS =
        "\1\174\1\57\1\uffff\1\170\1\uffff\1\172\1\uffff\1\71\10\172\14\uffff"+
        "\1\uffff\1\71\4\uffff\2\172\1\47\3\172\1\47\1\uffff\1\146\3\uffff"+
        "\3\172\3\uffff\14\172\1\176\1\uffff\1\uffff\1\uffff\2\172\1\uffff"+
        "\3\172\5\uffff\11\172\1\uffff\4\172\2\uffff\3\uffff\2\172\1\uffff"+
        "\10\172\1\uffff\1\172\1\uffff\4\172\1\uffff\6\172\1\uffff\4\172"+
        "\3\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\4\172\4\uffff\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\4\uffff\1\11\1\uffff\1\12\11\uffff\1\33\1\34\1\35\1\36\1\37\1\41"+
        "\1\43\1\44\1\45\1\46\1\47\1\50\2\uffff\1\61\1\1\1\42\1\2\7\uffff"+
        "\1\55\1\uffff\1\60\1\56\1\57\3\uffff\1\51\1\13\1\40\15\uffff\1\52"+
        "\1\uffff\1\53\2\uffff\1\4\3\uffff\1\6\1\54\2\5\1\10\11\uffff\1\25"+
        "\6\uffff\1\52\1\4\1\7\2\uffff\1\54\10\uffff\1\23\1\uffff\1\26\4"+
        "\uffff\1\3\6\uffff\1\21\4\uffff\1\30\1\31\1\3\1\uffff\1\15\1\uffff"+
        "\1\17\1\uffff\1\22\1\uffff\1\32\4\uffff\1\24\1\27\1\14\1\16\1\uffff"+
        "\1\20";
    static final String DFA20_specialS =
        "\2\uffff\1\3\31\uffff\1\4\45\uffff\1\1\32\uffff\1\2\1\0\66\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\33\1\34\3\uffff\1\26\1\2"+
            "\1\22\1\23\1\25\1\24\1\20\1\7\1\6\1\1\1\3\11\35\1\uffff\1\21"+
            "\1\32\1\30\1\31\2\uffff\32\17\4\uffff\1\4\1\uffff\1\17\1\5\1"+
            "\10\1\17\1\11\1\12\2\17\1\13\10\17\1\14\1\17\1\15\1\17\1\16"+
            "\4\17\1\uffff\1\27",
            "\1\37",
            "\40\51\1\47\1\50\1\44\4\50\1\41\7\50\1\51\1\43\11\46\7\50\32"+
            "\45\1\50\1\42\4\50\32\45\4\50\uff81\51",
            "\1\55\1\uffff\12\35\36\uffff\1\53\37\uffff\1\52",
            "",
            "\1\6\22\uffff\32\60\6\uffff\16\60\1\56\2\60\1\57\10\60",
            "",
            "\12\62",
            "\1\6\22\uffff\32\60\6\uffff\1\64\12\60\1\65\2\60\1\66\13\60",
            "\1\6\22\uffff\32\60\6\uffff\13\60\1\67\16\60",
            "\1\6\22\uffff\32\60\6\uffff\1\70\12\60\1\72\2\60\1\71\13\60",
            "\1\6\22\uffff\32\60\6\uffff\5\60\1\73\7\60\1\74\14\60",
            "\1\6\22\uffff\32\60\6\uffff\4\60\1\75\25\60",
            "\1\6\22\uffff\32\60\6\uffff\21\60\1\76\10\60",
            "\1\6\22\uffff\32\60\6\uffff\16\60\1\77\13\60",
            "\1\6\22\uffff\32\60\6\uffff\32\60",
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
            "\40\103\2\102\1\101\4\102\1\103\7\102\1\103\54\102\1\100\42"+
            "\102\uff81\103",
            "\1\55\1\uffff\12\35",
            "",
            "",
            "",
            "",
            "\1\107\4\uffff\1\105\10\uffff\12\106\7\uffff\32\106\1\uffff"+
            "\1\107\4\uffff\1\106\1\104\3\106\1\104\7\106\1\104\3\106\1\104"+
            "\1\106\1\104\6\106",
            "\1\112\6\uffff\1\113\10\uffff\12\112\7\uffff\27\112\1\111\2"+
            "\112\1\uffff\1\112\4\uffff\27\112\1\110\2\112",
            "\1\115\4\uffff\1\114",
            "\1\112\6\uffff\1\113\10\uffff\12\112\7\uffff\32\112\1\uffff"+
            "\1\112\4\uffff\32\112",
            "\1\112\6\uffff\1\113\10\uffff\12\112\7\uffff\32\112\1\uffff"+
            "\1\112\4\uffff\32\112",
            "\1\112\6\uffff\1\113\10\uffff\12\112\7\uffff\32\112\1\uffff"+
            "\1\112\4\uffff\32\112",
            "\1\113",
            "",
            "\12\53\7\uffff\6\53\32\uffff\6\53",
            "",
            "",
            "",
            "\1\6\22\uffff\32\60\6\uffff\16\60\1\117\13\60",
            "\1\6\22\uffff\32\60\6\uffff\4\60\1\120\25\60",
            "\1\6\22\uffff\32\60\6\uffff\32\60",
            "",
            "",
            "",
            "\1\6\22\uffff\32\60\6\uffff\13\60\1\121\16\60",
            "\1\6\22\uffff\32\60\6\uffff\1\122\31\60",
            "\1\6\22\uffff\32\60\6\uffff\15\60\1\123\14\60",
            "\1\6\22\uffff\32\60\6\uffff\22\60\1\124\7\60",
            "\1\6\22\uffff\32\60\6\uffff\13\60\1\125\16\60",
            "\1\6\22\uffff\32\60\6\uffff\21\60\1\126\10\60",
            "\1\6\22\uffff\32\60\6\uffff\16\60\1\127\13\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\22\uffff\32\60\6\uffff\23\60\1\131\6\60",
            "\1\6\22\uffff\32\60\6\uffff\23\60\1\132\6\60",
            "\1\6\22\uffff\32\60\6\uffff\24\60\1\133\5\60",
            "\1\6\22\uffff\32\60\6\uffff\10\60\1\134\21\60",
            "\2\137\1\135\4\137\1\103\7\137\1\uffff\54\137\1\136\5\137\1"+
            "\136\3\137\1\136\7\137\1\136\3\137\1\136\1\137\1\136\12\137",
            "",
            "\40\103\2\102\1\101\4\102\1\103\7\102\1\103\54\102\1\100\42"+
            "\102\uff81\103",
            "",
            "\1\112\6\uffff\1\140\10\uffff\12\112\7\uffff\32\112\1\uffff"+
            "\1\112\4\uffff\32\112",
            "\1\112\6\uffff\1\51\10\uffff\12\112\7\uffff\32\112\1\uffff"+
            "\1\112\4\uffff\32\112",
            "",
            "\1\112\6\uffff\1\51\10\uffff\12\112\7\uffff\32\112\1\uffff"+
            "\1\112\4\uffff\32\112",
            "\1\112\6\uffff\1\112\10\uffff\12\143\7\uffff\6\142\24\112\1"+
            "\uffff\1\112\4\uffff\6\142\24\112",
            "\1\112\6\uffff\1\112\10\uffff\12\143\7\uffff\6\142\24\112\1"+
            "\uffff\1\112\4\uffff\6\142\24\112",
            "",
            "",
            "",
            "",
            "",
            "\1\6\22\uffff\32\60\6\uffff\13\60\1\145\16\60",
            "\1\6\22\uffff\32\60\6\uffff\1\146\31\60",
            "\1\6\22\uffff\32\60\6\uffff\13\60\1\147\16\60",
            "\1\6\22\uffff\32\60\6\uffff\22\60\1\150\7\60",
            "\1\6\22\uffff\32\60\6\uffff\23\60\1\151\6\60",
            "\1\6\22\uffff\32\60\6\uffff\4\60\1\152\25\60",
            "\1\6\22\uffff\32\60\6\uffff\22\60\1\153\7\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\17\60\1\154\12\60",
            "\1\6\22\uffff\32\60\6\uffff\1\156\31\60",
            "",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\22\uffff\32\60\6\uffff\24\60\1\160\5\60",
            "\1\6\22\uffff\32\60\6\uffff\4\60\1\161\25\60",
            "\1\6\22\uffff\32\60\6\uffff\3\60\1\162\26\60",
            "\0\103",
            "\40\103\2\102\1\101\4\102\1\103\7\102\1\103\54\102\1\100\42"+
            "\102\uff81\103",
            "",
            "",
            "",
            "\1\112\6\uffff\1\164\10\uffff\12\165\7\uffff\6\163\24\112\1"+
            "\uffff\1\112\4\uffff\6\163\24\112",
            "\1\112\6\uffff\1\164\10\uffff\12\165\7\uffff\6\163\24\112\1"+
            "\uffff\1\112\4\uffff\6\163\24\112",
            "",
            "\1\6\22\uffff\32\60\6\uffff\4\60\1\166\25\60",
            "\1\6\22\uffff\32\60\6\uffff\12\60\1\167\17\60",
            "\1\6\22\uffff\32\60\6\uffff\16\60\1\170\13\60",
            "\1\6\22\uffff\32\60\6\uffff\22\60\1\171\7\60",
            "\1\6\22\uffff\32\60\6\uffff\10\60\1\172\21\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\22\uffff\32\60\6\uffff\4\60\1\174\25\60",
            "\1\6\22\uffff\32\60\6\uffff\1\175\31\60",
            "",
            "\1\6\22\uffff\32\60\6\uffff\23\60\1\176\6\60",
            "",
            "\1\6\22\uffff\32\60\6\uffff\21\60\1\177\10\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\112\6\uffff\1\164\10\uffff\12\165\7\uffff\6\163\24\112\1"+
            "\uffff\1\112\4\uffff\6\163\24\112",
            "",
            "\1\112\6\uffff\1\164\10\uffff\12\165\7\uffff\6\163\24\112\1"+
            "\uffff\1\112\4\uffff\6\163\24\112",
            "\1\6\22\uffff\32\60\6\uffff\1\u0083\31\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\22\uffff\32\60\6\uffff\24\60\1\u0085\5\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\22\uffff\32\60\6\uffff\15\60\1\u0087\14\60",
            "",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\22\uffff\32\60\6\uffff\21\60\1\u0089\10\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\22\uffff\32\60\6\uffff\15\60\1\u008b\14\60",
            "",
            "",
            "",
            "\1\6\22\uffff\32\60\6\uffff\15\60\1\u008c\14\60",
            "",
            "\1\6\22\uffff\32\60\6\uffff\23\60\1\u008d\6\60",
            "",
            "\1\6\22\uffff\32\60\6\uffff\24\60\1\u008e\5\60",
            "",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            "\1\6\22\uffff\32\60\6\uffff\4\60\1\u0093\25\60",
            "",
            "",
            "",
            "",
            "\1\6\1\uffff\12\61\7\uffff\32\60\6\uffff\32\60",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENT | MISMATCH | WRONGCHAR | WRONGBACK | WRONGQUOTE | LONGCHR | NOQUOTE | NOHEX | INVALID | INVALID1 | NEGATIVE | KWBOOLEAN | KWBREAK | KWCALLOUT | KWCLASS | KWCONTINUE | KWELSE | KWFALSE | KWFOR | KWFORPAR | KWIF | KWINT | KWRETURN | KWTRUE | KWVOID | KWFLOAT | COMMA | SEMI | LPAREN | RPAREN | PLUS | MINUS | MULT | DIV | AND | OR | EQ | MAYORQ | MENORQ | NEG | VAR | STR | LITERALSTR | CHR | LITERALCHAR | NUMBER | REAL | HEX | WHITESPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_94 = input.LA(1);

                        s = -1;
                        if ( (LA20_94=='\"') ) {s = 65;}

                        else if ( (LA20_94=='\\') ) {s = 64;}

                        else if ( ((LA20_94 >= ' ' && LA20_94 <= '!')||(LA20_94 >= '#' && LA20_94 <= '&')||(LA20_94 >= '(' && LA20_94 <= '.')||(LA20_94 >= '0' && LA20_94 <= '[')||(LA20_94 >= ']' && LA20_94 <= '~')) ) {s = 66;}

                        else if ( ((LA20_94 >= '\u0000' && LA20_94 <= '\u001F')||LA20_94=='\''||LA20_94=='/'||(LA20_94 >= '\u007F' && LA20_94 <= '\uFFFF')) ) {s = 67;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA20_66 = input.LA(1);

                        s = -1;
                        if ( (LA20_66=='\"') ) {s = 65;}

                        else if ( (LA20_66=='\\') ) {s = 64;}

                        else if ( ((LA20_66 >= ' ' && LA20_66 <= '!')||(LA20_66 >= '#' && LA20_66 <= '&')||(LA20_66 >= '(' && LA20_66 <= '.')||(LA20_66 >= '0' && LA20_66 <= '[')||(LA20_66 >= ']' && LA20_66 <= '~')) ) {s = 66;}

                        else if ( ((LA20_66 >= '\u0000' && LA20_66 <= '\u001F')||LA20_66=='\''||LA20_66=='/'||(LA20_66 >= '\u007F' && LA20_66 <= '\uFFFF')) ) {s = 67;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA20_93 = input.LA(1);

                        s = -1;
                        if ( ((LA20_93 >= '\u0000' && LA20_93 <= '\uFFFF')) ) {s = 67;}

                        else s = 95;

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA20_2 = input.LA(1);

                        s = -1;
                        if ( (LA20_2=='\'') ) {s = 33;}

                        else if ( (LA20_2=='\\') ) {s = 34;}

                        else if ( (LA20_2=='0') ) {s = 35;}

                        else if ( (LA20_2=='\"') ) {s = 36;}

                        else if ( ((LA20_2 >= 'A' && LA20_2 <= 'Z')||(LA20_2 >= 'a' && LA20_2 <= 'z')) ) {s = 37;}

                        else if ( ((LA20_2 >= '1' && LA20_2 <= '9')) ) {s = 38;}

                        else if ( (LA20_2==' ') ) {s = 39;}

                        else if ( (LA20_2=='!'||(LA20_2 >= '#' && LA20_2 <= '&')||(LA20_2 >= '(' && LA20_2 <= '.')||(LA20_2 >= ':' && LA20_2 <= '@')||LA20_2=='['||(LA20_2 >= ']' && LA20_2 <= '`')||(LA20_2 >= '{' && LA20_2 <= '~')) ) {s = 40;}

                        else if ( ((LA20_2 >= '\u0000' && LA20_2 <= '\u001F')||LA20_2=='/'||(LA20_2 >= '\u007F' && LA20_2 <= '\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA20_28 = input.LA(1);

                        s = -1;
                        if ( (LA20_28=='\\') ) {s = 64;}

                        else if ( (LA20_28=='\"') ) {s = 65;}

                        else if ( ((LA20_28 >= ' ' && LA20_28 <= '!')||(LA20_28 >= '#' && LA20_28 <= '&')||(LA20_28 >= '(' && LA20_28 <= '.')||(LA20_28 >= '0' && LA20_28 <= '[')||(LA20_28 >= ']' && LA20_28 <= '~')) ) {s = 66;}

                        else if ( ((LA20_28 >= '\u0000' && LA20_28 <= '\u001F')||LA20_28=='\''||LA20_28=='/'||(LA20_28 >= '\u007F' && LA20_28 <= '\uFFFF')) ) {s = 67;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}