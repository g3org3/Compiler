parser grammar GramaticaParser;

options {
	tokenVocab=Decaf;
}

@parser::header{
	package compiler.parser;
	import compiler.scanner.*;
	import java.util.ArrayList;
}

start 			: CLASS INDENTI LBRACE field_decl* method_decl* RBRACE;

field_decl		: type (id | id LBRAKE int_literal RBRAKE) (COMA (id | id LBRAKE int_literal RBRAKE))* SEMICO;

method_decl 	: (type | VOID) id LPAREN ((type id)(COMA type id)*)? RPAREN block;

block			: LBRACE var_decl* statement* RBRACE;

var_decl		: type id (COMA id)* SEMICO;

type 			: INT | BOOLEAN ;

statement		: location assign_op expr SEMICO
				| method_call SEMICO
				| IF LPAREN expr RPAREN block (ELSE block)?
				| FOR id ASSIGN expr COMA expr block
				| RETURN (expr)? SEMICO
				| BREAK SEMICO
				| CONTINUE SEMICO
				| block;

assign_op		: ASSIGN 
				| ASSIGNADD
				| ASSIGNSUB;

method_call 	: method_name LPAREN (expr(COMA expr)*)? RPAREN
				| CALLOUT LPAREN string_literal ((COMA callout_arg)+)? RPAREN;

method_name 	: id;

location		: id
				| id LBRAKE expr RBRAKE;

expr 			: l = expr_and (OR r = expr_and);
expr_and		: l = expr_eq  (AND r = expr_eq);
expr_eq			: l = expr_rel  (eq_op r = expr_rel);
expr_rel		: l = expr_add  (rel_op r = expr_add);
expr_add		: l = expr_arith  (sumsub_op r = expr_arith);
expr_arith		: l = expr_factor  (arith_op r = expr_factor);

expr_factor		: location
				| method_call
				| literal
				| MINUS expr
				| NOT expr
				| LPAREN expr RPAREN;

callout_arg 	: expr | string_literal;

bin_op			: arith_op | rel_op | eq_op | cond_op;
arith_op 		: MULT | DIV | MOD;
sumsub_op		: ADD | MINUS;
rel_op			: LESSTHAN | GREATHAN | LTOEQ | GTOEQ;
eq_op			: EQUAL | NEQUAL;
cond_op			: AND | OR;

literal 		: int_literal | char_literal | bool_literal;

id 				: alpha alpha_num*;

alpha_num		: alpha | digit;

alpha 			: CHAR | UNDERSCORE;

digit 			: NUM;

hex_digit 		: digit | HEXCHAR;

int_literal 	: decimal_literal | hex_literal;

decimal_literal : DIGIT;

hex_literal		: HEX;

bool_literal    : TRUE | FALSE;

char_literal	: CHR;

string_literal 	: STR;



















