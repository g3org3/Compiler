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
		int x=0;
		for (int i=0; i<this.size; i++) {
			if(args[i].equals(str)) x=i;
		}
		return x;
	}

	public static void main(String[] args) {
		// Define variables
		int x=0;
		String[] options = {"-o", "-target", "-opt", "-debug", "-h"};

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
		compilador.verificar();


		// all ok!

		// o
		if(o>0){
			x = compilador.position("-o");
		}


	}
}

















