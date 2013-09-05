make: GRAMATICA DECAF SCANNER GRAPARSER PARSERprograma

GRAMATICA: compiler/scanner/Decaf.g
	java org.antlr.Tool compiler/scanner/Decaf.g
	mv Decaf.tokens compiler/scanner

DECAF: compiler/scanner/Decaf.java
	javac compiler/scanner/Decaf.java

SCANNER: compiler/scanner/Scanner.java
	javac compiler/scanner/Scanner.java

GRAPARSER: compiler/parser/Parser.g
	java org.antlr.Tool compiler/scanner/Decaf.g
	mv Decaf.tokens compiler/parser
	java org.antlr.Tool compiler/parser/Parser.g
	mv Parser.tokens compiler/parser

PARSER: compiler/parser/Parser.java
	javac compiler/parser/Parser.java

programa:
	javac Compiler.java

clean: 
	rm *.class
	rm *.s
	rm compiler/scanner/*.class
	rm compiler/scanner/*.tokens
#	rm compiler/parser/*.class
#	rm compiler/ast/*.class
#	rm compiler/semantic/*.class
#	rm compiler/irt/*.class
#	rm compiler/codegen/*.class
#	rm compiler/opt/*.class
#	rm compiler/lib/*.class
#	clear
