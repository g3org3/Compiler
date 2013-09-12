// $ANTLR 3.4 compiler/parser/GramaticaParser.g 2013-09-12 11:06:54

	package compiler.parser;
	import compiler.scanner.*;
	import java.util.ArrayList;
	import org.antlr.runtime.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GramaticaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ADD1", "ALPHA", "AND", "ANDBITWISE", "ASCII", "ASSIGN", "ASSIGNADD", "ASSIGNSUB", "BOOLEAN", "BREAK", "CALLOUT", "CHAR", "CHR", "CLASS", "COMA", "COMMENTS", "CONTINUE", "DIGIT", "DIV", "DPOINTS", "ELSE", "EQUAL", "ESC", "FALSE", "FOR", "GREATHAN", "GTOEQ", "HEX", "HEXCHAR", "IF", "INDENTIFIER", "INT", "LBRACE", "LBRAKET", "LESSTHAN", "LPAREN", "LTOEQ", "MINUS", "MINUS1", "MOD", "MULT", "NEQUAL", "NOT", "NOTCHAR1", "NOTCHAR2", "NOTCHAR3", "NOTCHAR4", "NOTCHAR5", "NOTCHAR6", "NOTHEX1", "NOTHEX2", "NOTSTR1", "NOTSTR2", "NOTSTR3", "NUM", "OR", "ORBITWISE", "POINT", "PROGRAM", "QMARK", "RAISE", "RBRACE", "RBRAKET", "RETURN", "RPAREN", "SEMICO", "STR", "TRUE", "UCASE", "UNDERSCORE", "UNICODE1", "UNICODE2", "UNICODE3", "VOID", "WHITESPACE"
    };

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
    public static final int NOTSTR1=56;
    public static final int NOTSTR2=57;
    public static final int NOTSTR3=58;
    public static final int NUM=59;
    public static final int OR=60;
    public static final int ORBITWISE=61;
    public static final int POINT=62;
    public static final int PROGRAM=63;
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


    	public ArrayList<String> errors = new ArrayList<String>();
    	public ArrayList<String> rules = new ArrayList<String>();

    	public void displayRecognitionError(String[] tokenNames, RecognitionException e){
    		String hdr = getErrorHeader(e);
    		String msg = getErrorMessage(e, tokenNames);
    		int x = hdr.indexOf("line");
    		String line = hdr.substring(x);
    		errors.add(line+" "+msg);
    	}
    	public void addtoList(String str){
    		rules.add(str);
    	}
    	public ArrayList<String> getErrors(){
    		return errors;
    	}
    	public ArrayList<String> getRules(){
    		ArrayList<String> rulez = new ArrayList<String>(rules.size());
    		for (int i=rules.size()-1; i>=0; i--) {
    			rulez.add(rules.get(i));
    		}
    		return rulez;
    	}



    // $ANTLR start "start"
    // compiler/parser/GramaticaParser.g:41:1: start : CLASS PROGRAM LBRACE ( field_decl )* ( method_decl )* RBRACE ;
    public final void start() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:41:10: ( CLASS PROGRAM LBRACE ( field_decl )* ( method_decl )* RBRACE )
            // compiler/parser/GramaticaParser.g:41:12: CLASS PROGRAM LBRACE ( field_decl )* ( method_decl )* RBRACE
            {
            match(input,CLASS,FOLLOW_CLASS_in_start41); 

            match(input,PROGRAM,FOLLOW_PROGRAM_in_start43); 

            match(input,LBRACE,FOLLOW_LBRACE_in_start45); 

            // compiler/parser/GramaticaParser.g:41:33: ( field_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INT) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==INDENTIFIER) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==COMA||LA1_4==LBRAKET||LA1_4==SEMICO) ) {
                            alt1=1;
                        }


                    }


                }
                else if ( (LA1_0==BOOLEAN) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==INDENTIFIER) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==COMA||LA1_4==LBRAKET||LA1_4==SEMICO) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:41:33: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_start47);
            	    field_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // compiler/parser/GramaticaParser.g:41:45: ( method_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BOOLEAN||LA2_0==INT||LA2_0==VOID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:41:45: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_start50);
            	    method_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_start53); 

            addtoList("Start");

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
    // compiler/parser/GramaticaParser.g:43:1: field_decl : type ( id | id LBRAKET int_literal RBRAKET ) ( COMA ( id | id LBRAKET int_literal RBRAKET ) )* SEMICO ;
    public final void field_decl() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:43:13: ( type ( id | id LBRAKET int_literal RBRAKET ) ( COMA ( id | id LBRAKET int_literal RBRAKET ) )* SEMICO )
            // compiler/parser/GramaticaParser.g:43:15: type ( id | id LBRAKET int_literal RBRAKET ) ( COMA ( id | id LBRAKET int_literal RBRAKET ) )* SEMICO
            {
            pushFollow(FOLLOW_type_in_field_decl64);
            type();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:43:20: ( id | id LBRAKET int_literal RBRAKET )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==INDENTIFIER) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==COMA||LA3_1==SEMICO) ) {
                    alt3=1;
                }
                else if ( (LA3_1==LBRAKET) ) {
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
                    // compiler/parser/GramaticaParser.g:43:21: id
                    {
                    pushFollow(FOLLOW_id_in_field_decl67);
                    id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:43:26: id LBRAKET int_literal RBRAKET
                    {
                    pushFollow(FOLLOW_id_in_field_decl71);
                    id();

                    state._fsp--;


                    match(input,LBRAKET,FOLLOW_LBRAKET_in_field_decl73); 

                    pushFollow(FOLLOW_int_literal_in_field_decl75);
                    int_literal();

                    state._fsp--;


                    match(input,RBRAKET,FOLLOW_RBRAKET_in_field_decl77); 

                    }
                    break;

            }


            // compiler/parser/GramaticaParser.g:43:58: ( COMA ( id | id LBRAKET int_literal RBRAKET ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:43:59: COMA ( id | id LBRAKET int_literal RBRAKET )
            	    {
            	    match(input,COMA,FOLLOW_COMA_in_field_decl81); 

            	    // compiler/parser/GramaticaParser.g:43:64: ( id | id LBRAKET int_literal RBRAKET )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==INDENTIFIER) ) {
            	        int LA4_1 = input.LA(2);

            	        if ( (LA4_1==COMA||LA4_1==SEMICO) ) {
            	            alt4=1;
            	        }
            	        else if ( (LA4_1==LBRAKET) ) {
            	            alt4=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 4, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // compiler/parser/GramaticaParser.g:43:65: id
            	            {
            	            pushFollow(FOLLOW_id_in_field_decl84);
            	            id();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // compiler/parser/GramaticaParser.g:43:70: id LBRAKET int_literal RBRAKET
            	            {
            	            pushFollow(FOLLOW_id_in_field_decl88);
            	            id();

            	            state._fsp--;


            	            match(input,LBRAKET,FOLLOW_LBRAKET_in_field_decl90); 

            	            pushFollow(FOLLOW_int_literal_in_field_decl92);
            	            int_literal();

            	            state._fsp--;


            	            match(input,RBRAKET,FOLLOW_RBRAKET_in_field_decl94); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,SEMICO,FOLLOW_SEMICO_in_field_decl99); 

            addtoList("Field Declaration");

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
    // compiler/parser/GramaticaParser.g:45:1: method_decl : ( type | VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block ;
    public final void method_decl() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:45:14: ( ( type | VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block )
            // compiler/parser/GramaticaParser.g:45:16: ( type | VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block
            {
            // compiler/parser/GramaticaParser.g:45:16: ( type | VOID )
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
                    // compiler/parser/GramaticaParser.g:45:17: type
                    {
                    pushFollow(FOLLOW_type_in_method_decl110);
                    type();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:45:24: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_method_decl114); 

                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_method_decl117);
            id();

            state._fsp--;


            match(input,LPAREN,FOLLOW_LPAREN_in_method_decl119); 

            // compiler/parser/GramaticaParser.g:45:40: ( ( type id ) ( COMA type id )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BOOLEAN||LA8_0==INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:45:41: ( type id ) ( COMA type id )*
                    {
                    // compiler/parser/GramaticaParser.g:45:41: ( type id )
                    // compiler/parser/GramaticaParser.g:45:42: type id
                    {
                    pushFollow(FOLLOW_type_in_method_decl123);
                    type();

                    state._fsp--;


                    pushFollow(FOLLOW_id_in_method_decl125);
                    id();

                    state._fsp--;


                    }


                    // compiler/parser/GramaticaParser.g:45:51: ( COMA type id )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // compiler/parser/GramaticaParser.g:45:52: COMA type id
                    	    {
                    	    match(input,COMA,FOLLOW_COMA_in_method_decl129); 

                    	    pushFollow(FOLLOW_type_in_method_decl131);
                    	    type();

                    	    state._fsp--;


                    	    pushFollow(FOLLOW_id_in_method_decl133);
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


            match(input,RPAREN,FOLLOW_RPAREN_in_method_decl140); 

            pushFollow(FOLLOW_block_in_method_decl142);
            block();

            state._fsp--;


            addtoList("Method Declaration");

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
    // compiler/parser/GramaticaParser.g:47:1: block : LBRACE ( var_decl )* ( statement )* RBRACE ;
    public final void block() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:47:9: ( LBRACE ( var_decl )* ( statement )* RBRACE )
            // compiler/parser/GramaticaParser.g:47:11: LBRACE ( var_decl )* ( statement )* RBRACE
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_block153); 

            // compiler/parser/GramaticaParser.g:47:18: ( var_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==BOOLEAN||LA9_0==INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:47:18: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_block155);
            	    var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // compiler/parser/GramaticaParser.g:47:28: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= BREAK && LA10_0 <= CALLOUT)||LA10_0==CONTINUE||LA10_0==FOR||(LA10_0 >= IF && LA10_0 <= INDENTIFIER)||LA10_0==LBRACE||LA10_0==RETURN) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:47:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block158);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_block161); 

            addtoList("Block");

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
    // compiler/parser/GramaticaParser.g:49:1: var_decl : type id ( COMA id )* SEMICO ;
    public final void var_decl() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:49:11: ( type id ( COMA id )* SEMICO )
            // compiler/parser/GramaticaParser.g:49:13: type id ( COMA id )* SEMICO
            {
            pushFollow(FOLLOW_type_in_var_decl171);
            type();

            state._fsp--;


            pushFollow(FOLLOW_id_in_var_decl173);
            id();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:49:21: ( COMA id )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:49:22: COMA id
            	    {
            	    match(input,COMA,FOLLOW_COMA_in_var_decl176); 

            	    pushFollow(FOLLOW_id_in_var_decl178);
            	    id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,SEMICO,FOLLOW_SEMICO_in_var_decl182); 

            addtoList("Variable Declaration");

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
    // compiler/parser/GramaticaParser.g:51:1: type : ( INT | BOOLEAN );
    public final void type() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:51:9: ( INT | BOOLEAN )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==BOOLEAN) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:51:11: INT
                    {
                    match(input,INT,FOLLOW_INT_in_type194); 

                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:51:17: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type198); 

                    addtoList("Type");

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
    // $ANTLR end "type"



    // $ANTLR start "statement"
    // compiler/parser/GramaticaParser.g:53:1: statement : ( location assign_op expr SEMICO | method_call SEMICO | IF LPAREN expr RPAREN block ( ELSE block )? | FOR id ASSIGN expr COMA expr block | RETURN ( expr )? SEMICO | BREAK SEMICO | CONTINUE SEMICO | block );
    public final void statement() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:53:12: ( location assign_op expr SEMICO | method_call SEMICO | IF LPAREN expr RPAREN block ( ELSE block )? | FOR id ASSIGN expr COMA expr block | RETURN ( expr )? SEMICO | BREAK SEMICO | CONTINUE SEMICO | block )
            int alt15=8;
            switch ( input.LA(1) ) {
            case INDENTIFIER:
                {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1 >= ASSIGN && LA15_1 <= ASSIGNSUB)||LA15_1==LBRAKET) ) {
                    alt15=1;
                }
                else if ( (LA15_1==LPAREN) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
                }
                break;
            case CALLOUT:
                {
                alt15=2;
                }
                break;
            case IF:
                {
                alt15=3;
                }
                break;
            case FOR:
                {
                alt15=4;
                }
                break;
            case RETURN:
                {
                alt15=5;
                }
                break;
            case BREAK:
                {
                alt15=6;
                }
                break;
            case CONTINUE:
                {
                alt15=7;
                }
                break;
            case LBRACE:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:53:14: location assign_op expr SEMICO
                    {
                    pushFollow(FOLLOW_location_in_statement209);
                    location();

                    state._fsp--;


                    pushFollow(FOLLOW_assign_op_in_statement211);
                    assign_op();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_statement213);
                    expr();

                    state._fsp--;


                    match(input,SEMICO,FOLLOW_SEMICO_in_statement215); 

                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:54:7: method_call SEMICO
                    {
                    pushFollow(FOLLOW_method_call_in_statement223);
                    method_call();

                    state._fsp--;


                    match(input,SEMICO,FOLLOW_SEMICO_in_statement225); 

                    }
                    break;
                case 3 :
                    // compiler/parser/GramaticaParser.g:55:7: IF LPAREN expr RPAREN block ( ELSE block )?
                    {
                    match(input,IF,FOLLOW_IF_in_statement233); 

                    match(input,LPAREN,FOLLOW_LPAREN_in_statement235); 

                    pushFollow(FOLLOW_expr_in_statement237);
                    expr();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_statement239); 

                    pushFollow(FOLLOW_block_in_statement241);
                    block();

                    state._fsp--;


                    // compiler/parser/GramaticaParser.g:55:35: ( ELSE block )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ELSE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // compiler/parser/GramaticaParser.g:55:36: ELSE block
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_statement244); 

                            pushFollow(FOLLOW_block_in_statement246);
                            block();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // compiler/parser/GramaticaParser.g:56:7: FOR id ASSIGN expr COMA expr block
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement256); 

                    pushFollow(FOLLOW_id_in_statement258);
                    id();

                    state._fsp--;


                    match(input,ASSIGN,FOLLOW_ASSIGN_in_statement260); 

                    pushFollow(FOLLOW_expr_in_statement262);
                    expr();

                    state._fsp--;


                    match(input,COMA,FOLLOW_COMA_in_statement264); 

                    pushFollow(FOLLOW_expr_in_statement266);
                    expr();

                    state._fsp--;


                    pushFollow(FOLLOW_block_in_statement268);
                    block();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // compiler/parser/GramaticaParser.g:57:7: RETURN ( expr )? SEMICO
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement276); 

                    // compiler/parser/GramaticaParser.g:57:14: ( expr )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==CALLOUT||LA14_0==CHR||LA14_0==DIGIT||LA14_0==FALSE||LA14_0==HEX||LA14_0==INDENTIFIER||LA14_0==LPAREN||LA14_0==MINUS||LA14_0==NOT||LA14_0==TRUE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // compiler/parser/GramaticaParser.g:57:15: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement279);
                            expr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,SEMICO,FOLLOW_SEMICO_in_statement283); 

                    }
                    break;
                case 6 :
                    // compiler/parser/GramaticaParser.g:58:7: BREAK SEMICO
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement291); 

                    match(input,SEMICO,FOLLOW_SEMICO_in_statement293); 

                    }
                    break;
                case 7 :
                    // compiler/parser/GramaticaParser.g:59:7: CONTINUE SEMICO
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement301); 

                    match(input,SEMICO,FOLLOW_SEMICO_in_statement303); 

                    }
                    break;
                case 8 :
                    // compiler/parser/GramaticaParser.g:60:7: block
                    {
                    pushFollow(FOLLOW_block_in_statement311);
                    block();

                    state._fsp--;


                    addtoList("Statement");

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
    // compiler/parser/GramaticaParser.g:62:1: assign_op : ( ASSIGN | ASSIGNADD | ASSIGNSUB );
    public final void assign_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:62:12: ( ASSIGN | ASSIGNADD | ASSIGNSUB )
            int alt16=3;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt16=1;
                }
                break;
            case ASSIGNADD:
                {
                alt16=2;
                }
                break;
            case ASSIGNSUB:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:62:14: ASSIGN
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_op322); 

                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:63:7: ASSIGNADD
                    {
                    match(input,ASSIGNADD,FOLLOW_ASSIGNADD_in_assign_op331); 

                    }
                    break;
                case 3 :
                    // compiler/parser/GramaticaParser.g:64:7: ASSIGNSUB
                    {
                    match(input,ASSIGNSUB,FOLLOW_ASSIGNSUB_in_assign_op339); 

                    addtoList("Assign Operator");

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
    // $ANTLR end "assign_op"



    // $ANTLR start "method_call"
    // compiler/parser/GramaticaParser.g:66:1: method_call : ( method_name LPAREN ( expr ( COMA expr )* )? RPAREN | CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN );
    public final void method_call() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:66:14: ( method_name LPAREN ( expr ( COMA expr )* )? RPAREN | CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==INDENTIFIER) ) {
                alt21=1;
            }
            else if ( (LA21_0==CALLOUT) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:66:16: method_name LPAREN ( expr ( COMA expr )* )? RPAREN
                    {
                    pushFollow(FOLLOW_method_name_in_method_call350);
                    method_name();

                    state._fsp--;


                    match(input,LPAREN,FOLLOW_LPAREN_in_method_call352); 

                    // compiler/parser/GramaticaParser.g:66:35: ( expr ( COMA expr )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==CALLOUT||LA18_0==CHR||LA18_0==DIGIT||LA18_0==FALSE||LA18_0==HEX||LA18_0==INDENTIFIER||LA18_0==LPAREN||LA18_0==MINUS||LA18_0==NOT||LA18_0==TRUE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // compiler/parser/GramaticaParser.g:66:36: expr ( COMA expr )*
                            {
                            pushFollow(FOLLOW_expr_in_method_call355);
                            expr();

                            state._fsp--;


                            // compiler/parser/GramaticaParser.g:66:40: ( COMA expr )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==COMA) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // compiler/parser/GramaticaParser.g:66:41: COMA expr
                            	    {
                            	    match(input,COMA,FOLLOW_COMA_in_method_call357); 

                            	    pushFollow(FOLLOW_expr_in_method_call359);
                            	    expr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_method_call365); 

                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:67:7: CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN
                    {
                    match(input,CALLOUT,FOLLOW_CALLOUT_in_method_call373); 

                    match(input,LPAREN,FOLLOW_LPAREN_in_method_call375); 

                    pushFollow(FOLLOW_string_literal_in_method_call377);
                    string_literal();

                    state._fsp--;


                    // compiler/parser/GramaticaParser.g:67:37: ( ( COMA callout_arg )+ )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==COMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // compiler/parser/GramaticaParser.g:67:38: ( COMA callout_arg )+
                            {
                            // compiler/parser/GramaticaParser.g:67:38: ( COMA callout_arg )+
                            int cnt19=0;
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==COMA) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // compiler/parser/GramaticaParser.g:67:39: COMA callout_arg
                            	    {
                            	    match(input,COMA,FOLLOW_COMA_in_method_call381); 

                            	    pushFollow(FOLLOW_callout_arg_in_method_call383);
                            	    callout_arg();

                            	    state._fsp--;


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


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_method_call389); 

                    addtoList("Method Call");

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
    // compiler/parser/GramaticaParser.g:69:1: method_name : id ;
    public final void method_name() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:69:14: ( id )
            // compiler/parser/GramaticaParser.g:69:16: id
            {
            pushFollow(FOLLOW_id_in_method_name400);
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
    // compiler/parser/GramaticaParser.g:71:1: location : ( id | id LBRAKET expr RBRAKET );
    public final void location() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:71:11: ( id | id LBRAKET expr RBRAKET )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==INDENTIFIER) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==ADD||LA22_1==AND||(LA22_1 >= ASSIGN && LA22_1 <= ASSIGNSUB)||LA22_1==COMA||LA22_1==DIV||LA22_1==EQUAL||(LA22_1 >= GREATHAN && LA22_1 <= GTOEQ)||LA22_1==LBRACE||LA22_1==LESSTHAN||(LA22_1 >= LTOEQ && LA22_1 <= MINUS)||(LA22_1 >= MOD && LA22_1 <= NEQUAL)||LA22_1==OR||LA22_1==RBRAKET||(LA22_1 >= RPAREN && LA22_1 <= SEMICO)) ) {
                    alt22=1;
                }
                else if ( (LA22_1==LBRAKET) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:71:13: id
                    {
                    pushFollow(FOLLOW_id_in_location409);
                    id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:72:7: id LBRAKET expr RBRAKET
                    {
                    pushFollow(FOLLOW_id_in_location417);
                    id();

                    state._fsp--;


                    match(input,LBRAKET,FOLLOW_LBRAKET_in_location419); 

                    pushFollow(FOLLOW_expr_in_location421);
                    expr();

                    state._fsp--;


                    match(input,RBRAKET,FOLLOW_RBRAKET_in_location423); 

                    addtoList("Location");

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
    // compiler/parser/GramaticaParser.g:74:1: expr : l= expr_and ( OR r= expr_and )* ;
    public final void expr() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:74:9: (l= expr_and ( OR r= expr_and )* )
            // compiler/parser/GramaticaParser.g:74:11: l= expr_and ( OR r= expr_and )*
            {
            pushFollow(FOLLOW_expr_and_in_expr440);
            expr_and();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:74:24: ( OR r= expr_and )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:74:25: OR r= expr_and
            	    {
            	    match(input,OR,FOLLOW_OR_in_expr443); 

            	    pushFollow(FOLLOW_expr_and_in_expr449);
            	    expr_and();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "expr"



    // $ANTLR start "expr_and"
    // compiler/parser/GramaticaParser.g:75:1: expr_and : l= expr_eq ( AND r= expr_eq )* ;
    public final void expr_and() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:75:11: (l= expr_eq ( AND r= expr_eq )* )
            // compiler/parser/GramaticaParser.g:75:13: l= expr_eq ( AND r= expr_eq )*
            {
            pushFollow(FOLLOW_expr_eq_in_expr_and463);
            expr_eq();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:75:26: ( AND r= expr_eq )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:75:27: AND r= expr_eq
            	    {
            	    match(input,AND,FOLLOW_AND_in_expr_and467); 

            	    pushFollow(FOLLOW_expr_eq_in_expr_and473);
            	    expr_eq();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "expr_and"



    // $ANTLR start "expr_eq"
    // compiler/parser/GramaticaParser.g:76:1: expr_eq : l= expr_rel ( eq_op r= expr_rel )* ;
    public final void expr_eq() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:76:11: (l= expr_rel ( eq_op r= expr_rel )* )
            // compiler/parser/GramaticaParser.g:76:13: l= expr_rel ( eq_op r= expr_rel )*
            {
            pushFollow(FOLLOW_expr_rel_in_expr_eq488);
            expr_rel();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:76:27: ( eq_op r= expr_rel )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EQUAL||LA25_0==NEQUAL) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:76:28: eq_op r= expr_rel
            	    {
            	    pushFollow(FOLLOW_eq_op_in_expr_eq492);
            	    eq_op();

            	    state._fsp--;


            	    pushFollow(FOLLOW_expr_rel_in_expr_eq498);
            	    expr_rel();

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
    // $ANTLR end "expr_eq"



    // $ANTLR start "expr_rel"
    // compiler/parser/GramaticaParser.g:77:1: expr_rel : l= expr_add ( rel_op r= expr_add )* ;
    public final void expr_rel() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:77:11: (l= expr_add ( rel_op r= expr_add )* )
            // compiler/parser/GramaticaParser.g:77:13: l= expr_add ( rel_op r= expr_add )*
            {
            pushFollow(FOLLOW_expr_add_in_expr_rel512);
            expr_add();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:77:27: ( rel_op r= expr_add )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= GREATHAN && LA26_0 <= GTOEQ)||LA26_0==LESSTHAN||LA26_0==LTOEQ) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:77:28: rel_op r= expr_add
            	    {
            	    pushFollow(FOLLOW_rel_op_in_expr_rel516);
            	    rel_op();

            	    state._fsp--;


            	    pushFollow(FOLLOW_expr_add_in_expr_rel522);
            	    expr_add();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "expr_rel"



    // $ANTLR start "expr_add"
    // compiler/parser/GramaticaParser.g:78:1: expr_add : l= expr_arith ( sumsub_op r= expr_arith )* ;
    public final void expr_add() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:78:11: (l= expr_arith ( sumsub_op r= expr_arith )* )
            // compiler/parser/GramaticaParser.g:78:13: l= expr_arith ( sumsub_op r= expr_arith )*
            {
            pushFollow(FOLLOW_expr_arith_in_expr_add536);
            expr_arith();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:78:29: ( sumsub_op r= expr_arith )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ADD||LA27_0==MINUS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:78:30: sumsub_op r= expr_arith
            	    {
            	    pushFollow(FOLLOW_sumsub_op_in_expr_add540);
            	    sumsub_op();

            	    state._fsp--;


            	    pushFollow(FOLLOW_expr_arith_in_expr_add546);
            	    expr_arith();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "expr_add"



    // $ANTLR start "expr_arith"
    // compiler/parser/GramaticaParser.g:79:1: expr_arith : l= expr_factor ( arith_op r= expr_factor )* ;
    public final void expr_arith() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:79:13: (l= expr_factor ( arith_op r= expr_factor )* )
            // compiler/parser/GramaticaParser.g:79:15: l= expr_factor ( arith_op r= expr_factor )*
            {
            pushFollow(FOLLOW_expr_factor_in_expr_arith560);
            expr_factor();

            state._fsp--;


            // compiler/parser/GramaticaParser.g:79:32: ( arith_op r= expr_factor )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==DIV||(LA28_0 >= MOD && LA28_0 <= MULT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // compiler/parser/GramaticaParser.g:79:33: arith_op r= expr_factor
            	    {
            	    pushFollow(FOLLOW_arith_op_in_expr_arith564);
            	    arith_op();

            	    state._fsp--;


            	    pushFollow(FOLLOW_expr_factor_in_expr_arith570);
            	    expr_factor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "expr_arith"



    // $ANTLR start "expr_factor"
    // compiler/parser/GramaticaParser.g:81:1: expr_factor : ( location | method_call | literal | MINUS expr | NOT expr | LPAREN expr RPAREN );
    public final void expr_factor() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:81:14: ( location | method_call | literal | MINUS expr | NOT expr | LPAREN expr RPAREN )
            int alt29=6;
            switch ( input.LA(1) ) {
            case INDENTIFIER:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==ADD||LA29_1==AND||LA29_1==COMA||LA29_1==DIV||LA29_1==EQUAL||(LA29_1 >= GREATHAN && LA29_1 <= GTOEQ)||(LA29_1 >= LBRACE && LA29_1 <= LESSTHAN)||(LA29_1 >= LTOEQ && LA29_1 <= MINUS)||(LA29_1 >= MOD && LA29_1 <= NEQUAL)||LA29_1==OR||LA29_1==RBRAKET||(LA29_1 >= RPAREN && LA29_1 <= SEMICO)) ) {
                    alt29=1;
                }
                else if ( (LA29_1==LPAREN) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
                }
                break;
            case CALLOUT:
                {
                alt29=2;
                }
                break;
            case CHR:
            case DIGIT:
            case FALSE:
            case HEX:
            case TRUE:
                {
                alt29=3;
                }
                break;
            case MINUS:
                {
                alt29=4;
                }
                break;
            case NOT:
                {
                alt29=5;
                }
                break;
            case LPAREN:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:81:16: location
                    {
                    pushFollow(FOLLOW_location_in_expr_factor581);
                    location();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:82:7: method_call
                    {
                    pushFollow(FOLLOW_method_call_in_expr_factor589);
                    method_call();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // compiler/parser/GramaticaParser.g:83:7: literal
                    {
                    pushFollow(FOLLOW_literal_in_expr_factor597);
                    literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // compiler/parser/GramaticaParser.g:84:7: MINUS expr
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr_factor605); 

                    pushFollow(FOLLOW_expr_in_expr_factor607);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // compiler/parser/GramaticaParser.g:85:7: NOT expr
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr_factor615); 

                    pushFollow(FOLLOW_expr_in_expr_factor617);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // compiler/parser/GramaticaParser.g:86:7: LPAREN expr RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_expr_factor625); 

                    pushFollow(FOLLOW_expr_in_expr_factor627);
                    expr();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_expr_factor629); 

                    addtoList("Expression");

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
    // compiler/parser/GramaticaParser.g:88:1: callout_arg : ( expr | string_literal );
    public final void callout_arg() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:88:14: ( expr | string_literal )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CALLOUT||LA30_0==CHR||LA30_0==DIGIT||LA30_0==FALSE||LA30_0==HEX||LA30_0==INDENTIFIER||LA30_0==LPAREN||LA30_0==MINUS||LA30_0==NOT||LA30_0==TRUE) ) {
                alt30=1;
            }
            else if ( (LA30_0==STR) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:88:16: expr
                    {
                    pushFollow(FOLLOW_expr_in_callout_arg640);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:88:23: string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_callout_arg644);
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
    // compiler/parser/GramaticaParser.g:90:1: bin_op : ( arith_op | rel_op | eq_op | cond_op );
    public final void bin_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:90:10: ( arith_op | rel_op | eq_op | cond_op )
            int alt31=4;
            switch ( input.LA(1) ) {
            case DIV:
            case MOD:
            case MULT:
                {
                alt31=1;
                }
                break;
            case GREATHAN:
            case GTOEQ:
            case LESSTHAN:
            case LTOEQ:
                {
                alt31=2;
                }
                break;
            case EQUAL:
            case NEQUAL:
                {
                alt31=3;
                }
                break;
            case AND:
            case OR:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:90:12: arith_op
                    {
                    pushFollow(FOLLOW_arith_op_in_bin_op654);
                    arith_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:90:23: rel_op
                    {
                    pushFollow(FOLLOW_rel_op_in_bin_op658);
                    rel_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // compiler/parser/GramaticaParser.g:90:32: eq_op
                    {
                    pushFollow(FOLLOW_eq_op_in_bin_op662);
                    eq_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // compiler/parser/GramaticaParser.g:90:40: cond_op
                    {
                    pushFollow(FOLLOW_cond_op_in_bin_op666);
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
    // compiler/parser/GramaticaParser.g:91:1: arith_op : ( MULT | DIV | MOD );
    public final void arith_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:91:12: ( MULT | DIV | MOD )
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
    // compiler/parser/GramaticaParser.g:92:1: sumsub_op : ( ADD | MINUS );
    public final void sumsub_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:92:12: ( ADD | MINUS )
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
    // compiler/parser/GramaticaParser.g:93:1: rel_op : ( LESSTHAN | GREATHAN | LTOEQ | GTOEQ );
    public final void rel_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:93:10: ( LESSTHAN | GREATHAN | LTOEQ | GTOEQ )
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
    // compiler/parser/GramaticaParser.g:94:1: eq_op : ( EQUAL | NEQUAL );
    public final void eq_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:94:9: ( EQUAL | NEQUAL )
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
    // compiler/parser/GramaticaParser.g:95:1: cond_op : ( AND | OR );
    public final void cond_op() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:95:11: ( AND | OR )
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
    // compiler/parser/GramaticaParser.g:97:1: literal : ( int_literal | char_literal | bool_literal );
    public final void literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:97:11: ( int_literal | char_literal | bool_literal )
            int alt32=3;
            switch ( input.LA(1) ) {
            case DIGIT:
            case HEX:
                {
                alt32=1;
                }
                break;
            case CHR:
                {
                alt32=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // compiler/parser/GramaticaParser.g:97:13: int_literal
                    {
                    pushFollow(FOLLOW_int_literal_in_literal752);
                    int_literal();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // compiler/parser/GramaticaParser.g:97:27: char_literal
                    {
                    pushFollow(FOLLOW_char_literal_in_literal756);
                    char_literal();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // compiler/parser/GramaticaParser.g:97:42: bool_literal
                    {
                    pushFollow(FOLLOW_bool_literal_in_literal760);
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
    // compiler/parser/GramaticaParser.g:99:1: id : INDENTIFIER ;
    public final void id() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:99:8: ( INDENTIFIER )
            // compiler/parser/GramaticaParser.g:99:10: INDENTIFIER
            {
            match(input,INDENTIFIER,FOLLOW_INDENTIFIER_in_id772); 

            addtoList("Indentifier");

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
    // compiler/parser/GramaticaParser.g:101:1: alpha_num : ( CHAR | UNDERSCORE | NUM );
    public final void alpha_num() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:101:12: ( CHAR | UNDERSCORE | NUM )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==CHAR||input.LA(1)==NUM||input.LA(1)==UNDERSCORE ) {
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
    // $ANTLR end "alpha_num"



    // $ANTLR start "hex_digit"
    // compiler/parser/GramaticaParser.g:103:1: hex_digit : ( NUM | HEXCHAR );
    public final void hex_digit() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:103:13: ( NUM | HEXCHAR )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==HEXCHAR||input.LA(1)==NUM ) {
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
    // $ANTLR end "hex_digit"



    // $ANTLR start "int_literal"
    // compiler/parser/GramaticaParser.g:105:1: int_literal : ( DIGIT | HEX );
    public final void int_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:105:14: ( DIGIT | HEX )
            // compiler/parser/GramaticaParser.g:
            {
            if ( input.LA(1)==DIGIT||input.LA(1)==HEX ) {
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
    // $ANTLR end "int_literal"



    // $ANTLR start "bool_literal"
    // compiler/parser/GramaticaParser.g:107:1: bool_literal : ( TRUE | FALSE );
    public final void bool_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:107:17: ( TRUE | FALSE )
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
    // compiler/parser/GramaticaParser.g:109:1: char_literal : CHR ;
    public final void char_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:109:14: ( CHR )
            // compiler/parser/GramaticaParser.g:109:16: CHR
            {
            match(input,CHR,FOLLOW_CHR_in_char_literal841); 

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
    // compiler/parser/GramaticaParser.g:111:1: string_literal : STR ;
    public final void string_literal() throws RecognitionException {
        try {
            // compiler/parser/GramaticaParser.g:111:17: ( STR )
            // compiler/parser/GramaticaParser.g:111:19: STR
            {
            match(input,STR,FOLLOW_STR_in_string_literal850); 

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


 

    public static final BitSet FOLLOW_CLASS_in_start41 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_PROGRAM_in_start43 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_start45 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004004L});
    public static final BitSet FOLLOW_field_decl_in_start47 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004004L});
    public static final BitSet FOLLOW_method_decl_in_start50 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004004L});
    public static final BitSet FOLLOW_RBRACE_in_start53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_field_decl64 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_field_decl67 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_id_in_field_decl71 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRAKET_in_field_decl73 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_int_literal_in_field_decl75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRAKET_in_field_decl77 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMA_in_field_decl81 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_field_decl84 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_id_in_field_decl88 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRAKET_in_field_decl90 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_int_literal_in_field_decl92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRAKET_in_field_decl94 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_field_decl99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_method_decl110 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_VOID_in_method_decl114 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl117 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_decl119 = new BitSet(new long[]{0x0000001000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_method_decl123 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl125 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_decl129 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_type_in_method_decl131 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl133 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_decl140 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_method_decl142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block153 = new BitSet(new long[]{0x0000003C2020E000L,0x0000000000000014L});
    public static final BitSet FOLLOW_var_decl_in_block155 = new BitSet(new long[]{0x0000003C2020E000L,0x0000000000000014L});
    public static final BitSet FOLLOW_statement_in_block158 = new BitSet(new long[]{0x0000002C2020C000L,0x0000000000000014L});
    public static final BitSet FOLLOW_RBRACE_in_block161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var_decl171 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_var_decl173 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMA_in_var_decl176 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_var_decl178 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_var_decl182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_location_in_statement209 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_assign_op_in_statement211 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_call_in_statement223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement233 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement235 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_statement239 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_statement241 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ELSE_in_statement244 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_statement246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement256 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_statement258 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ASSIGN_in_statement260 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement262 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COMA_in_statement264 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement266 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_statement268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement276 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000140L});
    public static final BitSet FOLLOW_expr_in_statement279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_op322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNADD_in_assign_op331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNSUB_in_assign_op339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_name_in_method_call350 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_call352 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_method_call355 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_call357 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_method_call359 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_call365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALLOUT_in_method_call373 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_call375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_string_literal_in_method_call377 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_call381 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000180L});
    public static final BitSet FOLLOW_callout_arg_in_method_call383 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_call389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_method_name400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_location409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_location417 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRAKET_in_location419 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_location421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRAKET_in_location423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_and_in_expr440 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr443 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_and_in_expr449 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_expr_eq_in_expr_and463 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_expr_and467 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_eq_in_expr_and473 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_expr_rel_in_expr_eq488 = new BitSet(new long[]{0x0000400004000002L});
    public static final BitSet FOLLOW_eq_op_in_expr_eq492 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_rel_in_expr_eq498 = new BitSet(new long[]{0x0000400004000002L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel512 = new BitSet(new long[]{0x00000280C0000002L});
    public static final BitSet FOLLOW_rel_op_in_expr_rel516 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel522 = new BitSet(new long[]{0x00000280C0000002L});
    public static final BitSet FOLLOW_expr_arith_in_expr_add536 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_sumsub_op_in_expr_add540 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_arith_in_expr_add546 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_expr_factor_in_expr_arith560 = new BitSet(new long[]{0x0000300000800002L});
    public static final BitSet FOLLOW_arith_op_in_expr_arith564 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_factor_in_expr_arith570 = new BitSet(new long[]{0x0000300000800002L});
    public static final BitSet FOLLOW_location_in_expr_factor581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_call_in_expr_factor589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_expr_factor597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_factor605 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_expr_factor607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_expr_factor615 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_expr_factor617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_expr_factor625 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_expr_factor627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_expr_factor629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_callout_arg640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_callout_arg644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_op_in_bin_op654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_op_in_bin_op658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eq_op_in_bin_op662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_op_in_bin_op666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_literal_in_literal752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_literal_in_literal756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_literal_in_literal760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENTIFIER_in_id772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHR_in_char_literal841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_string_literal850 = new BitSet(new long[]{0x0000000000000002L});

}