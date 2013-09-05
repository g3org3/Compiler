// $ANTLR 3.4 compiler/scanner/Decaf.g 2013-09-05 11:29:37

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
    public static final int CHAR2=8;
    public static final int CHARS=9;
    public static final int CHR=10;
    public static final int COMMA=11;
    public static final int COMMENT=12;
    public static final int DIGIT=13;
    public static final int DIV=14;
    public static final int EQ=15;
    public static final int ESC=16;
    public static final int FIX=17;
    public static final int HEX=18;
    public static final int HEXCHAR=19;
    public static final int INVALID=20;
    public static final int INVALID1=21;
    public static final int KWBOOLEAN=22;
    public static final int KWBREAK=23;
    public static final int KWCALLOUT=24;
    public static final int KWCLASS=25;
    public static final int KWCONTINUE=26;
    public static final int KWELSE=27;
    public static final int KWFALSE=28;
    public static final int KWFLOAT=29;
    public static final int KWFOR=30;
    public static final int KWFORPAR=31;
    public static final int KWIF=32;
    public static final int KWINT=33;
    public static final int KWRETURN=34;
    public static final int KWTRUE=35;
    public static final int KWVOID=36;
    public static final int LBRACE=37;
    public static final int LBRAKE=38;
    public static final int LITERALCHAR=39;
    public static final int LITERALSTR=40;
    public static final int LONGCHR=41;
    public static final int LPAREN=42;
    public static final int MAYORQ=43;
    public static final int MENORQ=44;
    public static final int MINUS=45;
    public static final int MISMATCH=46;
    public static final int MULT=47;
    public static final int NEG=48;
    public static final int NEGATIVE=49;
    public static final int NEWLINE=50;
    public static final int NOHEX=51;
    public static final int NOQUOTE=52;
    public static final int NUMBER=53;
    public static final int OPERADORES=54;
    public static final int OR=55;
    public static final int PERC=56;
    public static final int PLUS=57;
    public static final int POINT=58;
    public static final int PROGRAM=59;
    public static final int QUOTE=60;
    public static final int RBRACE=61;
    public static final int RBRAKE=62;
    public static final int REAL=63;
    public static final int RPAREN=64;
    public static final int SEMI=65;
    public static final int SPACE=66;
    public static final int SQUOTE=67;
    public static final int STR=68;
    public static final int TAB=69;
    public static final int UNDERSCORE=70;
    public static final int UNICODE=71;
    public static final int VAR=72;
    public static final int WHITE=73;
    public static final int WHITESPACE=74;
    public static final int WHITESPACE1=75;
    public static final int WRONGBACK=76;
    public static final int WRONGCHAR=77;
    public static final int WRONGQUOTE=78;

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

    // $ANTLR start "PERC"
    public final void mPERC() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:29:16: ( ( '%' ) )
            // compiler/scanner/Decaf.g:29:18: ( '%' )
            {
            // compiler/scanner/Decaf.g:29:18: ( '%' )
            // compiler/scanner/Decaf.g:29:19: '%'
            {
            match('%'); 

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERC"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:30:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // compiler/scanner/Decaf.g:30:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // compiler/scanner/Decaf.g:31:20: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
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
            // compiler/scanner/Decaf.g:32:20: ( ( 'A' .. 'F' | 'a' .. 'f' ) )
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
            // compiler/scanner/Decaf.g:33:20: ( ( '0' .. '9' ) )
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
            // compiler/scanner/Decaf.g:34:19: ( ( ' ' .. '!' ) | ( '#' .. '&' ) | ( '(' .. '.' ) | ( '0' .. '~' ) )
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

    // $ANTLR start "CHAR2"
    public final void mCHAR2() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:35:17: ( ( 'a' | 'c' .. 'e' | 'g' .. 'm' | 'p' .. 'q' | 's' | 'u' .. 'z' | 'A' | 'C' .. 'E' | 'G' .. 'M' | 'P' .. 'Q' | 'S' | 'U' .. 'Z' ) )
            // compiler/scanner/Decaf.g:
            {
            if ( input.LA(1)=='A'||(input.LA(1) >= 'C' && input.LA(1) <= 'E')||(input.LA(1) >= 'G' && input.LA(1) <= 'M')||(input.LA(1) >= 'P' && input.LA(1) <= 'Q')||input.LA(1)=='S'||(input.LA(1) >= 'U' && input.LA(1) <= 'Z')||input.LA(1)=='a'||(input.LA(1) >= 'c' && input.LA(1) <= 'e')||(input.LA(1) >= 'g' && input.LA(1) <= 'm')||(input.LA(1) >= 'p' && input.LA(1) <= 'q')||input.LA(1)=='s'||(input.LA(1) >= 'u' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "CHAR2"

    // $ANTLR start "SQUOTE"
    public final void mSQUOTE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:36:20: ( ( '\\'' ) )
            // compiler/scanner/Decaf.g:36:22: ( '\\'' )
            {
            // compiler/scanner/Decaf.g:36:22: ( '\\'' )
            // compiler/scanner/Decaf.g:36:23: '\\''
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
            // compiler/scanner/Decaf.g:37:19: ( ( '\\\"' ) )
            // compiler/scanner/Decaf.g:37:21: ( '\\\"' )
            {
            // compiler/scanner/Decaf.g:37:21: ( '\\\"' )
            // compiler/scanner/Decaf.g:37:22: '\\\"'
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
            // compiler/scanner/Decaf.g:38:20: ( ( '\\\\' ) )
            // compiler/scanner/Decaf.g:38:22: ( '\\\\' )
            {
            // compiler/scanner/Decaf.g:38:22: ( '\\\\' )
            // compiler/scanner/Decaf.g:38:23: '\\\\'
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
            // compiler/scanner/Decaf.g:39:20: ( ( '\\n' ) )
            // compiler/scanner/Decaf.g:39:22: ( '\\n' )
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
            // compiler/scanner/Decaf.g:40:17: ( ( '\\t' ) )
            // compiler/scanner/Decaf.g:40:19: ( '\\t' )
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
            // compiler/scanner/Decaf.g:41:19: ( ( ' ' ) )
            // compiler/scanner/Decaf.g:41:21: ( ' ' )
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
            // compiler/scanner/Decaf.g:42:21: ( ( '_' ) )
            // compiler/scanner/Decaf.g:42:23: ( '_' )
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
            // compiler/scanner/Decaf.g:43:18: ( ( '_' ) )
            // compiler/scanner/Decaf.g:43:20: ( '_' )
            {
            // compiler/scanner/Decaf.g:43:20: ( '_' )
            // compiler/scanner/Decaf.g:43:21: '_'
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

    // $ANTLR start "WHITE"
    public final void mWHITE() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:44:18: ( ( SPACE | TAB | '\\r' | NEWLINE | '\\b' ) )
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITE"

    // $ANTLR start "WHITESPACE1"
    public final void mWHITESPACE1() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:45:21: ( ( SPACE | TAB | '\\r' ) )
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
            // compiler/scanner/Decaf.g:46:17: ( ( '.' | ':' | ';' | ',' ) )
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
            // compiler/scanner/Decaf.g:47:18: ( ( CHAR | DIGIT | SPACE | ESC ) )
            // compiler/scanner/Decaf.g:47:20: ( CHAR | DIGIT | SPACE | ESC )
            {
            // compiler/scanner/Decaf.g:47:20: ( CHAR | DIGIT | SPACE | ESC )
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
                    // compiler/scanner/Decaf.g:47:21: CHAR
                    {
                    mCHAR(); 


                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:47:26: DIGIT
                    {
                    mDIGIT(); 


                    }
                    break;
                case 3 :
                    // compiler/scanner/Decaf.g:47:32: SPACE
                    {
                    mSPACE(); 


                    }
                    break;
                case 4 :
                    // compiler/scanner/Decaf.g:47:38: ESC
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
            // compiler/scanner/Decaf.g:50:10: ( ( '//' ) (~ ( '\\r' | '\\n' ) )* ( NEWLINE ) )
            // compiler/scanner/Decaf.g:50:12: ( '//' ) (~ ( '\\r' | '\\n' ) )* ( NEWLINE )
            {
            // compiler/scanner/Decaf.g:50:12: ( '//' )
            // compiler/scanner/Decaf.g:50:13: '//'
            {
            match("//"); 



            }


            // compiler/scanner/Decaf.g:50:19: (~ ( '\\r' | '\\n' ) )*
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
            // compiler/scanner/Decaf.g:53:10: ( ( '\\'\\'\\'' ) )
            // compiler/scanner/Decaf.g:53:12: ( '\\'\\'\\'' )
            {
            // compiler/scanner/Decaf.g:53:12: ( '\\'\\'\\'' )
            // compiler/scanner/Decaf.g:53:13: '\\'\\'\\''
            {
            match("'''"); 



            }


            Decaf.debug("unexpected char:1", getLine(), getText());

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
            // compiler/scanner/Decaf.g:54:11: ( ( '\\'' ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* '\\'' ) )
            // compiler/scanner/Decaf.g:54:13: ( '\\'' ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* '\\'' )
            {
            // compiler/scanner/Decaf.g:54:13: ( '\\'' ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* '\\'' )
            // compiler/scanner/Decaf.g:54:14: '\\'' ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* '\\''
            {
            match('\''); 

            // compiler/scanner/Decaf.g:54:19: ( '0x' | '0X' )
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
                    // compiler/scanner/Decaf.g:54:20: '0x'
                    {
                    match("0x"); 



                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:54:25: '0X'
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


            // compiler/scanner/Decaf.g:54:45: ( DIGIT | HEXCHAR )*
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


            Decaf.debug("unexpected char:2", getLine(), getText());

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
            // compiler/scanner/Decaf.g:55:11: ( ( '\\'\\\\' ( DIGIT | CHAR2 )+ '\\'' ) )
            // compiler/scanner/Decaf.g:55:13: ( '\\'\\\\' ( DIGIT | CHAR2 )+ '\\'' )
            {
            // compiler/scanner/Decaf.g:55:13: ( '\\'\\\\' ( DIGIT | CHAR2 )+ '\\'' )
            // compiler/scanner/Decaf.g:55:14: '\\'\\\\' ( DIGIT | CHAR2 )+ '\\''
            {
            match("'\\"); 



            // compiler/scanner/Decaf.g:55:20: ( DIGIT | CHAR2 )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||LA5_0=='A'||(LA5_0 >= 'C' && LA5_0 <= 'E')||(LA5_0 >= 'G' && LA5_0 <= 'M')||(LA5_0 >= 'P' && LA5_0 <= 'Q')||LA5_0=='S'||(LA5_0 >= 'U' && LA5_0 <= 'Z')||LA5_0=='a'||(LA5_0 >= 'c' && LA5_0 <= 'e')||(LA5_0 >= 'g' && LA5_0 <= 'm')||(LA5_0 >= 'p' && LA5_0 <= 'q')||LA5_0=='s'||(LA5_0 >= 'u' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='A'||(input.LA(1) >= 'C' && input.LA(1) <= 'E')||(input.LA(1) >= 'G' && input.LA(1) <= 'M')||(input.LA(1) >= 'P' && input.LA(1) <= 'Q')||input.LA(1)=='S'||(input.LA(1) >= 'U' && input.LA(1) <= 'Z')||input.LA(1)=='a'||(input.LA(1) >= 'c' && input.LA(1) <= 'e')||(input.LA(1) >= 'g' && input.LA(1) <= 'm')||(input.LA(1) >= 'p' && input.LA(1) <= 'q')||input.LA(1)=='s'||(input.LA(1) >= 'u' && input.LA(1) <= 'z') ) {
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


            match('\''); 

            }


            Decaf.debug("unexpected char:3", getLine(), getText());

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
            // compiler/scanner/Decaf.g:56:12: ( ( '\\'' ( '\\\"' )+ '\\'' ) )
            // compiler/scanner/Decaf.g:56:14: ( '\\'' ( '\\\"' )+ '\\'' )
            {
            // compiler/scanner/Decaf.g:56:14: ( '\\'' ( '\\\"' )+ '\\'' )
            // compiler/scanner/Decaf.g:56:15: '\\'' ( '\\\"' )+ '\\''
            {
            match('\''); 

            // compiler/scanner/Decaf.g:56:19: ( '\\\"' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\"') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:56:20: '\\\"'
            	    {
            	    match('\"'); 

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


            match('\''); 

            }


            Decaf.debug("unexpected char:4", getLine(), getText());

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
            // compiler/scanner/Decaf.g:57:10: ( ( SQUOTE ( ASCCI ) ( ASCCI )+ SQUOTE ) )
            // compiler/scanner/Decaf.g:57:12: ( SQUOTE ( ASCCI ) ( ASCCI )+ SQUOTE )
            {
            // compiler/scanner/Decaf.g:57:12: ( SQUOTE ( ASCCI ) ( ASCCI )+ SQUOTE )
            // compiler/scanner/Decaf.g:57:13: SQUOTE ( ASCCI ) ( ASCCI )+ SQUOTE
            {
            mSQUOTE(); 


            if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '~') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:57:27: ( ASCCI )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= ' ' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '.')||(LA7_0 >= '0' && LA7_0 <= '~')) ) {
                    alt7=1;
                }


                switch (alt7) {
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            mSQUOTE(); 


            }


            Decaf.debug("unexpected char:5", getLine(), getText());

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
            // compiler/scanner/Decaf.g:58:10: ( ( '\\'\\\\\\'' ) )
            // compiler/scanner/Decaf.g:58:12: ( '\\'\\\\\\'' )
            {
            // compiler/scanner/Decaf.g:58:12: ( '\\'\\\\\\'' )
            // compiler/scanner/Decaf.g:58:13: '\\'\\\\\\''
            {
            match("'\\'"); 



            }


            Decaf.debug("unexpected char:6", getLine(), getText());

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
            // compiler/scanner/Decaf.g:59:8: ( ( '0x' ) )
            // compiler/scanner/Decaf.g:59:10: ( '0x' )
            {
            // compiler/scanner/Decaf.g:59:10: ( '0x' )
            // compiler/scanner/Decaf.g:59:11: '0x'
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
            // compiler/scanner/Decaf.g:60:10: ( ( ( UNDERSCORE ) ( CHAR | DIGIT | UNDERSCORE )* ) )
            // compiler/scanner/Decaf.g:60:12: ( ( UNDERSCORE ) ( CHAR | DIGIT | UNDERSCORE )* )
            {
            // compiler/scanner/Decaf.g:60:12: ( ( UNDERSCORE ) ( CHAR | DIGIT | UNDERSCORE )* )
            // compiler/scanner/Decaf.g:60:13: ( UNDERSCORE ) ( CHAR | DIGIT | UNDERSCORE )*
            {
            if ( input.LA(1)=='_' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:60:26: ( CHAR | DIGIT | UNDERSCORE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    break loop8;
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
            // compiler/scanner/Decaf.g:61:10: ( ( ( CHAR )* '.' ( CHAR )* ) )
            // compiler/scanner/Decaf.g:61:12: ( ( CHAR )* '.' ( CHAR )* )
            {
            // compiler/scanner/Decaf.g:61:12: ( ( CHAR )* '.' ( CHAR )* )
            // compiler/scanner/Decaf.g:61:13: ( CHAR )* '.' ( CHAR )*
            {
            // compiler/scanner/Decaf.g:61:13: ( CHAR )*
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


            match('.'); 

            // compiler/scanner/Decaf.g:61:23: ( CHAR )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= 'A' && LA10_0 <= 'Z')||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
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
            // compiler/scanner/Decaf.g:65:10: ( ( '-' ( DIGIT ) ( DIGIT )* ) )
            // compiler/scanner/Decaf.g:65:12: ( '-' ( DIGIT ) ( DIGIT )* )
            {
            // compiler/scanner/Decaf.g:65:12: ( '-' ( DIGIT ) ( DIGIT )* )
            // compiler/scanner/Decaf.g:65:13: '-' ( DIGIT ) ( DIGIT )*
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


            // compiler/scanner/Decaf.g:65:24: ( DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
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
            // compiler/scanner/Decaf.g:69:11: ( 'boolean' )
            // compiler/scanner/Decaf.g:69:13: 'boolean'
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
            // compiler/scanner/Decaf.g:70:10: ( 'break' )
            // compiler/scanner/Decaf.g:70:12: 'break'
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
            // compiler/scanner/Decaf.g:71:11: ( 'callout' )
            // compiler/scanner/Decaf.g:71:13: 'callout'
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
            // compiler/scanner/Decaf.g:72:10: ( 'class' )
            // compiler/scanner/Decaf.g:72:12: 'class'
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
            // compiler/scanner/Decaf.g:73:12: ( 'continue' )
            // compiler/scanner/Decaf.g:73:14: 'continue'
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
            // compiler/scanner/Decaf.g:74:9: ( 'else' )
            // compiler/scanner/Decaf.g:74:11: 'else'
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
            // compiler/scanner/Decaf.g:75:10: ( 'false' )
            // compiler/scanner/Decaf.g:75:12: 'false'
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
            // compiler/scanner/Decaf.g:76:8: ( 'for' )
            // compiler/scanner/Decaf.g:76:10: 'for'
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
            // compiler/scanner/Decaf.g:77:10: ( 'forpar' )
            // compiler/scanner/Decaf.g:77:12: 'forpar'
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
            // compiler/scanner/Decaf.g:78:7: ( 'if' )
            // compiler/scanner/Decaf.g:78:9: 'if'
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
            // compiler/scanner/Decaf.g:79:8: ( 'int' )
            // compiler/scanner/Decaf.g:79:10: 'int'
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
            // compiler/scanner/Decaf.g:80:10: ( 'return' )
            // compiler/scanner/Decaf.g:80:12: 'return'
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
            // compiler/scanner/Decaf.g:81:9: ( 'true' )
            // compiler/scanner/Decaf.g:81:11: 'true'
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
            // compiler/scanner/Decaf.g:82:9: ( 'void' )
            // compiler/scanner/Decaf.g:82:11: 'void'
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
            // compiler/scanner/Decaf.g:83:13: ( 'float' )
            // compiler/scanner/Decaf.g:83:15: 'float'
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

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            // compiler/scanner/Decaf.g:84:17: ( ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )* ) )
            // compiler/scanner/Decaf.g:84:19: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )* )
            {
            // compiler/scanner/Decaf.g:84:19: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )* )
            // compiler/scanner/Decaf.g:84:20: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' )*
            {
            matchRange('A','Z'); 

            // compiler/scanner/Decaf.g:84:29: ( 'A' .. 'Z' | 'a' .. 'z' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= 'A' && LA12_0 <= 'Z')||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    break loop12;
                }
            } while (true);


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:87:13: ( ',' )
            // compiler/scanner/Decaf.g:87:17: ','
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
            // compiler/scanner/Decaf.g:88:13: ( ';' )
            // compiler/scanner/Decaf.g:88:17: ';'
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
            // compiler/scanner/Decaf.g:89:13: ( '(' )
            // compiler/scanner/Decaf.g:89:17: '('
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
            // compiler/scanner/Decaf.g:90:13: ( ')' )
            // compiler/scanner/Decaf.g:90:17: ')'
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

    // $ANTLR start "LBRAKE"
    public final void mLBRAKE() throws RecognitionException {
        try {
            int _type = LBRAKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:91:13: ( '[' )
            // compiler/scanner/Decaf.g:91:17: '['
            {
            match('['); 

             Decaf.debug("LBRAKE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRAKE"

    // $ANTLR start "RBRAKE"
    public final void mRBRAKE() throws RecognitionException {
        try {
            int _type = RBRAKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:92:13: ( ']' )
            // compiler/scanner/Decaf.g:92:17: ']'
            {
            match(']'); 

             Decaf.debug("RBRAKE", getLine(), getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRAKE"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:93:13: ( '{' )
            // compiler/scanner/Decaf.g:93:17: '{'
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
            // compiler/scanner/Decaf.g:94:13: ( '}' )
            // compiler/scanner/Decaf.g:94:17: '}'
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

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:97:7: ( '+' )
            // compiler/scanner/Decaf.g:97:9: '+'
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
            // compiler/scanner/Decaf.g:98:8: ( '-' )
            // compiler/scanner/Decaf.g:98:11: '-'
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
            // compiler/scanner/Decaf.g:99:7: ( '*' )
            // compiler/scanner/Decaf.g:99:10: '*'
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
            // compiler/scanner/Decaf.g:100:7: ( '/' )
            // compiler/scanner/Decaf.g:100:10: '/'
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
            // compiler/scanner/Decaf.g:101:7: ( '&' )
            // compiler/scanner/Decaf.g:101:10: '&'
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
            // compiler/scanner/Decaf.g:102:6: ( '|' )
            // compiler/scanner/Decaf.g:102:9: '|'
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
            // compiler/scanner/Decaf.g:103:6: ( '=' )
            // compiler/scanner/Decaf.g:103:9: '='
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
            // compiler/scanner/Decaf.g:104:9: ( '>' )
            // compiler/scanner/Decaf.g:104:11: '>'
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
            // compiler/scanner/Decaf.g:105:9: ( '<' )
            // compiler/scanner/Decaf.g:105:11: '<'
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
            // compiler/scanner/Decaf.g:106:7: ( '!' )
            // compiler/scanner/Decaf.g:106:9: '!'
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
            // compiler/scanner/Decaf.g:108:21: ( ( '+' | '-' | '*' | '/' | '&' | '|' | '=' | '>' | '<' | '!' ) )
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
            // compiler/scanner/Decaf.g:115:13: ( ( CHAR ) ( CHAR | DIGIT )* )
            // compiler/scanner/Decaf.g:115:15: ( CHAR ) ( CHAR | DIGIT )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // compiler/scanner/Decaf.g:115:21: ( CHAR | DIGIT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||(LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    break loop13;
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
            // compiler/scanner/Decaf.g:118:7: ( ( QUOTE ( ASCCI )* QUOTE ) )
            // compiler/scanner/Decaf.g:118:9: ( QUOTE ( ASCCI )* QUOTE )
            {
            // compiler/scanner/Decaf.g:118:9: ( QUOTE ( ASCCI )* QUOTE )
            // compiler/scanner/Decaf.g:118:10: QUOTE ( ASCCI )* QUOTE
            {
            mQUOTE(); 


            // compiler/scanner/Decaf.g:118:16: ( ASCCI )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= ' ' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '&')||(LA14_0 >= '(' && LA14_0 <= '.')||(LA14_0 >= '0' && LA14_0 <= '~')) ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    break loop14;
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
            // compiler/scanner/Decaf.g:119:13: ( ( QUOTE ( ESC |~ ( '\\\\' | '\"' ) )* QUOTE ) )
            // compiler/scanner/Decaf.g:119:15: ( QUOTE ( ESC |~ ( '\\\\' | '\"' ) )* QUOTE )
            {
            // compiler/scanner/Decaf.g:119:15: ( QUOTE ( ESC |~ ( '\\\\' | '\"' ) )* QUOTE )
            // compiler/scanner/Decaf.g:119:16: QUOTE ( ESC |~ ( '\\\\' | '\"' ) )* QUOTE
            {
            mQUOTE(); 


            // compiler/scanner/Decaf.g:119:22: ( ESC |~ ( '\\\\' | '\"' ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\\') ) {
                    alt15=1;
                }
                else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // compiler/scanner/Decaf.g:119:23: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 2 :
            	    // compiler/scanner/Decaf.g:119:29: ~ ( '\\\\' | '\"' )
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
            	    break loop15;
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
            // compiler/scanner/Decaf.g:122:7: ( ( SQUOTE ASCCI SQUOTE ) )
            // compiler/scanner/Decaf.g:122:9: ( SQUOTE ASCCI SQUOTE )
            {
            // compiler/scanner/Decaf.g:122:9: ( SQUOTE ASCCI SQUOTE )
            // compiler/scanner/Decaf.g:122:10: SQUOTE ASCCI SQUOTE
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
            // compiler/scanner/Decaf.g:123:13: ( ( SQUOTE ( ESC |~ ( '\\'' | '\\\\' ) ) SQUOTE ) )
            // compiler/scanner/Decaf.g:123:15: ( SQUOTE ( ESC |~ ( '\\'' | '\\\\' ) ) SQUOTE )
            {
            // compiler/scanner/Decaf.g:123:15: ( SQUOTE ( ESC |~ ( '\\'' | '\\\\' ) ) SQUOTE )
            // compiler/scanner/Decaf.g:123:16: SQUOTE ( ESC |~ ( '\\'' | '\\\\' ) ) SQUOTE
            {
            mSQUOTE(); 


            // compiler/scanner/Decaf.g:123:23: ( ESC |~ ( '\\'' | '\\\\' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\\') ) {
                alt16=1;
            }
            else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '&')||(LA16_0 >= '(' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // compiler/scanner/Decaf.g:123:24: ESC
                    {
                    mESC(); 


                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:123:30: ~ ( '\\'' | '\\\\' )
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
            // compiler/scanner/Decaf.g:126:9: ( ( DIGIT )+ )
            // compiler/scanner/Decaf.g:126:11: ( DIGIT )+
            {
            // compiler/scanner/Decaf.g:126:11: ( DIGIT )+
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
            // compiler/scanner/Decaf.g:127:7: ( ( DIGIT )+ '.' ( DIGIT )+ )
            // compiler/scanner/Decaf.g:127:9: ( DIGIT )+ '.' ( DIGIT )+
            {
            // compiler/scanner/Decaf.g:127:9: ( DIGIT )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            match('.'); 

            // compiler/scanner/Decaf.g:127:22: ( DIGIT )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // compiler/scanner/Decaf.g:128:7: ( ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )* )
            // compiler/scanner/Decaf.g:128:9: ( '0x' | '0X' ) ( DIGIT | HEXCHAR ) ( DIGIT | HEXCHAR )*
            {
            // compiler/scanner/Decaf.g:128:9: ( '0x' | '0X' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='0') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='x') ) {
                    alt20=1;
                }
                else if ( (LA20_1=='X') ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // compiler/scanner/Decaf.g:128:10: '0x'
                    {
                    match("0x"); 



                    }
                    break;
                case 2 :
                    // compiler/scanner/Decaf.g:128:17: '0X'
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


            // compiler/scanner/Decaf.g:128:41: ( DIGIT | HEXCHAR )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= '0' && LA21_0 <= '9')||(LA21_0 >= 'A' && LA21_0 <= 'F')||(LA21_0 >= 'a' && LA21_0 <= 'f')) ) {
                    alt21=1;
                }


                switch (alt21) {
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
            	    break loop21;
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
            // compiler/scanner/Decaf.g:133:13: ( ( TAB | SPACE | '\\r' | NEWLINE ) )
            // compiler/scanner/Decaf.g:133:15: ( TAB | SPACE | '\\r' | NEWLINE )
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

    // $ANTLR start "FIX"
    public final void mFIX() throws RecognitionException {
        try {
            int _type = FIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // compiler/scanner/Decaf.g:134:13: ( (~ ( ASCCI ) ) )
            // compiler/scanner/Decaf.g:134:15: (~ ( ASCCI ) )
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\u001F')||input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='/'||(input.LA(1) >= '\u007F' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
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
    // $ANTLR end "FIX"

    public void mTokens() throws RecognitionException {
        // compiler/scanner/Decaf.g:1:8: ( COMMENT | MISMATCH | WRONGCHAR | WRONGBACK | WRONGQUOTE | LONGCHR | NOQUOTE | NOHEX | INVALID | INVALID1 | NEGATIVE | KWBOOLEAN | KWBREAK | KWCALLOUT | KWCLASS | KWCONTINUE | KWELSE | KWFALSE | KWFOR | KWFORPAR | KWIF | KWINT | KWRETURN | KWTRUE | KWVOID | KWFLOAT | COMMA | SEMI | LPAREN | RPAREN | LBRAKE | RBRAKE | LBRACE | RBRACE | PLUS | MINUS | MULT | DIV | AND | OR | EQ | MAYORQ | MENORQ | NEG | VAR | STR | LITERALSTR | CHR | LITERALCHAR | NUMBER | REAL | HEX | WHITESPACE | FIX )
        int alt22=54;
        alt22 = dfa22.predict(input);
        switch (alt22) {
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
                // compiler/scanner/Decaf.g:1:250: LBRAKE
                {
                mLBRAKE(); 


                }
                break;
            case 32 :
                // compiler/scanner/Decaf.g:1:257: RBRAKE
                {
                mRBRAKE(); 


                }
                break;
            case 33 :
                // compiler/scanner/Decaf.g:1:264: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 34 :
                // compiler/scanner/Decaf.g:1:271: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 35 :
                // compiler/scanner/Decaf.g:1:278: PLUS
                {
                mPLUS(); 


                }
                break;
            case 36 :
                // compiler/scanner/Decaf.g:1:283: MINUS
                {
                mMINUS(); 


                }
                break;
            case 37 :
                // compiler/scanner/Decaf.g:1:289: MULT
                {
                mMULT(); 


                }
                break;
            case 38 :
                // compiler/scanner/Decaf.g:1:294: DIV
                {
                mDIV(); 


                }
                break;
            case 39 :
                // compiler/scanner/Decaf.g:1:298: AND
                {
                mAND(); 


                }
                break;
            case 40 :
                // compiler/scanner/Decaf.g:1:302: OR
                {
                mOR(); 


                }
                break;
            case 41 :
                // compiler/scanner/Decaf.g:1:305: EQ
                {
                mEQ(); 


                }
                break;
            case 42 :
                // compiler/scanner/Decaf.g:1:308: MAYORQ
                {
                mMAYORQ(); 


                }
                break;
            case 43 :
                // compiler/scanner/Decaf.g:1:315: MENORQ
                {
                mMENORQ(); 


                }
                break;
            case 44 :
                // compiler/scanner/Decaf.g:1:322: NEG
                {
                mNEG(); 


                }
                break;
            case 45 :
                // compiler/scanner/Decaf.g:1:326: VAR
                {
                mVAR(); 


                }
                break;
            case 46 :
                // compiler/scanner/Decaf.g:1:330: STR
                {
                mSTR(); 


                }
                break;
            case 47 :
                // compiler/scanner/Decaf.g:1:334: LITERALSTR
                {
                mLITERALSTR(); 


                }
                break;
            case 48 :
                // compiler/scanner/Decaf.g:1:345: CHR
                {
                mCHR(); 


                }
                break;
            case 49 :
                // compiler/scanner/Decaf.g:1:349: LITERALCHAR
                {
                mLITERALCHAR(); 


                }
                break;
            case 50 :
                // compiler/scanner/Decaf.g:1:361: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 51 :
                // compiler/scanner/Decaf.g:1:368: REAL
                {
                mREAL(); 


                }
                break;
            case 52 :
                // compiler/scanner/Decaf.g:1:373: HEX
                {
                mHEX(); 


                }
                break;
            case 53 :
                // compiler/scanner/Decaf.g:1:377: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 54 :
                // compiler/scanner/Decaf.g:1:388: FIX
                {
                mFIX(); 


                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\46\1\44\1\57\1\uffff\1\64\1\uffff\1\66\10\64\20\uffff"+
        "\1\44\1\57\13\uffff\1\120\3\uffff\3\64\3\uffff\7\64\1\132\4\64\4"+
        "\uffff\1\142\11\uffff\7\64\1\157\1\64\1\uffff\1\161\3\64\1\141\7"+
        "\uffff\5\64\1\175\2\64\1\uffff\1\64\1\uffff\1\64\1\u0082\1\u0083"+
        "\3\uffff\1\64\1\u0086\1\64\1\u0088\1\64\1\uffff\1\u008a\1\64\1\u008c"+
        "\1\64\3\uffff\1\64\1\uffff\1\64\1\uffff\1\64\1\uffff\1\u0091\1\uffff"+
        "\1\u0092\1\u0093\1\u0094\1\64\4\uffff\1\u0096\1\uffff";
    static final String DFA22_eofS =
        "\u0097\uffff";
    static final String DFA22_minS =
        "\1\0\1\57\1\0\1\56\1\uffff\1\56\1\uffff\1\60\10\56\20\uffff\1\0"+
        "\1\56\6\uffff\2\40\1\42\1\40\1\uffff\1\60\3\uffff\3\56\3\uffff\14"+
        "\56\1\40\1\uffff\1\0\1\uffff\1\47\2\40\1\uffff\2\40\4\uffff\11\56"+
        "\1\uffff\4\56\2\0\4\uffff\1\40\1\uffff\10\56\1\uffff\1\56\1\uffff"+
        "\3\56\1\uffff\1\40\1\uffff\5\56\1\uffff\4\56\3\uffff\1\56\1\uffff"+
        "\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\4\56\4\uffff\1\56\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\57\1\uffff\1\170\1\uffff\1\172\1\uffff\1\71\10\172\20"+
        "\uffff\1\uffff\1\71\6\uffff\2\176\1\47\1\176\1\uffff\1\146\3\uffff"+
        "\3\172\3\uffff\14\172\1\176\1\uffff\1\uffff\1\uffff\1\47\2\176\1"+
        "\uffff\2\176\4\uffff\11\172\1\uffff\4\172\2\uffff\4\uffff\1\176"+
        "\1\uffff\10\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\176\1\uffff"+
        "\5\172\1\uffff\4\172\3\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1"+
        "\uffff\1\172\1\uffff\4\172\4\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\4\uffff\1\11\1\uffff\1\12\11\uffff\1\33\1\34\1\35\1\36\1\37\1\40"+
        "\1\41\1\42\1\43\1\45\1\47\1\50\1\51\1\52\1\53\1\54\2\uffff\2\65"+
        "\1\66\1\1\1\46\1\2\4\uffff\1\61\1\uffff\1\64\1\62\1\63\3\uffff\1"+
        "\55\1\13\1\44\15\uffff\1\56\1\uffff\1\57\3\uffff\1\6\2\uffff\1\60"+
        "\2\5\1\10\11\uffff\1\25\6\uffff\1\56\1\7\1\6\1\4\1\uffff\1\60\10"+
        "\uffff\1\23\1\uffff\1\26\3\uffff\1\4\1\uffff\1\3\5\uffff\1\21\4"+
        "\uffff\1\30\1\31\1\3\1\uffff\1\15\1\uffff\1\17\1\uffff\1\22\1\uffff"+
        "\1\32\4\uffff\1\24\1\27\1\14\1\16\1\uffff\1\20";
    static final String DFA22_specialS =
        "\1\1\1\uffff\1\3\35\uffff\1\5\44\uffff\1\4\31\uffff\1\2\1\0\66\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\44\2\42\2\44\1\42\22\44\1\43\1\37\1\40\3\uffff\1\32\1\2"+
            "\1\22\1\23\1\31\1\30\1\20\1\7\1\6\1\1\1\3\11\41\1\uffff\1\21"+
            "\1\36\1\34\1\35\2\uffff\32\17\1\24\1\uffff\1\25\1\uffff\1\4"+
            "\1\uffff\1\17\1\5\1\10\1\17\1\11\1\12\2\17\1\13\10\17\1\14\1"+
            "\17\1\15\1\17\1\16\4\17\1\26\1\33\1\27\1\uffff\uff81\44",
            "\1\45",
            "\40\54\2\53\1\52\4\53\1\47\7\53\1\54\1\51\53\53\1\50\42\53"+
            "\uff81\54",
            "\1\60\1\uffff\12\41\36\uffff\1\56\37\uffff\1\55",
            "",
            "\1\6\22\uffff\32\63\6\uffff\16\63\1\61\2\63\1\62\10\63",
            "",
            "\12\65",
            "\1\6\22\uffff\32\63\6\uffff\1\67\12\63\1\70\2\63\1\71\13\63",
            "\1\6\22\uffff\32\63\6\uffff\13\63\1\72\16\63",
            "\1\6\22\uffff\32\63\6\uffff\1\73\12\63\1\75\2\63\1\74\13\63",
            "\1\6\22\uffff\32\63\6\uffff\5\63\1\76\7\63\1\77\14\63",
            "\1\6\22\uffff\32\63\6\uffff\4\63\1\100\25\63",
            "\1\6\22\uffff\32\63\6\uffff\21\63\1\101\10\63",
            "\1\6\22\uffff\32\63\6\uffff\16\63\1\102\13\63",
            "\1\6\22\uffff\32\63\6\uffff\32\63",
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
            "\40\106\2\105\1\104\4\105\1\106\7\105\1\106\54\105\1\103\42"+
            "\105\uff81\106",
            "\1\60\1\uffff\12\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\112\1\54\4\112\1\107\7\112\1\uffff\12\111\7\112\1\111\1"+
            "\112\3\111\1\112\7\111\2\112\2\111\1\112\1\111\1\112\6\111\1"+
            "\112\1\110\4\112\1\111\1\110\3\111\1\110\7\111\1\110\1\112\2"+
            "\111\1\110\1\111\1\110\6\111\4\112",
            "\2\112\1\uffff\4\112\1\115\7\112\1\uffff\50\112\1\114\37\112"+
            "\1\113\6\112",
            "\1\117\4\uffff\1\116",
            "\2\112\1\uffff\4\112\1\115\7\112\1\uffff\117\112",
            "",
            "\12\56\7\uffff\6\56\32\uffff\6\56",
            "",
            "",
            "",
            "\1\6\22\uffff\32\63\6\uffff\16\63\1\121\13\63",
            "\1\6\22\uffff\32\63\6\uffff\4\63\1\122\25\63",
            "\1\6\22\uffff\32\63\6\uffff\32\63",
            "",
            "",
            "",
            "\1\6\22\uffff\32\63\6\uffff\13\63\1\123\16\63",
            "\1\6\22\uffff\32\63\6\uffff\1\124\31\63",
            "\1\6\22\uffff\32\63\6\uffff\15\63\1\125\14\63",
            "\1\6\22\uffff\32\63\6\uffff\22\63\1\126\7\63",
            "\1\6\22\uffff\32\63\6\uffff\13\63\1\127\16\63",
            "\1\6\22\uffff\32\63\6\uffff\21\63\1\130\10\63",
            "\1\6\22\uffff\32\63\6\uffff\16\63\1\131\13\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\22\uffff\32\63\6\uffff\23\63\1\133\6\63",
            "\1\6\22\uffff\32\63\6\uffff\23\63\1\134\6\63",
            "\1\6\22\uffff\32\63\6\uffff\24\63\1\135\5\63",
            "\1\6\22\uffff\32\63\6\uffff\10\63\1\136\21\63",
            "\2\141\1\137\4\141\1\106\7\141\1\uffff\54\141\1\140\5\141\1"+
            "\140\3\141\1\140\7\141\1\140\3\141\1\140\1\141\1\140\12\141",
            "",
            "\40\106\2\105\1\104\4\105\1\106\7\105\1\106\54\105\1\103\42"+
            "\105\uff81\106",
            "",
            "\1\54",
            "\2\112\1\uffff\4\112\1\143\7\112\1\uffff\117\112",
            "\2\112\1\uffff\4\112\1\144\7\112\1\uffff\12\111\7\112\1\111"+
            "\1\112\3\111\1\112\7\111\2\112\2\111\1\112\1\111\1\112\6\111"+
            "\6\112\1\111\1\112\3\111\1\112\7\111\2\112\2\111\1\112\1\111"+
            "\1\112\6\111\4\112",
            "",
            "\2\112\1\uffff\14\112\1\uffff\12\145\7\112\6\145\32\112\6\145"+
            "\30\112",
            "\2\112\1\uffff\14\112\1\uffff\12\145\7\112\6\145\32\112\6\145"+
            "\30\112",
            "",
            "",
            "",
            "",
            "\1\6\22\uffff\32\63\6\uffff\13\63\1\147\16\63",
            "\1\6\22\uffff\32\63\6\uffff\1\150\31\63",
            "\1\6\22\uffff\32\63\6\uffff\13\63\1\151\16\63",
            "\1\6\22\uffff\32\63\6\uffff\22\63\1\152\7\63",
            "\1\6\22\uffff\32\63\6\uffff\23\63\1\153\6\63",
            "\1\6\22\uffff\32\63\6\uffff\4\63\1\154\25\63",
            "\1\6\22\uffff\32\63\6\uffff\22\63\1\155\7\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\17\63\1\156\12\63",
            "\1\6\22\uffff\32\63\6\uffff\1\160\31\63",
            "",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\22\uffff\32\63\6\uffff\24\63\1\162\5\63",
            "\1\6\22\uffff\32\63\6\uffff\4\63\1\163\25\63",
            "\1\6\22\uffff\32\63\6\uffff\3\63\1\164\26\63",
            "\0\106",
            "\40\106\2\105\1\104\4\105\1\106\7\105\1\106\54\105\1\103\42"+
            "\105\uff81\106",
            "",
            "",
            "",
            "",
            "\2\112\1\uffff\4\112\1\167\7\112\1\uffff\12\166\7\112\6\166"+
            "\32\112\6\166\30\112",
            "",
            "\1\6\22\uffff\32\63\6\uffff\4\63\1\170\25\63",
            "\1\6\22\uffff\32\63\6\uffff\12\63\1\171\17\63",
            "\1\6\22\uffff\32\63\6\uffff\16\63\1\172\13\63",
            "\1\6\22\uffff\32\63\6\uffff\22\63\1\173\7\63",
            "\1\6\22\uffff\32\63\6\uffff\10\63\1\174\21\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\22\uffff\32\63\6\uffff\4\63\1\176\25\63",
            "\1\6\22\uffff\32\63\6\uffff\1\177\31\63",
            "",
            "\1\6\22\uffff\32\63\6\uffff\23\63\1\u0080\6\63",
            "",
            "\1\6\22\uffff\32\63\6\uffff\21\63\1\u0081\10\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "",
            "\2\112\1\uffff\4\112\1\167\7\112\1\uffff\12\166\7\112\6\166"+
            "\32\112\6\166\30\112",
            "",
            "\1\6\22\uffff\32\63\6\uffff\1\u0085\31\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\22\uffff\32\63\6\uffff\24\63\1\u0087\5\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\22\uffff\32\63\6\uffff\15\63\1\u0089\14\63",
            "",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\22\uffff\32\63\6\uffff\21\63\1\u008b\10\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\22\uffff\32\63\6\uffff\15\63\1\u008d\14\63",
            "",
            "",
            "",
            "\1\6\22\uffff\32\63\6\uffff\15\63\1\u008e\14\63",
            "",
            "\1\6\22\uffff\32\63\6\uffff\23\63\1\u008f\6\63",
            "",
            "\1\6\22\uffff\32\63\6\uffff\24\63\1\u0090\5\63",
            "",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            "\1\6\22\uffff\32\63\6\uffff\4\63\1\u0095\25\63",
            "",
            "",
            "",
            "",
            "\1\6\1\uffff\12\64\7\uffff\32\63\6\uffff\32\63",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( COMMENT | MISMATCH | WRONGCHAR | WRONGBACK | WRONGQUOTE | LONGCHR | NOQUOTE | NOHEX | INVALID | INVALID1 | NEGATIVE | KWBOOLEAN | KWBREAK | KWCALLOUT | KWCLASS | KWCONTINUE | KWELSE | KWFALSE | KWFOR | KWFORPAR | KWIF | KWINT | KWRETURN | KWTRUE | KWVOID | KWFLOAT | COMMA | SEMI | LPAREN | RPAREN | LBRAKE | RBRAKE | LBRACE | RBRACE | PLUS | MINUS | MULT | DIV | AND | OR | EQ | MAYORQ | MENORQ | NEG | VAR | STR | LITERALSTR | CHR | LITERALCHAR | NUMBER | REAL | HEX | WHITESPACE | FIX );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_96 = input.LA(1);

                        s = -1;
                        if ( (LA22_96=='\"') ) {s = 68;}

                        else if ( (LA22_96=='\\') ) {s = 67;}

                        else if ( ((LA22_96 >= ' ' && LA22_96 <= '!')||(LA22_96 >= '#' && LA22_96 <= '&')||(LA22_96 >= '(' && LA22_96 <= '.')||(LA22_96 >= '0' && LA22_96 <= '[')||(LA22_96 >= ']' && LA22_96 <= '~')) ) {s = 69;}

                        else if ( ((LA22_96 >= '\u0000' && LA22_96 <= '\u001F')||LA22_96=='\''||LA22_96=='/'||(LA22_96 >= '\u007F' && LA22_96 <= '\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='/') ) {s = 1;}

                        else if ( (LA22_0=='\'') ) {s = 2;}

                        else if ( (LA22_0=='0') ) {s = 3;}

                        else if ( (LA22_0=='_') ) {s = 4;}

                        else if ( (LA22_0=='b') ) {s = 5;}

                        else if ( (LA22_0=='.') ) {s = 6;}

                        else if ( (LA22_0=='-') ) {s = 7;}

                        else if ( (LA22_0=='c') ) {s = 8;}

                        else if ( (LA22_0=='e') ) {s = 9;}

                        else if ( (LA22_0=='f') ) {s = 10;}

                        else if ( (LA22_0=='i') ) {s = 11;}

                        else if ( (LA22_0=='r') ) {s = 12;}

                        else if ( (LA22_0=='t') ) {s = 13;}

                        else if ( (LA22_0=='v') ) {s = 14;}

                        else if ( ((LA22_0 >= 'A' && LA22_0 <= 'Z')||LA22_0=='a'||LA22_0=='d'||(LA22_0 >= 'g' && LA22_0 <= 'h')||(LA22_0 >= 'j' && LA22_0 <= 'q')||LA22_0=='s'||LA22_0=='u'||(LA22_0 >= 'w' && LA22_0 <= 'z')) ) {s = 15;}

                        else if ( (LA22_0==',') ) {s = 16;}

                        else if ( (LA22_0==';') ) {s = 17;}

                        else if ( (LA22_0=='(') ) {s = 18;}

                        else if ( (LA22_0==')') ) {s = 19;}

                        else if ( (LA22_0=='[') ) {s = 20;}

                        else if ( (LA22_0==']') ) {s = 21;}

                        else if ( (LA22_0=='{') ) {s = 22;}

                        else if ( (LA22_0=='}') ) {s = 23;}

                        else if ( (LA22_0=='+') ) {s = 24;}

                        else if ( (LA22_0=='*') ) {s = 25;}

                        else if ( (LA22_0=='&') ) {s = 26;}

                        else if ( (LA22_0=='|') ) {s = 27;}

                        else if ( (LA22_0=='=') ) {s = 28;}

                        else if ( (LA22_0=='>') ) {s = 29;}

                        else if ( (LA22_0=='<') ) {s = 30;}

                        else if ( (LA22_0=='!') ) {s = 31;}

                        else if ( (LA22_0=='\"') ) {s = 32;}

                        else if ( ((LA22_0 >= '1' && LA22_0 <= '9')) ) {s = 33;}

                        else if ( ((LA22_0 >= '\t' && LA22_0 <= '\n')||LA22_0=='\r') ) {s = 34;}

                        else if ( (LA22_0==' ') ) {s = 35;}

                        else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\b')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '\u001F')||(LA22_0 >= '\u007F' && LA22_0 <= '\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA22_95 = input.LA(1);

                        s = -1;
                        if ( ((LA22_95 >= '\u0000' && LA22_95 <= '\uFFFF')) ) {s = 70;}

                        else s = 97;

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA22_2 = input.LA(1);

                        s = -1;
                        if ( (LA22_2=='\'') ) {s = 39;}

                        else if ( (LA22_2=='\\') ) {s = 40;}

                        else if ( (LA22_2=='0') ) {s = 41;}

                        else if ( (LA22_2=='\"') ) {s = 42;}

                        else if ( ((LA22_2 >= ' ' && LA22_2 <= '!')||(LA22_2 >= '#' && LA22_2 <= '&')||(LA22_2 >= '(' && LA22_2 <= '.')||(LA22_2 >= '1' && LA22_2 <= '[')||(LA22_2 >= ']' && LA22_2 <= '~')) ) {s = 43;}

                        else if ( ((LA22_2 >= '\u0000' && LA22_2 <= '\u001F')||LA22_2=='/'||(LA22_2 >= '\u007F' && LA22_2 <= '\uFFFF')) ) {s = 44;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA22_69 = input.LA(1);

                        s = -1;
                        if ( (LA22_69=='\"') ) {s = 68;}

                        else if ( (LA22_69=='\\') ) {s = 67;}

                        else if ( ((LA22_69 >= ' ' && LA22_69 <= '!')||(LA22_69 >= '#' && LA22_69 <= '&')||(LA22_69 >= '(' && LA22_69 <= '.')||(LA22_69 >= '0' && LA22_69 <= '[')||(LA22_69 >= ']' && LA22_69 <= '~')) ) {s = 69;}

                        else if ( ((LA22_69 >= '\u0000' && LA22_69 <= '\u001F')||LA22_69=='\''||LA22_69=='/'||(LA22_69 >= '\u007F' && LA22_69 <= '\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA22_32 = input.LA(1);

                        s = -1;
                        if ( (LA22_32=='\\') ) {s = 67;}

                        else if ( (LA22_32=='\"') ) {s = 68;}

                        else if ( ((LA22_32 >= ' ' && LA22_32 <= '!')||(LA22_32 >= '#' && LA22_32 <= '&')||(LA22_32 >= '(' && LA22_32 <= '.')||(LA22_32 >= '0' && LA22_32 <= '[')||(LA22_32 >= ']' && LA22_32 <= '~')) ) {s = 69;}

                        else if ( ((LA22_32 >= '\u0000' && LA22_32 <= '\u001F')||LA22_32=='\''||LA22_32=='/'||(LA22_32 >= '\u007F' && LA22_32 <= '\uFFFF')) ) {s = 70;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}