parser grammar GramaticaAst;

options {
	tokenVocab=Decaf;
	output=AST;
}

tokens {
	ROOT;
	VARS;
	FIELD;
	METHOD;
	BLOCK;
	EX;
	STATEMENT;
	CALL;
	ARRAY;
	PRINTF;
}

@parser::header{
	package compiler.ast;
	import compiler.scanner.*;
	import java.util.ArrayList;
	import org.antlr.runtime.*;
}

@members {
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
}


start 			: CLASS PROGRAM LBRACE field_decl* method_decl* RBRACE 
					-> ^(ROOT field_decl* method_decl* );

field_decl		: type (id | id LBRAKET int_literal RBRAKET) (COMA (id | id LBRAKET int_literal RBRAKET))* SEMICO 
					-> ^(FIELD type (id int_literal? )+ );

method_decl 	: ((VOID) id LPAREN ((type id) (COMA type id)* )? RPAREN block
					-> ^(METHOD VOID id  (type id)* block))
				| ((type) id LPAREN ((type id) (COMA type id)* )? RPAREN block
					-> ^(METHOD type id  (type id)* block));
block			: LBRACE var_decl* statement* RBRACE 
					-> ^(BLOCK var_decl* statement*);

var_decl		: type id (COMA id)* SEMICO ->^(VARS type id id*);

type 			: INT | BOOLEAN ;

statement		: location assign_op expr SEMICO			-> ^(STATEMENT location assign_op expr)
				| method_call SEMICO 						-> ^(STATEMENT method_call)
				| IF LPAREN expr RPAREN block (ELSE block)? -> ^(STATEMENT  IF expr block (ELSE block)?)
				| FOR id ASSIGN expr COMA expr block 		-> ^(STATEMENT FOR id ASSIGN expr expr block)
				| RETURN (expr)? SEMICO 					-> ^(STATEMENT RETURN (expr)? )
				| BREAK SEMICO								-> ^(STATEMENT BREAK )
				| CONTINUE SEMICO							-> ^(STATEMENT CONTINUE )
				| block ;

assign_op		: ASSIGN 
				| ASSIGNADD
				| ASSIGNSUB ;

method_call 	: method_name LPAREN (expr(COMA expr)*)? RPAREN ->^(CALL method_name (expr (expr)*)? )
				| CALLOUT LPAREN string_literal ((COMA callout_arg)+)? RPAREN ->^(PRINTF CALLOUT string_literal callout_arg*);

method_name 	: id ;

location		: id
				| id LBRAKET expr RBRAKET ->^(ARRAY id expr);

expr 	 		: l = expr_and (OR^ r = expr_and)*;
expr_and		: l = expr_eq  (AND^ r = expr_eq)*;

expr_eq			: l = expr_rel  (EQUAL^ r = expr_rel 
								| NEQUAL^ r = expr_rel)*;

expr_rel		: l = expr_add  (LESSTHAN^ r = expr_add 
								| GREATHAN^ r = expr_add 
								| LTOEQ^ r = expr_add 
								| GTOEQ^ r = expr_add)*;

expr_add		: l = expr_arith  (ADD^ r = expr_arith 
								| MINUS^ r = expr_arith)*;

expr_arith		: l = expr_minus  (MULT^ r = expr_minus 
								| DIV^ r = expr_minus
								| MOD^ r = expr_minus)*;
expr_minus		: l=expr_not 
				| (MINUS^ r=expr_not);
expr_not		: l=factorExpr
				| (NOT^ r=factorExpr);

factorExpr		: location 			 -> ^(EX location)
				| method_call 		 -> ^(EX method_call)
				| DIGIT
				| HEX 				 
				| CHR 		 		
				| TRUE 		 		 
				| FALSE 		 	 
				| LPAREN expr RPAREN -> expr;

callout_arg 	: expr | string_literal;


literal 		: int_literal | char_literal | bool_literal;

id 				: INDENTIFIER ;

alpha_num		: CHAR | UNDERSCORE | NUM;

hex_digit 		: NUM | HEXCHAR;

int_literal 	: DIGIT | HEX;

bool_literal    : TRUE | FALSE;

char_literal	: CHR;

string_literal 	: STR;



















