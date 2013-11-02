make: GRAMATICA DECAF SCANNER GRAPARSER PARSER CC4PARSER GRAAST ASTJAVA AST TABLESS SEMANTIC.CLASS IRT.CLASS DEBUG.CLASS programa

INSTALL: ../../../Developer/lib/antlr-3.4-complete.jar
	export CLASSPATH=".:/Developer/lib/antlr-3.4-complete.jar:$$CLASSPATH"

GRAMATICA: compiler/scanner/Decaf.g
	java org.antlr.Tool compiler/scanner/Decaf.g
	mv Decaf.tokens compiler/scanner

DECAF: compiler/scanner/Decaf.java
	javac compiler/scanner/Decaf.java

SCANNER: compiler/scanner/Scanner.java
	javac compiler/scanner/Scanner.java

GRAPARSER: compiler/parser/GramaticaParser.g
	java org.antlr.Tool -lib compiler/scanner compiler/parser/GramaticaParser.g
	mv GramaticaParser.tokens compiler/parser

PARSER: compiler/parser/GramaticaParser.java
	javac compiler/parser/GramaticaParser.java

CC4PARSER: compiler/parser/CC4Parser.java
	javac compiler/parser/CC4Parser.java

GRAAST: compiler/ast/GramaticaAst.g
	java org.antlr.Tool -lib compiler/scanner compiler/ast/GramaticaAst.g
	mv GramaticaAst.tokens compiler/ast

ASTJAVA: compiler/ast/GramaticaAst.java
	javac compiler/ast/GramaticaAst.java

AST: compiler/ast/Ast.java
	javac compiler/ast/Ast.java

TABLESS: compiler/semantic/Tables.java
	javac compiler/semantic/Tables.java

SEMANTIC.CLASS: compiler/semantic/Semantic.java
	javac compiler/semantic/Semantic.java

IRT.CLASS: compiler/irt/Irt.java
	javac compiler/irt/Irt.java
	javac compiler/codegen/Codegen.java

DEBUG.CLASS: compiler/lib/Debug.java
	javac compiler/lib/Debug.java
	javac compiler/lib/ErrorHandler.java

programa:
	javac Compiler.java

testcases.do:	Compiler.java
	javac Compiler.java
	java Compiler -target codegen testcases/codegen/00-empty.dcf
	java Compiler -target codegen testcases/codegen/01-callout.dcf
	java Compiler -target codegen testcases/codegen/02-expr.dcf
	java Compiler -target codegen testcases/codegen/03-math.dcf
	java Compiler -target codegen testcases/codegen/04-math2.dcf
	java Compiler -target codegen testcases/codegen/05-calls.dcf
	java Compiler -target codegen testcases/codegen/06-control-flow.dcf
	java Compiler -target codegen testcases/codegen/07-recursion.dcf
	java Compiler -target codegen testcases/codegen/08-array.dcf
	java Compiler -target codegen testcases/codegen/09-global.dcf
	java Compiler -target codegen testcases/codegen/10-bounds.dcf
	java Compiler -target codegen testcases/codegen/11-big-array.dcf
	java Compiler -target codegen testcases/codegen/12-huge.dcf
	java Compiler -target codegen testcases/codegen/13-ifs.dcf
	java Compiler -target codegen testcases/codegen/14-shortcircuit.dcf
	java Compiler -target codegen testcases/codegen/15-not.dcf
	java Compiler -target codegen testcases/codegen/16-qsort.dcf
	rm testcases/codegen/*.dot
	mv testcases/codegen/*.s testcases/codegen/salidas/
caso16: testcases/codegen/03-math.dcf
	java Compiler -target codegen testcases/codegen/16-qsort.dcf
	mv testcases/codegen/*.s testcases/codegen/salidas/
caso7: testcases/codegen/03-math.dcf
	java Compiler -target codegen testcases/codegen/07-recursion.dcf
	mv testcases/codegen/*.s testcases/codegen/salidas/
caso0: miPrograma.dcf
	java Compiler -target codegen miPrograma.dcf
	rm *.dot
	mv *.s testcases/codegen/salidas/
caso0.opt: miPrograma.dcf
	java Compiler -target codegen -opt constant miPrograma.dcf
	rm *.dot
	mv *.s testcases/codegen/salidas/
limpio:
	rm testcases/codegen/salidas/*.s
clean: 
	rm *.class
	rm compiler/scanner/*.class
	rm compiler/scanner/*.tokens
	rm compiler/scanner/Decaf.java
	rm compiler/parser/*.class
	rm compiler/parser/*.tokens
	rm compiler/parser/GramaticaParser.java
	rm compiler/ast/*.class
	rm compiler/ast/*.tokens
	rm compiler/ast/GramaticaAst.java
#	rm testcases/parser/*.dot
#	rm testcases/parser/*.s
	rm testcases/codegen/salidas/*.s
	rm compiler/semantic/*.class
	rm compiler/irt/*.class
	rm compiler/codegen/*.class
	rm compiler/lib/*.class
#	clear
