make: uno dos tres cuatro cinco seis siete ocho nueve Main

uno:	scanner\Scanner.java
	javac ..\compiler\scanner\Scanner.java

dos:	parser\CC4Parser.java
	javac ..\compiler\parser\CC4Parser.java

tres:	ast\Ast.java
	javac ..\compiler\ast\Ast.java

cuatro:	semantic\Semantic.java
	javac ..\compiler\semantic\Semantic.java
	
cinco:	irt\Irt.java
	javac ..\compiler\irt\Irt.java
	
seis:	codegen\Codegen.java
	javac ..\compiler\codegen\Codegen.java

siete:		compiler\opt\ConstantFolding.java
	javac ..\compiler\opt\ConstantFolding.java

ocho:	opt\Algebraic.java
	javac ..\compiler\opt\Algebraic.java
	
nueve:		lib\Debug.java
	javac ..\compiler\lib\Debug.java

Main:
	javac Compiler.java

clean: 
	del *.class
	del *.s
	del readme.txt
	del scanner\*.class
	del parser\*.class
	del irt\*.class
	del ast\*.class
	del semantic\*.class
	del codegen\*.class
	del opt\*.class
	del lib\*.class
	cls