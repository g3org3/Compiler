make: programa

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
