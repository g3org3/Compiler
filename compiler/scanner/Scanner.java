package compiler.scanner;

import org.antlr.runtime.*;
import compiler.scanner.Decaf;
import java.util.ArrayList;

public class Scanner {

	public String file;
	public ArrayList<String> targetList;

	//constructor
	public Scanner(String fileInput){
		this.file = fileInput;
		this.targetList = new ArrayList<String>(1);
	}

	// metodo
	public void scanIt(int n) throws Exception{
		Token tk;
		try{
	    	Decaf lexer = new Decaf(new ANTLRFileStream(this.file), n);
	    	tk = lexer.nextToken();
	    	while(!(tk.getType()==Token.EOF)){
	    		tk = lexer.nextToken();
	    	}
	    	this.targetList = lexer.getList();
		} catch(ArrayIndexOutOfBoundsException aiobe){
	   		System.exit(1);
		} catch(Exception e){
	    	System.exit(1);
		}
	}

	public ArrayList<String> getList(){
		return this.targetList;
	}

	public String getPath(){
		return this.file;
	}


}