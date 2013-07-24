import compiler.scanner.*;
import compiler.parser.*;
import compiler.irt.*;
import compiler.ast.*;
import compiler.semantic.*;
import compiler.codegen.*;
import compiler.opt.*;
import compiler.lib.*;

public class Compiler {
	public String[] args;
	public int size;

	public Compiler(String[] args){
		this.args = args;
		this.size = args.length;
	}


	// METODOS
	public void error(int o, int d){
		System.out.println("----------------------------------------------------");
		//	DEBUG
		System.out.println("*Error on line "+d+".");
		System.out.println("\t\t\t::Ayuda::");
		System.out.println("\t-o\t<outname>\t\t<outname> es el archivo");
		System.out.println("\t-target\t<stage>\t\t\t<stage> es el archivo");
		System.out.println("\t-opt\t<optimization>\t\t<optimization> es el archivo");
		System.out.println("----------------------------------------------------");
		System.exit(1);
	}
	public void noArguments(){
		if (this.args.length==0)
			this.error(1, 35);
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
		if(x+1>=args.length || (x+2)>=args.length)
			this.error(1, 53);
		if(args[x+1].substring(0,1).equals("-"))
			this.error(1,55);

	}

	public static void main(String[] args) {
		// Define variables
		int x=0;
		String str = "";
		String filename = "";
		String[] options = {"-o", "-target", "-opt", "-debug", "-h"};
		String[] targets = {"scan", "parser", "ast", "-debug", "-h"};
		String[] targetsP = {"-o", "-target", "-opt", "-debug", "-h"};

		// Create a compiler
		Compiler compilador = new Compiler(args);

		// checks if there is no arguments
		compilador.noArguments();

		int o = compilador.counter("-o");
		int target = compilador.counter("-target");
		int opt = compilador.counter("-opt");
		int debug = compilador.counter("-debug");
		int h = compilador.counter("-h");

		// if no option recognized
		if(o==0&&target==0&&opt==0&&debug==0)
			compilador.error(1, 55);

		// checks if the options have valid arguments
		for (int i=0; i<options.length; i++) {
			x = compilador.position(options[i]);
			str = args[x+1];
			if(x>=0 && i==0){							//VERIFY -O
				System.out.println(x);
				compilador.verificar("-o");
				if(str.indexOf(".s")<0)
					compilador.error(1,92);
			}
			if(x>=0 && i==1){							//VERIFY -TARGET
				x = -1;
				for (int j=0; j<targets.length; j++)
					if(str.equals(targets[j])) x=1;
				if(x<0) compilador.error(1,98);
			}
		}


		// checks for filename
		if(args.length<3) compilador.error(1, 76);
		else if(args[args.length-3].substring(0,1).equals("-"))
			if(args[args.length-2].substring(0,1).equals("-"))
				compilador.error(1, 79);
			else
				if(args[args.length-1].indexOf(".txt")>0)
					filename = args[args.length-1];
				else
					compilador.error(1,83);

		// all ok!

		// o
		if(o>0){
			x = compilador.position("-o");
		} else {
			x = filename.indexOf(".");
			str = filename.substring(0, x);
			str = str + ".s";
			System.out.println("output: "+str);
		}


	}
}

















