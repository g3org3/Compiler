// $ANTLR 3.4 compiler/parser/GramaticaParser.g 2013-09-07 08:47:24

	package compiler.parser;
	import compiler.scanner.*;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GramaticaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ADD1", "AND", "ANDBITWISE", "ASCII", "ASSIGN", "ASSIGNADD", "ASSIGNSUB", "BOOLEAN", "BREAK", "CALLOUT", "CHAR", "CHR", "CLASS", "COMA", "COMMENTS", "CONTINUE", "DIGIT", "DIV", "DPOINTS", "ELSE", "EQUAL", "ESC", "FALSE", "FOR", "GREATHAN", "GTOEQ", "HEX", "HEXCHAR", "IF", "INDENTI", "INT", "LBRACE", "LBRAKET", "LESSTHAN", "LPAREN", "LTOEQ", "MINUS", "MINUS1", "MOD", "MULT", "NEGNUM", "NEQUAL", "NOT", "NOTCHAR1", "NOTCHAR2", "NOTCHAR3", "NOTCHAR4", "NOTCHAR5", "NOTCHAR6", "NOTHEX1", "NOTHEX2", "NOTINDEN", "NOTSTR1", "NOTSTR2", "NOTSTR3", "NUM", "OR", "ORBITWISE", "POINT", "QMARK", "RAISE", "RBRACE", "RBRAKET", "RETURN", "RPAREN", "SEMICO", "STR", "TRUE", "UCASE", "UNDERSCORE", "UNICODE1", "UNICODE2", "UNICODE3", "VOID", "WHITESPACE", "LBRAKE", "RBRAKE"
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
    public static final int NOTSTR3=59;
    public static final int NUM=60;
    public static final int OR=61;
    public static final int ORBITWISE=62;
    public static final int POINT=63;
    public static final int QMARK=64;
    public static final int RAISE=65;
    public static final int RBRACE=66;
    public static final int RBRAKET=67;
    public static final int RETURN=68;
    public static final int RPAREN=69;
    public static final int SEMICO=70;
    public static final int STR=71;
    public static final int TRUE=72;
    public static final int UCASE=73;
    public static final int UNDERSCORE=74;
    public static final int UNICODE1=75;
    public static final int UNICODE2=76;
    public static final int UNICODE3=77;
    public static final int VOID=78;
    public static final int WHITESPACE=79;
    public static final int LBRAKE=80;
    public static final int RBRAKE=81;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public GramaticaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GramaticaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return GramaticaParser.tokenNames; }
    public String getGrammarFileName() { return "compiler/parser/GramaticaParser.g"; }



    // $ANTLR start "start"
    // compiler/parser/GramaticaParser.g:13:1: start : CLASS INDENTI LBRACE ( field_decl )* ( method_decl )* RBRACE ;
    public final void start() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:13:10: ( CLASS INDENTI LBRACE ( field_decl )* ( method_decl )* RBRACE )
            // compiler/parser/GramaticaParser.g:13:12: CLASS INDENTI LBRACE ( field_decl )* ( method_decl )* RBRACE
            {
            match(input,CLASS,FOLLOW_CLASS_in_start34); 

            match(input,INDENTI,FOLLOW_INDENTI_in_start36); 

            match(input,LBRACE,FOLLOW_LBRACE_in_start38); 

            // compiler/parser/GramaticaParser.g:13:33: ( field_decl )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:13:33: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_start40);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // compiler/parser/GramaticaParser.g:13:45: ( method_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BOOLEAN||LA2_0==INT||LA2_0==VOID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:13:45: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_start43);
            	    method_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_start46); 

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



    // $ANTLR start "field_decl"
    // compiler/parser/GramaticaParser.g:15:1: field_decl : type ( id | id LBRAKE int_literal RBRAKE ) ( COMA ( id | id LBRAKE int_literal RBRAKE ) )* SEMICO ;
    public final void field_decl() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:15:13: ( type ( id | id LBRAKE int_literal RBRAKE ) ( COMA ( id | id LBRAKE int_literal RBRAKE ) )* SEMICO )
            // compiler/parser/GramaticaParser.g:15:15: type ( id | id LBRAKE int_literal RBRAKE ) ( COMA ( id | id LBRAKE int_literal RBRAKE ) )* SEMICO
            {
            pushFollow(FOLLOW_type_in_field_decl55);
            type();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:15:20: ( id | id LBRAKE int_literal RBRAKE )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:15:21: id
                    {
                    pushFollow(FOLLOW_id_in_field_decl58);
                    id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:15:26: id LBRAKE int_literal RBRAKE
                    {
                    pushFollow(FOLLOW_id_in_field_decl62);
                    id();

                    state._fsp--;


                    match(input,LBRAKE,FOLLOW_LBRAKE_in_field_decl64); 

                    pushFollow(FOLLOW_int_literal_in_field_decl66);
                    int_literal();

                    state._fsp--;


                    match(input,RBRAKE,FOLLOW_RBRAKE_in_field_decl68); 

                    }
                    break;

            }


            // compiler/parser/GramaticaParser.g:15:56: ( COMA ( id | id LBRAKE int_literal RBRAKE ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:15:57: COMA ( id | id LBRAKE int_literal RBRAKE )
            	    {
            	    match(input,COMA,FOLLOW_COMA_in_field_decl72); 

            	    // compiler/parser/GramaticaParser.g:15:62: ( id | id LBRAKE int_literal RBRAKE )
            	    int alt4=2;
            	    alt4 = dfa4.predict(input);
            	    switch (alt4) {
            	        case 1 :
            	            // compiler/parser/GramaticaParser.g:15:63: id
            	            {
            	            pushFollow(FOLLOW_id_in_field_decl75);
            	            id();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // compiler/parser/GramaticaParser.g:15:68: id LBRAKE int_literal RBRAKE
            	            {
            	            pushFollow(FOLLOW_id_in_field_decl79);
            	            id();

            	            state._fsp--;


            	            match(input,LBRAKE,FOLLOW_LBRAKE_in_field_decl81); 

            	            pushFollow(FOLLOW_int_literal_in_field_decl83);
            	            int_literal();

            	            state._fsp--;


            	            match(input,RBRAKE,FOLLOW_RBRAKE_in_field_decl85); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,SEMICO,FOLLOW_SEMICO_in_field_decl90); 

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
    // $ANTLR end "field_decl"



    // $ANTLR start "method_decl"
    // compiler/parser/GramaticaParser.g:17:1: method_decl : ( type | VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block ;
    public final void method_decl() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:17:14: ( ( type | VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block )
            // compiler/parser/GramaticaParser.g:17:16: ( type | VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block
            {
            // compiler/parser/GramaticaParser.g:17:16: ( type | VOID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BOOLEAN||LA6_0==INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==VOID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:17:17: type
                    {
                    pushFollow(FOLLOW_type_in_method_decl100);
                    type();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:17:24: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_method_decl104); 

                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_method_decl107);
            id();

            state._fsp--;


            match(input,LPAREN,FOLLOW_LPAREN_in_method_decl109); 

            // compiler/parser/GramaticaParser.g:17:40: ( ( type id ) ( COMA type id )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BOOLEAN||LA8_0==INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:17:41: ( type id ) ( COMA type id )*
                    {
                    // compiler/parser/GramaticaParser.g:17:41: ( type id )
                    // compiler/parser/GramaticaParser.g:17:42: type id
                    {
                    pushFollow(FOLLOW_type_in_method_decl113);
                    type();

                    state._fsp--;


                    pushFollow(FOLLOW_id_in_method_decl115);
                    id();

                    state._fsp--;


                    }


                    // compiler/parser/GramaticaParser.g:17:50: ( COMA type id )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // compiler/parser/GramaticaParser.g:17:51: COMA type id
                    	    {
                    	    match(input,COMA,FOLLOW_COMA_in_method_decl118); 

                    	    pushFollow(FOLLOW_type_in_method_decl120);
                    	    type();

                    	    state._fsp--;


                    	    pushFollow(FOLLOW_id_in_method_decl122);
                    	    id();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_method_decl128); 

            pushFollow(FOLLOW_block_in_method_decl130);
            block();

            state._fsp--;


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
    // $ANTLR end "method_decl"



    // $ANTLR start "block"
    // compiler/parser/GramaticaParser.g:19:1: block : LBRACE ( var_decl )* ( statement )* RBRACE ;
    public final void block() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:19:9: ( LBRACE ( var_decl )* ( statement )* RBRACE )
            // compiler/parser/GramaticaParser.g:19:11: LBRACE ( var_decl )* ( statement )* RBRACE
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_block140); 

            // compiler/parser/GramaticaParser.g:19:18: ( var_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==BOOLEAN||LA9_0==INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:19:18: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_block142);
            	    var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // compiler/parser/GramaticaParser.g:19:28: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= BREAK && LA10_0 <= CHAR)||LA10_0==CONTINUE||LA10_0==FOR||LA10_0==IF||LA10_0==LBRACE||LA10_0==RETURN||LA10_0==UNDERSCORE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:19:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block145);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_block148); 

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
    // $ANTLR end "block"



    // $ANTLR start "var_decl"
    // compiler/parser/GramaticaParser.g:21:1: var_decl : type id ( COMA id )* SEMICO ;
    public final void var_decl() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:21:11: ( type id ( COMA id )* SEMICO )
            // compiler/parser/GramaticaParser.g:21:13: type id ( COMA id )* SEMICO
            {
            pushFollow(FOLLOW_type_in_var_decl157);
            type();

            state._fsp--;


            pushFollow(FOLLOW_id_in_var_decl159);
            id();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:21:21: ( COMA id )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:21:22: COMA id
            	    {
            	    match(input,COMA,FOLLOW_COMA_in_var_decl162); 

            	    pushFollow(FOLLOW_id_in_var_decl164);
            	    id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,SEMICO,FOLLOW_SEMICO_in_var_decl168); 

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
    // $ANTLR end "var_decl"



    // $ANTLR start "type"
    // compiler/parser/GramaticaParser.g:23:1: type : ( INT | BOOLEAN );
    public final void type() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:23:9: ( INT | BOOLEAN )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==BOOLEAN||input.LA(1)==INT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "type"



    // $ANTLR start "statement"
    // compiler/parser/GramaticaParser.g:25:1: statement : ( location assign_op expr SEMICO | method_call SEMICO | IF LPAREN expr RPAREN block ( ELSE block )? | FOR id ASSIGN expr COMA expr block | RETURN ( expr )? SEMICO | BREAK SEMICO | CONTINUE SEMICO | block );
    public final void statement() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:25:12: ( location assign_op expr SEMICO | method_call SEMICO | IF LPAREN expr RPAREN block ( ELSE block )? | FOR id ASSIGN expr COMA expr block | RETURN ( expr )? SEMICO | BREAK SEMICO | CONTINUE SEMICO | block )
            int alt14=8;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:25:14: location assign_op expr SEMICO
                    {
                    pushFollow(FOLLOW_location_in_statement193);
                    location();

                    state._fsp--;


                    pushFollow(FOLLOW_assign_op_in_statement195);
                    assign_op();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_statement197);
                    expr();

                    state._fsp--;


                    match(input,SEMICO,FOLLOW_SEMICO_in_statement199); 

                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:26:7: method_call SEMICO
                    {
                    pushFollow(FOLLOW_method_call_in_statement207);
                    method_call();

                    state._fsp--;


                    match(input,SEMICO,FOLLOW_SEMICO_in_statement209); 

                    }
                    break;
                case 3 :
                    // compiler/parser/GramaticaParser.g:27:7: IF LPAREN expr RPAREN block ( ELSE block )?
                    {
                    match(input,IF,FOLLOW_IF_in_statement217); 

                    match(input,LPAREN,FOLLOW_LPAREN_in_statement219); 

                    pushFollow(FOLLOW_expr_in_statement221);
                    expr();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_statement223); 

                    pushFollow(FOLLOW_block_in_statement225);
                    block();

                    state._fsp--;


                    // compiler/parser/GramaticaParser.g:27:35: ( ELSE block )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ELSE) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // compiler/parser/GramaticaParser.g:27:36: ELSE block
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_statement228); 

                            pushFollow(FOLLOW_block_in_statement230);
                            block();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // compiler/parser/GramaticaParser.g:28:7: FOR id ASSIGN expr COMA expr block
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement240); 

                    pushFollow(FOLLOW_id_in_statement242);
                    id();

                    state._fsp--;


                    match(input,ASSIGN,FOLLOW_ASSIGN_in_statement244); 

                    pushFollow(FOLLOW_expr_in_statement246);
                    expr();

                    state._fsp--;


                    match(input,COMA,FOLLOW_COMA_in_statement248); 

                    pushFollow(FOLLOW_expr_in_statement250);
                    expr();

                    state._fsp--;


                    pushFollow(FOLLOW_block_in_statement252);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // compiler/parser/GramaticaParser.g:29:7: RETURN ( expr )? SEMICO
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement260); 

                    // compiler/parser/GramaticaParser.g:29:14: ( expr )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0 >= CALLOUT && LA13_0 <= CHR)||LA13_0==DIGIT||LA13_0==FALSE||LA13_0==HEX||LA13_0==LPAREN||LA13_0==MINUS||LA13_0==NOT||LA13_0==TRUE||LA13_0==UNDERSCORE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // compiler/parser/GramaticaParser.g:29:15: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement263);
                            expr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,SEMICO,FOLLOW_SEMICO_in_statement267); 

                    }
                    break;
                case 6 :
                    // compiler/parser/GramaticaParser.g:30:7: BREAK SEMICO
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement275); 

                    match(input,SEMICO,FOLLOW_SEMICO_in_statement277); 

                    }
                    break;
                case 7 :
                    // compiler/parser/GramaticaParser.g:31:7: CONTINUE SEMICO
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement285); 

                    match(input,SEMICO,FOLLOW_SEMICO_in_statement287); 

                    }
                    break;
                case 8 :
                    // compiler/parser/GramaticaParser.g:32:7: block
                    {
                    pushFollow(FOLLOW_block_in_statement295);
                    block();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "statement"



    // $ANTLR start "assign_op"
    // compiler/parser/GramaticaParser.g:34:1: assign_op : ( ASSIGN | ASSIGNADD | ASSIGNSUB );
    public final void assign_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:34:12: ( ASSIGN | ASSIGNADD | ASSIGNSUB )
            // compiler/parser/GramaticaParser.g:
            {
            if ( (input.LA(1) >= ASSIGN && input.LA(1) <= ASSIGNSUB) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "assign_op"



    // $ANTLR start "method_call"
    // compiler/parser/GramaticaParser.g:38:1: method_call : ( method_name LPAREN ( expr ( COMA expr )* )? RPAREN | CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN );
    public final void method_call() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:38:14: ( method_name LPAREN ( expr ( COMA expr )* )? RPAREN | CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CHAR||LA19_0==UNDERSCORE) ) {
                alt19=1;
            }
            else if ( (LA19_0==CALLOUT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:38:16: method_name LPAREN ( expr ( COMA expr )* )? RPAREN
                    {
                    pushFollow(FOLLOW_method_name_in_method_call330);
                    method_name();

                    state._fsp--;


                    match(input,LPAREN,FOLLOW_LPAREN_in_method_call332); 

                    // compiler/parser/GramaticaParser.g:38:35: ( expr ( COMA expr )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0 >= CALLOUT && LA16_0 <= CHR)||LA16_0==DIGIT||LA16_0==FALSE||LA16_0==HEX||LA16_0==LPAREN||LA16_0==MINUS||LA16_0==NOT||LA16_0==TRUE||LA16_0==UNDERSCORE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // compiler/parser/GramaticaParser.g:38:36: expr ( COMA expr )*
                            {
                            pushFollow(FOLLOW_expr_in_method_call335);
                            expr();

                            state._fsp--;


                            // compiler/parser/GramaticaParser.g:38:40: ( COMA expr )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==COMA) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // compiler/parser/GramaticaParser.g:38:41: COMA expr
                            	    {
                            	    match(input,COMA,FOLLOW_COMA_in_method_call337); 

                            	    pushFollow(FOLLOW_expr_in_method_call339);
                            	    expr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_method_call345); 

                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:39:7: CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN
                    {
                    match(input,CALLOUT,FOLLOW_CALLOUT_in_method_call353); 

                    match(input,LPAREN,FOLLOW_LPAREN_in_method_call355); 

                    pushFollow(FOLLOW_string_literal_in_method_call357);
                    string_literal();

                    state._fsp--;


                    // compiler/parser/GramaticaParser.g:39:37: ( ( COMA callout_arg )+ )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==COMA) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // compiler/parser/GramaticaParser.g:39:38: ( COMA callout_arg )+
                            {
                            // compiler/parser/GramaticaParser.g:39:38: ( COMA callout_arg )+
                            int cnt17=0;
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==COMA) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // compiler/parser/GramaticaParser.g:39:39: COMA callout_arg
                            	    {
                            	    match(input,COMA,FOLLOW_COMA_in_method_call361); 

                            	    pushFollow(FOLLOW_callout_arg_in_method_call363);
                            	    callout_arg();

                            	    state._fsp--;


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


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_method_call369); 

                    }
                    break;

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
    // $ANTLR end "method_call"



    // $ANTLR start "method_name"
    // compiler/parser/GramaticaParser.g:41:1: method_name : id ;
    public final void method_name() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:41:14: ( id )
            // compiler/parser/GramaticaParser.g:41:16: id
            {
            pushFollow(FOLLOW_id_in_method_name378);
            id();

            state._fsp--;


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
    // $ANTLR end "method_name"



    // $ANTLR start "location"
    // compiler/parser/GramaticaParser.g:43:1: location : ( id | id LBRAKE expr RBRAKE );
    public final void location() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:43:11: ( id | id LBRAKE expr RBRAKE )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:43:13: id
                    {
                    pushFollow(FOLLOW_id_in_location387);
                    id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:44:7: id LBRAKE expr RBRAKE
                    {
                    pushFollow(FOLLOW_id_in_location395);
                    id();

                    state._fsp--;


                    match(input,LBRAKE,FOLLOW_LBRAKE_in_location397); 

                    pushFollow(FOLLOW_expr_in_location399);
                    expr();

                    state._fsp--;


                    match(input,RBRAKE,FOLLOW_RBRAKE_in_location401); 

                    }
                    break;

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
    // $ANTLR end "location"



    // $ANTLR start "expr"
    // compiler/parser/GramaticaParser.g:46:1: expr : l= expr_and ( OR r= expr_and ) ;
    public final void expr() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:46:9: (l= expr_and ( OR r= expr_and ) )
            // compiler/parser/GramaticaParser.g:46:11: l= expr_and ( OR r= expr_and )
            {
            pushFollow(FOLLOW_expr_and_in_expr416);
            expr_and();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:46:24: ( OR r= expr_and )
            // compiler/parser/GramaticaParser.g:46:25: OR r= expr_and
            {
            match(input,OR,FOLLOW_OR_in_expr419); 

            pushFollow(FOLLOW_expr_and_in_expr425);
            expr_and();

            state._fsp--;


            }


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
    // $ANTLR end "expr"



    // $ANTLR start "expr_and"
    // compiler/parser/GramaticaParser.g:47:1: expr_and : l= expr_eq ( AND r= expr_eq ) ;
    public final void expr_and() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:47:11: (l= expr_eq ( AND r= expr_eq ) )
            // compiler/parser/GramaticaParser.g:47:13: l= expr_eq ( AND r= expr_eq )
            {
            pushFollow(FOLLOW_expr_eq_in_expr_and438);
            expr_eq();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:47:26: ( AND r= expr_eq )
            // compiler/parser/GramaticaParser.g:47:27: AND r= expr_eq
            {
            match(input,AND,FOLLOW_AND_in_expr_and442); 

            pushFollow(FOLLOW_expr_eq_in_expr_and448);
            expr_eq();

            state._fsp--;


            }


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
    // $ANTLR end "expr_and"



    // $ANTLR start "expr_eq"
    // compiler/parser/GramaticaParser.g:48:1: expr_eq : l= expr_rel ( eq_op r= expr_rel ) ;
    public final void expr_eq() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:48:11: (l= expr_rel ( eq_op r= expr_rel ) )
            // compiler/parser/GramaticaParser.g:48:13: l= expr_rel ( eq_op r= expr_rel )
            {
            pushFollow(FOLLOW_expr_rel_in_expr_eq462);
            expr_rel();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:48:27: ( eq_op r= expr_rel )
            // compiler/parser/GramaticaParser.g:48:28: eq_op r= expr_rel
            {
            pushFollow(FOLLOW_eq_op_in_expr_eq466);
            eq_op();

            state._fsp--;


            pushFollow(FOLLOW_expr_rel_in_expr_eq472);
            expr_rel();

            state._fsp--;


            }


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
    // $ANTLR end "expr_eq"



    // $ANTLR start "expr_rel"
    // compiler/parser/GramaticaParser.g:49:1: expr_rel : l= expr_add ( rel_op r= expr_add ) ;
    public final void expr_rel() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:49:11: (l= expr_add ( rel_op r= expr_add ) )
            // compiler/parser/GramaticaParser.g:49:13: l= expr_add ( rel_op r= expr_add )
            {
            pushFollow(FOLLOW_expr_add_in_expr_rel485);
            expr_add();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:49:27: ( rel_op r= expr_add )
            // compiler/parser/GramaticaParser.g:49:28: rel_op r= expr_add
            {
            pushFollow(FOLLOW_rel_op_in_expr_rel489);
            rel_op();

            state._fsp--;


            pushFollow(FOLLOW_expr_add_in_expr_rel495);
            expr_add();

            state._fsp--;


            }


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
    // $ANTLR end "expr_rel"



    // $ANTLR start "expr_add"
    // compiler/parser/GramaticaParser.g:50:1: expr_add : l= expr_arith ( sumsub_op r= expr_arith ) ;
    public final void expr_add() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:50:11: (l= expr_arith ( sumsub_op r= expr_arith ) )
            // compiler/parser/GramaticaParser.g:50:13: l= expr_arith ( sumsub_op r= expr_arith )
            {
            pushFollow(FOLLOW_expr_arith_in_expr_add508);
            expr_arith();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:50:29: ( sumsub_op r= expr_arith )
            // compiler/parser/GramaticaParser.g:50:30: sumsub_op r= expr_arith
            {
            pushFollow(FOLLOW_sumsub_op_in_expr_add512);
            sumsub_op();

            state._fsp--;


            pushFollow(FOLLOW_expr_arith_in_expr_add518);
            expr_arith();

            state._fsp--;


            }


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
    // $ANTLR end "expr_add"



    // $ANTLR start "expr_arith"
    // compiler/parser/GramaticaParser.g:51:1: expr_arith : l= expr_factor ( arith_op r= expr_factor ) ;
    public final void expr_arith() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:51:13: (l= expr_factor ( arith_op r= expr_factor ) )
            // compiler/parser/GramaticaParser.g:51:15: l= expr_factor ( arith_op r= expr_factor )
            {
            pushFollow(FOLLOW_expr_factor_in_expr_arith531);
            expr_factor();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:51:32: ( arith_op r= expr_factor )
            // compiler/parser/GramaticaParser.g:51:33: arith_op r= expr_factor
            {
            pushFollow(FOLLOW_arith_op_in_expr_arith535);
            arith_op();

            state._fsp--;


            pushFollow(FOLLOW_expr_factor_in_expr_arith541);
            expr_factor();

            state._fsp--;


            }


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
    // $ANTLR end "expr_arith"



    // $ANTLR start "expr_factor"
    // compiler/parser/GramaticaParser.g:53:1: expr_factor : ( location | method_call | literal | MINUS expr | NOT expr | LPAREN expr RPAREN );
    public final void expr_factor() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:53:14: ( location | method_call | literal | MINUS expr | NOT expr | LPAREN expr RPAREN )
            int alt21=6;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:53:16: location
                    {
                    pushFollow(FOLLOW_location_in_expr_factor551);
                    location();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:54:7: method_call
                    {
                    pushFollow(FOLLOW_method_call_in_expr_factor559);
                    method_call();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // compiler/parser/GramaticaParser.g:55:7: literal
                    {
                    pushFollow(FOLLOW_literal_in_expr_factor567);
                    literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // compiler/parser/GramaticaParser.g:56:7: MINUS expr
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr_factor575); 

                    pushFollow(FOLLOW_expr_in_expr_factor577);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // compiler/parser/GramaticaParser.g:57:7: NOT expr
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr_factor585); 

                    pushFollow(FOLLOW_expr_in_expr_factor587);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // compiler/parser/GramaticaParser.g:58:7: LPAREN expr RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_expr_factor595); 

                    pushFollow(FOLLOW_expr_in_expr_factor597);
                    expr();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_expr_factor599); 

                    }
                    break;

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
    // $ANTLR end "expr_factor"



    // $ANTLR start "callout_arg"
    // compiler/parser/GramaticaParser.g:60:1: callout_arg : ( expr | string_literal );
    public final void callout_arg() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:60:14: ( expr | string_literal )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0 >= CALLOUT && LA22_0 <= CHR)||LA22_0==DIGIT||LA22_0==FALSE||LA22_0==HEX||LA22_0==LPAREN||LA22_0==MINUS||LA22_0==NOT||LA22_0==TRUE||LA22_0==UNDERSCORE) ) {
                alt22=1;
            }
            else if ( (LA22_0==STR) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:60:16: expr
                    {
                    pushFollow(FOLLOW_expr_in_callout_arg608);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:60:23: string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_callout_arg612);
                    string_literal();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "callout_arg"



    // $ANTLR start "bin_op"
    // compiler/parser/GramaticaParser.g:62:1: bin_op : ( arith_op | rel_op | eq_op | cond_op );
    public final void bin_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:62:10: ( arith_op | rel_op | eq_op | cond_op )
            int alt23=4;
            switch ( input.LA(1) ) {
            case DIV:
            case MOD:
            case MULT:
                {
                alt23=1;
                }
                break;
            case GREATHAN:
            case GTOEQ:
            case LESSTHAN:
            case LTOEQ:
                {
                alt23=2;
                }
                break;
            case EQUAL:
            case NEQUAL:
                {
                alt23=3;
                }
                break;
            case AND:
            case OR:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:62:12: arith_op
                    {
                    pushFollow(FOLLOW_arith_op_in_bin_op622);
                    arith_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:62:23: rel_op
                    {
                    pushFollow(FOLLOW_rel_op_in_bin_op626);
                    rel_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // compiler/parser/GramaticaParser.g:62:32: eq_op
                    {
                    pushFollow(FOLLOW_eq_op_in_bin_op630);
                    eq_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // compiler/parser/GramaticaParser.g:62:40: cond_op
                    {
                    pushFollow(FOLLOW_cond_op_in_bin_op634);
                    cond_op();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "bin_op"



    // $ANTLR start "arith_op"
    // compiler/parser/GramaticaParser.g:63:1: arith_op : ( MULT | DIV | MOD );
    public final void arith_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:63:12: ( MULT | DIV | MOD )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "arith_op"



    // $ANTLR start "sumsub_op"
    // compiler/parser/GramaticaParser.g:64:1: sumsub_op : ( ADD | MINUS );
    public final void sumsub_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:64:12: ( ADD | MINUS )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==ADD||input.LA(1)==MINUS ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "sumsub_op"



    // $ANTLR start "rel_op"
    // compiler/parser/GramaticaParser.g:65:1: rel_op : ( LESSTHAN | GREATHAN | LTOEQ | GTOEQ );
    public final void rel_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:65:10: ( LESSTHAN | GREATHAN | LTOEQ | GTOEQ )
            // compiler/parser/GramaticaParser.g:
            {
            if ( (input.LA(1) >= GREATHAN && input.LA(1) <= GTOEQ)||input.LA(1)==LESSTHAN||input.LA(1)==LTOEQ ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "rel_op"



    // $ANTLR start "eq_op"
    // compiler/parser/GramaticaParser.g:66:1: eq_op : ( EQUAL | NEQUAL );
    public final void eq_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:66:9: ( EQUAL | NEQUAL )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==EQUAL||input.LA(1)==NEQUAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "eq_op"



    // $ANTLR start "cond_op"
    // compiler/parser/GramaticaParser.g:67:1: cond_op : ( AND | OR );
    public final void cond_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:67:11: ( AND | OR )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==AND||input.LA(1)==OR ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "cond_op"



    // $ANTLR start "literal"
    // compiler/parser/GramaticaParser.g:69:1: literal : ( int_literal | char_literal | bool_literal );
    public final void literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:69:11: ( int_literal | char_literal | bool_literal )
            int alt24=3;
            switch ( input.LA(1) ) {
            case DIGIT:
            case HEX:
                {
                alt24=1;
                }
                break;
            case CHR:
                {
                alt24=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:69:13: int_literal
                    {
                    pushFollow(FOLLOW_int_literal_in_literal720);
                    int_literal();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:69:27: char_literal
                    {
                    pushFollow(FOLLOW_char_literal_in_literal724);
                    char_literal();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // compiler/parser/GramaticaParser.g:69:42: bool_literal
                    {
                    pushFollow(FOLLOW_bool_literal_in_literal728);
                    bool_literal();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "literal"



    // $ANTLR start "id"
    // compiler/parser/GramaticaParser.g:71:1: id : alpha ( alpha_num )* ;
    public final void id() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:71:8: ( alpha ( alpha_num )* )
            // compiler/parser/GramaticaParser.g:71:10: alpha ( alpha_num )*
            {
            pushFollow(FOLLOW_alpha_in_id740);
            alpha();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:71:16: ( alpha_num )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==CHAR||LA25_0==NUM||LA25_0==UNDERSCORE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:71:16: alpha_num
            	    {
            	    pushFollow(FOLLOW_alpha_num_in_id742);
            	    alpha_num();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "id"



    // $ANTLR start "alpha_num"
    // compiler/parser/GramaticaParser.g:73:1: alpha_num : ( alpha | digit );
    public final void alpha_num() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:73:12: ( alpha | digit )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==CHAR||LA26_0==UNDERSCORE) ) {
                alt26=1;
            }
            else if ( (LA26_0==NUM) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:73:14: alpha
                    {
                    pushFollow(FOLLOW_alpha_in_alpha_num752);
                    alpha();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:73:22: digit
                    {
                    pushFollow(FOLLOW_digit_in_alpha_num756);
                    digit();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "alpha_num"



    // $ANTLR start "alpha"
    // compiler/parser/GramaticaParser.g:75:1: alpha : ( CHAR | UNDERSCORE );
    public final void alpha() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:75:10: ( CHAR | UNDERSCORE )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==CHAR||input.LA(1)==UNDERSCORE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "alpha"



    // $ANTLR start "digit"
    // compiler/parser/GramaticaParser.g:77:1: digit : NUM ;
    public final void digit() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:77:10: ( NUM )
            // compiler/parser/GramaticaParser.g:77:12: NUM
            {
            match(input,NUM,FOLLOW_NUM_in_digit782); 

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
    // $ANTLR end "digit"



    // $ANTLR start "hex_digit"
    // compiler/parser/GramaticaParser.g:79:1: hex_digit : ( digit | HEXCHAR );
    public final void hex_digit() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:79:13: ( digit | HEXCHAR )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==NUM) ) {
                alt27=1;
            }
            else if ( (LA27_0==HEXCHAR) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:79:15: digit
                    {
                    pushFollow(FOLLOW_digit_in_hex_digit792);
                    digit();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:79:23: HEXCHAR
                    {
                    match(input,HEXCHAR,FOLLOW_HEXCHAR_in_hex_digit796); 

                    }
                    break;

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
    // $ANTLR end "hex_digit"



    // $ANTLR start "int_literal"
    // compiler/parser/GramaticaParser.g:81:1: int_literal : ( decimal_literal | hex_literal );
    public final void int_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:81:14: ( decimal_literal | hex_literal )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DIGIT) ) {
                alt28=1;
            }
            else if ( (LA28_0==HEX) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:81:16: decimal_literal
                    {
                    pushFollow(FOLLOW_decimal_literal_in_int_literal805);
                    decimal_literal();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:81:34: hex_literal
                    {
                    pushFollow(FOLLOW_hex_literal_in_int_literal809);
                    hex_literal();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "int_literal"



    // $ANTLR start "decimal_literal"
    // compiler/parser/GramaticaParser.g:83:1: decimal_literal : DIGIT ;
    public final void decimal_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:83:17: ( DIGIT )
            // compiler/parser/GramaticaParser.g:83:19: DIGIT
            {
            match(input,DIGIT,FOLLOW_DIGIT_in_decimal_literal817); 

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
    // $ANTLR end "decimal_literal"



    // $ANTLR start "hex_literal"
    // compiler/parser/GramaticaParser.g:85:1: hex_literal : HEX ;
    public final void hex_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:85:14: ( HEX )
            // compiler/parser/GramaticaParser.g:85:16: HEX
            {
            match(input,HEX,FOLLOW_HEX_in_hex_literal826); 

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
    // $ANTLR end "hex_literal"



    // $ANTLR start "bool_literal"
    // compiler/parser/GramaticaParser.g:87:1: bool_literal : ( TRUE | FALSE );
    public final void bool_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:87:17: ( TRUE | FALSE )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "bool_literal"



    // $ANTLR start "char_literal"
    // compiler/parser/GramaticaParser.g:89:1: char_literal : CHR ;
    public final void char_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:89:14: ( CHR )
            // compiler/parser/GramaticaParser.g:89:16: CHR
            {
            match(input,CHR,FOLLOW_CHR_in_char_literal849); 

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
    // $ANTLR end "char_literal"



    // $ANTLR start "string_literal"
    // compiler/parser/GramaticaParser.g:91:1: string_literal : STR ;
    public final void string_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:91:17: ( STR )
            // compiler/parser/GramaticaParser.g:91:19: STR
            {
            match(input,STR,FOLLOW_STR_in_string_literal858); 

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
    // $ANTLR end "string_literal"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA1_eotS =
        "\7\uffff";
    static final String DFA1_eofS =
        "\7\uffff";
    static final String DFA1_minS =
        "\1\14\1\17\1\uffff\3\17\1\uffff";
    static final String DFA1_maxS =
        "\1\116\1\112\1\uffff\3\120\1\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\3\uffff\1\1";
    static final String DFA1_specialS =
        "\7\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\26\uffff\1\1\36\uffff\1\2\13\uffff\1\2",
            "\1\3\72\uffff\1\3",
            "",
            "\1\4\2\uffff\1\6\24\uffff\1\2\24\uffff\1\5\11\uffff\1\6\3\uffff"+
            "\1\4\5\uffff\1\6",
            "\1\4\2\uffff\1\6\24\uffff\1\2\24\uffff\1\5\11\uffff\1\6\3\uffff"+
            "\1\4\5\uffff\1\6",
            "\1\4\2\uffff\1\6\24\uffff\1\2\24\uffff\1\5\11\uffff\1\6\3\uffff"+
            "\1\4\5\uffff\1\6",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 13:33: ( field_decl )*";
        }
    }
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\4\17\2\uffff";
    static final String DFA3_maxS =
        "\1\112\3\120\2\uffff";
    static final String DFA3_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\72\uffff\1\1",
            "\1\2\2\uffff\1\4\51\uffff\1\3\11\uffff\1\4\3\uffff\1\2\5\uffff"+
            "\1\5",
            "\1\2\2\uffff\1\4\51\uffff\1\3\11\uffff\1\4\3\uffff\1\2\5\uffff"+
            "\1\5",
            "\1\2\2\uffff\1\4\51\uffff\1\3\11\uffff\1\4\3\uffff\1\2\5\uffff"+
            "\1\5",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "15:20: ( id | id LBRAKE int_literal RBRAKE )";
        }
    }
    static final String DFA4_eotS =
        "\6\uffff";
    static final String DFA4_eofS =
        "\6\uffff";
    static final String DFA4_minS =
        "\4\17\2\uffff";
    static final String DFA4_maxS =
        "\1\112\3\120\2\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\6\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\72\uffff\1\1",
            "\1\2\2\uffff\1\4\51\uffff\1\3\11\uffff\1\4\3\uffff\1\2\5\uffff"+
            "\1\5",
            "\1\2\2\uffff\1\4\51\uffff\1\3\11\uffff\1\4\3\uffff\1\2\5\uffff"+
            "\1\5",
            "\1\2\2\uffff\1\4\51\uffff\1\3\11\uffff\1\4\3\uffff\1\2\5\uffff"+
            "\1\5",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "15:62: ( id | id LBRAKE int_literal RBRAKE )";
        }
    }
    static final String DFA14_eotS =
        "\14\uffff";
    static final String DFA14_eofS =
        "\14\uffff";
    static final String DFA14_minS =
        "\1\15\1\11\7\uffff\2\11\1\uffff";
    static final String DFA14_maxS =
        "\1\112\1\120\7\uffff\2\120\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\1";
    static final String DFA14_specialS =
        "\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\6\1\2\1\1\4\uffff\1\7\7\uffff\1\4\4\uffff\1\3\2\uffff\1\10"+
            "\37\uffff\1\5\5\uffff\1\1",
            "\3\13\3\uffff\1\11\27\uffff\1\2\24\uffff\1\12\15\uffff\1\11"+
            "\5\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\13\3\uffff\1\11\27\uffff\1\2\24\uffff\1\12\15\uffff\1\11"+
            "\5\uffff\1\13",
            "\3\13\3\uffff\1\11\27\uffff\1\2\24\uffff\1\12\15\uffff\1\11"+
            "\5\uffff\1\13",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "25:1: statement : ( location assign_op expr SEMICO | method_call SEMICO | IF LPAREN expr RPAREN block ( ELSE block )? | FOR id ASSIGN expr COMA expr block | RETURN ( expr )? SEMICO | BREAK SEMICO | CONTINUE SEMICO | block );";
        }
    }
    static final String DFA20_eotS =
        "\6\uffff";
    static final String DFA20_eofS =
        "\6\uffff";
    static final String DFA20_minS =
        "\1\17\3\4\2\uffff";
    static final String DFA20_maxS =
        "\1\112\3\121\2\uffff";
    static final String DFA20_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\6\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\72\uffff\1\1",
            "\1\4\1\uffff\1\4\2\uffff\3\4\3\uffff\1\2\2\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\3\uffff\2\4\5\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\2\4\1\uffff\1\4\15\uffff\1\3\1\4\7\uffff\2\4\3"+
            "\uffff\1\2\5\uffff\1\5\1\4",
            "\1\4\1\uffff\1\4\2\uffff\3\4\3\uffff\1\2\2\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\3\uffff\2\4\5\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\2\4\1\uffff\1\4\15\uffff\1\3\1\4\7\uffff\2\4\3"+
            "\uffff\1\2\5\uffff\1\5\1\4",
            "\1\4\1\uffff\1\4\2\uffff\3\4\3\uffff\1\2\2\uffff\1\4\3\uffff"+
            "\1\4\2\uffff\1\4\3\uffff\2\4\5\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\2\4\1\uffff\1\4\15\uffff\1\3\1\4\7\uffff\2\4\3"+
            "\uffff\1\2\5\uffff\1\5\1\4",
            "",
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
            return "43:1: location : ( id | id LBRAKE expr RBRAKE );";
        }
    }
    static final String DFA21_eotS =
        "\12\uffff";
    static final String DFA21_eofS =
        "\12\uffff";
    static final String DFA21_minS =
        "\1\16\1\4\5\uffff\2\4\1\uffff";
    static final String DFA21_maxS =
        "\1\112\1\121\5\uffff\2\121\1\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\2\uffff\1\1";
    static final String DFA21_specialS =
        "\12\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\1\1\3\4\uffff\1\3\5\uffff\1\3\3\uffff\1\3\7\uffff\1\6"+
            "\1\uffff\1\4\5\uffff\1\5\30\uffff\1\3\1\uffff\1\1",
            "\1\11\1\uffff\1\11\10\uffff\1\7\2\uffff\1\11\3\uffff\1\11\2"+
            "\uffff\1\11\3\uffff\2\11\5\uffff\1\11\1\uffff\1\11\1\2\2\11"+
            "\1\uffff\2\11\1\uffff\1\11\15\uffff\1\10\1\11\7\uffff\2\11\3"+
            "\uffff\1\7\5\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\1\11\10\uffff\1\7\2\uffff\1\11\3\uffff\1\11\2"+
            "\uffff\1\11\3\uffff\2\11\5\uffff\1\11\1\uffff\1\11\1\2\2\11"+
            "\1\uffff\2\11\1\uffff\1\11\15\uffff\1\10\1\11\7\uffff\2\11\3"+
            "\uffff\1\7\5\uffff\2\11",
            "\1\11\1\uffff\1\11\10\uffff\1\7\2\uffff\1\11\3\uffff\1\11\2"+
            "\uffff\1\11\3\uffff\2\11\5\uffff\1\11\1\uffff\1\11\1\2\2\11"+
            "\1\uffff\2\11\1\uffff\1\11\15\uffff\1\10\1\11\7\uffff\2\11\3"+
            "\uffff\1\7\5\uffff\2\11",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "53:1: expr_factor : ( location | method_call | literal | MINUS expr | NOT expr | LPAREN expr RPAREN );";
        }
    }
 

    public static final BitSet FOLLOW_CLASS_in_start34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INDENTI_in_start36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LBRACE_in_start38 = new BitSet(new long[]{0x0000000800001000L,0x0000000000004004L});
    public static final BitSet FOLLOW_field_decl_in_start40 = new BitSet(new long[]{0x0000000800001000L,0x0000000000004004L});
    public static final BitSet FOLLOW_method_decl_in_start43 = new BitSet(new long[]{0x0000000800001000L,0x0000000000004004L});
    public static final BitSet FOLLOW_RBRACE_in_start46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_field_decl55 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_field_decl58 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_id_in_field_decl62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRAKE_in_field_decl64 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_int_literal_in_field_decl66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRAKE_in_field_decl68 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMA_in_field_decl72 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_field_decl75 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_id_in_field_decl79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRAKE_in_field_decl81 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_int_literal_in_field_decl83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRAKE_in_field_decl85 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_field_decl90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_method_decl100 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_VOID_in_method_decl104 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_method_decl107 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_decl109 = new BitSet(new long[]{0x0000000800001000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_method_decl113 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_method_decl115 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_decl118 = new BitSet(new long[]{0x0000000800001000L});
    public static final BitSet FOLLOW_type_in_method_decl120 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_method_decl122 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_decl128 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_block_in_method_decl130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block140 = new BitSet(new long[]{0x0000001A1010F000L,0x0000000000000414L});
    public static final BitSet FOLLOW_var_decl_in_block142 = new BitSet(new long[]{0x0000001A1010F000L,0x0000000000000414L});
    public static final BitSet FOLLOW_statement_in_block145 = new BitSet(new long[]{0x000000121010E000L,0x0000000000000414L});
    public static final BitSet FOLLOW_RBRACE_in_block148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var_decl157 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_var_decl159 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMA_in_var_decl162 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_var_decl164 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_var_decl168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_location_in_statement193 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_assign_op_in_statement195 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_in_statement197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_call_in_statement207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement217 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement219 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_in_statement221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_statement223 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_block_in_statement225 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ELSE_in_statement228 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_block_in_statement230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement240 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_statement242 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_statement244 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_in_statement246 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COMA_in_statement248 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_in_statement250 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_block_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement260 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000540L});
    public static final BitSet FOLLOW_expr_in_statement263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_name_in_method_call330 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_call332 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000520L});
    public static final BitSet FOLLOW_expr_in_method_call335 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_call337 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_in_method_call339 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_call345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALLOUT_in_method_call353 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_call355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_string_literal_in_method_call357 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_call361 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000580L});
    public static final BitSet FOLLOW_callout_arg_in_method_call363 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_call369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_method_name378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_location387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_location395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRAKE_in_location397 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_in_location399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRAKE_in_location401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_and_in_expr416 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_OR_in_expr419 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_and_in_expr425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_eq_in_expr_and438 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AND_in_expr_and442 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_eq_in_expr_and448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_rel_in_expr_eq462 = new BitSet(new long[]{0x0000400002000000L});
    public static final BitSet FOLLOW_eq_op_in_expr_eq466 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_rel_in_expr_eq472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel485 = new BitSet(new long[]{0x0000014060000000L});
    public static final BitSet FOLLOW_rel_op_in_expr_rel489 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_arith_in_expr_add508 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_sumsub_op_in_expr_add512 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_arith_in_expr_add518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_factor_in_expr_arith531 = new BitSet(new long[]{0x0000180000400000L});
    public static final BitSet FOLLOW_arith_op_in_expr_arith535 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_factor_in_expr_arith541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_location_in_expr_factor551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_call_in_expr_factor559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_expr_factor567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_factor575 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_in_expr_factor577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_expr_factor585 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_in_expr_factor587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_expr_factor595 = new BitSet(new long[]{0x000082808821C000L,0x0000000000000500L});
    public static final BitSet FOLLOW_expr_in_expr_factor597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_expr_factor599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_callout_arg608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_callout_arg612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_op_in_bin_op622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_op_in_bin_op626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eq_op_in_bin_op630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_op_in_bin_op634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_literal_in_literal720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_literal_in_literal724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_literal_in_literal728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alpha_in_id740 = new BitSet(new long[]{0x1000000000008002L,0x0000000000000400L});
    public static final BitSet FOLLOW_alpha_num_in_id742 = new BitSet(new long[]{0x1000000000008002L,0x0000000000000400L});
    public static final BitSet FOLLOW_alpha_in_alpha_num752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_alpha_num756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_digit782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_digit_in_hex_digit792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXCHAR_in_hex_digit796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimal_literal_in_int_literal805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hex_literal_in_int_literal809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_decimal_literal817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_in_hex_literal826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHR_in_char_literal849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_string_literal858 = new BitSet(new long[]{0x0000000000000002L});

}