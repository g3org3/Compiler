<<<<<<< HEAD
make: Main

Main: 
	javac Compiler.java

clean:
	rm Compiler.class
	rm *.s
	rm readme.txt
	clear
=======
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
>>>>>>> bff1031ccc8ea4cbd4ca3b1669f4d50af1e9cb6b
