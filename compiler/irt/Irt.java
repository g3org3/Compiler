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
	public int ifCount = 0;
	public int elseCount = 0;
	public int forCount = 0;

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
		if(valid){
			setMips();
			readTree(arbol, "-");
			endMips();
		}
	}

	public void setMips(){
		code.add(".text");
		int x = tables.getVariablesSize();
		x = x * 4;
		//System.out.println(tables.getVariables());
		code.add("addi $sp $sp -"+x);
		code.add("j main #start program");
	}

	public void endMips(){
		code.add("li $v0 10 #end program");
		code.add("syscall");
	}

	public void readTree(Tree t, String scopeName){
		int childs = t.getChildCount();
		String rootName = t.getText();
		String nombre =""; String nombrefix=""; String nombrefix2 ="";

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
			if(type.equals("void")&& !(name.equals("main")))
				code.add("jr $ra");

		} else if(rootName.equals("BLOCK")){
			for (int i=0; i<childs; i++)
				readTree(t.getChild(i), scopeName);
		
		} else if(rootName.equals("STATEMENT")){
			if(t.getChild(0).getText().equals("if")){
				//System.out.println("ENTRO");
				nombre = "if";
				nombrefix = (ifCount==0)? nombre: nombre+ifCount;
				ifCount++;

				code.add(nombrefix+":");

				if(childs<4){
					getExVal(t.getChild(1), scopeName);
					code.add("beqz $v0 "+nombrefix+"done");
					readTree(t.getChild(2), nombrefix);
				}
				else {
					nombre = "else";
					nombrefix2 = (elseCount==0)? nombre: nombre+elseCount;
					elseCount++;

					getExVal(t.getChild(1), scopeName);
					code.add("beqz $v0 "+nombrefix2);
					readTree(t.getChild(2), nombrefix);
					code.add("j "+nombrefix+"done");
					code.add(nombrefix2+":");
					readTree(t.getChild(4), nombrefix);
				}

				code.add(nombrefix+"done:");
			} else if(t.getChild(0).getText().equals("for")){
				nombre = "for";
				nombrefix = (forCount==0)? nombre: nombre+forCount;
				forCount++;
				
				String var = tables.getMipsOf(t.getChild(1).getText(), nombrefix);
				getExVal(t.getChild(3), scopeName);
				code.add("sw $v0 "+var+"($sp)");
				code.add("move $t7 $v0");
				getExVal(t.getChild(4), scopeName);
				code.add("move $t8 $v0");
				code.add(nombrefix+":");
				code.add("beq $t7 $t8 "+nombrefix+"done");
				readTree(t.getChild(5), nombrefix);
				code.add("lw $t7 "+var+"($sp)");
				code.add("addi $t7 $t7 1");
				code.add("sw $t7 "+var+"($sp)");
				code.add("j "+nombrefix);
				code.add(nombrefix+"done:");

			} else if(childs>2){
				// ASIGN
				String var = tables.getMipsOf(t.getChild(0).getText(), scopeName);
				getExVal(t.getChild(2), scopeName);
				code.add("sw $v0 "+var+"($sp)");
			} else if(childs==2){
				if(t.getChild(0).getText().equals("return")){
					getExVal(t.getChild(1), scopeName);
					if(!scopeName.equals("main"))
						code.add("jr $ra");
				}
			} else {
				for (int i=0; i<childs; i++) {
				readTree(t.getChild(i), scopeName);
				}
			}

		} else if(rootName.equals("CALL")) {
			String name = t.getChild(0).getText();
			
			if(childs==1 && name.equals("readInt")){
				code.add("li $v0 5");
				code.add("syscall");
			} 
			String var = (childs==1)? "":t.getChild(1).getText();
			String type="";
			int x=0;
			if(name.equals("printInt")){
				getExVal(t.getChild(1), scopeName);
				code.add("move $a0 $v0");
				code.add("li $v0 1");
				code.add("syscall");
				//System.out.println(var);
			} else {
				x = tables.getTotalParam(name);
				for (int j=0; j<x; j++) {
					getExVal(t.getChild(j+1), scopeName);
					type = tables.getVarName(j, name);
					type = tables.getMipsOf(type, name);
					code.add("sw $v0 "+type+"($sp)");
				}
				code.add("jal "+name);
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

	public String getExVal(Tree t, String scopeName){
		String val = "unkown";
		String type = "unkown";
		String rootName = "";
		int childs = -1;
		if(t!=null){
			childs = t.getChildCount();
			rootName = t.getText();
		}
		int x, subchilds;

		if(childs==0){
			if(rootName.equals("true")||rootName.equals("false")){
				if(rootName.equals("true"))
					code.add("addi $v0 $0 1");
				else
					code.add("add $v0 $0 $0");
			} else {
				try {
					Integer.parseInt(rootName);
					code.add("addi $v0 $0 "+rootName);
				} catch (Exception e) {
					val = tables.getMipsOf(rootName, scopeName);
					code.add("lw $v0 "+val+"($sp)");
				}
			}
		} else {
			//code.add("move $t8 $a0");
			//code.add("move $t9 $a0");
			for (int i=0; i<childs; i++) {
				if(rootName.equals("EX")){
					getExVal(t.getChild(i), scopeName);
				} else if(rootName.equals("+")){
					getExVal(t.getChild(0), scopeName);
					code.add("move $a0 $v0");
					
					getExVal(t.getChild(1), scopeName);
					code.add("move $a1 $v0");
					
					code.add("add $v0 $a0 $a1");
					i=childs;
				} else if(rootName.equals("-")){
					getExVal(t.getChild(0), scopeName);
					code.add("move $a0 $v0");
					
					if(childs==2) {
						getExVal(t.getChild(1), scopeName);
						code.add("move $a1 $v0");
					
						code.add("sub $v0 $a0 $a1");
					} else {
						code.add("sub $v0 $0 $a0");
					}
					i=childs;
				} else if(rootName.equals("*")){
					getExVal(t.getChild(0), scopeName);
					code.add("move $a0 $v0");
					
					getExVal(t.getChild(1), scopeName);
					code.add("move $a1 $v0");
					
					code.add("mult $a0 $a1");
					code.add("mflo $v0");
					i=childs;
				} else if(rootName.equals("/")){
					getExVal(t.getChild(0), scopeName);
					code.add("move $a0 $v0");
					
					getExVal(t.getChild(1), scopeName);
					code.add("move $a1 $v0");
					
					code.add("div $a0 $a1");
					code.add("mflo $v0");
					i=childs;
				}  else if(rootName.equals("%")){
					getExVal(t.getChild(0), scopeName);
					code.add("move $a0 $v0");
					
					getExVal(t.getChild(1), scopeName);
					code.add("move $a1 $v0");
					
					code.add("div $a0 $a1");
					code.add("mfhi $v0");
					i=childs;
				} else if(rootName.equals("!")){
					getExVal(t.getChild(0), scopeName);
					code.add("beqz $v0 else"+scopeName);
					code.add("add $v0 $0 $0");
					code.add("j done"+scopeName);
					code.add("else"+scopeName+":");
					code.add("addi $v0 $0 1");
					code.add("done"+scopeName+":");
					i = childs;

				} else if(rootName.equals("==")) {
					getExVal(t.getChild(0), scopeName);
					code.add("move $a0 $v0");
					getExVal(t.getChild(1), scopeName);
					code.add("move $a1 $v0");
					code.add("bne $a0 $a1 else"+scopeName);
					code.add("addi $v0 $0 1");
					code.add("j done"+scopeName);
					code.add("else"+scopeName+":");
					code.add("add $v0 $0 $0");
					code.add("done"+scopeName+":");
					i = childs;
				} else if(rootName.equals("CALL")){
					val = t.getChild(0).getText();
					if(childs==1 && val.equals("readInt")){
						code.add("li $v0 5");
						code.add("syscall");
					} else {
						x = tables.getTotalParam(val);
						for (int j=0; j<x; j++) {
							getExVal(t.getChild(j+1), scopeName);
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
		//code.add("move $a0 $t8");
		//code.add("move $a1 $t9");
		return val;
	}

	public String toString(){
		String str = "";
		String num = "";
		if(!valid)
			return "  No se pudo hacer el irt ya que el programa no es valido.\n  Para ver los errores prueba con:\n\n  java Compiler -debug -semantic tuprograma.dcf ";
		for (int i=0; i<code.size(); i++) {
			num = ((i+1)<10)? " "+(i+1): (i+1)+"";
			//str = str+"   "+ num +". "+code.get(i)+"\n";
			str = str+code.get(i)+"\n";
		}

		return str;
	}

}