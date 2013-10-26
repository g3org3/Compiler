// $ANTLR 3.4 compiler/ast/GramaticaAst.g 2013-10-26 16:15:18

	package compiler.ast;
	import compiler.scanner.*;
	import java.util.ArrayList;
	import org.antlr.runtime.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class GramaticaAst extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ADD1", "ALPHA", "AND", "ANDBITWISE", "ASCII", "ASSIGN", "ASSIGNADD", "ASSIGNSUB", "BOOLEAN", "BREAK", "CALLOUT", "CHAR", "CHR", "CLASS", "COMA", "COMMENTS", "CONTINUE", "DIGIT", "DIV", "DPOINTS", "ELSE", "EQUAL", "ESC", "FALSE", "FOR", "GREATHAN", "GTOEQ", "HEX", "HEXCHAR", "IF", "INDENTIFIER", "INT", "LBRACE", "LBRAKET", "LESSTHAN", "LPAREN", "LTOEQ", "MINUS", "MINUS1", "MOD", "MULT", "NEQUAL", "NOT", "NOTCHAR1", "NOTCHAR2", "NOTCHAR3", "NOTCHAR4", "NOTCHAR5", "NOTCHAR6", "NOTHEX1", "NOTHEX2", "NOTSTR1", "NOTSTR2", "NOTSTR3", "NUM", "OR", "ORBITWISE", "POINT", "PROGRAM", "QMARK", "RAISE", "RBRACE", "RBRAKET", "RETURN", "RPAREN", "SEMICO", "STR", "TRUE", "UCASE", "UNDERSCORE", "UNICODE1", "UNICODE2", "UNICODE3", "VOID", "WHITESPACE", "ARRAY", "BLOCK", "CALL", "EX", "FIELD", "METHOD", "PRINTF", "ROOT", "STATEMENT", "VARS"
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
    public static final int ARRAY=80;
    public static final int BLOCK=81;
    public static final int CALL=82;
    public static final int EX=83;
    public static final int FIELD=84;
    public static final int METHOD=85;
    public static final int PRINTF=86;
    public static final int ROOT=87;
    public static final int STATEMENT=88;
    public static final int VARS=89;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public GramaticaAst(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GramaticaAst(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return GramaticaAst.tokenNames; }
    public String getGrammarFileName() { return "compiler/ast/GramaticaAst.g"; }


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


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // compiler/ast/GramaticaAst.g:55:1: start : CLASS PROGRAM LBRACE ( field_decl )* ( method_decl )* RBRACE -> ^( ROOT ( field_decl )* ( method_decl )* ) ;
    public final GramaticaAst.start_return start() throws RecognitionException {
        GramaticaAst.start_return retval = new GramaticaAst.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS1=null;
        Token PROGRAM2=null;
        Token LBRACE3=null;
        Token RBRACE6=null;
        GramaticaAst.field_decl_return field_decl4 =null;

        GramaticaAst.method_decl_return method_decl5 =null;


        Object CLASS1_tree=null;
        Object PROGRAM2_tree=null;
        Object LBRACE3_tree=null;
        Object RBRACE6_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_PROGRAM=new RewriteRuleTokenStream(adaptor,"token PROGRAM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_field_decl=new RewriteRuleSubtreeStream(adaptor,"rule field_decl");
        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        try {
            // compiler/ast/GramaticaAst.g:55:10: ( CLASS PROGRAM LBRACE ( field_decl )* ( method_decl )* RBRACE -> ^( ROOT ( field_decl )* ( method_decl )* ) )
            // compiler/ast/GramaticaAst.g:55:12: CLASS PROGRAM LBRACE ( field_decl )* ( method_decl )* RBRACE
            {
            CLASS1=(Token)match(input,CLASS,FOLLOW_CLASS_in_start92);  
            stream_CLASS.add(CLASS1);


            PROGRAM2=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_start94);  
            stream_PROGRAM.add(PROGRAM2);


            LBRACE3=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_start96);  
            stream_LBRACE.add(LBRACE3);


            // compiler/ast/GramaticaAst.g:55:33: ( field_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOLEAN||LA1_0==INT) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==INDENTIFIER) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==COMA||LA1_3==LBRAKET||LA1_3==SEMICO) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:55:33: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_start98);
            	    field_decl4=field_decl();

            	    state._fsp--;

            	    stream_field_decl.add(field_decl4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // compiler/ast/GramaticaAst.g:55:45: ( method_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BOOLEAN||LA2_0==INT||LA2_0==VOID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:55:45: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_start101);
            	    method_decl5=method_decl();

            	    state._fsp--;

            	    stream_method_decl.add(method_decl5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            RBRACE6=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_start104);  
            stream_RBRACE.add(RBRACE6);


            // AST REWRITE
            // elements: field_decl, method_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:6: -> ^( ROOT ( field_decl )* ( method_decl )* )
            {
                // compiler/ast/GramaticaAst.g:56:9: ^( ROOT ( field_decl )* ( method_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ROOT, "ROOT")
                , root_1);

                // compiler/ast/GramaticaAst.g:56:16: ( field_decl )*
                while ( stream_field_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_decl.nextTree());

                }
                stream_field_decl.reset();

                // compiler/ast/GramaticaAst.g:56:28: ( method_decl )*
                while ( stream_method_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_decl.nextTree());

                }
                stream_method_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class field_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_decl"
    // compiler/ast/GramaticaAst.g:58:1: field_decl : type ( id | id LBRAKET int_literal RBRAKET ) ( COMA ( id | id LBRAKET int_literal RBRAKET ) )* SEMICO -> ^( FIELD type ( id ( int_literal )? )+ ) ;
    public final GramaticaAst.field_decl_return field_decl() throws RecognitionException {
        GramaticaAst.field_decl_return retval = new GramaticaAst.field_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRAKET10=null;
        Token RBRAKET12=null;
        Token COMA13=null;
        Token LBRAKET16=null;
        Token RBRAKET18=null;
        Token SEMICO19=null;
        GramaticaAst.type_return type7 =null;

        GramaticaAst.id_return id8 =null;

        GramaticaAst.id_return id9 =null;

        GramaticaAst.int_literal_return int_literal11 =null;

        GramaticaAst.id_return id14 =null;

        GramaticaAst.id_return id15 =null;

        GramaticaAst.int_literal_return int_literal17 =null;


        Object LBRAKET10_tree=null;
        Object RBRAKET12_tree=null;
        Object COMA13_tree=null;
        Object LBRAKET16_tree=null;
        Object RBRAKET18_tree=null;
        Object SEMICO19_tree=null;
        RewriteRuleTokenStream stream_RBRAKET=new RewriteRuleTokenStream(adaptor,"token RBRAKET");
        RewriteRuleTokenStream stream_LBRAKET=new RewriteRuleTokenStream(adaptor,"token LBRAKET");
        RewriteRuleTokenStream stream_SEMICO=new RewriteRuleTokenStream(adaptor,"token SEMICO");
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_int_literal=new RewriteRuleSubtreeStream(adaptor,"rule int_literal");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // compiler/ast/GramaticaAst.g:58:13: ( type ( id | id LBRAKET int_literal RBRAKET ) ( COMA ( id | id LBRAKET int_literal RBRAKET ) )* SEMICO -> ^( FIELD type ( id ( int_literal )? )+ ) )
            // compiler/ast/GramaticaAst.g:58:15: type ( id | id LBRAKET int_literal RBRAKET ) ( COMA ( id | id LBRAKET int_literal RBRAKET ) )* SEMICO
            {
            pushFollow(FOLLOW_type_in_field_decl132);
            type7=type();

            state._fsp--;

            stream_type.add(type7.getTree());

            // compiler/ast/GramaticaAst.g:58:20: ( id | id LBRAKET int_literal RBRAKET )
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
                    // compiler/ast/GramaticaAst.g:58:21: id
                    {
                    pushFollow(FOLLOW_id_in_field_decl135);
                    id8=id();

                    state._fsp--;

                    stream_id.add(id8.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:58:26: id LBRAKET int_literal RBRAKET
                    {
                    pushFollow(FOLLOW_id_in_field_decl139);
                    id9=id();

                    state._fsp--;

                    stream_id.add(id9.getTree());

                    LBRAKET10=(Token)match(input,LBRAKET,FOLLOW_LBRAKET_in_field_decl141);  
                    stream_LBRAKET.add(LBRAKET10);


                    pushFollow(FOLLOW_int_literal_in_field_decl143);
                    int_literal11=int_literal();

                    state._fsp--;

                    stream_int_literal.add(int_literal11.getTree());

                    RBRAKET12=(Token)match(input,RBRAKET,FOLLOW_RBRAKET_in_field_decl145);  
                    stream_RBRAKET.add(RBRAKET12);


                    }
                    break;

            }


            // compiler/ast/GramaticaAst.g:58:58: ( COMA ( id | id LBRAKET int_literal RBRAKET ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:58:59: COMA ( id | id LBRAKET int_literal RBRAKET )
            	    {
            	    COMA13=(Token)match(input,COMA,FOLLOW_COMA_in_field_decl149);  
            	    stream_COMA.add(COMA13);


            	    // compiler/ast/GramaticaAst.g:58:64: ( id | id LBRAKET int_literal RBRAKET )
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
            	            // compiler/ast/GramaticaAst.g:58:65: id
            	            {
            	            pushFollow(FOLLOW_id_in_field_decl152);
            	            id14=id();

            	            state._fsp--;

            	            stream_id.add(id14.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // compiler/ast/GramaticaAst.g:58:70: id LBRAKET int_literal RBRAKET
            	            {
            	            pushFollow(FOLLOW_id_in_field_decl156);
            	            id15=id();

            	            state._fsp--;

            	            stream_id.add(id15.getTree());

            	            LBRAKET16=(Token)match(input,LBRAKET,FOLLOW_LBRAKET_in_field_decl158);  
            	            stream_LBRAKET.add(LBRAKET16);


            	            pushFollow(FOLLOW_int_literal_in_field_decl160);
            	            int_literal17=int_literal();

            	            state._fsp--;

            	            stream_int_literal.add(int_literal17.getTree());

            	            RBRAKET18=(Token)match(input,RBRAKET,FOLLOW_RBRAKET_in_field_decl162);  
            	            stream_RBRAKET.add(RBRAKET18);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            SEMICO19=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_field_decl167);  
            stream_SEMICO.add(SEMICO19);


            // AST REWRITE
            // elements: id, int_literal, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:6: -> ^( FIELD type ( id ( int_literal )? )+ )
            {
                // compiler/ast/GramaticaAst.g:59:9: ^( FIELD type ( id ( int_literal )? )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD, "FIELD")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                if ( !(stream_id.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());

                    // compiler/ast/GramaticaAst.g:59:26: ( int_literal )?
                    if ( stream_int_literal.hasNext() ) {
                        adaptor.addChild(root_1, stream_int_literal.nextTree());

                    }
                    stream_int_literal.reset();

                }
                stream_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_decl"


    public static class method_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_decl"
    // compiler/ast/GramaticaAst.g:61:1: method_decl : ( ( ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD VOID id ( type id )* block ) ) | ( ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD type id ( type id )* block ) ) );
    public final GramaticaAst.method_decl_return method_decl() throws RecognitionException {
        GramaticaAst.method_decl_return retval = new GramaticaAst.method_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID20=null;
        Token LPAREN22=null;
        Token COMA25=null;
        Token RPAREN28=null;
        Token LPAREN32=null;
        Token COMA35=null;
        Token RPAREN38=null;
        GramaticaAst.id_return id21 =null;

        GramaticaAst.type_return type23 =null;

        GramaticaAst.id_return id24 =null;

        GramaticaAst.type_return type26 =null;

        GramaticaAst.id_return id27 =null;

        GramaticaAst.block_return block29 =null;

        GramaticaAst.type_return type30 =null;

        GramaticaAst.id_return id31 =null;

        GramaticaAst.type_return type33 =null;

        GramaticaAst.id_return id34 =null;

        GramaticaAst.type_return type36 =null;

        GramaticaAst.id_return id37 =null;

        GramaticaAst.block_return block39 =null;


        Object VOID20_tree=null;
        Object LPAREN22_tree=null;
        Object COMA25_tree=null;
        Object RPAREN28_tree=null;
        Object LPAREN32_tree=null;
        Object COMA35_tree=null;
        Object RPAREN38_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // compiler/ast/GramaticaAst.g:61:14: ( ( ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD VOID id ( type id )* block ) ) | ( ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD type id ( type id )* block ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==VOID) ) {
                alt10=1;
            }
            else if ( (LA10_0==BOOLEAN||LA10_0==INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // compiler/ast/GramaticaAst.g:61:16: ( ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD VOID id ( type id )* block ) )
                    {
                    // compiler/ast/GramaticaAst.g:61:16: ( ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD VOID id ( type id )* block ) )
                    // compiler/ast/GramaticaAst.g:61:17: ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block
                    {
                    // compiler/ast/GramaticaAst.g:61:17: ( VOID )
                    // compiler/ast/GramaticaAst.g:61:18: VOID
                    {
                    VOID20=(Token)match(input,VOID,FOLLOW_VOID_in_method_decl202);  
                    stream_VOID.add(VOID20);


                    }


                    pushFollow(FOLLOW_id_in_method_decl205);
                    id21=id();

                    state._fsp--;

                    stream_id.add(id21.getTree());

                    LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_method_decl207);  
                    stream_LPAREN.add(LPAREN22);


                    // compiler/ast/GramaticaAst.g:61:34: ( ( type id ) ( COMA type id )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==BOOLEAN||LA7_0==INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:61:35: ( type id ) ( COMA type id )*
                            {
                            // compiler/ast/GramaticaAst.g:61:35: ( type id )
                            // compiler/ast/GramaticaAst.g:61:36: type id
                            {
                            pushFollow(FOLLOW_type_in_method_decl211);
                            type23=type();

                            state._fsp--;

                            stream_type.add(type23.getTree());

                            pushFollow(FOLLOW_id_in_method_decl213);
                            id24=id();

                            state._fsp--;

                            stream_id.add(id24.getTree());

                            }


                            // compiler/ast/GramaticaAst.g:61:45: ( COMA type id )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==COMA) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // compiler/ast/GramaticaAst.g:61:46: COMA type id
                            	    {
                            	    COMA25=(Token)match(input,COMA,FOLLOW_COMA_in_method_decl217);  
                            	    stream_COMA.add(COMA25);


                            	    pushFollow(FOLLOW_type_in_method_decl219);
                            	    type26=type();

                            	    state._fsp--;

                            	    stream_type.add(type26.getTree());

                            	    pushFollow(FOLLOW_id_in_method_decl221);
                            	    id27=id();

                            	    state._fsp--;

                            	    stream_id.add(id27.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }


                    RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_decl228);  
                    stream_RPAREN.add(RPAREN28);


                    pushFollow(FOLLOW_block_in_method_decl230);
                    block29=block();

                    state._fsp--;

                    stream_block.add(block29.getTree());

                    // AST REWRITE
                    // elements: id, VOID, block, id, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:6: -> ^( METHOD VOID id ( type id )* block )
                    {
                        // compiler/ast/GramaticaAst.g:62:9: ^( METHOD VOID id ( type id )* block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD, "METHOD")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VOID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_id.nextTree());

                        // compiler/ast/GramaticaAst.g:62:27: ( type id )*
                        while ( stream_id.hasNext()||stream_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_type.nextTree());

                            adaptor.addChild(root_1, stream_id.nextTree());

                        }
                        stream_id.reset();
                        stream_type.reset();

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:63:7: ( ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD type id ( type id )* block ) )
                    {
                    // compiler/ast/GramaticaAst.g:63:7: ( ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD type id ( type id )* block ) )
                    // compiler/ast/GramaticaAst.g:63:8: ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block
                    {
                    // compiler/ast/GramaticaAst.g:63:8: ( type )
                    // compiler/ast/GramaticaAst.g:63:9: type
                    {
                    pushFollow(FOLLOW_type_in_method_decl266);
                    type30=type();

                    state._fsp--;

                    stream_type.add(type30.getTree());

                    }


                    pushFollow(FOLLOW_id_in_method_decl269);
                    id31=id();

                    state._fsp--;

                    stream_id.add(id31.getTree());

                    LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_method_decl271);  
                    stream_LPAREN.add(LPAREN32);


                    // compiler/ast/GramaticaAst.g:63:25: ( ( type id ) ( COMA type id )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==BOOLEAN||LA9_0==INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:63:26: ( type id ) ( COMA type id )*
                            {
                            // compiler/ast/GramaticaAst.g:63:26: ( type id )
                            // compiler/ast/GramaticaAst.g:63:27: type id
                            {
                            pushFollow(FOLLOW_type_in_method_decl275);
                            type33=type();

                            state._fsp--;

                            stream_type.add(type33.getTree());

                            pushFollow(FOLLOW_id_in_method_decl277);
                            id34=id();

                            state._fsp--;

                            stream_id.add(id34.getTree());

                            }


                            // compiler/ast/GramaticaAst.g:63:36: ( COMA type id )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==COMA) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // compiler/ast/GramaticaAst.g:63:37: COMA type id
                            	    {
                            	    COMA35=(Token)match(input,COMA,FOLLOW_COMA_in_method_decl281);  
                            	    stream_COMA.add(COMA35);


                            	    pushFollow(FOLLOW_type_in_method_decl283);
                            	    type36=type();

                            	    state._fsp--;

                            	    stream_type.add(type36.getTree());

                            	    pushFollow(FOLLOW_id_in_method_decl285);
                            	    id37=id();

                            	    state._fsp--;

                            	    stream_id.add(id37.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }


                    RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_decl292);  
                    stream_RPAREN.add(RPAREN38);


                    pushFollow(FOLLOW_block_in_method_decl294);
                    block39=block();

                    state._fsp--;

                    stream_block.add(block39.getTree());

                    // AST REWRITE
                    // elements: type, type, id, block, id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:6: -> ^( METHOD type id ( type id )* block )
                    {
                        // compiler/ast/GramaticaAst.g:64:9: ^( METHOD type id ( type id )* block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD, "METHOD")
                        , root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, stream_id.nextTree());

                        // compiler/ast/GramaticaAst.g:64:27: ( type id )*
                        while ( stream_type.hasNext()||stream_id.hasNext() ) {
                            adaptor.addChild(root_1, stream_type.nextTree());

                            adaptor.addChild(root_1, stream_id.nextTree());

                        }
                        stream_type.reset();
                        stream_id.reset();

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_decl"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // compiler/ast/GramaticaAst.g:65:1: block : LBRACE ( var_decl )* ( statement )* RBRACE -> ^( BLOCK ( var_decl )* ( statement )* ) ;
    public final GramaticaAst.block_return block() throws RecognitionException {
        GramaticaAst.block_return retval = new GramaticaAst.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRACE40=null;
        Token RBRACE43=null;
        GramaticaAst.var_decl_return var_decl41 =null;

        GramaticaAst.statement_return statement42 =null;


        Object LBRACE40_tree=null;
        Object RBRACE43_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // compiler/ast/GramaticaAst.g:65:9: ( LBRACE ( var_decl )* ( statement )* RBRACE -> ^( BLOCK ( var_decl )* ( statement )* ) )
            // compiler/ast/GramaticaAst.g:65:11: LBRACE ( var_decl )* ( statement )* RBRACE
            {
            LBRACE40=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block329);  
            stream_LBRACE.add(LBRACE40);


            // compiler/ast/GramaticaAst.g:65:18: ( var_decl )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BOOLEAN||LA11_0==INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:65:18: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_block331);
            	    var_decl41=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl41.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // compiler/ast/GramaticaAst.g:65:28: ( statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= BREAK && LA12_0 <= CALLOUT)||LA12_0==CONTINUE||LA12_0==FOR||(LA12_0 >= IF && LA12_0 <= INDENTIFIER)||LA12_0==LBRACE||LA12_0==RETURN) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:65:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block334);
            	    statement42=statement();

            	    state._fsp--;

            	    stream_statement.add(statement42.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            RBRACE43=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block337);  
            stream_RBRACE.add(RBRACE43);


            // AST REWRITE
            // elements: statement, var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:6: -> ^( BLOCK ( var_decl )* ( statement )* )
            {
                // compiler/ast/GramaticaAst.g:66:9: ^( BLOCK ( var_decl )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // compiler/ast/GramaticaAst.g:66:17: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();

                // compiler/ast/GramaticaAst.g:66:27: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class var_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_decl"
    // compiler/ast/GramaticaAst.g:68:1: var_decl : type id ( COMA id )* SEMICO -> ^( VARS type id ( id )* ) ;
    public final GramaticaAst.var_decl_return var_decl() throws RecognitionException {
        GramaticaAst.var_decl_return retval = new GramaticaAst.var_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMA46=null;
        Token SEMICO48=null;
        GramaticaAst.type_return type44 =null;

        GramaticaAst.id_return id45 =null;

        GramaticaAst.id_return id47 =null;


        Object COMA46_tree=null;
        Object SEMICO48_tree=null;
        RewriteRuleTokenStream stream_SEMICO=new RewriteRuleTokenStream(adaptor,"token SEMICO");
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // compiler/ast/GramaticaAst.g:68:11: ( type id ( COMA id )* SEMICO -> ^( VARS type id ( id )* ) )
            // compiler/ast/GramaticaAst.g:68:13: type id ( COMA id )* SEMICO
            {
            pushFollow(FOLLOW_type_in_var_decl364);
            type44=type();

            state._fsp--;

            stream_type.add(type44.getTree());

            pushFollow(FOLLOW_id_in_var_decl366);
            id45=id();

            state._fsp--;

            stream_id.add(id45.getTree());

            // compiler/ast/GramaticaAst.g:68:21: ( COMA id )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:68:22: COMA id
            	    {
            	    COMA46=(Token)match(input,COMA,FOLLOW_COMA_in_var_decl369);  
            	    stream_COMA.add(COMA46);


            	    pushFollow(FOLLOW_id_in_var_decl371);
            	    id47=id();

            	    state._fsp--;

            	    stream_id.add(id47.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            SEMICO48=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_var_decl375);  
            stream_SEMICO.add(SEMICO48);


            // AST REWRITE
            // elements: id, id, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:39: -> ^( VARS type id ( id )* )
            {
                // compiler/ast/GramaticaAst.g:68:41: ^( VARS type id ( id )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VARS, "VARS")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, stream_id.nextTree());

                // compiler/ast/GramaticaAst.g:68:56: ( id )*
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());

                }
                stream_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_decl"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // compiler/ast/GramaticaAst.g:70:1: type : ( INT | BOOLEAN );
    public final GramaticaAst.type_return type() throws RecognitionException {
        GramaticaAst.type_return retval = new GramaticaAst.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set49=null;

        Object set49_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:70:9: ( INT | BOOLEAN )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set49=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set49)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // compiler/ast/GramaticaAst.g:72:1: statement : ( location assign_op expr SEMICO -> ^( STATEMENT location assign_op expr ) | method_call SEMICO -> ^( STATEMENT method_call ) | IF LPAREN expr RPAREN block ( ELSE block )? -> ^( STATEMENT IF expr block ( ELSE block )? ) | FOR id ASSIGN expr COMA expr block -> ^( STATEMENT FOR id ASSIGN expr expr block ) | RETURN ( expr )? SEMICO -> ^( STATEMENT RETURN ( expr )? ) | BREAK SEMICO -> ^( STATEMENT BREAK ) | CONTINUE SEMICO -> ^( STATEMENT CONTINUE ) | block );
    public final GramaticaAst.statement_return statement() throws RecognitionException {
        GramaticaAst.statement_return retval = new GramaticaAst.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMICO53=null;
        Token SEMICO55=null;
        Token IF56=null;
        Token LPAREN57=null;
        Token RPAREN59=null;
        Token ELSE61=null;
        Token FOR63=null;
        Token ASSIGN65=null;
        Token COMA67=null;
        Token RETURN70=null;
        Token SEMICO72=null;
        Token BREAK73=null;
        Token SEMICO74=null;
        Token CONTINUE75=null;
        Token SEMICO76=null;
        GramaticaAst.location_return location50 =null;

        GramaticaAst.assign_op_return assign_op51 =null;

        GramaticaAst.expr_return expr52 =null;

        GramaticaAst.method_call_return method_call54 =null;

        GramaticaAst.expr_return expr58 =null;

        GramaticaAst.block_return block60 =null;

        GramaticaAst.block_return block62 =null;

        GramaticaAst.id_return id64 =null;

        GramaticaAst.expr_return expr66 =null;

        GramaticaAst.expr_return expr68 =null;

        GramaticaAst.block_return block69 =null;

        GramaticaAst.expr_return expr71 =null;

        GramaticaAst.block_return block77 =null;


        Object SEMICO53_tree=null;
        Object SEMICO55_tree=null;
        Object IF56_tree=null;
        Object LPAREN57_tree=null;
        Object RPAREN59_tree=null;
        Object ELSE61_tree=null;
        Object FOR63_tree=null;
        Object ASSIGN65_tree=null;
        Object COMA67_tree=null;
        Object RETURN70_tree=null;
        Object SEMICO72_tree=null;
        Object BREAK73_tree=null;
        Object SEMICO74_tree=null;
        Object CONTINUE75_tree=null;
        Object SEMICO76_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMICO=new RewriteRuleTokenStream(adaptor,"token SEMICO");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_location=new RewriteRuleSubtreeStream(adaptor,"rule location");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_method_call=new RewriteRuleSubtreeStream(adaptor,"rule method_call");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_assign_op=new RewriteRuleSubtreeStream(adaptor,"rule assign_op");
        try {
            // compiler/ast/GramaticaAst.g:72:12: ( location assign_op expr SEMICO -> ^( STATEMENT location assign_op expr ) | method_call SEMICO -> ^( STATEMENT method_call ) | IF LPAREN expr RPAREN block ( ELSE block )? -> ^( STATEMENT IF expr block ( ELSE block )? ) | FOR id ASSIGN expr COMA expr block -> ^( STATEMENT FOR id ASSIGN expr expr block ) | RETURN ( expr )? SEMICO -> ^( STATEMENT RETURN ( expr )? ) | BREAK SEMICO -> ^( STATEMENT BREAK ) | CONTINUE SEMICO -> ^( STATEMENT CONTINUE ) | block )
            int alt16=8;
            switch ( input.LA(1) ) {
            case INDENTIFIER:
                {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1 >= ASSIGN && LA16_1 <= ASSIGNSUB)||LA16_1==LBRAKET) ) {
                    alt16=1;
                }
                else if ( (LA16_1==LPAREN) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
                }
                break;
            case CALLOUT:
                {
                alt16=2;
                }
                break;
            case IF:
                {
                alt16=3;
                }
                break;
            case FOR:
                {
                alt16=4;
                }
                break;
            case RETURN:
                {
                alt16=5;
                }
                break;
            case BREAK:
                {
                alt16=6;
                }
                break;
            case CONTINUE:
                {
                alt16=7;
                }
                break;
            case LBRACE:
                {
                alt16=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // compiler/ast/GramaticaAst.g:72:14: location assign_op expr SEMICO
                    {
                    pushFollow(FOLLOW_location_in_statement412);
                    location50=location();

                    state._fsp--;

                    stream_location.add(location50.getTree());

                    pushFollow(FOLLOW_assign_op_in_statement414);
                    assign_op51=assign_op();

                    state._fsp--;

                    stream_assign_op.add(assign_op51.getTree());

                    pushFollow(FOLLOW_expr_in_statement416);
                    expr52=expr();

                    state._fsp--;

                    stream_expr.add(expr52.getTree());

                    SEMICO53=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement418);  
                    stream_SEMICO.add(SEMICO53);


                    // AST REWRITE
                    // elements: expr, assign_op, location
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:47: -> ^( STATEMENT location assign_op expr )
                    {
                        // compiler/ast/GramaticaAst.g:72:50: ^( STATEMENT location assign_op expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_location.nextTree());

                        adaptor.addChild(root_1, stream_assign_op.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:73:7: method_call SEMICO
                    {
                    pushFollow(FOLLOW_method_call_in_statement440);
                    method_call54=method_call();

                    state._fsp--;

                    stream_method_call.add(method_call54.getTree());

                    SEMICO55=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement442);  
                    stream_SEMICO.add(SEMICO55);


                    // AST REWRITE
                    // elements: method_call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:32: -> ^( STATEMENT method_call )
                    {
                        // compiler/ast/GramaticaAst.g:73:35: ^( STATEMENT method_call )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_method_call.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // compiler/ast/GramaticaAst.g:74:7: IF LPAREN expr RPAREN block ( ELSE block )?
                    {
                    IF56=(Token)match(input,IF,FOLLOW_IF_in_statement464);  
                    stream_IF.add(IF56);


                    LPAREN57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement466);  
                    stream_LPAREN.add(LPAREN57);


                    pushFollow(FOLLOW_expr_in_statement468);
                    expr58=expr();

                    state._fsp--;

                    stream_expr.add(expr58.getTree());

                    RPAREN59=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement470);  
                    stream_RPAREN.add(RPAREN59);


                    pushFollow(FOLLOW_block_in_statement472);
                    block60=block();

                    state._fsp--;

                    stream_block.add(block60.getTree());

                    // compiler/ast/GramaticaAst.g:74:35: ( ELSE block )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ELSE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:74:36: ELSE block
                            {
                            ELSE61=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement475);  
                            stream_ELSE.add(ELSE61);


                            pushFollow(FOLLOW_block_in_statement477);
                            block62=block();

                            state._fsp--;

                            stream_block.add(block62.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: block, block, IF, ELSE, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:49: -> ^( STATEMENT IF expr block ( ELSE block )? )
                    {
                        // compiler/ast/GramaticaAst.g:74:52: ^( STATEMENT IF expr block ( ELSE block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IF.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // compiler/ast/GramaticaAst.g:74:79: ( ELSE block )?
                        if ( stream_block.hasNext()||stream_ELSE.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ELSE.nextNode()
                            );

                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        stream_ELSE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // compiler/ast/GramaticaAst.g:75:7: FOR id ASSIGN expr COMA expr block
                    {
                    FOR63=(Token)match(input,FOR,FOLLOW_FOR_in_statement507);  
                    stream_FOR.add(FOR63);


                    pushFollow(FOLLOW_id_in_statement509);
                    id64=id();

                    state._fsp--;

                    stream_id.add(id64.getTree());

                    ASSIGN65=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement511);  
                    stream_ASSIGN.add(ASSIGN65);


                    pushFollow(FOLLOW_expr_in_statement513);
                    expr66=expr();

                    state._fsp--;

                    stream_expr.add(expr66.getTree());

                    COMA67=(Token)match(input,COMA,FOLLOW_COMA_in_statement515);  
                    stream_COMA.add(COMA67);


                    pushFollow(FOLLOW_expr_in_statement517);
                    expr68=expr();

                    state._fsp--;

                    stream_expr.add(expr68.getTree());

                    pushFollow(FOLLOW_block_in_statement519);
                    block69=block();

                    state._fsp--;

                    stream_block.add(block69.getTree());

                    // AST REWRITE
                    // elements: expr, expr, ASSIGN, FOR, id, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:44: -> ^( STATEMENT FOR id ASSIGN expr expr block )
                    {
                        // compiler/ast/GramaticaAst.g:75:47: ^( STATEMENT FOR id ASSIGN expr expr block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FOR.nextNode()
                        );

                        adaptor.addChild(root_1, stream_id.nextTree());

                        adaptor.addChild(root_1, 
                        stream_ASSIGN.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // compiler/ast/GramaticaAst.g:76:7: RETURN ( expr )? SEMICO
                    {
                    RETURN70=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement547);  
                    stream_RETURN.add(RETURN70);


                    // compiler/ast/GramaticaAst.g:76:14: ( expr )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==CALLOUT||LA15_0==CHR||LA15_0==DIGIT||LA15_0==FALSE||LA15_0==HEX||LA15_0==INDENTIFIER||LA15_0==LPAREN||LA15_0==MINUS||LA15_0==NOT||LA15_0==TRUE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:76:15: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement550);
                            expr71=expr();

                            state._fsp--;

                            stream_expr.add(expr71.getTree());

                            }
                            break;

                    }


                    SEMICO72=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement554);  
                    stream_SEMICO.add(SEMICO72);


                    // AST REWRITE
                    // elements: expr, RETURN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:34: -> ^( STATEMENT RETURN ( expr )? )
                    {
                        // compiler/ast/GramaticaAst.g:76:37: ^( STATEMENT RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_RETURN.nextNode()
                        );

                        // compiler/ast/GramaticaAst.g:76:56: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // compiler/ast/GramaticaAst.g:77:7: BREAK SEMICO
                    {
                    BREAK73=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement581);  
                    stream_BREAK.add(BREAK73);


                    SEMICO74=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement583);  
                    stream_SEMICO.add(SEMICO74);


                    // AST REWRITE
                    // elements: BREAK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:27: -> ^( STATEMENT BREAK )
                    {
                        // compiler/ast/GramaticaAst.g:77:30: ^( STATEMENT BREAK )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_BREAK.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // compiler/ast/GramaticaAst.g:78:7: CONTINUE SEMICO
                    {
                    CONTINUE75=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement607);  
                    stream_CONTINUE.add(CONTINUE75);


                    SEMICO76=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement609);  
                    stream_SEMICO.add(SEMICO76);


                    // AST REWRITE
                    // elements: CONTINUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:29: -> ^( STATEMENT CONTINUE )
                    {
                        // compiler/ast/GramaticaAst.g:78:32: ^( STATEMENT CONTINUE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CONTINUE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // compiler/ast/GramaticaAst.g:79:7: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement632);
                    block77=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block77.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class assign_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign_op"
    // compiler/ast/GramaticaAst.g:81:1: assign_op : ( ASSIGN | ASSIGNADD | ASSIGNSUB );
    public final GramaticaAst.assign_op_return assign_op() throws RecognitionException {
        GramaticaAst.assign_op_return retval = new GramaticaAst.assign_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set78=null;

        Object set78_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:81:12: ( ASSIGN | ASSIGNADD | ASSIGNSUB )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set78=(Token)input.LT(1);

            if ( (input.LA(1) >= ASSIGN && input.LA(1) <= ASSIGNSUB) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set78)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign_op"


    public static class method_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_call"
    // compiler/ast/GramaticaAst.g:85:1: method_call : ( method_name LPAREN ( expr ( COMA expr )* )? RPAREN -> ^( CALL method_name ( expr ( expr )* )? ) | CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN -> ^( PRINTF CALLOUT string_literal ( callout_arg )* ) );
    public final GramaticaAst.method_call_return method_call() throws RecognitionException {
        GramaticaAst.method_call_return retval = new GramaticaAst.method_call_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN80=null;
        Token COMA82=null;
        Token RPAREN84=null;
        Token CALLOUT85=null;
        Token LPAREN86=null;
        Token COMA88=null;
        Token RPAREN90=null;
        GramaticaAst.method_name_return method_name79 =null;

        GramaticaAst.expr_return expr81 =null;

        GramaticaAst.expr_return expr83 =null;

        GramaticaAst.string_literal_return string_literal87 =null;

        GramaticaAst.callout_arg_return callout_arg89 =null;


        Object LPAREN80_tree=null;
        Object COMA82_tree=null;
        Object RPAREN84_tree=null;
        Object CALLOUT85_tree=null;
        Object LPAREN86_tree=null;
        Object COMA88_tree=null;
        Object RPAREN90_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_CALLOUT=new RewriteRuleTokenStream(adaptor,"token CALLOUT");
        RewriteRuleSubtreeStream stream_callout_arg=new RewriteRuleSubtreeStream(adaptor,"rule callout_arg");
        RewriteRuleSubtreeStream stream_method_name=new RewriteRuleSubtreeStream(adaptor,"rule method_name");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_string_literal=new RewriteRuleSubtreeStream(adaptor,"rule string_literal");
        try {
            // compiler/ast/GramaticaAst.g:85:14: ( method_name LPAREN ( expr ( COMA expr )* )? RPAREN -> ^( CALL method_name ( expr ( expr )* )? ) | CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN -> ^( PRINTF CALLOUT string_literal ( callout_arg )* ) )
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
                    // compiler/ast/GramaticaAst.g:85:16: method_name LPAREN ( expr ( COMA expr )* )? RPAREN
                    {
                    pushFollow(FOLLOW_method_name_in_method_call669);
                    method_name79=method_name();

                    state._fsp--;

                    stream_method_name.add(method_name79.getTree());

                    LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_method_call671);  
                    stream_LPAREN.add(LPAREN80);


                    // compiler/ast/GramaticaAst.g:85:35: ( expr ( COMA expr )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==CALLOUT||LA18_0==CHR||LA18_0==DIGIT||LA18_0==FALSE||LA18_0==HEX||LA18_0==INDENTIFIER||LA18_0==LPAREN||LA18_0==MINUS||LA18_0==NOT||LA18_0==TRUE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:85:36: expr ( COMA expr )*
                            {
                            pushFollow(FOLLOW_expr_in_method_call674);
                            expr81=expr();

                            state._fsp--;

                            stream_expr.add(expr81.getTree());

                            // compiler/ast/GramaticaAst.g:85:40: ( COMA expr )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==COMA) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // compiler/ast/GramaticaAst.g:85:41: COMA expr
                            	    {
                            	    COMA82=(Token)match(input,COMA,FOLLOW_COMA_in_method_call676);  
                            	    stream_COMA.add(COMA82);


                            	    pushFollow(FOLLOW_expr_in_method_call678);
                            	    expr83=expr();

                            	    state._fsp--;

                            	    stream_expr.add(expr83.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }


                    RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_call684);  
                    stream_RPAREN.add(RPAREN84);


                    // AST REWRITE
                    // elements: method_name, expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:62: -> ^( CALL method_name ( expr ( expr )* )? )
                    {
                        // compiler/ast/GramaticaAst.g:85:64: ^( CALL method_name ( expr ( expr )* )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_method_name.nextTree());

                        // compiler/ast/GramaticaAst.g:85:83: ( expr ( expr )* )?
                        if ( stream_expr.hasNext()||stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                            // compiler/ast/GramaticaAst.g:85:89: ( expr )*
                            while ( stream_expr.hasNext() ) {
                                adaptor.addChild(root_1, stream_expr.nextTree());

                            }
                            stream_expr.reset();

                        }
                        stream_expr.reset();
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:86:7: CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN
                    {
                    CALLOUT85=(Token)match(input,CALLOUT,FOLLOW_CALLOUT_in_method_call710);  
                    stream_CALLOUT.add(CALLOUT85);


                    LPAREN86=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_method_call712);  
                    stream_LPAREN.add(LPAREN86);


                    pushFollow(FOLLOW_string_literal_in_method_call714);
                    string_literal87=string_literal();

                    state._fsp--;

                    stream_string_literal.add(string_literal87.getTree());

                    // compiler/ast/GramaticaAst.g:86:37: ( ( COMA callout_arg )+ )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==COMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:86:38: ( COMA callout_arg )+
                            {
                            // compiler/ast/GramaticaAst.g:86:38: ( COMA callout_arg )+
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
                            	    // compiler/ast/GramaticaAst.g:86:39: COMA callout_arg
                            	    {
                            	    COMA88=(Token)match(input,COMA,FOLLOW_COMA_in_method_call718);  
                            	    stream_COMA.add(COMA88);


                            	    pushFollow(FOLLOW_callout_arg_in_method_call720);
                            	    callout_arg89=callout_arg();

                            	    state._fsp--;

                            	    stream_callout_arg.add(callout_arg89.getTree());

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


                    RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_call726);  
                    stream_RPAREN.add(RPAREN90);


                    // AST REWRITE
                    // elements: callout_arg, string_literal, CALLOUT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:67: -> ^( PRINTF CALLOUT string_literal ( callout_arg )* )
                    {
                        // compiler/ast/GramaticaAst.g:86:69: ^( PRINTF CALLOUT string_literal ( callout_arg )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINTF, "PRINTF")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CALLOUT.nextNode()
                        );

                        adaptor.addChild(root_1, stream_string_literal.nextTree());

                        // compiler/ast/GramaticaAst.g:86:101: ( callout_arg )*
                        while ( stream_callout_arg.hasNext() ) {
                            adaptor.addChild(root_1, stream_callout_arg.nextTree());

                        }
                        stream_callout_arg.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_call"


    public static class method_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_name"
    // compiler/ast/GramaticaAst.g:88:1: method_name : id ;
    public final GramaticaAst.method_name_return method_name() throws RecognitionException {
        GramaticaAst.method_name_return retval = new GramaticaAst.method_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.id_return id91 =null;



        try {
            // compiler/ast/GramaticaAst.g:88:14: ( id )
            // compiler/ast/GramaticaAst.g:88:16: id
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_id_in_method_name747);
            id91=id();

            state._fsp--;

            adaptor.addChild(root_0, id91.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_name"


    public static class location_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "location"
    // compiler/ast/GramaticaAst.g:90:1: location : ( id | id LBRAKET expr RBRAKET -> ^( ARRAY id expr ) );
    public final GramaticaAst.location_return location() throws RecognitionException {
        GramaticaAst.location_return retval = new GramaticaAst.location_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LBRAKET94=null;
        Token RBRAKET96=null;
        GramaticaAst.id_return id92 =null;

        GramaticaAst.id_return id93 =null;

        GramaticaAst.expr_return expr95 =null;


        Object LBRAKET94_tree=null;
        Object RBRAKET96_tree=null;
        RewriteRuleTokenStream stream_RBRAKET=new RewriteRuleTokenStream(adaptor,"token RBRAKET");
        RewriteRuleTokenStream stream_LBRAKET=new RewriteRuleTokenStream(adaptor,"token LBRAKET");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // compiler/ast/GramaticaAst.g:90:11: ( id | id LBRAKET expr RBRAKET -> ^( ARRAY id expr ) )
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
                    // compiler/ast/GramaticaAst.g:90:13: id
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_location757);
                    id92=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id92.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:91:7: id LBRAKET expr RBRAKET
                    {
                    pushFollow(FOLLOW_id_in_location765);
                    id93=id();

                    state._fsp--;

                    stream_id.add(id93.getTree());

                    LBRAKET94=(Token)match(input,LBRAKET,FOLLOW_LBRAKET_in_location767);  
                    stream_LBRAKET.add(LBRAKET94);


                    pushFollow(FOLLOW_expr_in_location769);
                    expr95=expr();

                    state._fsp--;

                    stream_expr.add(expr95.getTree());

                    RBRAKET96=(Token)match(input,RBRAKET,FOLLOW_RBRAKET_in_location771);  
                    stream_RBRAKET.add(RBRAKET96);


                    // AST REWRITE
                    // elements: expr, id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:31: -> ^( ARRAY id expr )
                    {
                        // compiler/ast/GramaticaAst.g:91:33: ^( ARRAY id expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARRAY, "ARRAY")
                        , root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "location"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // compiler/ast/GramaticaAst.g:93:1: expr : l= expr_and ( OR ^r= expr_and )* ;
    public final GramaticaAst.expr_return expr() throws RecognitionException {
        GramaticaAst.expr_return retval = new GramaticaAst.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR97=null;
        GramaticaAst.expr_and_return l =null;

        GramaticaAst.expr_and_return r =null;


        Object OR97_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:93:10: (l= expr_and ( OR ^r= expr_and )* )
            // compiler/ast/GramaticaAst.g:93:12: l= expr_and ( OR ^r= expr_and )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_and_in_expr796);
            l=expr_and();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:93:25: ( OR ^r= expr_and )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:93:26: OR ^r= expr_and
            	    {
            	    OR97=(Token)match(input,OR,FOLLOW_OR_in_expr799); 
            	    OR97_tree = 
            	    (Object)adaptor.create(OR97)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR97_tree, root_0);


            	    pushFollow(FOLLOW_expr_and_in_expr806);
            	    r=expr_and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class expr_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_and"
    // compiler/ast/GramaticaAst.g:94:1: expr_and : l= expr_eq ( AND ^r= expr_eq )* ;
    public final GramaticaAst.expr_and_return expr_and() throws RecognitionException {
        GramaticaAst.expr_and_return retval = new GramaticaAst.expr_and_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND98=null;
        GramaticaAst.expr_eq_return l =null;

        GramaticaAst.expr_eq_return r =null;


        Object AND98_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:94:11: (l= expr_eq ( AND ^r= expr_eq )* )
            // compiler/ast/GramaticaAst.g:94:13: l= expr_eq ( AND ^r= expr_eq )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_eq_in_expr_and820);
            l=expr_eq();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:94:26: ( AND ^r= expr_eq )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:94:27: AND ^r= expr_eq
            	    {
            	    AND98=(Token)match(input,AND,FOLLOW_AND_in_expr_and824); 
            	    AND98_tree = 
            	    (Object)adaptor.create(AND98)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND98_tree, root_0);


            	    pushFollow(FOLLOW_expr_eq_in_expr_and831);
            	    r=expr_eq();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_and"


    public static class expr_eq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_eq"
    // compiler/ast/GramaticaAst.g:96:1: expr_eq : l= expr_rel ( EQUAL ^r= expr_rel | NEQUAL ^r= expr_rel )* ;
    public final GramaticaAst.expr_eq_return expr_eq() throws RecognitionException {
        GramaticaAst.expr_eq_return retval = new GramaticaAst.expr_eq_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL99=null;
        Token NEQUAL100=null;
        GramaticaAst.expr_rel_return l =null;

        GramaticaAst.expr_rel_return r =null;


        Object EQUAL99_tree=null;
        Object NEQUAL100_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:96:11: (l= expr_rel ( EQUAL ^r= expr_rel | NEQUAL ^r= expr_rel )* )
            // compiler/ast/GramaticaAst.g:96:13: l= expr_rel ( EQUAL ^r= expr_rel | NEQUAL ^r= expr_rel )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_rel_in_expr_eq847);
            l=expr_rel();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:96:27: ( EQUAL ^r= expr_rel | NEQUAL ^r= expr_rel )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EQUAL) ) {
                    alt25=1;
                }
                else if ( (LA25_0==NEQUAL) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:96:28: EQUAL ^r= expr_rel
            	    {
            	    EQUAL99=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_expr_eq851); 
            	    EQUAL99_tree = 
            	    (Object)adaptor.create(EQUAL99)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(EQUAL99_tree, root_0);


            	    pushFollow(FOLLOW_expr_rel_in_expr_eq858);
            	    r=expr_rel();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;
            	case 2 :
            	    // compiler/ast/GramaticaAst.g:97:11: NEQUAL ^r= expr_rel
            	    {
            	    NEQUAL100=(Token)match(input,NEQUAL,FOLLOW_NEQUAL_in_expr_eq871); 
            	    NEQUAL100_tree = 
            	    (Object)adaptor.create(NEQUAL100)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(NEQUAL100_tree, root_0);


            	    pushFollow(FOLLOW_expr_rel_in_expr_eq878);
            	    r=expr_rel();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_eq"


    public static class expr_rel_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_rel"
    // compiler/ast/GramaticaAst.g:99:1: expr_rel : l= expr_add ( LESSTHAN ^r= expr_add | GREATHAN ^r= expr_add | LTOEQ ^r= expr_add | GTOEQ ^r= expr_add )* ;
    public final GramaticaAst.expr_rel_return expr_rel() throws RecognitionException {
        GramaticaAst.expr_rel_return retval = new GramaticaAst.expr_rel_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESSTHAN101=null;
        Token GREATHAN102=null;
        Token LTOEQ103=null;
        Token GTOEQ104=null;
        GramaticaAst.expr_add_return l =null;

        GramaticaAst.expr_add_return r =null;


        Object LESSTHAN101_tree=null;
        Object GREATHAN102_tree=null;
        Object LTOEQ103_tree=null;
        Object GTOEQ104_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:99:11: (l= expr_add ( LESSTHAN ^r= expr_add | GREATHAN ^r= expr_add | LTOEQ ^r= expr_add | GTOEQ ^r= expr_add )* )
            // compiler/ast/GramaticaAst.g:99:13: l= expr_add ( LESSTHAN ^r= expr_add | GREATHAN ^r= expr_add | LTOEQ ^r= expr_add | GTOEQ ^r= expr_add )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_add_in_expr_rel893);
            l=expr_add();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:99:27: ( LESSTHAN ^r= expr_add | GREATHAN ^r= expr_add | LTOEQ ^r= expr_add | GTOEQ ^r= expr_add )*
            loop26:
            do {
                int alt26=5;
                switch ( input.LA(1) ) {
                case LESSTHAN:
                    {
                    alt26=1;
                    }
                    break;
                case GREATHAN:
                    {
                    alt26=2;
                    }
                    break;
                case LTOEQ:
                    {
                    alt26=3;
                    }
                    break;
                case GTOEQ:
                    {
                    alt26=4;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:99:28: LESSTHAN ^r= expr_add
            	    {
            	    LESSTHAN101=(Token)match(input,LESSTHAN,FOLLOW_LESSTHAN_in_expr_rel897); 
            	    LESSTHAN101_tree = 
            	    (Object)adaptor.create(LESSTHAN101)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(LESSTHAN101_tree, root_0);


            	    pushFollow(FOLLOW_expr_add_in_expr_rel904);
            	    r=expr_add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;
            	case 2 :
            	    // compiler/ast/GramaticaAst.g:100:11: GREATHAN ^r= expr_add
            	    {
            	    GREATHAN102=(Token)match(input,GREATHAN,FOLLOW_GREATHAN_in_expr_rel917); 
            	    GREATHAN102_tree = 
            	    (Object)adaptor.create(GREATHAN102)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(GREATHAN102_tree, root_0);


            	    pushFollow(FOLLOW_expr_add_in_expr_rel924);
            	    r=expr_add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;
            	case 3 :
            	    // compiler/ast/GramaticaAst.g:101:11: LTOEQ ^r= expr_add
            	    {
            	    LTOEQ103=(Token)match(input,LTOEQ,FOLLOW_LTOEQ_in_expr_rel937); 
            	    LTOEQ103_tree = 
            	    (Object)adaptor.create(LTOEQ103)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(LTOEQ103_tree, root_0);


            	    pushFollow(FOLLOW_expr_add_in_expr_rel944);
            	    r=expr_add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;
            	case 4 :
            	    // compiler/ast/GramaticaAst.g:102:11: GTOEQ ^r= expr_add
            	    {
            	    GTOEQ104=(Token)match(input,GTOEQ,FOLLOW_GTOEQ_in_expr_rel957); 
            	    GTOEQ104_tree = 
            	    (Object)adaptor.create(GTOEQ104)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(GTOEQ104_tree, root_0);


            	    pushFollow(FOLLOW_expr_add_in_expr_rel964);
            	    r=expr_add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_rel"


    public static class expr_add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_add"
    // compiler/ast/GramaticaAst.g:104:1: expr_add : l= expr_arith ( ADD ^r= expr_arith | MINUS ^r= expr_arith )* ;
    public final GramaticaAst.expr_add_return expr_add() throws RecognitionException {
        GramaticaAst.expr_add_return retval = new GramaticaAst.expr_add_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ADD105=null;
        Token MINUS106=null;
        GramaticaAst.expr_arith_return l =null;

        GramaticaAst.expr_arith_return r =null;


        Object ADD105_tree=null;
        Object MINUS106_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:104:11: (l= expr_arith ( ADD ^r= expr_arith | MINUS ^r= expr_arith )* )
            // compiler/ast/GramaticaAst.g:104:13: l= expr_arith ( ADD ^r= expr_arith | MINUS ^r= expr_arith )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_arith_in_expr_add979);
            l=expr_arith();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:104:29: ( ADD ^r= expr_arith | MINUS ^r= expr_arith )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ADD) ) {
                    alt27=1;
                }
                else if ( (LA27_0==MINUS) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:104:30: ADD ^r= expr_arith
            	    {
            	    ADD105=(Token)match(input,ADD,FOLLOW_ADD_in_expr_add983); 
            	    ADD105_tree = 
            	    (Object)adaptor.create(ADD105)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(ADD105_tree, root_0);


            	    pushFollow(FOLLOW_expr_arith_in_expr_add990);
            	    r=expr_arith();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;
            	case 2 :
            	    // compiler/ast/GramaticaAst.g:105:11: MINUS ^r= expr_arith
            	    {
            	    MINUS106=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add1003); 
            	    MINUS106_tree = 
            	    (Object)adaptor.create(MINUS106)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(MINUS106_tree, root_0);


            	    pushFollow(FOLLOW_expr_arith_in_expr_add1010);
            	    r=expr_arith();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_add"


    public static class expr_arith_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_arith"
    // compiler/ast/GramaticaAst.g:107:1: expr_arith : l= expr_minus ( MULT ^r= expr_minus | DIV ^r= expr_minus | MOD ^r= expr_minus )* ;
    public final GramaticaAst.expr_arith_return expr_arith() throws RecognitionException {
        GramaticaAst.expr_arith_return retval = new GramaticaAst.expr_arith_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MULT107=null;
        Token DIV108=null;
        Token MOD109=null;
        GramaticaAst.expr_minus_return l =null;

        GramaticaAst.expr_minus_return r =null;


        Object MULT107_tree=null;
        Object DIV108_tree=null;
        Object MOD109_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:107:13: (l= expr_minus ( MULT ^r= expr_minus | DIV ^r= expr_minus | MOD ^r= expr_minus )* )
            // compiler/ast/GramaticaAst.g:107:15: l= expr_minus ( MULT ^r= expr_minus | DIV ^r= expr_minus | MOD ^r= expr_minus )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_minus_in_expr_arith1025);
            l=expr_minus();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:107:31: ( MULT ^r= expr_minus | DIV ^r= expr_minus | MOD ^r= expr_minus )*
            loop28:
            do {
                int alt28=4;
                switch ( input.LA(1) ) {
                case MULT:
                    {
                    alt28=1;
                    }
                    break;
                case DIV:
                    {
                    alt28=2;
                    }
                    break;
                case MOD:
                    {
                    alt28=3;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:107:32: MULT ^r= expr_minus
            	    {
            	    MULT107=(Token)match(input,MULT,FOLLOW_MULT_in_expr_arith1029); 
            	    MULT107_tree = 
            	    (Object)adaptor.create(MULT107)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(MULT107_tree, root_0);


            	    pushFollow(FOLLOW_expr_minus_in_expr_arith1036);
            	    r=expr_minus();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;
            	case 2 :
            	    // compiler/ast/GramaticaAst.g:108:11: DIV ^r= expr_minus
            	    {
            	    DIV108=(Token)match(input,DIV,FOLLOW_DIV_in_expr_arith1049); 
            	    DIV108_tree = 
            	    (Object)adaptor.create(DIV108)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(DIV108_tree, root_0);


            	    pushFollow(FOLLOW_expr_minus_in_expr_arith1056);
            	    r=expr_minus();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;
            	case 3 :
            	    // compiler/ast/GramaticaAst.g:109:11: MOD ^r= expr_minus
            	    {
            	    MOD109=(Token)match(input,MOD,FOLLOW_MOD_in_expr_arith1068); 
            	    MOD109_tree = 
            	    (Object)adaptor.create(MOD109)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(MOD109_tree, root_0);


            	    pushFollow(FOLLOW_expr_minus_in_expr_arith1075);
            	    r=expr_minus();

            	    state._fsp--;

            	    adaptor.addChild(root_0, r.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_arith"


    public static class expr_minus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_minus"
    // compiler/ast/GramaticaAst.g:110:1: expr_minus : (l= expr_not | ( MINUS ^r= expr_not ) );
    public final GramaticaAst.expr_minus_return expr_minus() throws RecognitionException {
        GramaticaAst.expr_minus_return retval = new GramaticaAst.expr_minus_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MINUS110=null;
        GramaticaAst.expr_not_return l =null;

        GramaticaAst.expr_not_return r =null;


        Object MINUS110_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:110:13: (l= expr_not | ( MINUS ^r= expr_not ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CALLOUT||LA29_0==CHR||LA29_0==DIGIT||LA29_0==FALSE||LA29_0==HEX||LA29_0==INDENTIFIER||LA29_0==LPAREN||LA29_0==NOT||LA29_0==TRUE) ) {
                alt29=1;
            }
            else if ( (LA29_0==MINUS) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // compiler/ast/GramaticaAst.g:110:15: l= expr_not
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_not_in_expr_minus1087);
                    l=expr_not();

                    state._fsp--;

                    adaptor.addChild(root_0, l.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:111:7: ( MINUS ^r= expr_not )
                    {
                    root_0 = (Object)adaptor.nil();


                    // compiler/ast/GramaticaAst.g:111:7: ( MINUS ^r= expr_not )
                    // compiler/ast/GramaticaAst.g:111:8: MINUS ^r= expr_not
                    {
                    MINUS110=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_minus1097); 
                    MINUS110_tree = 
                    (Object)adaptor.create(MINUS110)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(MINUS110_tree, root_0);


                    pushFollow(FOLLOW_expr_not_in_expr_minus1102);
                    r=expr_not();

                    state._fsp--;

                    adaptor.addChild(root_0, r.getTree());

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_minus"


    public static class expr_not_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_not"
    // compiler/ast/GramaticaAst.g:112:1: expr_not : (l= factorExpr | ( NOT ^r= factorExpr ) );
    public final GramaticaAst.expr_not_return expr_not() throws RecognitionException {
        GramaticaAst.expr_not_return retval = new GramaticaAst.expr_not_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT111=null;
        GramaticaAst.factorExpr_return l =null;

        GramaticaAst.factorExpr_return r =null;


        Object NOT111_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:112:11: (l= factorExpr | ( NOT ^r= factorExpr ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CALLOUT||LA30_0==CHR||LA30_0==DIGIT||LA30_0==FALSE||LA30_0==HEX||LA30_0==INDENTIFIER||LA30_0==LPAREN||LA30_0==TRUE) ) {
                alt30=1;
            }
            else if ( (LA30_0==NOT) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // compiler/ast/GramaticaAst.g:112:13: l= factorExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_factorExpr_in_expr_not1113);
                    l=factorExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, l.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:113:7: ( NOT ^r= factorExpr )
                    {
                    root_0 = (Object)adaptor.nil();


                    // compiler/ast/GramaticaAst.g:113:7: ( NOT ^r= factorExpr )
                    // compiler/ast/GramaticaAst.g:113:8: NOT ^r= factorExpr
                    {
                    NOT111=(Token)match(input,NOT,FOLLOW_NOT_in_expr_not1122); 
                    NOT111_tree = 
                    (Object)adaptor.create(NOT111)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NOT111_tree, root_0);


                    pushFollow(FOLLOW_factorExpr_in_expr_not1127);
                    r=factorExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, r.getTree());

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_not"


    public static class factorExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factorExpr"
    // compiler/ast/GramaticaAst.g:115:1: factorExpr : ( location -> ^( EX location ) | method_call -> ^( EX method_call ) | DIGIT | HEX | CHR | TRUE | FALSE | LPAREN expr RPAREN -> expr );
    public final GramaticaAst.factorExpr_return factorExpr() throws RecognitionException {
        GramaticaAst.factorExpr_return retval = new GramaticaAst.factorExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DIGIT114=null;
        Token HEX115=null;
        Token CHR116=null;
        Token TRUE117=null;
        Token FALSE118=null;
        Token LPAREN119=null;
        Token RPAREN121=null;
        GramaticaAst.location_return location112 =null;

        GramaticaAst.method_call_return method_call113 =null;

        GramaticaAst.expr_return expr120 =null;


        Object DIGIT114_tree=null;
        Object HEX115_tree=null;
        Object CHR116_tree=null;
        Object TRUE117_tree=null;
        Object FALSE118_tree=null;
        Object LPAREN119_tree=null;
        Object RPAREN121_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_location=new RewriteRuleSubtreeStream(adaptor,"rule location");
        RewriteRuleSubtreeStream stream_method_call=new RewriteRuleSubtreeStream(adaptor,"rule method_call");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // compiler/ast/GramaticaAst.g:115:13: ( location -> ^( EX location ) | method_call -> ^( EX method_call ) | DIGIT | HEX | CHR | TRUE | FALSE | LPAREN expr RPAREN -> expr )
            int alt31=8;
            switch ( input.LA(1) ) {
            case INDENTIFIER:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==ADD||LA31_1==AND||LA31_1==COMA||LA31_1==DIV||LA31_1==EQUAL||(LA31_1 >= GREATHAN && LA31_1 <= GTOEQ)||(LA31_1 >= LBRACE && LA31_1 <= LESSTHAN)||(LA31_1 >= LTOEQ && LA31_1 <= MINUS)||(LA31_1 >= MOD && LA31_1 <= NEQUAL)||LA31_1==OR||LA31_1==RBRAKET||(LA31_1 >= RPAREN && LA31_1 <= SEMICO)) ) {
                    alt31=1;
                }
                else if ( (LA31_1==LPAREN) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
                }
                break;
            case CALLOUT:
                {
                alt31=2;
                }
                break;
            case DIGIT:
                {
                alt31=3;
                }
                break;
            case HEX:
                {
                alt31=4;
                }
                break;
            case CHR:
                {
                alt31=5;
                }
                break;
            case TRUE:
                {
                alt31=6;
                }
                break;
            case FALSE:
                {
                alt31=7;
                }
                break;
            case LPAREN:
                {
                alt31=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // compiler/ast/GramaticaAst.g:115:15: location
                    {
                    pushFollow(FOLLOW_location_in_factorExpr1137);
                    location112=location();

                    state._fsp--;

                    stream_location.add(location112.getTree());

                    // AST REWRITE
                    // elements: location
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:28: -> ^( EX location )
                    {
                        // compiler/ast/GramaticaAst.g:115:31: ^( EX location )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EX, "EX")
                        , root_1);

                        adaptor.addChild(root_1, stream_location.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:116:7: method_call
                    {
                    pushFollow(FOLLOW_method_call_in_factorExpr1157);
                    method_call113=method_call();

                    state._fsp--;

                    stream_method_call.add(method_call113.getTree());

                    // AST REWRITE
                    // elements: method_call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:22: -> ^( EX method_call )
                    {
                        // compiler/ast/GramaticaAst.g:116:25: ^( EX method_call )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EX, "EX")
                        , root_1);

                        adaptor.addChild(root_1, stream_method_call.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // compiler/ast/GramaticaAst.g:117:7: DIGIT
                    {
                    root_0 = (Object)adaptor.nil();


                    DIGIT114=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_factorExpr1176); 
                    DIGIT114_tree = 
                    (Object)adaptor.create(DIGIT114)
                    ;
                    adaptor.addChild(root_0, DIGIT114_tree);


                    }
                    break;
                case 4 :
                    // compiler/ast/GramaticaAst.g:118:7: HEX
                    {
                    root_0 = (Object)adaptor.nil();


                    HEX115=(Token)match(input,HEX,FOLLOW_HEX_in_factorExpr1184); 
                    HEX115_tree = 
                    (Object)adaptor.create(HEX115)
                    ;
                    adaptor.addChild(root_0, HEX115_tree);


                    }
                    break;
                case 5 :
                    // compiler/ast/GramaticaAst.g:119:7: CHR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHR116=(Token)match(input,CHR,FOLLOW_CHR_in_factorExpr1198); 
                    CHR116_tree = 
                    (Object)adaptor.create(CHR116)
                    ;
                    adaptor.addChild(root_0, CHR116_tree);


                    }
                    break;
                case 6 :
                    // compiler/ast/GramaticaAst.g:120:7: TRUE
                    {
                    root_0 = (Object)adaptor.nil();


                    TRUE117=(Token)match(input,TRUE,FOLLOW_TRUE_in_factorExpr1212); 
                    TRUE117_tree = 
                    (Object)adaptor.create(TRUE117)
                    ;
                    adaptor.addChild(root_0, TRUE117_tree);


                    }
                    break;
                case 7 :
                    // compiler/ast/GramaticaAst.g:121:7: FALSE
                    {
                    root_0 = (Object)adaptor.nil();


                    FALSE118=(Token)match(input,FALSE,FOLLOW_FALSE_in_factorExpr1227); 
                    FALSE118_tree = 
                    (Object)adaptor.create(FALSE118)
                    ;
                    adaptor.addChild(root_0, FALSE118_tree);


                    }
                    break;
                case 8 :
                    // compiler/ast/GramaticaAst.g:122:7: LPAREN expr RPAREN
                    {
                    LPAREN119=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factorExpr1241);  
                    stream_LPAREN.add(LPAREN119);


                    pushFollow(FOLLOW_expr_in_factorExpr1243);
                    expr120=expr();

                    state._fsp--;

                    stream_expr.add(expr120.getTree());

                    RPAREN121=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factorExpr1245);  
                    stream_RPAREN.add(RPAREN121);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:26: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factorExpr"


    public static class callout_arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callout_arg"
    // compiler/ast/GramaticaAst.g:124:1: callout_arg : ( expr | string_literal );
    public final GramaticaAst.callout_arg_return callout_arg() throws RecognitionException {
        GramaticaAst.callout_arg_return retval = new GramaticaAst.callout_arg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.expr_return expr122 =null;

        GramaticaAst.string_literal_return string_literal123 =null;



        try {
            // compiler/ast/GramaticaAst.g:124:14: ( expr | string_literal )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==CALLOUT||LA32_0==CHR||LA32_0==DIGIT||LA32_0==FALSE||LA32_0==HEX||LA32_0==INDENTIFIER||LA32_0==LPAREN||LA32_0==MINUS||LA32_0==NOT||LA32_0==TRUE) ) {
                alt32=1;
            }
            else if ( (LA32_0==STR) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // compiler/ast/GramaticaAst.g:124:16: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_callout_arg1258);
                    expr122=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr122.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:124:23: string_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_string_literal_in_callout_arg1262);
                    string_literal123=string_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, string_literal123.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callout_arg"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // compiler/ast/GramaticaAst.g:127:1: literal : ( int_literal | char_literal | bool_literal );
    public final GramaticaAst.literal_return literal() throws RecognitionException {
        GramaticaAst.literal_return retval = new GramaticaAst.literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.int_literal_return int_literal124 =null;

        GramaticaAst.char_literal_return char_literal125 =null;

        GramaticaAst.bool_literal_return bool_literal126 =null;



        try {
            // compiler/ast/GramaticaAst.g:127:11: ( int_literal | char_literal | bool_literal )
            int alt33=3;
            switch ( input.LA(1) ) {
            case DIGIT:
            case HEX:
                {
                alt33=1;
                }
                break;
            case CHR:
                {
                alt33=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // compiler/ast/GramaticaAst.g:127:13: int_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_int_literal_in_literal1273);
                    int_literal124=int_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, int_literal124.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:127:27: char_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_char_literal_in_literal1277);
                    char_literal125=char_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, char_literal125.getTree());

                    }
                    break;
                case 3 :
                    // compiler/ast/GramaticaAst.g:127:42: bool_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bool_literal_in_literal1281);
                    bool_literal126=bool_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_literal126.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // compiler/ast/GramaticaAst.g:129:1: id : INDENTIFIER ;
    public final GramaticaAst.id_return id() throws RecognitionException {
        GramaticaAst.id_return retval = new GramaticaAst.id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INDENTIFIER127=null;

        Object INDENTIFIER127_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:129:8: ( INDENTIFIER )
            // compiler/ast/GramaticaAst.g:129:10: INDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            INDENTIFIER127=(Token)match(input,INDENTIFIER,FOLLOW_INDENTIFIER_in_id1293); 
            INDENTIFIER127_tree = 
            (Object)adaptor.create(INDENTIFIER127)
            ;
            adaptor.addChild(root_0, INDENTIFIER127_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id"


    public static class alpha_num_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alpha_num"
    // compiler/ast/GramaticaAst.g:131:1: alpha_num : ( CHAR | UNDERSCORE | NUM );
    public final GramaticaAst.alpha_num_return alpha_num() throws RecognitionException {
        GramaticaAst.alpha_num_return retval = new GramaticaAst.alpha_num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set128=null;

        Object set128_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:131:12: ( CHAR | UNDERSCORE | NUM )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set128=(Token)input.LT(1);

            if ( input.LA(1)==CHAR||input.LA(1)==NUM||input.LA(1)==UNDERSCORE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set128)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alpha_num"


    public static class hex_digit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hex_digit"
    // compiler/ast/GramaticaAst.g:133:1: hex_digit : ( NUM | HEXCHAR );
    public final GramaticaAst.hex_digit_return hex_digit() throws RecognitionException {
        GramaticaAst.hex_digit_return retval = new GramaticaAst.hex_digit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set129=null;

        Object set129_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:133:13: ( NUM | HEXCHAR )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set129=(Token)input.LT(1);

            if ( input.LA(1)==HEXCHAR||input.LA(1)==NUM ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set129)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hex_digit"


    public static class int_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "int_literal"
    // compiler/ast/GramaticaAst.g:135:1: int_literal : ( DIGIT | HEX );
    public final GramaticaAst.int_literal_return int_literal() throws RecognitionException {
        GramaticaAst.int_literal_return retval = new GramaticaAst.int_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set130=null;

        Object set130_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:135:14: ( DIGIT | HEX )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set130=(Token)input.LT(1);

            if ( input.LA(1)==DIGIT||input.LA(1)==HEX ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set130)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "int_literal"


    public static class bool_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_literal"
    // compiler/ast/GramaticaAst.g:137:1: bool_literal : ( TRUE | FALSE );
    public final GramaticaAst.bool_literal_return bool_literal() throws RecognitionException {
        GramaticaAst.bool_literal_return retval = new GramaticaAst.bool_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set131=null;

        Object set131_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:137:17: ( TRUE | FALSE )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set131=(Token)input.LT(1);

            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set131)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_literal"


    public static class char_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "char_literal"
    // compiler/ast/GramaticaAst.g:139:1: char_literal : CHR ;
    public final GramaticaAst.char_literal_return char_literal() throws RecognitionException {
        GramaticaAst.char_literal_return retval = new GramaticaAst.char_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHR132=null;

        Object CHR132_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:139:14: ( CHR )
            // compiler/ast/GramaticaAst.g:139:16: CHR
            {
            root_0 = (Object)adaptor.nil();


            CHR132=(Token)match(input,CHR,FOLLOW_CHR_in_char_literal1361); 
            CHR132_tree = 
            (Object)adaptor.create(CHR132)
            ;
            adaptor.addChild(root_0, CHR132_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "char_literal"


    public static class string_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_literal"
    // compiler/ast/GramaticaAst.g:141:1: string_literal : STR ;
    public final GramaticaAst.string_literal_return string_literal() throws RecognitionException {
        GramaticaAst.string_literal_return retval = new GramaticaAst.string_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STR133=null;

        Object STR133_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:141:17: ( STR )
            // compiler/ast/GramaticaAst.g:141:19: STR
            {
            root_0 = (Object)adaptor.nil();


            STR133=(Token)match(input,STR,FOLLOW_STR_in_string_literal1370); 
            STR133_tree = 
            (Object)adaptor.create(STR133)
            ;
            adaptor.addChild(root_0, STR133_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string_literal"

    // Delegated rules


 

    public static final BitSet FOLLOW_CLASS_in_start92 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_PROGRAM_in_start94 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_start96 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004004L});
    public static final BitSet FOLLOW_field_decl_in_start98 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004004L});
    public static final BitSet FOLLOW_method_decl_in_start101 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004004L});
    public static final BitSet FOLLOW_RBRACE_in_start104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_field_decl132 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_field_decl135 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_id_in_field_decl139 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRAKET_in_field_decl141 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_int_literal_in_field_decl143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRAKET_in_field_decl145 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMA_in_field_decl149 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_field_decl152 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_id_in_field_decl156 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRAKET_in_field_decl158 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_int_literal_in_field_decl160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRAKET_in_field_decl162 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_field_decl167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_method_decl202 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl205 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_decl207 = new BitSet(new long[]{0x0000001000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_method_decl211 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl213 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_decl217 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_type_in_method_decl219 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl221 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_decl228 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_method_decl230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_method_decl266 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl269 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_decl271 = new BitSet(new long[]{0x0000001000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_method_decl275 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl277 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_decl281 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_type_in_method_decl283 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl285 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_decl292 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_method_decl294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block329 = new BitSet(new long[]{0x0000003C2020E000L,0x0000000000000014L});
    public static final BitSet FOLLOW_var_decl_in_block331 = new BitSet(new long[]{0x0000003C2020E000L,0x0000000000000014L});
    public static final BitSet FOLLOW_statement_in_block334 = new BitSet(new long[]{0x0000002C2020C000L,0x0000000000000014L});
    public static final BitSet FOLLOW_RBRACE_in_block337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var_decl364 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_var_decl366 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMA_in_var_decl369 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_var_decl371 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_var_decl375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_location_in_statement412 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_assign_op_in_statement414 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_call_in_statement440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement464 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement466 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_statement470 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_statement472 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ELSE_in_statement475 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_statement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement507 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_statement509 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ASSIGN_in_statement511 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement513 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COMA_in_statement515 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement517 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_statement519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement547 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000140L});
    public static final BitSet FOLLOW_expr_in_statement550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_name_in_method_call669 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_call671 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_method_call674 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_call676 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_method_call678 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_call684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALLOUT_in_method_call710 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_call712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_string_literal_in_method_call714 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_call718 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000180L});
    public static final BitSet FOLLOW_callout_arg_in_method_call720 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_call726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_method_name747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_location757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_location765 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRAKET_in_location767 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_location769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRAKET_in_location771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_and_in_expr796 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr799 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_and_in_expr806 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_expr_eq_in_expr_and820 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_expr_and824 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_eq_in_expr_and831 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_expr_rel_in_expr_eq847 = new BitSet(new long[]{0x0000400004000002L});
    public static final BitSet FOLLOW_EQUAL_in_expr_eq851 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_rel_in_expr_eq858 = new BitSet(new long[]{0x0000400004000002L});
    public static final BitSet FOLLOW_NEQUAL_in_expr_eq871 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_rel_in_expr_eq878 = new BitSet(new long[]{0x0000400004000002L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel893 = new BitSet(new long[]{0x00000280C0000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_expr_rel897 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel904 = new BitSet(new long[]{0x00000280C0000002L});
    public static final BitSet FOLLOW_GREATHAN_in_expr_rel917 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel924 = new BitSet(new long[]{0x00000280C0000002L});
    public static final BitSet FOLLOW_LTOEQ_in_expr_rel937 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel944 = new BitSet(new long[]{0x00000280C0000002L});
    public static final BitSet FOLLOW_GTOEQ_in_expr_rel957 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel964 = new BitSet(new long[]{0x00000280C0000002L});
    public static final BitSet FOLLOW_expr_arith_in_expr_add979 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_ADD_in_expr_add983 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_arith_in_expr_add990 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_MINUS_in_expr_add1003 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_arith_in_expr_add1010 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_expr_minus_in_expr_arith1025 = new BitSet(new long[]{0x0000300000800002L});
    public static final BitSet FOLLOW_MULT_in_expr_arith1029 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_minus_in_expr_arith1036 = new BitSet(new long[]{0x0000300000800002L});
    public static final BitSet FOLLOW_DIV_in_expr_arith1049 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_minus_in_expr_arith1056 = new BitSet(new long[]{0x0000300000800002L});
    public static final BitSet FOLLOW_MOD_in_expr_arith1068 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_minus_in_expr_arith1075 = new BitSet(new long[]{0x0000300000800002L});
    public static final BitSet FOLLOW_expr_not_in_expr_minus1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_minus1097 = new BitSet(new long[]{0x0000810910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_not_in_expr_minus1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factorExpr_in_expr_not1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_expr_not1122 = new BitSet(new long[]{0x0000010910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_factorExpr_in_expr_not1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_location_in_factorExpr1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_call_in_factorExpr1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_factorExpr1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_in_factorExpr1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHR_in_factorExpr1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_factorExpr1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_factorExpr1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_factorExpr1241 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_factorExpr1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_factorExpr1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_callout_arg1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_callout_arg1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_literal_in_literal1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_literal_in_literal1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_literal_in_literal1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENTIFIER_in_id1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHR_in_char_literal1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_string_literal1370 = new BitSet(new long[]{0x0000000000000002L});

}