package compiler.semantic;

import compiler.ast.Ast;
import compiler.semantic.Tables;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.util.ArrayList;

public class Semantic {
	
	public Ast ast;
	public Tree arbol;
	public Tables tables;
	public boolean valid;
	public ArrayList<String> erroresScan, erroresParser, erroresSemantic;
	public int unicidad, existencia, tipos, fix;

	// contructor
	public Semantic(Ast ast){
		this.ast 	= ast;
		arbol 		= ast.getTree();
		tables 		= new Tables();
		valid 		= true;
		erroresScan 	= ast.getScanErrors();
		erroresParser 	= ast.getAstErrors();
		erroresSemantic = new ArrayList<String>();
		fix=0;
	}

	public boolean validProgram(){
		int w = erroresSemantic.size();
		int total = unicidad + tipos + existencia + w - fix;
		int z = erroresParser.size() + erroresScan.size();
		valid = (total==0)&&valid&&(z==0);
		return valid;
	}
	public Tree getArbol(){
		return arbol;
	}
	public Tables getSemanticTable(){
		return tables;
	}

	public void fillTables(){
		this.fillTables(arbol, "-");
		this.checkMain();
	}
	public void checkMain(){
		int x = tables.containsTable("main"); 
		if(x!=-1){
			x = tables.getTotalParam(x);
			if(x>0){
				valid = false;
				erroresSemantic.add("El metodo main no debe de tener parametros!!");
			}
		} else {
			valid = false;
			erroresSemantic.add("No tiene metodo main.");
		}
	}
	public void fillTables(Tree t, String tablename){
		int childs = t.getChildCount();
		String type = "";

		if(t.getText().equals("ROOT")) {
			tables.addTable("-", "ROOT");
			tables.addVars("int", "printStr", 0);
			tables.addVars("int", "printInt", 0);
			tables.addVars("int", "readInt", 0);
			tables.addTable("ROOT", "printStr");
			tables.addTable("ROOT", "printInt");
			tables.addTable("ROOT", "readInt");
			tables.addVars("String", "str", 1, 1);
			tables.addVars("int", "n", 2, 1);
			tables.removeFromVariables();
			for (int i=0; i<childs; i++) {
				this.fillTables(t.getChild(i), "ROOT");
			}
		} else if(t.getText().equals("FIELD")){
			type = t.getChild(0).getText();
			for (int i=1; i<childs; i++) {
				try {
					int x = Integer.parseInt(t.getChild(i+1).getText());
					if(x<=0){
						valid = false;
						erroresSemantic.add("No puede crear un arreglo vacio. >"+t.getChild(i)+"["+x+"]");
					} else if(tables.containsCurrentScope(t.getChild(i).getText(), 0)){
						unicidad++; fix++;
						erroresSemantic.add("Ya existe la variable: "+t.getChild(i).getText());
						valid = false;
						break;
					} else {
						//if(!type.equals("void"))
						tables.addVars((type+"[]"), t.getChild(i).getText(), 0, x, x);
						//valid = true;
					}
					i++;
				} catch (Exception e){
					if(tables.containsCurrentScope(t.getChild(i).getText(), 0)){
						unicidad++;
						fix++;
						erroresSemantic.add("Ya existe la variable: "+t.getChild(i).getText());
						valid = false;
						break;
					} else {
						tables.addVars(type, t.getChild(i).getText(), 0);
						//valid = true;
					}
				}
			}
		} else if(t.getText().equals("METHOD")){ 
			type = t.getChild(0).getText();
			if(tables.containsCurrentScope(t.getChild(1).getText(), 0)){
					unicidad++; valid = false; fix++;
					erroresSemantic.add("Ya existe la variable: "+t.getChild(1).getText());
			} else {
				tables.addVars(type, t.getChild(1).getText(), 0, 101);
				//valid = true;
			}
			tables.addTable("ROOT", t.getChild(1).getText());
			int scope = tables.containsTable(t.getChild(1).getText());
			if(childs>3) {
				for (int i=2; i<(childs-1); i+=2) {
					
					if(tables.containsCurrentScope(t.getChild(i+1).getText(), scope)){
						unicidad++;
						valid = false;
					} else {
						tables.addVars(t.getChild(i).getText(), t.getChild(i+1).getText(), scope, i);
						//valid = true;
					}
				}
			}
			if(!t.getChild(0).getText().equals("void"))
				tables.addVars(scope, "need");

			for (int i=0; i<childs; i++) {
				this.fillTables(t.getChild(i), t.getChild(1).getText());
			}
			if(tables.getReturnSize(scope)==-1){
				valid=false;
				String necesita = (t.getChild(0).getText().equals("void"))? "() No deberia":"() Deberia";
				erroresSemantic.add(t.getChild(0).getText()+" "+t.getChild(1).getText()+necesita+" de tener return! (valido)");
			}
			//System.out.println(tables.lastrow(scope));
			//System.exit(1);
		} else if(t.getText().equals("BLOCK")) {
			int scope = tables.containsTable(tablename);
			for (int i=0; i<childs; i++) {
				this.fillTables(t.getChild(i), tablename);
			}
		} else if(t.getText().equals("VARS")) {
			type = t.getChild(0).getText();
			int scope = tables.containsTable(tablename);
			for (int i=1; i<childs; i++) {
				if(tables.containsCurrentScope(t.getChild(i).getText(), scope)){
					unicidad++;
					valid = false;
					break;
				} else {
					tables.addVars(type, t.getChild(i).getText(), scope);
					//System.out.println("holi");
					//valid = true;
				}
			}
		} else if(t.getText().equals("STATEMENT")) {
			String nombre = t.getChild(0).getText();
			String nombrefix = nombre;
			int x = 2;
			if(nombre.equals("break")||nombre.equals("continue")){
				if(!tables.isParentFor(tablename)){
					valid = false;
					erroresSemantic.add(nombre+" deberia de estar dentro de un for");
				}
			} else if(nombre.equals("if")){
				while(tables.containsTable(nombrefix)!=-1){
					nombrefix = nombre + x;
					x++;
				}
				tables.addTable(tablename, nombrefix);
				String tipo = checkEx(t.getChild(1), "boolean", tablename, 1);

				//System.out.println(tipo+t.getChild(1).getText());
				if(!tipo.equals("boolean")){
					valid = false;
					tipos++; fix++;
					erroresSemantic.add("IF Expecting: boolean, Found: "+tipo+", Scope: "+tablename);
				}
				if(childs<4)
					for (int i=0; i<childs; i++)
						this.fillTables(t.getChild(i), nombrefix);
				else {
					this.fillTables(t.getChild(2), nombrefix);
					nombrefix = "else"; nombre = "else"; x=2;
					while(tables.containsTable(nombrefix)!=-1){
						nombrefix = nombre + x;
						x++;
					}
					tables.addTable(tablename, nombrefix);
					this.fillTables(t.getChild(4), nombrefix);
				}
			} else if(nombre.equals("for")){
				while(tables.containsTable(nombrefix)!=-1){
					nombrefix = nombre + x;
					x++;
				}
				tables.addTable(tablename, nombrefix);
				int scope = tables.containsTable(nombrefix);
				tables.addVars("int", t.getChild(1).getText(), scope);
				String tipo = this.checkEx(t.getChild(3), "int", nombrefix, 1);
				if(!tipo.equals("int")){
					valid = false;
					tipos++; fix++;
					erroresSemantic.add("For: Expecting: int, Found: "+tipo+", Scope: "+tablename);
				}
				tipo = this.checkEx(t.getChild(4), "int", nombrefix, 1);
				if(!tipo.equals("int")) {
					valid = false;
					tipos++; fix++;
					erroresSemantic.add("For: Expecting: int, Found: "+tipo+", Scope: "+tablename);
				}
				
				for (int i=0; i<childs; i++)
					this.fillTables(t.getChild(i), nombrefix);

			} else if(childs>2){
				if(t.getChild(1).getText().equals("=")) {
					int y = tables.containsTable(tablename);
					if(!nombre.equals("ARRAY")) {
						y = tables.containsRecur(nombre, y);
						if(y!=-1){
							valid = true;
							this.checkEx(t.getChild(2), tables.getVarType(nombre, y), tablename, 0);
						} else {
							valid = false; existencia++; fix++;
							erroresSemantic.add("No existe la variable: "+nombre);
						}
					} else { // si es array!
						nombre = t.getChild(0).getChild(0).getText();
						y = tables.containsRecur(nombre, y);
						if(y!=-1){
							valid = true;
							String arrayTipo = tables.getVarType(nombre, y);
							arrayTipo = arrayTipo.substring(0, arrayTipo.indexOf("["));
							String tipo = checkEx(t.getChild(2), arrayTipo, tablename, 1);
							if(!tipo.equals(arrayTipo)){
								valid = false;
								tipos++; fix++;
								erroresSemantic.add("Expecting: "+arrayTipo+", Found: "+tipo+", Scope: "+tablename);
							}
						} else {
							valid = false; existencia++; fix++;
							erroresSemantic.add("No existe la variable: "+nombre);
						}
						nombre = this.checkEx(t.getChild(0).getChild(1), "int", tablename, 1);
						if(!nombre.equals("int")){
							valid = false;
							tipos++; fix++;
							erroresSemantic.add("Array index has wrong type: "+nombre+" Expecting: int, Scope: "+tablename);
						}
					}
				} else if(t.getChild(1).getText().equals("+=")||t.getChild(1).getText().equals("-=")) {
					int y = tables.containsTable(tablename);
					if(!nombre.equals("ARRAY")) {
						y = tables.containsRecur(nombre, y);
						if(y!=-1){
							String tipo = this.checkEx(t.getChild(2), tables.getVarType(nombre, y), tablename, 1);
							if(!tipo.equals("int")){
								valid = false;
								tipos++; fix++;
								erroresSemantic.add("Expecting: int, Found: "+tipo+", Scope: "+tablename);
							}
						} else {
							valid = false; existencia++; fix++;
							erroresSemantic.add("No existe la variable: "+nombre);
						}
					} else {
						valid = false;
						tipos++; fix++;
						erroresSemantic.add("Expecting: int, Found: obj[], Scope: "+tablename);
					}
				}
				for (int i=0; i<childs; i++)
				this.fillTables(t.getChild(i), tablename);
			} else if(childs==2){ 
				if(t.getChild(0).getText().equals("return")){
					int y = tables.containsTable(tablename);
					String tipo = tables.getMethodType(tablename);
					String p = this.checkEx(t.getChild(1), tipo, tablename, 1);
					//System.out.println(p+ " "+tipo);
					if(!tipo.equals(p)){
						valid=false;
						tipos++;
						fix++;
						if(tipo.equals("void"))
							erroresSemantic.add("Expecting: no return, Found: return "+p+", Scope: "+tablename);
						else
							erroresSemantic.add("Expecting: return "+tipo+", Found: return "+p+", Scope: "+tablename);
					} else {
						tables.addVars(y, "true");
					}
					//System.out.println(tablename);

				}
			} else {
					for (int i=0; i<childs; i++)
					this.fillTables(t.getChild(i), tablename);
			}
		} else if(t.getText().equals("CALL")){
			int y = tables.containsTable(t.getChild(0).getText());

			if(y!=-1){
				int n = tables.getTotalParam(y);
				String p;
				if(n==(childs-1)){
					ArrayList<String> params = tables.tableParameters(y);
					String tipo = "";
					for (int i=0; i<n; i++) {
						p = tables.getVarType(i, y);
						tipo = checkEx(t.getChild(i+1), p, tablename, 1);
						//System.out.println(tipo);
						if(!tipo.equals(p)) {
							valid = false; tipos++; fix++;
							erroresSemantic.add("Expecting: "+p+", Found: "+tipo);
						}
					}
				} else {
					valid = false;
					erroresSemantic.add("El metodo "+t.getChild(0)+" tiene menos argumentos.");
				}
			} else {
				valid = false;
				existencia++;
				fix++;
				erroresSemantic.add("No existe el metodo: "+t.getChild(0).getText());
			}
		}
	}

	public String checkEx(Tree t, String type, String tablename, int getType){
		int childs = -1;
		if(t!=null)
			childs = t.getChildCount();

		int number = 0;
		String var = "";
		String tipo = "unknown";
		String tipo2 = "";
		String root = "";
		
		if(t!=null)
			root = t.getText();

		// if no childs
		if(childs==0){
			var = t.getText();

			if(var.equals("true")||var.equals("false")){
				tipo = "boolean";
			} else {

				try{
						number = Integer.parseInt(var);
						tipo = "int";
				} catch (Exception e) {
					int x = tables.containsTable(tablename);
					x = tables.containsRecur(var, x);

					if(x!=-1) {// lo encontro en la tabla
						tipo = tables.getVarType(var, x); //chequeo de tipos
						//System.out.println(tipo);
						
					} else {
						valid = false; existencia++; fix++;
						erroresSemantic.add("No existe la variable: "+var);
					}
				}
			}
			if(getType!=1) {
				if(tipo.equals(type)) {
					valid = valid;
				} else {
					valid = false;
					tipos++; fix++;
					/**

					**/
					erroresSemantic.add("Expecting: "+type+", Found: "+tipo+", Scope: "+tablename);
				}
			}
		} else {

		for (int i=0; i<childs; i++) {
			var = t.getChild(i).getText();
			
			if(root.equals("%")||root.equals("*")||root.equals("/")||root.equals("+")||root.equals("-")){
				tipo = checkEx(t.getChild(0), "int", tablename, 0);
				tipo2 = checkEx(t.getChild(1), "int", tablename, 0);
				tipo = "int";
				if(!tipo.equals(type)){
					if(getType!=1) {
						valid = false; tipos++; fix++;
						erroresSemantic.add("Expecting: "+type+" , Found: int, Scope: "+tablename);
					}
				}
				i = childs;
			} 
			else if(root.equals("!")){
				tipo = checkEx(t.getChild(0), "boolean", tablename, 1);

				if(!tipo.equals("boolean")){
					valid = false; tipos++; fix++;
					erroresSemantic.add("Expecting: boolean , Found: "+tipo+", Scope: "+tablename);
					
				}
				if(getType!=1 && !type.equals("boolean")){
					valid = false; tipos++; fix++;
					erroresSemantic.add("Expecting: "+type+" , Found: boolean, Scope: "+tablename);
				}
				i = childs;
			}
			
			else if(root.equals("&&")||root.equals("||")) {
				if(type.equals("boolean")&&getType!=1){
					tipo = checkEx(t.getChild(0), "boolean", tablename, 1);
					tipo2 = checkEx(t.getChild(1), "boolean", tablename, 1);
					if(tipo.equals("boolean")&&tipo2.equals("boolean")){
						valid = valid;
						tipo = "boolean";
					} else {
						valid = false;
						tipos++;
						fix++;
						erroresSemantic.add("Expecting: boolean "+root+" boolean, Found: "+tipo+" "+root+" "+tipo2+", Scope: "+tablename);
						i = childs;
					}
				} else {
					tipo = "boolean";
					if(getType!=1){
						valid = false; tipos++; fix++;
						erroresSemantic.add("Expecting: "+type+" , Found: boolean, Scope: "+tablename);
					}
					i = childs;
				}
			} else if(root.equals("<")||root.equals(">")||root.equals(">=")||root.equals("<=")) {
				if(type.equals("boolean")&&getType!=1){
					tipo = checkEx(t.getChild(0), "int", tablename, 1);
					tipo2 = checkEx(t.getChild(1), "int", tablename, 1);
					if(tipo.equals("int")&&tipo2.equals("int")){
						valid = valid;
						tipo = "boolean";
					} else {
						tipo = "boolean";
						valid = false; tipos++; fix++;
						erroresSemantic.add("Expecting: int "+root+" int, Found: "+tipo+" "+root+" "+tipo2);
						i = childs;
					}
				} else {
					tipo = "boolean";
					if(getType!=1){
						valid = false;
						tipos++;
						fix++;
						erroresSemantic.add("Expecting: "+type+", Found: boolean");
					}
					i = childs;
				}
			} else if(root.equals("!=")) {
				if(type.equals("boolean")){
					tipo = checkEx(t.getChild(0), type, tablename, 1);
					tipo2 = checkEx(t.getChild(1), type, tablename, 1);
					if(tipo.equals(tipo2)){
						valid = valid;
						tipo = "boolean";
					} else {
						valid = false;
						tipos++; fix++;
						erroresSemantic.add("Scope: "+tablename);
					}
				} else {
					valid = false;
					tipos++;
					fix++;
					erroresSemantic.add("Expecting: "+type+", Found: boolean");
					i = childs;
				}
			} else if(root.equals("==")) {
				if(type.equals("boolean")){
					tipo = checkEx(t.getChild(0), type, tablename, 1);
					tipo2 = checkEx(t.getChild(1), type, tablename, 1);
					if(tipo.equals(tipo2)){
						valid = valid;
						tipo = "boolean";
					} else {
						valid = false;
						tipos++; fix++;
						erroresSemantic.add("Scope: "+tablename);
					}
				} else {
					valid = false;
					tipos++;
					fix++;
					erroresSemantic.add("Expecting: "+type+", Found: boolean");
					i = childs;
				}
			} else if(root.equals("EX")){
				tipo = checkEx(t.getChild(i), type, tablename, getType);
				//System.out.println("paso aqui");
			} else if(root.equals("ARRAY")){
				int y = tables.containsTable(tablename);
				y = tables.containsRecur(t.getChild(0).getText(), y, 1);
				if(y!=-1){
					tipo = tables.getVarType(t.getChild(0).getText(), y);
					tipo = tipo.substring(0, tipo.indexOf("["));

					//y = tables.containsTable(tablename);
					checkEx(t.getChild(1), "int", tablename, 0);
					i = childs;
					//y = tables.containsRecur(t.getChild(1).getText(), y, 1);
					/*else if(y==-1){
						valid=false; fix++; existencia++;
						erroresSemantic.add("No existe la variable: "+t.getChild(0).getText());
						i = childs;
					}*/
				} else {
					valid=false; fix++; existencia++;
					erroresSemantic.add("No existe la variable: "+t.getChild(0).getText()+"[]");
					i = childs;
				}

			} else if(root.equals("PRINTF")) { 
				if(!type.equals("int")){
					if(getType!=1){
						valid = false; tipos++; fix++;
						erroresSemantic.add("Expecting: "+type+", Found: int, Scope: "+tablename);
					}
					i = childs;
				} else {
					tipo = "int";
				}
			} else if(root.equals("CALL")){
				//System.out.println("CALL OK");
				ArrayList<String> params = new ArrayList<String>();
				int y = tables.containsTable(t.getChild(0).getText());
				if(y!=-1){
					int n = tables.getTotalParam(y);
					String p = "";
					if(n == childs-1){
						tipo = tables.getMethodType(t.getChild(0).getText());
						tipo2 = tipo;
						if(!tipo.equals(type)){
							valid=false; tipos++; fix++;
							erroresSemantic.add("Expecting: "+type+", Found: "+tipo);
						} else {
							params = tables.tableParameters(y);
							for (int j=1; j<childs; j++) {
								tipo = tables.getVarType((j-1), y);
								p = checkEx(t.getChild(j), tipo, tablename, 1);
								if(!tipo.equals(p)){
									valid = false;
									tipos++;
									fix++;
									erroresSemantic.add("Expecting: "+tipo+", Found: "+p);
								}// else
								//System.out.println(p);
								//System.out.println(p);
							}
							tipo = tipo2;
						}
					
					} else {
						valid = false;
						erroresSemantic.add("El metodo "+t.getChild(0)+" tiene menos argumentos");
					}
				} else {
					valid = false;
					existencia++;
					fix++;
					erroresSemantic.add("No existe la variable: "+t.getChild(0).getText());
				}
				i = childs;
			} else if(var.equals("EX")) {
				tipo = checkEx(t.getChild(i), type, tablename, getType);
			} else {

				try{
					number = Integer.parseInt(var);
					tipo = "int";
				} catch (Exception e) {
					int x = tables.containsTable(tablename);
					x = tables.containsRecur(var, x);
					if(x!=-1) {// lo encontro en la tabla
						tipo = tables.getVarType(var, x); //chequeo de tipos
					} else {
						valid = false;
						existencia++;
						fix++;
						erroresSemantic.add("No existe la variable: "+var);
					}
				}
				if(getType!=1) {
					if(tipo.equals(type)) {
						valid = valid;
					} else {
						valid = false;
						tipos++;
					}
				}
			}
		}	// for loop
		} // else 
		//System.out.println(tipo);
		return tipo;
	}

	public String errors(){
		int x = erroresScan.size();
		int y = erroresParser.size();
		int w = erroresSemantic.size();
		boolean atras = (x==0 && y==0 && w==0);
		String es = (valid&&atras)? "  - Es": "  - No es";
		
		String str = "";
		if(erroresScan.size()!=0){
			str = str + "\n    Scanner: \t"+erroresScan.size();
			str = (erroresScan.size()==1)? str+" error.": str+" errores.";
		}
		if(erroresParser.size()!=0){
			str = str + "\n    Parser: \t"+erroresParser.size();
			str = (erroresParser.size()==1)? str+" error.": str+" errores.";
			for (int i=0; i<erroresParser.size(); i++) {
				str = str +"\n      "+erroresParser.get(i);
			}
		}
		int total = unicidad + tipos + existencia + w - fix;
		if(!valid||(total>0)){
			String typeOfEr = "";
			String errores = (total==1)? " error.": " errores.";

			str = str + "\n    Semantic: \t"+total+errores;
			
			if(unicidad>0){
				errores  = (unicidad==1)? " error": " errores";
				typeOfEr = "\n      "+unicidad+errores+" de Unicidad.";
			}
			if(existencia>0){
				errores  = (existencia==1)? " error": " errores";
				typeOfEr = typeOfEr+"\n      "+existencia+errores+" de Existencia.";
			}
			if(tipos>0){
				errores  = (tipos==1)? " error": " errores";
				typeOfEr = typeOfEr+"\n      "+tipos+errores+" de Tipos.";
			}
			if(w>0){
				for (int i=0; i<w; i++) {
					typeOfEr = typeOfEr+"\n      "+erroresSemantic.get(i);
				}
			}
			
			str = str + typeOfEr;
		}
		return str;
	}
	public String toString(){
		int x = erroresScan.size();
		int y = erroresParser.size();
		int w = erroresSemantic.size();
		boolean atras = (x==0 && y==0 && w==0);
		String es = (valid&&atras)? "  - Es": "  - No es";
		
		String str = "\n=========TABLES==========\n\n\n";
		str = str + tables.toString();
		str = str + "=========  END ==========\n\n";
		
		str = str + es+" valido!";
		if(erroresScan.size()!=0){
			str = str + "\n    Scanner: \t"+erroresScan.size();
			str = (erroresScan.size()==1)? str+" error.": str+" errores.";
		}
		if(erroresParser.size()!=0){
			str = str + "\n    Parser: \t"+erroresParser.size();
			str = (erroresParser.size()==1)? str+" error.": str+" errores.";
			for (int i=0; i<erroresParser.size(); i++) {
				str = str +"\n      "+erroresParser.get(i);
			}
		}
		int total = unicidad + tipos + existencia + w - fix;
		if(!valid||(total>0)){
			String typeOfEr = "";
			String errores = (total==1)? " error.": " errores.";

			str = str + "\n    Semantic: \t"+total+errores;
			
			if(unicidad>0){
				errores  = (unicidad==1)? " error": " errores";
				typeOfEr = "\n      "+unicidad+errores+" de Unicidad.";
			}
			if(existencia>0){
				errores  = (existencia==1)? " error": " errores";
				typeOfEr = typeOfEr+"\n      "+existencia+errores+" de Existencia.";
			}
			if(tipos>0){
				errores  = (tipos==1)? " error": " errores";
				typeOfEr = typeOfEr+"\n      "+tipos+errores+" de Tipos.";
			}
			if(w>0){
				for (int i=0; i<w; i++) {
					typeOfEr = typeOfEr+"\n      "+erroresSemantic.get(i);
				}
			}
			
			str = str + typeOfEr;
		}
		return str;
	}
}
