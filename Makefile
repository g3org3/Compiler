make: programa

programa:
	javac Compiler.java

clean: 
	del *.class
	del *.s
	del readme.txt
	del compiler\scanner\*.class
	del compiler\parser\*.class
	del compiler\irt\*.class
	del compiler\ast\*.class
	del compiler\semantic\*.class
	del compiler\codegen\*.class
	del compiler\opt\*.class
	del compiler\lib\*.class
	cls