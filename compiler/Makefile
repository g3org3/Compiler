make: Scan Par Irt Ast Se Co Op Op2 Li Compiler

Scan:	scanner\Scanner.java
	javac ..\compiler\scanner\Scanner.java

Par:	parser\CC4Parser.java
	javac ..\compiler\parser\CC4Parser.java
	
Irt:	irt\Irt.java
	javac ..\compiler\irt\Irt.java

Ast:	ast\Ast.java
	javac ..\compiler\ast\Ast.java
	
Se:		semantic\Semantic.java
	javac ..\compiler\semantic\Semantic.java
	
Co:		codegen\Codegen.java
	javac ..\compiler\codegen\Codegen.java

Op:		opt\ConstantFolding.java
	javac ..\compiler\opt\ConstantFolding.java

Op2:	opt\Algebraic.java
	javac ..\compiler\opt\Algebraic.java
	
Li:		lib\Debug.java
	javac ..\compiler\lib\Debug.java

Compiler:
	javac Compiler.java

clean: 
	del *.class
	del *.s
	del readme.txt
	cls