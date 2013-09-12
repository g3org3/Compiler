package compiler.ast;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import compiler.parser.*;
import compiler.ast.*;
import java.util.ArrayList;
import compiler.scanner.*;

import compiler.parser.*;

public class Ast {
	
	public CC4Parser parser;
	public GramaticaAst gast;
	public String filename;
	public String parsertree = "";

	// contructor
	public Ast(CC4Parser ps){
		this.parser = ps;
		this.gast = new GramaticaAst(new CommonTokenStream(ps.getScanner().getLexer()));
		this.filename = ps.getScanner().getFilepath();
		int x = this.filename.indexOf(".");
		if (x>=0)
			this.filename = this.filename.substring(0, x);
	}

	public String toString(){
		String str 	= parsertree;
		int size 	= gast.getErrors().size();
		String er 	= (size==1)? "Se ha detectado "+size+" error.\n  ": "";
		er 	= (size>1)? "Se han detectado "+size+" errores.\n  ": er;
		er 	= (size<1)? "No se han detectado errores.\n  ": er;

		if(size==0)
			str = er+str;
		else{
			str = er;
			for (int i=0; i<size; i++)
				str = str+"  "+gast.getErrors().get(i)+"\n  ";
		}
		return str;
	}
	public void makeTree(){
		try {	    
		GramaticaAst.start_return r = gast.start();

		Tree t = (Tree)r.getTree();
		
		// debug
		this.parsertree = "  "+t.toStringTree();
		
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st = gen.toDOT(t);
		PrintStream ps = new PrintStream(filename+".dot");
		
		ps.println(st);
		ps.close();

	    } catch (ArrayIndexOutOfBoundsException aiobe) {
	      System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens 1");
	      System.exit(1);
	    } catch (Exception e) {
	      System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens 2\n"+e);
	      System.exit(1);
	    }
	}

}