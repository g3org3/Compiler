parser grammar GramaticaParser;

options {
	tokenVocab=Decaf;
}

@parser::header{
	package compiler.parser;
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


start 			: CLASS PROGRAM LBRACE field_decl* method_decl* RBRACE {addtoList("Start");};

field_decl		: type (id | id LBRAKET int_literal RBRAKET) (COMA (id | id LBRAKET int_literal RBRAKET))* SEMICO{addtoList("Field Declaration");};

method_decl 	: (type | VOID) id LPAREN ((type id) (COMA type id)* )? RPAREN block{addtoList("Method Declaration");};

block			: LBRACE var_decl* statement* RBRACE{addtoList("Block");};

var_decl		: type id (COMA id)* SEMICO{addtoList("Variable Declaration");};

type 			: INT | BOOLEAN {addtoList("Type");};

statement		: location assign_op expr SEMICO
				| method_call SEMICO
				| IF LPAREN expr RPAREN block (ELSE block)?
				| FOR id ASSIGN expr COMA expr block
				| RETURN (expr)? SEMICO
				| BREAK SEMICO
				| CONTINUE SEMICO
				| block {addtoList("Statement");};

assign_op		: ASSIGN 
				| ASSIGNADD
				| ASSIGNSUB {addtoList("Assign Operator");};

method_call 	: method_name LPAREN (expr(COMA expr)*)? RPAREN
				| CALLOUT LPAREN string_literal ((COMA callout_arg)+)? RPAREN {addtoList("Method Call");};

method_name 	: id;

location		: id
				| id LBRAKET expr RBRAKET {addtoList("Location");};

expr 			: l = expr_and (OR r = expr_and)*;
expr_and		: l = expr_eq  (AND r = expr_eq)*;
expr_eq			: l = expr_rel  (eq_op r = expr_rel)*;
expr_rel		: l = expr_add  (rel_op r = expr_add)*;
expr_add		: l = expr_arith  (sumsub_op r = expr_arith)*;
expr_arith		: l = expr_factor  (arith_op r = expr_factor)*;

expr_factor		: location
				| method_call
				| literal
				| MINUS expr
				| NOT expr
				| LPAREN expr RPAREN {addtoList("Expression");};

callout_arg 	: expr | string_literal;

bin_op			: arith_op | rel_op | eq_op | cond_op;
arith_op 		: MULT | DIV | MOD;
sumsub_op		: ADD | MINUS;
rel_op			: LESSTHAN | GREATHAN | LTOEQ | GTOEQ;
eq_op			: EQUAL | NEQUAL;
cond_op			: AND | OR;

literal 		: int_literal | char_literal | bool_literal;

id 				: INDENTIFIER {addtoList("Indentifier");};

alpha_num		: CHAR | UNDERSCORE | NUM;

hex_digit 		: NUM | HEXCHAR;

int_literal 	: DIGIT | HEX;

bool_literal    : TRUE | FALSE;

char_literal	: CHR;

string_literal 	: STR;



















