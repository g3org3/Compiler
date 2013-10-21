package compiler.semantic;

import java.util.ArrayList;

public class Tables {

	private ArrayList<ArrayList<ArrayList<String>>> tablas;
	private ArrayList<ArrayList<String>> variables;
	private int mips = 0;

	public Tables() {
		tablas 		= new ArrayList<ArrayList<ArrayList<String>>>();
		variables 	= new ArrayList<ArrayList<String>>();

		variables.add(new ArrayList<String>()); // 0 scope
		variables.add(new ArrayList<String>()); // 1 type
		variables.add(new ArrayList<String>()); // 2 name
		variables.add(new ArrayList<String>()); // 3 mips
	}

	public void addTable(String parent, String name){
		ArrayList<ArrayList<String>> tabla = new ArrayList<ArrayList<String>>();
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		
		lista.add(parent);
		lista2.add(name);

		tabla.add(lista);						// 0 PARENT 
		tabla.add(lista2);						// 1 NAME
		tabla.add(new ArrayList<String>());		// 2 VAR TYPE
		tabla.add(new ArrayList<String>());		// 3 VAR NAME
		tabla.add(new ArrayList<String>());		// 4 PARAMETROS
		tabla.add(new ArrayList<String>());		// 5 NEED RETURN

		tablas.add(tabla);
	}

	public void removeFromVariables(){
		for (int i=1; i<6; i++) {
			variables.get(0).remove(0);
			variables.get(1).remove(0);
			variables.get(2).remove(0);
			variables.get(3).remove(0);
		}
	}
	public void printVariables(){
		System.out.println("scope | type | name | mips");
		String scope, type, name, mips;
		for (int i=0; i<variables.get(0).size(); i++) {
			scope =variables.get(0).get(i);
			type =variables.get(1).get(i);
			name =variables.get(2).get(i);
			mips =variables.get(3).get(i);
			System.out.println(scope+" | "+type+" | "+name+" | "+mips);
		}
	}
	public int getVariablesSize(){
		return variables.get(1).size();
	}
	public String getParent(int i){
		return new String(tablas.get(i).get(0).get(0));
	}
	public String getMipsOf(String var, String scope){
		int x = getPositionInTable(var, scope);
		x = x * 4;
		//System.out.println(x);
		return x+"";
	}
	public String getMipsOf(String var, int sp){
		String scope = getName(sp);
		int x = getPositionInTable(var, scope);
		return (x*4)+"";
	}

	public int getPositionInTable(String var, String scopeP){
		String scope = "";
		if(var.indexOf("[")!=-1){
			String var2 = var;
			var = var.substring(0, var.indexOf("["));
			scope = getName(containsRecur(var, containsTable(scopeP)));
			var = var2;
		} else {
			scope = getName(containsRecur(var, containsTable(scopeP)));
		}

		

		int x = 0;
		for (int i=0; i<variables.get(0).size(); i++) {
			if(variables.get(0).get(i).equals(scope) && variables.get(2).get(i).equals(var))
				x=i;
			//System.out.print(variables.get(0).get(i)+ " ");
			//System.out.print(variables.get(2).get(i));
			//System.out.print(" = ");
			//System.out.print(scope);
			//System.out.println(" "+var);
		}
		//System.out.println(var+" "+x);
		return x;
	}

	public void addVars(int scope, String t){
		tablas.get(scope).get(5).add(t);
	}

	public int getReturnSize(int scope){
		int x = -1;

		if(tablas.get(scope).get(5).isEmpty())
			return 1;

		String need = tablas.get(scope).get(5).get(0);
		if(need.equals("need")){
			if(tablas.get(scope).get(5).size()>1){
				x=1;
			}
		}
		return x;
	}
	public void addVars(String type, String name, int scope){
		this.addVars(type, name, scope, -1);
	}
	public void addVars(String type, String name, int scope, int i){
		tablas.get(scope).get(2).add(type);
		tablas.get(scope).get(3).add(name);
		tablas.get(scope).get(4).add(i+"");

		if(i!=101){
			variables.get(0).add(getName(scope));
			variables.get(1).add(type);
			variables.get(2).add(name);
			variables.get(3).add(mips+"");
			mips+=4;
		}
	}
	public void addVars(String type, String name, int scope, int i, int size){
		tablas.get(scope).get(2).add(type);
		tablas.get(scope).get(3).add(name);
		tablas.get(scope).get(4).add(i+"");

		for (int p=0; p<size; p++) {
			variables.get(0).add(getName(scope));
			variables.get(1).add(type);
			variables.get(2).add(name+"["+p+"]");
			variables.get(3).add(mips+"");
			mips+=4;
		}
	}

	public ArrayList<String> tableParameters(int scope){
		return tablas.get(scope).get(4);
	}

	public int getTotalParam(int scope){
		int x = 0;
		ArrayList<ArrayList<String>> tabla = tablas.get(scope);
		int size = tabla.get(4).size();
		for (int i=0; i<size; i++) {
			if(!tabla.get(4).get(i).equals("-1"))
				x++;
		}
		return x;
	}

	public int getTotalParam(String scopeName){
		int scope = containsTable(scopeName);
		int x = 0;
		//System.out.println(scopeName);
		//System.exit(1);
		ArrayList<ArrayList<String>> tabla = tablas.get(scope);
		int size = tabla.get(4).size();
		for (int i=0; i<size; i++) {
			if(!tabla.get(4).get(i).equals("-1"))
				x++;
		}
		return x;
	}

	public int getTotalVars(int scope){
		int x = 0;
		ArrayList<ArrayList<String>> tabla = tablas.get(scope);
		int size = tabla.get(4).size();
		for (int i=0; i<size; i++) {
			if(!tabla.get(4).get(i).equals("-1"))
				x++;
		}
		return (size - x);
	}

	public boolean containsCurrentScope(String key, int i){
		if(i>=tablas.size())
			return false;

		ArrayList<ArrayList<String>> scope = tablas.get(i);
		boolean found = false;

		for (int k=0; k<scope.get(3).size(); k++)
			if(scope.get(3).get(k).equals(key))
				found = true;

		return found;
	}
	public boolean isParentFor(String scopeName){
		int scope = containsTable(scopeName);
		String parent = getParent(scope);
		boolean entro = false;
		while(!parent.equals("-")){
			if(parent.indexOf("for")!=-1)
				entro = true;
			scope = containsTable(parent);
			parent = getParent(scope);
		}
		return entro;
	}
	public String getVarType(int position, int scope){
		ArrayList<ArrayList<String>> tabla = tablas.get(scope);
		String tipo = tabla.get(2).get(position);
		return tipo;
	}
	public String getVarName(int position, int scope){
		ArrayList<ArrayList<String>> tabla = tablas.get(scope);
		String tipo = tabla.get(3).get(position);
		return tipo;
	}

	public String getVarType(int position, String scopeName){
		int scope = containsTable(scopeName);
		ArrayList<ArrayList<String>> tabla = tablas.get(scope);
		String tipo = tabla.get(2).get(position);
		return tipo;
	}
	public String getVarName(int position, String scopeName){
		int scope = containsTable(scopeName);
		ArrayList<ArrayList<String>> tabla = tablas.get(scope);
		String tipo = tabla.get(3).get(position);
		return tipo;
	}

	public String getParentIfFor(String statement){
		String method = "no tiene";
		int scope = containsTable(statement);
		if(statement.indexOf("if")!=-1)
			method = getParentIfFor(getParent(scope));
		else if(statement.indexOf("for")!=-1)
			method = getParentIfFor(getParent(scope));
		else if(statement.indexOf("else")!=-1)
			method = getParentIfFor(getParent(scope));
		else
			method = statement;

		//System.out.println(method);
		return method;
	}
	public String getMethodType(String method){
		String tipo = "unkown";
		if(method.indexOf("if")!=-1)
			method = getParentIfFor(method);
		else if(method.indexOf("for")!=-1)
			method = getParentIfFor(method);
		else if(method.indexOf("else")!=-1)
			method = getParentIfFor(method);
		
		int scope = containsTable(method);
		String parent = getParent(scope);
		scope = containsTable(parent);
		for (int i=0; i<tablas.get(scope).get(3).size(); i++) {
			if(tablas.get(scope).get(3).get(i).equals(method)) {
				tipo = tablas.get(scope).get(2).get(i);
				break;
			}
		}
		return tipo;
	}

	public String getVarType(String key, int scope){
		ArrayList<ArrayList<String>> tabla = tablas.get(scope);
		String tipo = "";
		for (int i=0; i<tabla.get(3).size(); i++) {
			if(tabla.get(3).get(i).equals(key))
				tipo = tabla.get(2).get(i);
		}

		return tipo;
	}
	public String getVarType(String key, String scopeName){
		int scope = containsTable(scopeName);
		ArrayList<ArrayList<String>> tabla = tablas.get(scope);
		String tipo = "";
		for (int i=0; i<tabla.get(3).size(); i++) {
			if(tabla.get(3).get(i).equals(key))
				tipo = tabla.get(2).get(i);
		}

		return tipo;
	}

	public int containsTable(String key){
		int x = -1;

		for (int i=0; i<tablas.size(); i++) {
			if(tablas.get(i).get(1).get(0).equals(key))
				x = i;
		}
		return x;
	}

	public int containsRecur(String key, int scope){
		int x = -1;
		String parent = "";


		while(parent.equals("")){
			if(this.containsCurrentScope(key, scope)){
				parent = "fin";
				x = scope;
			} else {
				if(this.getParent(scope).equals("-"))
					parent = "fin";
				else
					scope = this.containsTable(this.getParent(scope));
			}
		}
		return x;
	}
	public int containsRecur(String key, int scope, int i){
		int x = -1;
		String parent = "";

		while(parent.equals("")){
			if(this.containsCurrentScope(key, scope)){
				parent = "fin";
				x = scope;
			} else {
				if(this.getParent(scope).equals("-"))
					parent = "fin";
				else
					scope = this.containsTable(this.getParent(scope));
			}
		}
		String tipo = getVarType(key, x);
		x = (tipo.indexOf("[")!=-1)? x: -1;
		return x;
	}

	public int containsInTable(String key){
		int x = -1;

		for (int i=0; i<tablas.size(); i++) {
			for (int k=0; k<tablas.get(i).get(3).size(); k++)
				if(tablas.get(i).get(3).get(k).equals(key))
					x = i;
		}
		return x;
	}

	public String getName(int i){
		return new String(tablas.get(i).get(1).get(0));
	}

	public String toString(){
		String str = "";
		ArrayList<ArrayList<String>> tabla;
		String auxTipo = "";
		String auxName = "";

		for (int i=0; i<tablas.size(); i++) {
			tabla = tablas.get(i);
			
			//fix si vacias
			if(tabla.get(2).size()!=0) {

			str = str +"  Parent: "+tabla.get(0).get(0)+"    Name: "+tabla.get(1).get(0);
			str = str + "\n  -------------------\n";
			str = str + "     type   |   name   \n";
			for (int j=0; j<tabla.get(2).size(); j++) {
				auxTipo = tabla.get(2).get(j);
				auxName = tabla.get(3).get(j);
				auxTipo = correctSpaces(auxTipo);
				str = str+"  "+auxTipo+"|    "+auxName+"\n"; 
			}
			str = str + "\n\n";

			} //fix
		}
		return str;
	}
	public String correctSpaces(String str){
		if(str.equals("boolean"))
			return "  boolean ";
		if(str.equals("int"))
			return "    int   ";
		if(str.equals("void"))
			return "   void   ";
		if(str.equals("int[]"))
			return "   int[]  ";
		if(str.equals("boolean[]"))
			return "boolean[] ";
		if(str.equals("String"))
			return "  String  ";
		return "";
	}
	/*
	public static void main(String[] args) {
		Tables tab = new Tables();

		tab.addTable("-", "Root");
		tab.addVars("int", "a", 0);
		tab.addVars("int", "c", 0);
		tab.addVars("int", "aslkdjf", 0);
		tab.addVars("boolean", "Add", 0);

		tab.addTable("Root", "Add");
		tab.addVars("int", "d", 1);
		tab.addVars("int", "c", 1);
		tab.addVars("int", "aslkdjf", 1);

		tab.addTable("Add", "if");
		tab.addVars("int", "d", 2);
		tab.addVars("int", "a", 2);
		tab.addVars("int", "aslkdjf", 2);

		tab.addTable("if", "if2");
		tab.addVars("boolean", "asdf", 3);

	 	System.out.println(tab.getMethodType("if2"));
		System.out.println(tab);
	}
	//*/


}














