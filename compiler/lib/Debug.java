package compiler.lib;

import compiler.scanner.Scanner;
import compiler.parser.CC4Parser;
import compiler.ast.Ast;
import compiler.semantic.Semantic;
import compiler.irt.Irt;
import compiler.opt.ConstantFolding;
import java.util.ArrayList;


public class Debug {
	public ArrayList<String> output;
	// contructor
	public Debug(){
		output = new ArrayList<String>();
	}

	public void println(String str){
		output.add(str);
	}
	public void println(Scanner str){
		output.add(str.toString());
	}
	public void println(CC4Parser str){
		output.add(str.toString());
	}
	public void println(Ast str){
		output.add(str.toString());
	}
	public void println(Semantic str){
		output.add(str.toString());
	}
	public void println(Irt str){
		output.add(str.toString());
	}
	public void println(ConstantFolding str){
		output.add(str.toString());
	}


	public String toString(){
		String str = "";
		for (int i=0; i<output.size(); i++) {
			str = str + output.get(i) + "\n";
		}

		return str;
	}
}