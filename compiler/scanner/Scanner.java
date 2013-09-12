package compiler.scanner;

import org.antlr.runtime.*;
import compiler.scanner.Decaf;
import java.util.ArrayList;

public class Scanner {
	private String file;
	private ArrayList<String> targetList = new ArrayList<String>();
	private Decaf lexer;

	//constructor
	public Scanner(String fileInput){
		this.file = fileInput;
		try{
			this.lexer = new Decaf(new ANTLRFileStream(fileInput));
		} catch(ArrayIndexOutOfBoundsException aiobe){
	   		System.exit(1);
		} catch(Exception e){
	    	System.exit(1);
		}
	}

	// metodo
	public void scanIt() throws Exception{
		Token tk;
		try{
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
	public void set(boolean bool){
		this.lexer.set(bool);
	}
	public String getFilepath(){
		return file;
	}

	public ArrayList<String> getList(){
		return this.targetList;
	}
	public String toString(){
		String str = "";
		for (int i=0; i<lexer.getDebug().size(); i++)
			str = str+lexer.getDebug().get(i)+"\n";
		return str;
	}
	public Decaf getLexer(){
		return lexer;
	}
	public String getPath(){
		return this.file;
	}


}