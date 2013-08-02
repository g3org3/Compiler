make: part1 part2 Main

part1: scanner\Scanner.java
	javac ..\compiler\scanner\Scanner.java

part2: parser\CC4Parser.java
	javac ..\compiler\parser\CC4Parser.java

Main:
	dir

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