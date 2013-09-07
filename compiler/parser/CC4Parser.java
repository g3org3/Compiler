package compiler.parser;

import org.antlr.runtime.*;
import compiler.parser.GramaticaParser;
import java.util.ArrayList;
import compiler.scanner.*;

public class CC4Parser {
	
	public Scanner scan;
	public ArrayList<String> parserList;
	public GramaticaParser gparser;

	// contructor
	public CC4Parser(Scanner sc){
		this.scan = sc;
		this.parserList = new ArrayList<String>(1);
		this.gparser = new GramaticaParser(new CommonTokenStream(sc.getLexer()));
	}

	public void parserIt() throws Exception{
		this.gparser.start();
	}

	public ArrayList<String> getList(){
		return this.parserList;
	}
}