make: Main

Main: 
	javac Compiler.java

clean:
	rm Compiler.class
	rm *.s
	rm readme.txt
	clear