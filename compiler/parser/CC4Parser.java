package compiler.parser;

import org.antlr.runtime.*;
import compiler.parser.Parser;
import java.util.ArrayList;
import compiler.scanner.*;

public class CC4Parser {
	
	public Scanner scan;
	public ArrayList<String> parserList;

	// contructor
	public CC4Parser(Scanner sc){
		this.scan = sc;
		this.parserList = new ArrayList<String>(1);
	}

	public void parserIt(int n) throws Exception{
		Token tk;
		try{
	    	Parser lexer = new Parser(new ANTLRFileStream(this.scan.getPath()), n);
	    	tk = lexer.nextToken();
	    	while(!(tk.getType()==Token.EOF)){
	    		tk = lexer.nextToken();
	    	}
	    	this.parserList = lexer.getList();
		} catch(ArrayIndexOutOfBoundsException aiobe){
	   		System.exit(1);
		} catch(Exception e){
	    	System.exit(1);
		}
	}

	public ArrayList<String> getList(){
		return this.parserList;
	}
}