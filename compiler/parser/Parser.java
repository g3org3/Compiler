// $ANTLR 3.4 compiler/parser/Parser.g 2013-09-05 11:45:43

	package compiler.parser;
	import java.util.ArrayList;
	import compiler.scanner.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KWCLASS", "PROGRAM"
    };

    public static final int EOF=-1;
    public static final int KWCLASS=4;
    public static final int PROGRAM=5;

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
    // compiler/parser/Parser.g:13:1: start : KWCLASS PROGRAM ;
    public final void start() throws RecognitionException {
        try {
            // compiler/parser/Parser.g:13:8: ( KWCLASS PROGRAM )
            // compiler/parser/Parser.g:13:10: KWCLASS PROGRAM
            {
            match(input,KWCLASS,FOLLOW_KWCLASS_in_start32); 

            match(input,PROGRAM,FOLLOW_PROGRAM_in_start34); 

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


 

    public static final BitSet FOLLOW_KWCLASS_in_start32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_PROGRAM_in_start34 = new BitSet(new long[]{0x0000000000000002L});

}