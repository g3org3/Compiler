// $ANTLR 3.4 compiler/ast/GramaticaAst.g 2013-09-12 11:06:57

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ADD1", "ALPHA", "AND", "ANDBITWISE", "ASCII", "ASSIGN", "ASSIGNADD", "ASSIGNSUB", "BOOLEAN", "BREAK", "CALLOUT", "CHAR", "CHR", "CLASS", "COMA", "COMMENTS", "CONTINUE", "DIGIT", "DIV", "DPOINTS", "ELSE", "EQUAL", "ESC", "FALSE", "FOR", "GREATHAN", "GTOEQ", "HEX", "HEXCHAR", "IF", "INDENTIFIER", "INT", "LBRACE", "LBRAKET", "LESSTHAN", "LPAREN", "LTOEQ", "MINUS", "MINUS1", "MOD", "MULT", "NEQUAL", "NOT", "NOTCHAR1", "NOTCHAR2", "NOTCHAR3", "NOTCHAR4", "NOTCHAR5", "NOTCHAR6", "NOTHEX1", "NOTHEX2", "NOTSTR1", "NOTSTR2", "NOTSTR3", "NUM", "OR", "ORBITWISE", "POINT", "PROGRAM", "QMARK", "RAISE", "RBRACE", "RBRAKET", "RETURN", "RPAREN", "SEMICO", "STR", "TRUE", "UCASE", "UNDERSCORE", "UNICODE1", "UNICODE2", "UNICODE3", "VOID", "WHITESPACE", "BLOCK", "EX", "FIELD", "METHOD", "ROOT", "STATEMENT", "VARS"
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
    public static final int BLOCK=80;
    public static final int EX=81;
    public static final int FIELD=82;
    public static final int METHOD=83;
    public static final int ROOT=84;
    public static final int STATEMENT=85;
    public static final int VARS=86;

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
    // compiler/ast/GramaticaAst.g:52:1: start : CLASS PROGRAM LBRACE ( field_decl )* ( method_decl )* RBRACE -> ^( ROOT ( field_decl )* ( method_decl )* ) ;
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
            // compiler/ast/GramaticaAst.g:52:10: ( CLASS PROGRAM LBRACE ( field_decl )* ( method_decl )* RBRACE -> ^( ROOT ( field_decl )* ( method_decl )* ) )
            // compiler/ast/GramaticaAst.g:52:12: CLASS PROGRAM LBRACE ( field_decl )* ( method_decl )* RBRACE
            {
            CLASS1=(Token)match(input,CLASS,FOLLOW_CLASS_in_start80);  
            stream_CLASS.add(CLASS1);


            PROGRAM2=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_start82);  
            stream_PROGRAM.add(PROGRAM2);


            LBRACE3=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_start84);  
            stream_LBRACE.add(LBRACE3);


            // compiler/ast/GramaticaAst.g:52:33: ( field_decl )*
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
            	    // compiler/ast/GramaticaAst.g:52:33: field_decl
            	    {
            	    pushFollow(FOLLOW_field_decl_in_start86);
            	    field_decl4=field_decl();

            	    state._fsp--;

            	    stream_field_decl.add(field_decl4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // compiler/ast/GramaticaAst.g:52:45: ( method_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BOOLEAN||LA2_0==INT||LA2_0==VOID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:52:45: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_start89);
            	    method_decl5=method_decl();

            	    state._fsp--;

            	    stream_method_decl.add(method_decl5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            RBRACE6=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_start92);  
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
            // 53:6: -> ^( ROOT ( field_decl )* ( method_decl )* )
            {
                // compiler/ast/GramaticaAst.g:53:9: ^( ROOT ( field_decl )* ( method_decl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ROOT, "ROOT")
                , root_1);

                // compiler/ast/GramaticaAst.g:53:16: ( field_decl )*
                while ( stream_field_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_decl.nextTree());

                }
                stream_field_decl.reset();

                // compiler/ast/GramaticaAst.g:53:28: ( method_decl )*
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
    // compiler/ast/GramaticaAst.g:55:1: field_decl : type ( id | id LBRAKET int_literal RBRAKET ) ( COMA ( id | id LBRAKET int_literal RBRAKET ) )* SEMICO -> ^( FIELD type ( id ( LBRAKET )? ( int_literal )? ( RBRAKET )? )+ ) ;
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
            // compiler/ast/GramaticaAst.g:55:13: ( type ( id | id LBRAKET int_literal RBRAKET ) ( COMA ( id | id LBRAKET int_literal RBRAKET ) )* SEMICO -> ^( FIELD type ( id ( LBRAKET )? ( int_literal )? ( RBRAKET )? )+ ) )
            // compiler/ast/GramaticaAst.g:55:15: type ( id | id LBRAKET int_literal RBRAKET ) ( COMA ( id | id LBRAKET int_literal RBRAKET ) )* SEMICO
            {
            pushFollow(FOLLOW_type_in_field_decl120);
            type7=type();

            state._fsp--;

            stream_type.add(type7.getTree());

            // compiler/ast/GramaticaAst.g:55:20: ( id | id LBRAKET int_literal RBRAKET )
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
                    // compiler/ast/GramaticaAst.g:55:21: id
                    {
                    pushFollow(FOLLOW_id_in_field_decl123);
                    id8=id();

                    state._fsp--;

                    stream_id.add(id8.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:55:26: id LBRAKET int_literal RBRAKET
                    {
                    pushFollow(FOLLOW_id_in_field_decl127);
                    id9=id();

                    state._fsp--;

                    stream_id.add(id9.getTree());

                    LBRAKET10=(Token)match(input,LBRAKET,FOLLOW_LBRAKET_in_field_decl129);  
                    stream_LBRAKET.add(LBRAKET10);


                    pushFollow(FOLLOW_int_literal_in_field_decl131);
                    int_literal11=int_literal();

                    state._fsp--;

                    stream_int_literal.add(int_literal11.getTree());

                    RBRAKET12=(Token)match(input,RBRAKET,FOLLOW_RBRAKET_in_field_decl133);  
                    stream_RBRAKET.add(RBRAKET12);


                    }
                    break;

            }


            // compiler/ast/GramaticaAst.g:55:58: ( COMA ( id | id LBRAKET int_literal RBRAKET ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:55:59: COMA ( id | id LBRAKET int_literal RBRAKET )
            	    {
            	    COMA13=(Token)match(input,COMA,FOLLOW_COMA_in_field_decl137);  
            	    stream_COMA.add(COMA13);


            	    // compiler/ast/GramaticaAst.g:55:64: ( id | id LBRAKET int_literal RBRAKET )
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
            	            // compiler/ast/GramaticaAst.g:55:65: id
            	            {
            	            pushFollow(FOLLOW_id_in_field_decl140);
            	            id14=id();

            	            state._fsp--;

            	            stream_id.add(id14.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // compiler/ast/GramaticaAst.g:55:70: id LBRAKET int_literal RBRAKET
            	            {
            	            pushFollow(FOLLOW_id_in_field_decl144);
            	            id15=id();

            	            state._fsp--;

            	            stream_id.add(id15.getTree());

            	            LBRAKET16=(Token)match(input,LBRAKET,FOLLOW_LBRAKET_in_field_decl146);  
            	            stream_LBRAKET.add(LBRAKET16);


            	            pushFollow(FOLLOW_int_literal_in_field_decl148);
            	            int_literal17=int_literal();

            	            state._fsp--;

            	            stream_int_literal.add(int_literal17.getTree());

            	            RBRAKET18=(Token)match(input,RBRAKET,FOLLOW_RBRAKET_in_field_decl150);  
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


            SEMICO19=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_field_decl155);  
            stream_SEMICO.add(SEMICO19);


            // AST REWRITE
            // elements: RBRAKET, int_literal, LBRAKET, id, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:6: -> ^( FIELD type ( id ( LBRAKET )? ( int_literal )? ( RBRAKET )? )+ )
            {
                // compiler/ast/GramaticaAst.g:56:9: ^( FIELD type ( id ( LBRAKET )? ( int_literal )? ( RBRAKET )? )+ )
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

                    // compiler/ast/GramaticaAst.g:56:26: ( LBRAKET )?
                    if ( stream_LBRAKET.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_LBRAKET.nextNode()
                        );

                    }
                    stream_LBRAKET.reset();

                    // compiler/ast/GramaticaAst.g:56:35: ( int_literal )?
                    if ( stream_int_literal.hasNext() ) {
                        adaptor.addChild(root_1, stream_int_literal.nextTree());

                    }
                    stream_int_literal.reset();

                    // compiler/ast/GramaticaAst.g:56:48: ( RBRAKET )?
                    if ( stream_RBRAKET.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_RBRAKET.nextNode()
                        );

                    }
                    stream_RBRAKET.reset();

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
    // compiler/ast/GramaticaAst.g:58:1: method_decl : ( ( ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD VOID id ( type id )* block ) ) | ( ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD type id ( type id )* block ) ) );
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
            // compiler/ast/GramaticaAst.g:58:14: ( ( ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD VOID id ( type id )* block ) ) | ( ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD type id ( type id )* block ) ) )
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
                    // compiler/ast/GramaticaAst.g:58:16: ( ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD VOID id ( type id )* block ) )
                    {
                    // compiler/ast/GramaticaAst.g:58:16: ( ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD VOID id ( type id )* block ) )
                    // compiler/ast/GramaticaAst.g:58:17: ( VOID ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block
                    {
                    // compiler/ast/GramaticaAst.g:58:17: ( VOID )
                    // compiler/ast/GramaticaAst.g:58:18: VOID
                    {
                    VOID20=(Token)match(input,VOID,FOLLOW_VOID_in_method_decl195);  
                    stream_VOID.add(VOID20);


                    }


                    pushFollow(FOLLOW_id_in_method_decl198);
                    id21=id();

                    state._fsp--;

                    stream_id.add(id21.getTree());

                    LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_method_decl200);  
                    stream_LPAREN.add(LPAREN22);


                    // compiler/ast/GramaticaAst.g:58:34: ( ( type id ) ( COMA type id )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==BOOLEAN||LA7_0==INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:58:35: ( type id ) ( COMA type id )*
                            {
                            // compiler/ast/GramaticaAst.g:58:35: ( type id )
                            // compiler/ast/GramaticaAst.g:58:36: type id
                            {
                            pushFollow(FOLLOW_type_in_method_decl204);
                            type23=type();

                            state._fsp--;

                            stream_type.add(type23.getTree());

                            pushFollow(FOLLOW_id_in_method_decl206);
                            id24=id();

                            state._fsp--;

                            stream_id.add(id24.getTree());

                            }


                            // compiler/ast/GramaticaAst.g:58:45: ( COMA type id )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==COMA) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // compiler/ast/GramaticaAst.g:58:46: COMA type id
                            	    {
                            	    COMA25=(Token)match(input,COMA,FOLLOW_COMA_in_method_decl210);  
                            	    stream_COMA.add(COMA25);


                            	    pushFollow(FOLLOW_type_in_method_decl212);
                            	    type26=type();

                            	    state._fsp--;

                            	    stream_type.add(type26.getTree());

                            	    pushFollow(FOLLOW_id_in_method_decl214);
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


                    RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_decl221);  
                    stream_RPAREN.add(RPAREN28);


                    pushFollow(FOLLOW_block_in_method_decl223);
                    block29=block();

                    state._fsp--;

                    stream_block.add(block29.getTree());

                    // AST REWRITE
                    // elements: id, block, VOID, type, id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:6: -> ^( METHOD VOID id ( type id )* block )
                    {
                        // compiler/ast/GramaticaAst.g:59:9: ^( METHOD VOID id ( type id )* block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD, "METHOD")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VOID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_id.nextTree());

                        // compiler/ast/GramaticaAst.g:59:27: ( type id )*
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
                    // compiler/ast/GramaticaAst.g:60:7: ( ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD type id ( type id )* block ) )
                    {
                    // compiler/ast/GramaticaAst.g:60:7: ( ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block -> ^( METHOD type id ( type id )* block ) )
                    // compiler/ast/GramaticaAst.g:60:8: ( type ) id LPAREN ( ( type id ) ( COMA type id )* )? RPAREN block
                    {
                    // compiler/ast/GramaticaAst.g:60:8: ( type )
                    // compiler/ast/GramaticaAst.g:60:9: type
                    {
                    pushFollow(FOLLOW_type_in_method_decl259);
                    type30=type();

                    state._fsp--;

                    stream_type.add(type30.getTree());

                    }


                    pushFollow(FOLLOW_id_in_method_decl262);
                    id31=id();

                    state._fsp--;

                    stream_id.add(id31.getTree());

                    LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_method_decl264);  
                    stream_LPAREN.add(LPAREN32);


                    // compiler/ast/GramaticaAst.g:60:25: ( ( type id ) ( COMA type id )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==BOOLEAN||LA9_0==INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:60:26: ( type id ) ( COMA type id )*
                            {
                            // compiler/ast/GramaticaAst.g:60:26: ( type id )
                            // compiler/ast/GramaticaAst.g:60:27: type id
                            {
                            pushFollow(FOLLOW_type_in_method_decl268);
                            type33=type();

                            state._fsp--;

                            stream_type.add(type33.getTree());

                            pushFollow(FOLLOW_id_in_method_decl270);
                            id34=id();

                            state._fsp--;

                            stream_id.add(id34.getTree());

                            }


                            // compiler/ast/GramaticaAst.g:60:36: ( COMA type id )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==COMA) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // compiler/ast/GramaticaAst.g:60:37: COMA type id
                            	    {
                            	    COMA35=(Token)match(input,COMA,FOLLOW_COMA_in_method_decl274);  
                            	    stream_COMA.add(COMA35);


                            	    pushFollow(FOLLOW_type_in_method_decl276);
                            	    type36=type();

                            	    state._fsp--;

                            	    stream_type.add(type36.getTree());

                            	    pushFollow(FOLLOW_id_in_method_decl278);
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


                    RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_decl285);  
                    stream_RPAREN.add(RPAREN38);


                    pushFollow(FOLLOW_block_in_method_decl287);
                    block39=block();

                    state._fsp--;

                    stream_block.add(block39.getTree());

                    // AST REWRITE
                    // elements: block, type, id, id, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 61:6: -> ^( METHOD type id ( type id )* block )
                    {
                        // compiler/ast/GramaticaAst.g:61:9: ^( METHOD type id ( type id )* block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD, "METHOD")
                        , root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, stream_id.nextTree());

                        // compiler/ast/GramaticaAst.g:61:27: ( type id )*
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
    // compiler/ast/GramaticaAst.g:63:1: block : LBRACE ( var_decl )* ( statement )* RBRACE -> ^( BLOCK ( var_decl )* ( statement )* ) ;
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
            // compiler/ast/GramaticaAst.g:63:9: ( LBRACE ( var_decl )* ( statement )* RBRACE -> ^( BLOCK ( var_decl )* ( statement )* ) )
            // compiler/ast/GramaticaAst.g:63:11: LBRACE ( var_decl )* ( statement )* RBRACE
            {
            LBRACE40=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block323);  
            stream_LBRACE.add(LBRACE40);


            // compiler/ast/GramaticaAst.g:63:18: ( var_decl )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BOOLEAN||LA11_0==INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:63:18: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_block325);
            	    var_decl41=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl41.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // compiler/ast/GramaticaAst.g:63:28: ( statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= BREAK && LA12_0 <= CALLOUT)||LA12_0==CONTINUE||LA12_0==FOR||(LA12_0 >= IF && LA12_0 <= INDENTIFIER)||LA12_0==LBRACE||LA12_0==RETURN) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:63:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block328);
            	    statement42=statement();

            	    state._fsp--;

            	    stream_statement.add(statement42.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            RBRACE43=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block331);  
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
            // 64:6: -> ^( BLOCK ( var_decl )* ( statement )* )
            {
                // compiler/ast/GramaticaAst.g:64:9: ^( BLOCK ( var_decl )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // compiler/ast/GramaticaAst.g:64:17: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();

                // compiler/ast/GramaticaAst.g:64:27: ( statement )*
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
    // compiler/ast/GramaticaAst.g:66:1: var_decl : type id ( COMA id )* SEMICO -> ^( VARS type id ( COMA id )* ) ;
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
            // compiler/ast/GramaticaAst.g:66:11: ( type id ( COMA id )* SEMICO -> ^( VARS type id ( COMA id )* ) )
            // compiler/ast/GramaticaAst.g:66:13: type id ( COMA id )* SEMICO
            {
            pushFollow(FOLLOW_type_in_var_decl359);
            type44=type();

            state._fsp--;

            stream_type.add(type44.getTree());

            pushFollow(FOLLOW_id_in_var_decl361);
            id45=id();

            state._fsp--;

            stream_id.add(id45.getTree());

            // compiler/ast/GramaticaAst.g:66:21: ( COMA id )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:66:22: COMA id
            	    {
            	    COMA46=(Token)match(input,COMA,FOLLOW_COMA_in_var_decl364);  
            	    stream_COMA.add(COMA46);


            	    pushFollow(FOLLOW_id_in_var_decl366);
            	    id47=id();

            	    state._fsp--;

            	    stream_id.add(id47.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            SEMICO48=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_var_decl370);  
            stream_SEMICO.add(SEMICO48);


            // AST REWRITE
            // elements: COMA, type, id, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:6: -> ^( VARS type id ( COMA id )* )
            {
                // compiler/ast/GramaticaAst.g:67:9: ^( VARS type id ( COMA id )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VARS, "VARS")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, stream_id.nextTree());

                // compiler/ast/GramaticaAst.g:67:24: ( COMA id )*
                while ( stream_COMA.hasNext()||stream_id.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_COMA.nextNode()
                    );

                    adaptor.addChild(root_1, stream_id.nextTree());

                }
                stream_COMA.reset();
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
    // compiler/ast/GramaticaAst.g:69:1: type : ( INT | BOOLEAN );
    public final GramaticaAst.type_return type() throws RecognitionException {
        GramaticaAst.type_return retval = new GramaticaAst.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set49=null;

        Object set49_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:69:9: ( INT | BOOLEAN )
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
    // compiler/ast/GramaticaAst.g:71:1: statement : ( location assign_op expr SEMICO | method_call SEMICO | IF LPAREN expr RPAREN block ( ELSE block )? | FOR id ASSIGN expr COMA expr block | RETURN ( expr )? SEMICO | BREAK SEMICO | CONTINUE SEMICO | block );
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

        try {
            // compiler/ast/GramaticaAst.g:71:12: ( location assign_op expr SEMICO | method_call SEMICO | IF LPAREN expr RPAREN block ( ELSE block )? | FOR id ASSIGN expr COMA expr block | RETURN ( expr )? SEMICO | BREAK SEMICO | CONTINUE SEMICO | block )
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
                    // compiler/ast/GramaticaAst.g:71:14: location assign_op expr SEMICO
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_location_in_statement419);
                    location50=location();

                    state._fsp--;

                    adaptor.addChild(root_0, location50.getTree());

                    pushFollow(FOLLOW_assign_op_in_statement421);
                    assign_op51=assign_op();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_op51.getTree());

                    pushFollow(FOLLOW_expr_in_statement423);
                    expr52=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr52.getTree());

                    SEMICO53=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement425); 
                    SEMICO53_tree = 
                    (Object)adaptor.create(SEMICO53)
                    ;
                    adaptor.addChild(root_0, SEMICO53_tree);


                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:72:7: method_call SEMICO
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_method_call_in_statement433);
                    method_call54=method_call();

                    state._fsp--;

                    adaptor.addChild(root_0, method_call54.getTree());

                    SEMICO55=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement435); 
                    SEMICO55_tree = 
                    (Object)adaptor.create(SEMICO55)
                    ;
                    adaptor.addChild(root_0, SEMICO55_tree);


                    }
                    break;
                case 3 :
                    // compiler/ast/GramaticaAst.g:73:7: IF LPAREN expr RPAREN block ( ELSE block )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IF56=(Token)match(input,IF,FOLLOW_IF_in_statement450); 
                    IF56_tree = 
                    (Object)adaptor.create(IF56)
                    ;
                    adaptor.addChild(root_0, IF56_tree);


                    LPAREN57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement452); 
                    LPAREN57_tree = 
                    (Object)adaptor.create(LPAREN57)
                    ;
                    adaptor.addChild(root_0, LPAREN57_tree);


                    pushFollow(FOLLOW_expr_in_statement454);
                    expr58=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr58.getTree());

                    RPAREN59=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement456); 
                    RPAREN59_tree = 
                    (Object)adaptor.create(RPAREN59)
                    ;
                    adaptor.addChild(root_0, RPAREN59_tree);


                    pushFollow(FOLLOW_block_in_statement458);
                    block60=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block60.getTree());

                    // compiler/ast/GramaticaAst.g:73:35: ( ELSE block )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ELSE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:73:36: ELSE block
                            {
                            ELSE61=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement461); 
                            ELSE61_tree = 
                            (Object)adaptor.create(ELSE61)
                            ;
                            adaptor.addChild(root_0, ELSE61_tree);


                            pushFollow(FOLLOW_block_in_statement463);
                            block62=block();

                            state._fsp--;

                            adaptor.addChild(root_0, block62.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // compiler/ast/GramaticaAst.g:74:7: FOR id ASSIGN expr COMA expr block
                    {
                    root_0 = (Object)adaptor.nil();


                    FOR63=(Token)match(input,FOR,FOLLOW_FOR_in_statement474); 
                    FOR63_tree = 
                    (Object)adaptor.create(FOR63)
                    ;
                    adaptor.addChild(root_0, FOR63_tree);


                    pushFollow(FOLLOW_id_in_statement476);
                    id64=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id64.getTree());

                    ASSIGN65=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement478); 
                    ASSIGN65_tree = 
                    (Object)adaptor.create(ASSIGN65)
                    ;
                    adaptor.addChild(root_0, ASSIGN65_tree);


                    pushFollow(FOLLOW_expr_in_statement480);
                    expr66=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr66.getTree());

                    COMA67=(Token)match(input,COMA,FOLLOW_COMA_in_statement482); 
                    COMA67_tree = 
                    (Object)adaptor.create(COMA67)
                    ;
                    adaptor.addChild(root_0, COMA67_tree);


                    pushFollow(FOLLOW_expr_in_statement484);
                    expr68=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr68.getTree());

                    pushFollow(FOLLOW_block_in_statement486);
                    block69=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block69.getTree());

                    }
                    break;
                case 5 :
                    // compiler/ast/GramaticaAst.g:75:7: RETURN ( expr )? SEMICO
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN70=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement494); 
                    RETURN70_tree = 
                    (Object)adaptor.create(RETURN70)
                    ;
                    adaptor.addChild(root_0, RETURN70_tree);


                    // compiler/ast/GramaticaAst.g:75:14: ( expr )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==CALLOUT||LA15_0==CHR||LA15_0==DIGIT||LA15_0==FALSE||LA15_0==HEX||LA15_0==INDENTIFIER||LA15_0==LPAREN||LA15_0==MINUS||LA15_0==NOT||LA15_0==TRUE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:75:15: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement497);
                            expr71=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr71.getTree());

                            }
                            break;

                    }


                    SEMICO72=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement501); 
                    SEMICO72_tree = 
                    (Object)adaptor.create(SEMICO72)
                    ;
                    adaptor.addChild(root_0, SEMICO72_tree);


                    }
                    break;
                case 6 :
                    // compiler/ast/GramaticaAst.g:76:7: BREAK SEMICO
                    {
                    root_0 = (Object)adaptor.nil();


                    BREAK73=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement509); 
                    BREAK73_tree = 
                    (Object)adaptor.create(BREAK73)
                    ;
                    adaptor.addChild(root_0, BREAK73_tree);


                    SEMICO74=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement511); 
                    SEMICO74_tree = 
                    (Object)adaptor.create(SEMICO74)
                    ;
                    adaptor.addChild(root_0, SEMICO74_tree);


                    }
                    break;
                case 7 :
                    // compiler/ast/GramaticaAst.g:77:7: CONTINUE SEMICO
                    {
                    root_0 = (Object)adaptor.nil();


                    CONTINUE75=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement519); 
                    CONTINUE75_tree = 
                    (Object)adaptor.create(CONTINUE75)
                    ;
                    adaptor.addChild(root_0, CONTINUE75_tree);


                    SEMICO76=(Token)match(input,SEMICO,FOLLOW_SEMICO_in_statement521); 
                    SEMICO76_tree = 
                    (Object)adaptor.create(SEMICO76)
                    ;
                    adaptor.addChild(root_0, SEMICO76_tree);


                    }
                    break;
                case 8 :
                    // compiler/ast/GramaticaAst.g:78:7: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement529);
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
    // compiler/ast/GramaticaAst.g:80:1: assign_op : ( ASSIGN | ASSIGNADD | ASSIGNSUB );
    public final GramaticaAst.assign_op_return assign_op() throws RecognitionException {
        GramaticaAst.assign_op_return retval = new GramaticaAst.assign_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set78=null;

        Object set78_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:80:12: ( ASSIGN | ASSIGNADD | ASSIGNSUB )
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
    // compiler/ast/GramaticaAst.g:84:1: method_call : ( method_name LPAREN ( expr ( COMA expr )* )? RPAREN | CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN );
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

        try {
            // compiler/ast/GramaticaAst.g:84:14: ( method_name LPAREN ( expr ( COMA expr )* )? RPAREN | CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN )
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
                    // compiler/ast/GramaticaAst.g:84:16: method_name LPAREN ( expr ( COMA expr )* )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_method_name_in_method_call566);
                    method_name79=method_name();

                    state._fsp--;

                    adaptor.addChild(root_0, method_name79.getTree());

                    LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_method_call568); 
                    LPAREN80_tree = 
                    (Object)adaptor.create(LPAREN80)
                    ;
                    adaptor.addChild(root_0, LPAREN80_tree);


                    // compiler/ast/GramaticaAst.g:84:35: ( expr ( COMA expr )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==CALLOUT||LA18_0==CHR||LA18_0==DIGIT||LA18_0==FALSE||LA18_0==HEX||LA18_0==INDENTIFIER||LA18_0==LPAREN||LA18_0==MINUS||LA18_0==NOT||LA18_0==TRUE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:84:36: expr ( COMA expr )*
                            {
                            pushFollow(FOLLOW_expr_in_method_call571);
                            expr81=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr81.getTree());

                            // compiler/ast/GramaticaAst.g:84:40: ( COMA expr )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==COMA) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // compiler/ast/GramaticaAst.g:84:41: COMA expr
                            	    {
                            	    COMA82=(Token)match(input,COMA,FOLLOW_COMA_in_method_call573); 
                            	    COMA82_tree = 
                            	    (Object)adaptor.create(COMA82)
                            	    ;
                            	    adaptor.addChild(root_0, COMA82_tree);


                            	    pushFollow(FOLLOW_expr_in_method_call575);
                            	    expr83=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, expr83.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }


                    RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_call581); 
                    RPAREN84_tree = 
                    (Object)adaptor.create(RPAREN84)
                    ;
                    adaptor.addChild(root_0, RPAREN84_tree);


                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:85:7: CALLOUT LPAREN string_literal ( ( COMA callout_arg )+ )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    CALLOUT85=(Token)match(input,CALLOUT,FOLLOW_CALLOUT_in_method_call589); 
                    CALLOUT85_tree = 
                    (Object)adaptor.create(CALLOUT85)
                    ;
                    adaptor.addChild(root_0, CALLOUT85_tree);


                    LPAREN86=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_method_call591); 
                    LPAREN86_tree = 
                    (Object)adaptor.create(LPAREN86)
                    ;
                    adaptor.addChild(root_0, LPAREN86_tree);


                    pushFollow(FOLLOW_string_literal_in_method_call593);
                    string_literal87=string_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, string_literal87.getTree());

                    // compiler/ast/GramaticaAst.g:85:37: ( ( COMA callout_arg )+ )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==COMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // compiler/ast/GramaticaAst.g:85:38: ( COMA callout_arg )+
                            {
                            // compiler/ast/GramaticaAst.g:85:38: ( COMA callout_arg )+
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
                            	    // compiler/ast/GramaticaAst.g:85:39: COMA callout_arg
                            	    {
                            	    COMA88=(Token)match(input,COMA,FOLLOW_COMA_in_method_call597); 
                            	    COMA88_tree = 
                            	    (Object)adaptor.create(COMA88)
                            	    ;
                            	    adaptor.addChild(root_0, COMA88_tree);


                            	    pushFollow(FOLLOW_callout_arg_in_method_call599);
                            	    callout_arg89=callout_arg();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, callout_arg89.getTree());

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


                    RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_method_call605); 
                    RPAREN90_tree = 
                    (Object)adaptor.create(RPAREN90)
                    ;
                    adaptor.addChild(root_0, RPAREN90_tree);


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
    // compiler/ast/GramaticaAst.g:87:1: method_name : id ;
    public final GramaticaAst.method_name_return method_name() throws RecognitionException {
        GramaticaAst.method_name_return retval = new GramaticaAst.method_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.id_return id91 =null;



        try {
            // compiler/ast/GramaticaAst.g:87:14: ( id )
            // compiler/ast/GramaticaAst.g:87:16: id
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_id_in_method_name615);
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
    // compiler/ast/GramaticaAst.g:89:1: location : ( id | id LBRAKET expr RBRAKET );
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

        try {
            // compiler/ast/GramaticaAst.g:89:11: ( id | id LBRAKET expr RBRAKET )
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
                    // compiler/ast/GramaticaAst.g:89:13: id
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_location625);
                    id92=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id92.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:90:7: id LBRAKET expr RBRAKET
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_location633);
                    id93=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id93.getTree());

                    LBRAKET94=(Token)match(input,LBRAKET,FOLLOW_LBRAKET_in_location635); 
                    LBRAKET94_tree = 
                    (Object)adaptor.create(LBRAKET94)
                    ;
                    adaptor.addChild(root_0, LBRAKET94_tree);


                    pushFollow(FOLLOW_expr_in_location637);
                    expr95=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr95.getTree());

                    RBRAKET96=(Token)match(input,RBRAKET,FOLLOW_RBRAKET_in_location639); 
                    RBRAKET96_tree = 
                    (Object)adaptor.create(RBRAKET96)
                    ;
                    adaptor.addChild(root_0, RBRAKET96_tree);


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
    // compiler/ast/GramaticaAst.g:92:1: expr : l= expr_and ( OR r= expr_and )* ;
    public final GramaticaAst.expr_return expr() throws RecognitionException {
        GramaticaAst.expr_return retval = new GramaticaAst.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR97=null;
        GramaticaAst.expr_and_return l =null;

        GramaticaAst.expr_and_return r =null;


        Object OR97_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:92:9: (l= expr_and ( OR r= expr_and )* )
            // compiler/ast/GramaticaAst.g:92:11: l= expr_and ( OR r= expr_and )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_and_in_expr655);
            l=expr_and();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:92:24: ( OR r= expr_and )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:92:25: OR r= expr_and
            	    {
            	    OR97=(Token)match(input,OR,FOLLOW_OR_in_expr658); 
            	    OR97_tree = 
            	    (Object)adaptor.create(OR97)
            	    ;
            	    adaptor.addChild(root_0, OR97_tree);


            	    pushFollow(FOLLOW_expr_and_in_expr664);
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
    // compiler/ast/GramaticaAst.g:93:1: expr_and : l= expr_eq ( AND r= expr_eq )* ;
    public final GramaticaAst.expr_and_return expr_and() throws RecognitionException {
        GramaticaAst.expr_and_return retval = new GramaticaAst.expr_and_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND98=null;
        GramaticaAst.expr_eq_return l =null;

        GramaticaAst.expr_eq_return r =null;


        Object AND98_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:93:11: (l= expr_eq ( AND r= expr_eq )* )
            // compiler/ast/GramaticaAst.g:93:13: l= expr_eq ( AND r= expr_eq )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_eq_in_expr_and678);
            l=expr_eq();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:93:26: ( AND r= expr_eq )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:93:27: AND r= expr_eq
            	    {
            	    AND98=(Token)match(input,AND,FOLLOW_AND_in_expr_and682); 
            	    AND98_tree = 
            	    (Object)adaptor.create(AND98)
            	    ;
            	    adaptor.addChild(root_0, AND98_tree);


            	    pushFollow(FOLLOW_expr_eq_in_expr_and688);
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
    // compiler/ast/GramaticaAst.g:94:1: expr_eq : l= expr_rel ( eq_op r= expr_rel )* ;
    public final GramaticaAst.expr_eq_return expr_eq() throws RecognitionException {
        GramaticaAst.expr_eq_return retval = new GramaticaAst.expr_eq_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.expr_rel_return l =null;

        GramaticaAst.expr_rel_return r =null;

        GramaticaAst.eq_op_return eq_op99 =null;



        try {
            // compiler/ast/GramaticaAst.g:94:11: (l= expr_rel ( eq_op r= expr_rel )* )
            // compiler/ast/GramaticaAst.g:94:13: l= expr_rel ( eq_op r= expr_rel )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_rel_in_expr_eq703);
            l=expr_rel();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:94:27: ( eq_op r= expr_rel )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EQUAL||LA25_0==NEQUAL) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:94:28: eq_op r= expr_rel
            	    {
            	    pushFollow(FOLLOW_eq_op_in_expr_eq707);
            	    eq_op99=eq_op();

            	    state._fsp--;

            	    adaptor.addChild(root_0, eq_op99.getTree());

            	    pushFollow(FOLLOW_expr_rel_in_expr_eq713);
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
    // compiler/ast/GramaticaAst.g:95:1: expr_rel : l= expr_add ( rel_op r= expr_add )* ;
    public final GramaticaAst.expr_rel_return expr_rel() throws RecognitionException {
        GramaticaAst.expr_rel_return retval = new GramaticaAst.expr_rel_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.expr_add_return l =null;

        GramaticaAst.expr_add_return r =null;

        GramaticaAst.rel_op_return rel_op100 =null;



        try {
            // compiler/ast/GramaticaAst.g:95:11: (l= expr_add ( rel_op r= expr_add )* )
            // compiler/ast/GramaticaAst.g:95:13: l= expr_add ( rel_op r= expr_add )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_add_in_expr_rel727);
            l=expr_add();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:95:27: ( rel_op r= expr_add )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= GREATHAN && LA26_0 <= GTOEQ)||LA26_0==LESSTHAN||LA26_0==LTOEQ) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:95:28: rel_op r= expr_add
            	    {
            	    pushFollow(FOLLOW_rel_op_in_expr_rel731);
            	    rel_op100=rel_op();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rel_op100.getTree());

            	    pushFollow(FOLLOW_expr_add_in_expr_rel737);
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
    // compiler/ast/GramaticaAst.g:96:1: expr_add : l= expr_arith ( sumsub_op r= expr_arith )* ;
    public final GramaticaAst.expr_add_return expr_add() throws RecognitionException {
        GramaticaAst.expr_add_return retval = new GramaticaAst.expr_add_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.expr_arith_return l =null;

        GramaticaAst.expr_arith_return r =null;

        GramaticaAst.sumsub_op_return sumsub_op101 =null;



        try {
            // compiler/ast/GramaticaAst.g:96:11: (l= expr_arith ( sumsub_op r= expr_arith )* )
            // compiler/ast/GramaticaAst.g:96:13: l= expr_arith ( sumsub_op r= expr_arith )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_arith_in_expr_add751);
            l=expr_arith();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:96:29: ( sumsub_op r= expr_arith )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ADD||LA27_0==MINUS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:96:30: sumsub_op r= expr_arith
            	    {
            	    pushFollow(FOLLOW_sumsub_op_in_expr_add755);
            	    sumsub_op101=sumsub_op();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sumsub_op101.getTree());

            	    pushFollow(FOLLOW_expr_arith_in_expr_add761);
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
    // compiler/ast/GramaticaAst.g:97:1: expr_arith : l= expr_factor ( arith_op r= expr_factor )* ;
    public final GramaticaAst.expr_arith_return expr_arith() throws RecognitionException {
        GramaticaAst.expr_arith_return retval = new GramaticaAst.expr_arith_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.expr_factor_return l =null;

        GramaticaAst.expr_factor_return r =null;

        GramaticaAst.arith_op_return arith_op102 =null;



        try {
            // compiler/ast/GramaticaAst.g:97:13: (l= expr_factor ( arith_op r= expr_factor )* )
            // compiler/ast/GramaticaAst.g:97:15: l= expr_factor ( arith_op r= expr_factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_factor_in_expr_arith775);
            l=expr_factor();

            state._fsp--;

            adaptor.addChild(root_0, l.getTree());

            // compiler/ast/GramaticaAst.g:97:32: ( arith_op r= expr_factor )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==DIV||(LA28_0 >= MOD && LA28_0 <= MULT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // compiler/ast/GramaticaAst.g:97:33: arith_op r= expr_factor
            	    {
            	    pushFollow(FOLLOW_arith_op_in_expr_arith779);
            	    arith_op102=arith_op();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arith_op102.getTree());

            	    pushFollow(FOLLOW_expr_factor_in_expr_arith785);
            	    r=expr_factor();

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


    public static class expr_factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_factor"
    // compiler/ast/GramaticaAst.g:99:1: expr_factor : ( location | method_call | int_literal | char_literal | bool_literal | MINUS expr | NOT expr | LPAREN expr RPAREN );
    public final GramaticaAst.expr_factor_return expr_factor() throws RecognitionException {
        GramaticaAst.expr_factor_return retval = new GramaticaAst.expr_factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MINUS108=null;
        Token NOT110=null;
        Token LPAREN112=null;
        Token RPAREN114=null;
        GramaticaAst.location_return location103 =null;

        GramaticaAst.method_call_return method_call104 =null;

        GramaticaAst.int_literal_return int_literal105 =null;

        GramaticaAst.char_literal_return char_literal106 =null;

        GramaticaAst.bool_literal_return bool_literal107 =null;

        GramaticaAst.expr_return expr109 =null;

        GramaticaAst.expr_return expr111 =null;

        GramaticaAst.expr_return expr113 =null;


        Object MINUS108_tree=null;
        Object NOT110_tree=null;
        Object LPAREN112_tree=null;
        Object RPAREN114_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:99:14: ( location | method_call | int_literal | char_literal | bool_literal | MINUS expr | NOT expr | LPAREN expr RPAREN )
            int alt29=8;
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
            case DIGIT:
            case HEX:
                {
                alt29=3;
                }
                break;
            case CHR:
                {
                alt29=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt29=5;
                }
                break;
            case MINUS:
                {
                alt29=6;
                }
                break;
            case NOT:
                {
                alt29=7;
                }
                break;
            case LPAREN:
                {
                alt29=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // compiler/ast/GramaticaAst.g:99:16: location
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_location_in_expr_factor796);
                    location103=location();

                    state._fsp--;

                    adaptor.addChild(root_0, location103.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:100:7: method_call
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_method_call_in_expr_factor808);
                    method_call104=method_call();

                    state._fsp--;

                    adaptor.addChild(root_0, method_call104.getTree());

                    }
                    break;
                case 3 :
                    // compiler/ast/GramaticaAst.g:101:7: int_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_int_literal_in_expr_factor819);
                    int_literal105=int_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, int_literal105.getTree());

                    }
                    break;
                case 4 :
                    // compiler/ast/GramaticaAst.g:102:7: char_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_char_literal_in_expr_factor829);
                    char_literal106=char_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, char_literal106.getTree());

                    }
                    break;
                case 5 :
                    // compiler/ast/GramaticaAst.g:103:7: bool_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bool_literal_in_expr_factor840);
                    bool_literal107=bool_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_literal107.getTree());

                    }
                    break;
                case 6 :
                    // compiler/ast/GramaticaAst.g:104:7: MINUS expr
                    {
                    root_0 = (Object)adaptor.nil();


                    MINUS108=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_factor851); 
                    MINUS108_tree = 
                    (Object)adaptor.create(MINUS108)
                    ;
                    adaptor.addChild(root_0, MINUS108_tree);


                    pushFollow(FOLLOW_expr_in_expr_factor853);
                    expr109=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr109.getTree());

                    }
                    break;
                case 7 :
                    // compiler/ast/GramaticaAst.g:105:7: NOT expr
                    {
                    root_0 = (Object)adaptor.nil();


                    NOT110=(Token)match(input,NOT,FOLLOW_NOT_in_expr_factor864); 
                    NOT110_tree = 
                    (Object)adaptor.create(NOT110)
                    ;
                    adaptor.addChild(root_0, NOT110_tree);


                    pushFollow(FOLLOW_expr_in_expr_factor866);
                    expr111=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr111.getTree());

                    }
                    break;
                case 8 :
                    // compiler/ast/GramaticaAst.g:106:7: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN112=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_factor878); 
                    LPAREN112_tree = 
                    (Object)adaptor.create(LPAREN112)
                    ;
                    adaptor.addChild(root_0, LPAREN112_tree);


                    pushFollow(FOLLOW_expr_in_expr_factor880);
                    expr113=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr113.getTree());

                    RPAREN114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_factor882); 
                    RPAREN114_tree = 
                    (Object)adaptor.create(RPAREN114)
                    ;
                    adaptor.addChild(root_0, RPAREN114_tree);


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
    // $ANTLR end "expr_factor"


    public static class callout_arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callout_arg"
    // compiler/ast/GramaticaAst.g:108:1: callout_arg : ( expr | string_literal );
    public final GramaticaAst.callout_arg_return callout_arg() throws RecognitionException {
        GramaticaAst.callout_arg_return retval = new GramaticaAst.callout_arg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.expr_return expr115 =null;

        GramaticaAst.string_literal_return string_literal116 =null;



        try {
            // compiler/ast/GramaticaAst.g:108:14: ( expr | string_literal )
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
                    // compiler/ast/GramaticaAst.g:108:16: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_callout_arg892);
                    expr115=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr115.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:108:23: string_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_string_literal_in_callout_arg896);
                    string_literal116=string_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, string_literal116.getTree());

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


    public static class arith_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arith_op"
    // compiler/ast/GramaticaAst.g:110:1: arith_op : ( MULT | DIV | MOD );
    public final GramaticaAst.arith_op_return arith_op() throws RecognitionException {
        GramaticaAst.arith_op_return retval = new GramaticaAst.arith_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set117=null;

        Object set117_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:110:12: ( MULT | DIV | MOD )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set117=(Token)input.LT(1);

            if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set117)
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
    // $ANTLR end "arith_op"


    public static class sumsub_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sumsub_op"
    // compiler/ast/GramaticaAst.g:111:1: sumsub_op : ( ADD | MINUS );
    public final GramaticaAst.sumsub_op_return sumsub_op() throws RecognitionException {
        GramaticaAst.sumsub_op_return retval = new GramaticaAst.sumsub_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set118=null;

        Object set118_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:111:12: ( ADD | MINUS )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set118=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==MINUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set118)
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
    // $ANTLR end "sumsub_op"


    public static class rel_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel_op"
    // compiler/ast/GramaticaAst.g:112:1: rel_op : ( LESSTHAN | GREATHAN | LTOEQ | GTOEQ );
    public final GramaticaAst.rel_op_return rel_op() throws RecognitionException {
        GramaticaAst.rel_op_return retval = new GramaticaAst.rel_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set119=null;

        Object set119_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:112:10: ( LESSTHAN | GREATHAN | LTOEQ | GTOEQ )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set119=(Token)input.LT(1);

            if ( (input.LA(1) >= GREATHAN && input.LA(1) <= GTOEQ)||input.LA(1)==LESSTHAN||input.LA(1)==LTOEQ ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set119)
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
    // $ANTLR end "rel_op"


    public static class eq_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eq_op"
    // compiler/ast/GramaticaAst.g:113:1: eq_op : ( EQUAL | NEQUAL );
    public final GramaticaAst.eq_op_return eq_op() throws RecognitionException {
        GramaticaAst.eq_op_return retval = new GramaticaAst.eq_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set120=null;

        Object set120_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:113:9: ( EQUAL | NEQUAL )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set120=(Token)input.LT(1);

            if ( input.LA(1)==EQUAL||input.LA(1)==NEQUAL ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set120)
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
    // $ANTLR end "eq_op"


    public static class cond_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond_op"
    // compiler/ast/GramaticaAst.g:114:1: cond_op : ( AND | OR );
    public final GramaticaAst.cond_op_return cond_op() throws RecognitionException {
        GramaticaAst.cond_op_return retval = new GramaticaAst.cond_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set121=null;

        Object set121_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:114:11: ( AND | OR )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set121=(Token)input.LT(1);

            if ( input.LA(1)==AND||input.LA(1)==OR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set121)
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
    // $ANTLR end "cond_op"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // compiler/ast/GramaticaAst.g:116:1: literal : ( int_literal | char_literal | bool_literal );
    public final GramaticaAst.literal_return literal() throws RecognitionException {
        GramaticaAst.literal_return retval = new GramaticaAst.literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        GramaticaAst.int_literal_return int_literal122 =null;

        GramaticaAst.char_literal_return char_literal123 =null;

        GramaticaAst.bool_literal_return bool_literal124 =null;



        try {
            // compiler/ast/GramaticaAst.g:116:11: ( int_literal | char_literal | bool_literal )
            int alt31=3;
            switch ( input.LA(1) ) {
            case DIGIT:
            case HEX:
                {
                alt31=1;
                }
                break;
            case CHR:
                {
                alt31=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // compiler/ast/GramaticaAst.g:116:13: int_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_int_literal_in_literal983);
                    int_literal122=int_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, int_literal122.getTree());

                    }
                    break;
                case 2 :
                    // compiler/ast/GramaticaAst.g:116:27: char_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_char_literal_in_literal987);
                    char_literal123=char_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, char_literal123.getTree());

                    }
                    break;
                case 3 :
                    // compiler/ast/GramaticaAst.g:116:42: bool_literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bool_literal_in_literal991);
                    bool_literal124=bool_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_literal124.getTree());

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
    // compiler/ast/GramaticaAst.g:118:1: id : INDENTIFIER ;
    public final GramaticaAst.id_return id() throws RecognitionException {
        GramaticaAst.id_return retval = new GramaticaAst.id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INDENTIFIER125=null;

        Object INDENTIFIER125_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:118:8: ( INDENTIFIER )
            // compiler/ast/GramaticaAst.g:118:10: INDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            INDENTIFIER125=(Token)match(input,INDENTIFIER,FOLLOW_INDENTIFIER_in_id1003); 
            INDENTIFIER125_tree = 
            (Object)adaptor.create(INDENTIFIER125)
            ;
            adaptor.addChild(root_0, INDENTIFIER125_tree);


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
    // compiler/ast/GramaticaAst.g:120:1: alpha_num : ( CHAR | UNDERSCORE | NUM );
    public final GramaticaAst.alpha_num_return alpha_num() throws RecognitionException {
        GramaticaAst.alpha_num_return retval = new GramaticaAst.alpha_num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set126=null;

        Object set126_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:120:12: ( CHAR | UNDERSCORE | NUM )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set126=(Token)input.LT(1);

            if ( input.LA(1)==CHAR||input.LA(1)==NUM||input.LA(1)==UNDERSCORE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set126)
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
    // compiler/ast/GramaticaAst.g:122:1: hex_digit : ( NUM | HEXCHAR );
    public final GramaticaAst.hex_digit_return hex_digit() throws RecognitionException {
        GramaticaAst.hex_digit_return retval = new GramaticaAst.hex_digit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set127=null;

        Object set127_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:122:13: ( NUM | HEXCHAR )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set127=(Token)input.LT(1);

            if ( input.LA(1)==HEXCHAR||input.LA(1)==NUM ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set127)
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
    // compiler/ast/GramaticaAst.g:124:1: int_literal : ( DIGIT | HEX );
    public final GramaticaAst.int_literal_return int_literal() throws RecognitionException {
        GramaticaAst.int_literal_return retval = new GramaticaAst.int_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set128=null;

        Object set128_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:124:14: ( DIGIT | HEX )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set128=(Token)input.LT(1);

            if ( input.LA(1)==DIGIT||input.LA(1)==HEX ) {
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
    // $ANTLR end "int_literal"


    public static class bool_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_literal"
    // compiler/ast/GramaticaAst.g:126:1: bool_literal : ( TRUE | FALSE );
    public final GramaticaAst.bool_literal_return bool_literal() throws RecognitionException {
        GramaticaAst.bool_literal_return retval = new GramaticaAst.bool_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set129=null;

        Object set129_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:126:17: ( TRUE | FALSE )
            // compiler/ast/GramaticaAst.g:
            {
            root_0 = (Object)adaptor.nil();


            set129=(Token)input.LT(1);

            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
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
    // $ANTLR end "bool_literal"


    public static class char_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "char_literal"
    // compiler/ast/GramaticaAst.g:128:1: char_literal : CHR ;
    public final GramaticaAst.char_literal_return char_literal() throws RecognitionException {
        GramaticaAst.char_literal_return retval = new GramaticaAst.char_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHR130=null;

        Object CHR130_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:128:14: ( CHR )
            // compiler/ast/GramaticaAst.g:128:16: CHR
            {
            root_0 = (Object)adaptor.nil();


            CHR130=(Token)match(input,CHR,FOLLOW_CHR_in_char_literal1071); 
            CHR130_tree = 
            (Object)adaptor.create(CHR130)
            ;
            adaptor.addChild(root_0, CHR130_tree);


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
    // compiler/ast/GramaticaAst.g:130:1: string_literal : STR ;
    public final GramaticaAst.string_literal_return string_literal() throws RecognitionException {
        GramaticaAst.string_literal_return retval = new GramaticaAst.string_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STR131=null;

        Object STR131_tree=null;

        try {
            // compiler/ast/GramaticaAst.g:130:17: ( STR )
            // compiler/ast/GramaticaAst.g:130:19: STR
            {
            root_0 = (Object)adaptor.nil();


            STR131=(Token)match(input,STR,FOLLOW_STR_in_string_literal1080); 
            STR131_tree = 
            (Object)adaptor.create(STR131)
            ;
            adaptor.addChild(root_0, STR131_tree);


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


 

    public static final BitSet FOLLOW_CLASS_in_start80 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_PROGRAM_in_start82 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACE_in_start84 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004004L});
    public static final BitSet FOLLOW_field_decl_in_start86 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004004L});
    public static final BitSet FOLLOW_method_decl_in_start89 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004004L});
    public static final BitSet FOLLOW_RBRACE_in_start92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_field_decl120 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_field_decl123 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_id_in_field_decl127 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRAKET_in_field_decl129 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_int_literal_in_field_decl131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRAKET_in_field_decl133 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMA_in_field_decl137 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_field_decl140 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_id_in_field_decl144 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRAKET_in_field_decl146 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_int_literal_in_field_decl148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRAKET_in_field_decl150 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_field_decl155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_method_decl195 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl198 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_decl200 = new BitSet(new long[]{0x0000001000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_method_decl204 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl206 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_decl210 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_type_in_method_decl212 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl214 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_decl221 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_method_decl223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_method_decl259 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl262 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_decl264 = new BitSet(new long[]{0x0000001000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_method_decl268 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl270 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_decl274 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_type_in_method_decl276 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_method_decl278 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_decl285 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_method_decl287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block323 = new BitSet(new long[]{0x0000003C2020E000L,0x0000000000000014L});
    public static final BitSet FOLLOW_var_decl_in_block325 = new BitSet(new long[]{0x0000003C2020E000L,0x0000000000000014L});
    public static final BitSet FOLLOW_statement_in_block328 = new BitSet(new long[]{0x0000002C2020C000L,0x0000000000000014L});
    public static final BitSet FOLLOW_RBRACE_in_block331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var_decl359 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_var_decl361 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_COMA_in_var_decl364 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_var_decl366 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_var_decl370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_location_in_statement419 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_assign_op_in_statement421 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_call_in_statement433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement450 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement452 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_statement456 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_statement458 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ELSE_in_statement461 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_statement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement474 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_id_in_statement476 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ASSIGN_in_statement478 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement480 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COMA_in_statement482 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_statement484 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_block_in_statement486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement494 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000140L});
    public static final BitSet FOLLOW_expr_in_statement497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICO_in_statement521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_name_in_method_call566 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_call568 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000120L});
    public static final BitSet FOLLOW_expr_in_method_call571 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_call573 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_method_call575 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_call581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALLOUT_in_method_call589 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_method_call591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_string_literal_in_method_call593 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMA_in_method_call597 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000180L});
    public static final BitSet FOLLOW_callout_arg_in_method_call599 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_method_call605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_method_name615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_location625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_location633 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRAKET_in_location635 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_location637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRAKET_in_location639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_and_in_expr655 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr658 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_and_in_expr664 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_expr_eq_in_expr_and678 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AND_in_expr_and682 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_eq_in_expr_and688 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_expr_rel_in_expr_eq703 = new BitSet(new long[]{0x0000400004000002L});
    public static final BitSet FOLLOW_eq_op_in_expr_eq707 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_rel_in_expr_eq713 = new BitSet(new long[]{0x0000400004000002L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel727 = new BitSet(new long[]{0x00000280C0000002L});
    public static final BitSet FOLLOW_rel_op_in_expr_rel731 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_add_in_expr_rel737 = new BitSet(new long[]{0x00000280C0000002L});
    public static final BitSet FOLLOW_expr_arith_in_expr_add751 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_sumsub_op_in_expr_add755 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_arith_in_expr_add761 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_expr_factor_in_expr_arith775 = new BitSet(new long[]{0x0000300000800002L});
    public static final BitSet FOLLOW_arith_op_in_expr_arith779 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_factor_in_expr_arith785 = new BitSet(new long[]{0x0000300000800002L});
    public static final BitSet FOLLOW_location_in_expr_factor796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_call_in_expr_factor808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_literal_in_expr_factor819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_literal_in_expr_factor829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_literal_in_expr_factor840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_factor851 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_expr_factor853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_expr_factor864 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_expr_factor866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_expr_factor878 = new BitSet(new long[]{0x0000850910428000L,0x0000000000000100L});
    public static final BitSet FOLLOW_expr_in_expr_factor880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_expr_factor882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_callout_arg892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_callout_arg896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_literal_in_literal983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_literal_in_literal987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_literal_in_literal991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENTIFIER_in_id1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHR_in_char_literal1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_string_literal1080 = new BitSet(new long[]{0x0000000000000002L});

}