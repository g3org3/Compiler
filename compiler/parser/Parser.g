parser grammar Parser;

options {
	tokenVocab=Decaf;
}

@parser::header{
	package compiler.parser;
	import java.util.ArrayList;
}

start 			: CLASS INDENTI LBRACE field_decl* method_decl* RBRACE;

field_decl		: type (id | id LBRAKE int_literal RBRAKE) (COMA (id | id LBRAKE int_literal RBRAKE))* SEMICO;

method_decl 	: (type | VOID) id (type id) (COMA(type)(id))* block;

block			: LBRACE var_decl* statement* RBRACE;

var_decl		: type id (COMA id)* SEMICO;

type 			: DIGIT | BOOLEAN ;

statement		: location assign_op expr SEMICO
				| method_call SEMICO
				| IF LPAREN expr RPAREN block (ELSE block)
				| FOR id = expr COMA expr block
				| RETURN expr SEMICO
				| BREAK SEMICO
				| CONTINUE SEMICO
				| block;

assign_op		: ASSIGN 
				| ASSIGNADD
				| ASSIGNSUB;

method_call 	: method_name LPAREN expr(COMA expr)*
				| callout LPAREN string_literal (COMA callout_arg)+ RPAREN;

method_name 	: id;

location		: id
				| id LBRAKE expr RBRAKE;

expr			: location
				| method_call
				| literal
				| expr bin_op expr
				| MINUS expr
				| NOT expr
				| LPAREN expr RPAREN;

callout_arg 	: expr | string_literal;

bin_op			: arith_op | rel_op | eq_op | cond_op;
arith_op 		: ADD | MINUS | MULT | DIV | MOD;
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

char_literal	: CHAR;

string_literal 	: STR;



















