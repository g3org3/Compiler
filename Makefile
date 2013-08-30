make: GRAMATICA DECAF SCANNER programa

GRAMATICA: compiler/scanner/Decaf.g
	java org.antlr.Tool compiler/scanner/Decaf.g

DECAF: compiler/scanner/Decaf.java
	javac compiler/scanner/Decaf.java

SCANNER: compiler/scanner/Scanner.java
	javac compiler/scanner/Scanner.java

programa:
	javac Compiler.java

clean: 
	rm *.class
	rm *.s
	rm compiler/scanner/*.class
	rm compiler/parser/*.class
	rm compiler/irt/*.class
	rm compiler/ast/*.class
	rm compiler/semantic/*.class
	rm compiler/codegen/*.class
	rm compiler/opt/*.class
	rm compiler/lib/*.class
	clear
