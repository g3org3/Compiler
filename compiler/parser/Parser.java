// $ANTLR 3.4 compiler/parser/Parser.g 2013-09-05 23:21:51

	package compiler.parser;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ADD1", "AND", "ANDBITWISE", "ASCII", "ASSIGN", "ASSIGNADD", "ASSIGNSUB", "BOOLEAN", "BREAK", "CALLOUT", "CHAR", "CHR", "CLASS", "COMA", "COMMENTS", "CONTINUE", "DIGIT", "DIV", "DPOINTS", "ELSE", "EQUAL", "ESC", "FALSE", "FOR", "GREATHAN", "GTOEQ", "HEX", "HEXCHAR", "IF", "INDENTI", "INT", "LBRACE", "LBRAKET", "LESSTHAN", "LPAREN", "LTOEQ", "MINUS", "MINUS1", "MOD", "MULT", "NEGNUM", "NEQUAL", "NOT", "NOTCHAR1", "NOTCHAR2", "NOTCHAR3", "NOTCHAR4", "NOTCHAR5", "NOTCHAR6", "NOTHEX1", "NOTHEX2", "NOTINDEN", "NOTSTR1", "NOTSTR2", "NUM", "OR", "ORBITWISE", "POINT", "QMARK", "RAISE", "RBRACE", "RBRAKET", "RETURN", "RPAREN", "SEMICO", "STR", "TRUE", "UCASE", "UNDERSCORE", "UNICODE1", "UNICODE2", "UNICODE3", "VOID", "WHITESPACE"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Parser.tokenNames; }
    public String getGrammarFileName() { return "compiler/parser/Parser.g"; }



    // $ANTLR start "start"
    // compiler/parser/Parser.g:12:1: start : CLASS ;
    public final void start() throws RecognitionException {
        try {
            // compiler/parser/Parser.g:12:7: ( CLASS )
            // compiler/parser/Parser.g:12:9: CLASS
            {
            match(input,CLASS,FOLLOW_CLASS_in_start31); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"

    // Delegated rules


 

    public static final BitSet FOLLOW_CLASS_in_start31 = new BitSet(new long[]{0x0000000000000002L});

}