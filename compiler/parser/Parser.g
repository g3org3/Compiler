parser grammar Parser;

options {
	tokenVocab=Decaf;
}

@parser::header{
	package compiler.parser;
	import java.util.ArrayList;
	import compiler.scanner.*;
}

start		: KWCLASS PROGRAM;