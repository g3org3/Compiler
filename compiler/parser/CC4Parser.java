package compiler.parser;

import org.antlr.runtime.*;
import compiler.parser.GramaticaParser;
import java.util.ArrayList;
import compiler.scanner.*;

public class CC4Parser {
	
	public Scanner scan;
	public ArrayList<String> parserList, erroresScan;
	public GramaticaParser gparser;

	// contructor
	public CC4Parser(Scanner sc){
		this.scan = sc;
		this.parserList = new ArrayList<String>(1);
		this.gparser = new GramaticaParser(new CommonTokenStream(sc.getLexer()));
		this.erroresScan = sc.getErrores();
	}

	public void parserIt() throws Exception{
		this.gparser.start();
	}
	public Scanner getScanner(){
		return scan;
	}
	public GramaticaParser getParser(){
		return gparser;
	}
	public ArrayList<String> getErrors(){
		return gparser.getErrors();
	}
	public ArrayList<String> getScanErrors(){
		return erroresScan;
	}
	
	public String toString(){
		String str = "";
		for (int i=0; i<gparser.getErrors().size(); i++)
			str = str+"    "+gparser.getErrors().get(i)+"\n";
		return str;
	}
	public String toStringX(){
		String str = "";
		for (int i=0; i<gparser.getRules().size(); i++)
			str = str+"    "+(i+1)+". "+gparser.getRules().get(i)+"\n";
		return str;
	}
}