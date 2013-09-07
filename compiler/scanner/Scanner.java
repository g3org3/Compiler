package compiler.scanner;

import org.antlr.runtime.*;
import compiler.scanner.Decaf;
import java.util.ArrayList;

public class Scanner {

	private String file;
	private ArrayList<String> targetList;
	private Decaf lexer;

	//constructor
	public Scanner(String fileInput){
		this.file = fileInput;
		this.targetList = new ArrayList<String>(1);
		try{
			this.lexer = new Decaf(new ANTLRFileStream(fileInput));
		} catch(ArrayIndexOutOfBoundsException aiobe){
	   		System.exit(1);
		} catch(Exception e){
	    	System.exit(1);
		}
	}

	// metodo
	public void scanIt(int n) throws Exception{
		Token tk;
		try{
	    	Decaf scLexer = new Decaf(new ANTLRFileStream(this.file), n);
	    	tk = scLexer.nextToken();
	    	while(!(tk.getType()==Token.EOF)){
	    		tk = scLexer.nextToken();
	    	}
	    	this.targetList = scLexer.getList();
		} catch(ArrayIndexOutOfBoundsException aiobe){
	   		System.exit(1);
		} catch(Exception e){
	    	System.exit(1);
		}
	}

	public ArrayList<String> getList(){
		return this.targetList;
	}

	public Decaf getLexer(){
		return lexer;
	}
	public String getPath(){
		return this.file;
	}


}