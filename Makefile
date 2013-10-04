make: GRAMATICA DECAF SCANNER GRAPARSER PARSER CC4PARSER GRAAST ASTJAVA AST programa

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

programa:
	javac Compiler.java

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
	rm testcases/parser/*.dot
	rm testcases/parser/*.s
#	rm compiler/semantic/*.class
#	rm compiler/irt/*.class
#	rm compiler/codegen/*.class
#	rm compiler/opt/*.class
#	rm compiler/lib/*.class
#	clear
