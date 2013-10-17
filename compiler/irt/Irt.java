package compiler.irt;

import compiler.semantic.Semantic;
import compiler.ast.Ast;
import compiler.semantic.Tables;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.util.ArrayList;


public class Irt {
	// campos
	public Semantic semantic;
	public Tree 	arbol;
	public Tables  	tables;
	public boolean 	valid;
	public ArrayList<String> code;

	// contructor
	public Irt(Semantic smt){
		semantic 	= smt;
		//arbol		= smt.getArbol();
		tables 		= smt.getSemanticTable();
		valid 		= smt.validProgram();
		code 		= new ArrayList<String>();
	}


	// metodos
	public void setTree(Ast ast){
		arbol = ast.getTree();
		setMips();
		readTree(arbol, "-");
		endMips();
	}

	public void setMips(){
		code.add(".text");
		int x = tables.getVariablesSize();
		x = x * 4;
		//System.out.println(tables.getVariables());
		code.add("addi $sp $sp -"+x);
		code.add("j main");
	}

	public void endMips(){
		code.add("li $v0 10");
		code.add("syscall");
	}

	public void readTree(Tree t, String scopeName){
		int childs = t.getChildCount();
		String rootName = t.getText();

		if(rootName.equals("ROOT")){
			for (int i=0; i<childs; i++)
				readTree(t.getChild(i), "ROOT");

		} else if(rootName.equals("FIELD")){
			String type = t.getChild(0).getText();
			//int freeSpace = 4 * (childs-1);
			//code.add("addi $sp $sp -"+freeSpace);

		} else if(rootName.equals("METHOD")){
			String type = t.getChild(0).getText();
			String name = t.getChild(1).getText();
			code.add(name+":");//# "+type+" "+name+"()");
			
			for (int i=0; i<childs; i++)
				readTree(t.getChild(i), t.getChild(1).getText());

		} else if(rootName.equals("BLOCK")){
			for (int i=0; i<childs; i++)
				readTree(t.getChild(i), scopeName);
		
		} else if(rootName.equals("STATEMENT")){
			if(childs>2){
				// ASIGN
				String var = tables.getMipsOf(t.getChild(0).getText(), scopeName);
				getExVal(t.getChild(2), scopeName, "");
				code.add("add $t1 $v0 $0");
				code.add("sw $t1 "+var+"($sp)");
			} else if(childs==2){
				if(t.getChild(0).getText().equals("return")){
					getExVal(t.getChild(1), scopeName, "");
					code.add("jr $ra");
				}
			}
			for (int i=0; i<childs; i++)
				readTree(t.getChild(i), scopeName);

		} else if(rootName.equals("CALL")) {
			String name = t.getChild(0).getText();
			String var = t.getChild(1).getText();
			if(name.equals("printInt")){
				getExVal(t.getChild(1), scopeName, "");
				code.add("move $a0 $v0");
				code.add("li $v0 1");
				code.add("syscall");
			} 
		} else if(rootName.equals("PRINTF")){
			if(!code.get(0).equals(".data"))
				code.add(0, ".data");
			int x = 1;
			String str = "str";
			String label = str+x;

			for (int i=0; i<code.size(); i++) {
				if(code.get(i).indexOf("str")!=-1)
					x++;

				if(code.get(i+1).equals(".text"))
					i = code.size();
			}
			label = str+x;

			code.add(x, label+": .asciiz "+t.getChild(1).getText());
			code.add("la $a0 "+label);
			code.add("li $v0 4");
			code.add("syscall");
			//System.out.println("lkasdjflkajsdkfdfjkl");
		}

	}

	public String getExVal(Tree t, String scopeName, String rd){
		String val = "unkown";
		String type = "unkown";
		int childs = t.getChildCount();
		String rootName = t.getText();
		int x, subchilds;

		if(childs==0){
			try {
				Integer.parseInt(rootName);
				code.add("addi $v0 $0 "+rootName);
			} catch (Exception e) {
				val = tables.getMipsOf(rootName, scopeName);
				code.add("lw $v0 "+val+"($sp)");
			}
		} else {
			for (int i=0; i<childs; i++) {
				if(rootName.equals("EX")){
					getExVal(t.getChild(i), scopeName, rd);
				} else if(rootName.equals("+")){
					getExVal(t.getChild(0), scopeName, "$a0");
					code.add("move $a0 $v0");
					
					getExVal(t.getChild(1), scopeName, "$a1");
					code.add("move $a1 $v0");
					
					code.add("add $v0 $a0 $a1");
					i=childs;
				} else if(rootName.equals("*")){
					getExVal(t.getChild(0), scopeName, "$a0");
					code.add("move $a0 $v0");
					
					getExVal(t.getChild(1), scopeName, "$a1");
					code.add("move $a1 $v0");
					
					code.add("mult $a0 $a1");
					code.add("mflo $v0");
					i=childs;
				} else if(rootName.equals("/")){
					getExVal(t.getChild(0), scopeName, "$a0");
					code.add("move $a0 $v0");
					
					getExVal(t.getChild(1), scopeName, "$a1");
					code.add("move $a1 $v0");
					
					code.add("div $a0 $a1");
					code.add("mflo $v0");
					i=childs;
				} else if(rootName.equals("CALL")){
					val = t.getChild(0).getText();
					if(childs==1 && val.equals("readInt")){
						code.add("li $v0 5");
						code.add("syscall");
					} else {
						x = tables.getTotalParam(val);
						for (int j=0; j<x; j++) {
							getExVal(t.getChild(j+1), scopeName, "");
							type = tables.getVarName(j, val);
							type = tables.getMipsOf(type, val);
							code.add("sw $v0 "+type+"($sp)");
						}
						code.add("jal "+val);
						i = childs;
					}
				}
			}
		}

		return val;
	}

	public String toString(){
		String str = "";
		String num = "";
		if(!valid)
			return "  No se pudo hacer el irt ya que el programa no es valido.";
		for (int i=0; i<code.size(); i++) {
			num = ((i+1)<10)? " "+(i+1): (i+1)+"";
			//str = str+"   "+ num +". "+code.get(i)+"\n";
			str = str+code.get(i)+"\n";
		}

		return str;
	}

}