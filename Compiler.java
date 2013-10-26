// 

import compiler.scanner.*;
import compiler.parser.*;
import compiler.irt.*;
import compiler.ast.*;
import compiler.semantic.*;
import compiler.codegen.*;
import compiler.opt.*;
import compiler.lib.*;
import java.io.*;
import java.util.ArrayList;

public class Compiler {
	public String[] args;
	public int size;
	public boolean dev;

	public Compiler(String[] args){
		this.args = args;
		this.size = args.length;
		dev = false;
	}

	// METODOS
	public void error(int o, int d, PrintWriter a){
		a.close();
		error(o, d);
	}
	public void error(int o, int d){
		error(o, d, -1);
	}
	public void error(int o, int d, int type){
		System.out.println("-------------------------------------------------------------------------------------");
		//	DEBUG
		new ErrorHandler().displayError(type);
		if(dev)
			System.out.println("*Error on line "+d+".");
		
	}
	public void noArguments(){
		if (this.args.length==0)
			this.error(1, 35, 0);
		else {
			if(args[args.length-1].equals("-dev"))
				size = size -1;
		}
	}
	public int counter(String str){
		int x=0;
		for (int i=0; i<this.size; i++) {
			if(args[i].equals(str)) x++;
		}
		return x;
	}
	public int position(String str){
		int x=-1;
		for (int i=0; i<this.size; i++) {
			if(args[i].equals(str)) x=i;
		}
		return x;
	}
	public void verificar(String str){
		int x = this.position(str);
		if(x+1>=size || (x+2)>=size)
			this.error(1, 53);
		if(args[x+1].substring(0,1).equals("-"))
			this.error(1,55);

	}
	public String[] separate(String str){
		int n = 1;
		int x = -1;
		int i = 0;
		String aux = str;

		// cuantos stages hay!
		x = aux.indexOf(":");
		while (x>=0) {
			aux = aux.substring(x+1);
			x = aux.indexOf(":");
			n++;
		}

		// creamos el arreglo
		String stages[] = new String[n];

		// guardarlos a un arreglo
		x = str.indexOf(":");
		while (x>=0) {
			stages[i] = str.substring(0,x);
			str = str.substring(x+1);
			x = str.indexOf(":");
			i++;
		}

		// el ultimo o primero
		stages[i] = str;
		
		return stages;
	}

	public String[] insertionSort(String[] arreglo, String[] targets){

		int aux, j;
		String aux2;
		int[] positions = new int[arreglo.length];
		ArrayList<String> fill = new ArrayList<String>(1);

		// array of indexs
		for (int i=0; i<positions.length; i++)
			for (int k=0; k<targets.length; k++)
				if(arreglo[i].equals(targets[k]))
					positions[i] = k;

		// insertion sort
		for (int i=1; i<positions.length; i++) {
			aux = positions[i];
			aux2 = arreglo[i];					// fix
			j = i-1;
			while (j>=0 && positions[j]>aux){
				positions[j+1] = positions[j];
				arreglo[j+1] = arreglo[j];		// fix
				j = j-1;
			}
			positions[j+1] = aux;
			arreglo[j+1] = aux2;
		}

		aux2 = "";
		// remove repeated stages
		for (int i=0; i<arreglo.length; i++) {
			if (aux2.equals(arreglo[i]));
			else
				fill.add(arreglo[i]);

			aux2 = arreglo[i];

		}

		// list to array
		String[] a = new String[fill.size()];
		for (int i=0; i<fill.size(); i++) {
			a[i] = fill.get(i);
		}

		// done
		return a;
		
	}

	public static void main(String[] args) throws Exception {
		// Define variables
		Debug outputFileDebug = new Debug();
		int x					= 0;
		String str 				= "";
		String filename 		= "";
		String output			= "";
		File outFile 			= new File("");
		PrintWriter outputFile	= new PrintWriter("compiler/test/readme.txt");
		String[] options 		= {"-o", "-target", "-opt", "-debug", "-h"};
		String[] targets 		= {"scan", "parser", "ast", "semantic", "irt", "codegen"};
		String[] targetsP 		= {"Scanner", "Parser", "Ast", "Semantic", "Irt", "Codegen"};
	ArrayList<String> myOptions	= new ArrayList<String>(1);
	ArrayList<String> debugList	= new ArrayList<String>(1);
		
		// Create a compiler
		Compiler compilador = new Compiler(args);

		// checks if there are no arguments
		compilador.noArguments();

		int o = compilador.counter("-o");
		int target = compilador.counter("-target");
		int opt = compilador.counter("-opt");
		int debug = compilador.counter("-debug");
		int h = compilador.counter("-h");

		// if no option recognized
		if(o==0&&target==0&&opt==0&&debug==0)
			compilador.error(1, 149, 1);

		// checks for filename
		if(args.length<3) compilador.error(1, 201, 2);
		else if(args[args.length-3].substring(0,1).equals("-"))
			if(args[args.length-2].substring(0,1).equals("-"))
				compilador.error(1, 155, 5);
			else
				//if(args[args.length-1].indexOf(".txt")>0)
					filename = args[args.length-1];
				//else
				//	compilador.error(1,160);
		else
			compilador.error(1, 193, 5);
		// exists?
		File file = new File(filename);
		if(!(file.exists())) compilador.error(1, 163, 3);

		// checks if the options have valid arguments
		for (int i=0; i<options.length; i++) {
			x = compilador.position(options[i]);
			str = args[x+1];
			if(x>=0 && i==0){										//VERIFY -O
				compilador.verificar("-o");
				if(str.indexOf(".s")<0)
					compilador.error(1,172, 4);
			}
			else if(x>=0 && i==1){									//VERIFY -TARGET
				x = -1;
				for (int j=0; j<targets.length; j++)
					if(str.equals(targets[j])) x=1;
				if(x<0) compilador.error(1,178, 6);
			} else if (x>=0 && i==2){								//VERIFY -OPT
				if(!(str.equals("algebraic")||str.equals("constant")))
					compilador.error(1, 181, 7);
			} else if (x>=0 && i==3){								//VERIFY -DEGUB
				x = 0;
				String[] stages = compilador.separate(str);
				for (int k=0; k<stages.length; k++)
					for (int j=0; j<targets.length; j++)
						if(stages[k].equals(targets[j]))
							x++;
				if (!(x==stages.length)) compilador.error(1, 191, 8);
			}
		}

		// all ok!
		System.out.println("------------------------------");
		System.out.println("Input   File: "+filename);


		// o
		if(o>0){
			x = compilador.position("-o");
			output = args[x+1];
			System.out.println("Output  File: "+output);
			try {
				outFile = new File(output);
				outputFile = new PrintWriter(outFile);
			} catch (Exception e) {compilador.error(1, 208);}
		} else {
			x = filename.indexOf(".");
			if(x<0)
				str = filename;
			else
				str = filename.substring(0, x);
			str = str + ".s";
			output = str;
			System.out.println("Output  File: "+str);
			
			try {
				outFile = new File(output);
				outputFile = new PrintWriter(outFile);
			} catch (Exception e) {compilador.error(1, 219);}
		}
		//System.out.println(" ");


		// Creating objects
		Scanner 	myScanner 		= new Scanner(filename);
		CC4Parser 	myParser 		= new CC4Parser(myScanner);
		Ast 		myAst 			= new Ast(myParser);
		Ast 		myAst2 			= new Ast(myParser);
		Semantic 	mySemantic 		= new Semantic(myAst);
		Irt 		myIrt 			= new Irt(mySemantic);
		ArrayList<String> targetout = new ArrayList<String>();
		ArrayList<String> myScannerErrors = new ArrayList<String>();

		// target
		if(target>0){
			x = compilador.position("-target");
			str = args[x+1];
			for (int i=0; i<targets.length; i++)
				if(str.equals(targets[i])) x=i;
			for (int i=0; i<=x; i++){
				myOptions.add(targets[i]);
			}
			if(x>-1){
				//SCANNER
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Scanner");
				outputFileDebug.println("------------------------------");
				
				myScanner.scanIt();
				targetout = myScanner.getList();
				for (int i=0; i<targetout.size(); i++) {
					outputFileDebug.println(targetout.get(i));
				}
				outputFileDebug.println("\n");

				myScannerErrors = myScanner.getErrores();
			}
			if(x>0){
				//PARSER
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Parser");
				outputFileDebug.println("------------------------------");
				myScanner = new Scanner(filename);
				myParser = new CC4Parser(myScanner);
				myParser.parserIt();
				targetout = myParser.getErrors();
				String msg = (targetout.size()==1)?"  Invalido, se ha detecdado "+targetout.size()+" error.": "";
				msg = (targetout.size()>1)?"  Invalido, se han detecdado "+targetout.size()+" errores.": msg;
				if (targetout.size()!=0){
					outputFileDebug.println(msg);
					outputFileDebug.println(myParser);
				} else {
					outputFileDebug.println("  Valido, no se han detecdado errores.");
					outputFileDebug.println(myParser.toStringX());
				}
				outputFileDebug.println("\n");
			}
			if(x>1){
				//AST
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Ast");
				outputFileDebug.println("------------------------------");
				myScanner = new Scanner(filename);
				myParser = new CC4Parser(myScanner);
				myAst = new Ast(myParser);
				myAst.makeTree();
				outputFileDebug.println(myAst);
				outputFileDebug.println("\n");
				myAst.setScanErrors(myScannerErrors);
			}
			if(x>2){
				//SEMANTIC
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Semantic");
				outputFileDebug.println("------------------------------");
				mySemantic = new Semantic(myAst);
				mySemantic.fillTables();

				outputFileDebug.println(mySemantic);
				outputFileDebug.println("\n");
			}
			if(x>3){
				//IRT
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Irt");
				outputFileDebug.println("------------------------------");

				myScanner = new Scanner(filename);
				myParser = new CC4Parser(myScanner);
				myAst2 = new Ast(myParser);
				myAst2.makeTree();

				myIrt = new Irt(mySemantic);
				myIrt.setTree(myAst2);

				outputFileDebug.println(myIrt);
				outputFileDebug.println("\n");
			}
			if(x<5)
				outputFile.println(outputFileDebug);
			if(x>4){
				//CODEGEN
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Codegen");
				outputFileDebug.println("------------------------------");
				outputFileDebug.println(myIrt);
				if(myIrt.getValid()){
					outputFile.println(myIrt);
					System.out.println("Compile File: Success\n");
				} else {
					System.out.println("Compile File: Fail\n");
					outputFile.println(outputFileDebug);
				}
			}
		} else{
			try {
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Scanner");
				outputFileDebug.println("------------------------------");
				
				myScanner.scanIt();
				targetout = myScanner.getList();
				for (int i=0; i<targetout.size(); i++) {
					outputFileDebug.println(targetout.get(i));
				}
				outputFileDebug.println("\n");
				myScannerErrors = myScanner.getErrores();

				//PARSER
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Parser");
				outputFileDebug.println("------------------------------");
				myScanner = new Scanner(filename);
				myParser = new CC4Parser(myScanner);
				myParser.parserIt();
				targetout = myParser.getErrors();
				String msg = (targetout.size()==1)?"  Invalido, se ha detecdado "+targetout.size()+" error.": "";
				msg = (targetout.size()>1)?"  Invalido, se han detecdado "+targetout.size()+" errores.": msg;
				if (targetout.size()!=0){
					outputFileDebug.println(msg);
					outputFileDebug.println(myParser);
				} else {
					outputFileDebug.println("  Valido, no se han detecdado errores.");
					outputFileDebug.println(myParser.toStringX());
				}
				outputFileDebug.println("\n");
				
				//AST
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Ast");
				outputFileDebug.println("------------------------------");
				myScanner = new Scanner(filename);
				myParser = new CC4Parser(myScanner);
				myAst = new Ast(myParser);
				myAst.makeTree();
				outputFileDebug.println(myAst);
				outputFileDebug.println("\n");

				myAst.setScanErrors(myScannerErrors);
				//SEMANTIC
				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Semantic");
				outputFileDebug.println("------------------------------");
				mySemantic = new Semantic(myAst);
				mySemantic.fillTables();

				outputFileDebug.println(mySemantic);
				outputFileDebug.println("\n");


				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Irt");
				outputFileDebug.println("------------------------------");

				myScanner = new Scanner(filename);
				myParser = new CC4Parser(myScanner);
				myAst2 = new Ast(myParser);
				myAst2.makeTree();

				myIrt = new Irt(mySemantic);
				myIrt.setTree(myAst2);

				outputFileDebug.println(myIrt);
				outputFileDebug.println("\n");

				outputFileDebug.println("------------------------------");
				outputFileDebug.println("stage: Codegen");
				outputFileDebug.println("------------------------------");
				outputFileDebug.println(myIrt);

				if(myIrt.getValid()){
					outputFile.println(myIrt);
					System.out.println("Compile File: Success\n");
				} else {
					System.out.println("Compile File: Fail\n");
					outputFile.println(outputFileDebug);
				}				

				for (int i=0; i<targets.length; i++)
					myOptions.add(targets[i]);
			} catch (Exception e) {
				System.out.println(e);
				compilador.error(1, 459);
			}
		}

		// opt
		if(opt>0){
			x = compilador.position("-opt");
			str = args[x+1];
			if(str.equals("algebraic")){
				outputFileDebug.println("\noptimizing: algebraic simplification");
				Algebraic al = new Algebraic();
			} else {
				outputFileDebug.println("\noptimizing: constant folding");
				ConstantFolding cf = new ConstantFolding();
			}
		}

		// debug
		if(debug>0){
			x = compilador.position("-debug");
			str = args[x+1];
			String[] stages = compilador.separate(str);
			String debugin[] = compilador.insertionSort(stages, targets);
			int setS, setP, setA;
			setS = setP = setA = 0;
			for (int i=0; i<debugin.length; i++){
				if(myOptions.indexOf(debugin[i])>=0){

					if(debugin[i].equals("scan")){
						//SCANNER
						System.out.println("  Debug: Scanner -tokens");
						System.out.println("  ----------------------------");
						myScanner = new Scanner(filename);
						myScanner.set(true);
						myScanner.scanIt();
						System.out.println(myScanner);
						System.out.print("\n");
					}
					else if(debugin[i].equals("parser")){
						//PARSER
						System.out.println("  Debug: Parser");
						System.out.println("  ----------------------------");
						myScanner = new Scanner(filename);
						myParser = new CC4Parser(myScanner);
						myParser.parserIt();
						targetout = myParser.getErrors();
						String msg = (targetout.size()==1)?"  Invalido, se ha detecdado "+targetout.size()+" error.": "";
						msg = (targetout.size()>1)?"  Invalido, se han detecdado "+targetout.size()+" errores.": msg;
						if (targetout.size()!=0){
							System.out.println(msg);
							System.out.println(myParser);
						} else {
							System.out.println("  Valido, no se han detecdado errores.");
							System.out.print(myParser.toStringX());
						}
						System.out.print("\n");
					}
					else if(debugin[i].equals("ast")){
						//AST
						System.out.println("  Debug: AST");
						System.out.println("  ----------------------------");
						System.out.println("  "+myAst);
					}
					else if(debugin[i].equals("semantic")){
						//SEMANTIC
						System.out.println("  Debug: Semantic");
						System.out.println("  ----------------------------");
						System.out.println(mySemantic);
					}
					else if(debugin[i].equals("irt")){
						//IRT
						System.out.println("  Debug: Irt");
						System.out.println("  ----------------------------");
						System.out.println(myIrt);
						if(!myIrt.getValid()){
							System.out.print("\n  ver errores? (y/n): ");
							Read sc = new Read();
							String respuesta = sc.nextLine();
							if(respuesta.equals("y")){
								System.out.println(mySemantic.errors());
							}


						}
					}
					else if(debugin[i].equals("codegen")){
						//CODEGEN
						System.out.println("  Debug: Codegen");
						System.out.println("  ----------------------------");
						if(myIrt.getValid())
							System.out.println("  El Programa es valido.");
						else
							System.out.println("  No se pudo hacer el codegen ya que el programa no es valido.");
					}

				}
			}
			
		}



		outputFile.close();
		System.out.println("------------------------------");
	}
}

















