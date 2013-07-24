import compiler.scanner.*;
import compiler.parser.*;
import compiler.irt.*;
import compiler.ast.*;
import compiler.semantic.*;
import compiler.codegen.*;
import compiler.opt.*;
import compiler.lib.*;

public class Compiler {
	

	public Compiler{

	}


	// METODOS
	public void error(int o, int d){
		System.out.println("----------------------------------------------------");
		System.out.println("\t\t\t::Ayuda::");
		System.out.println("----------------------------------------------------");
	}

	public static void main(String[] args) {
		Compiler compilador = new Compiler(args);

		// checks if there is no arguments
		compilador.noArguments();
	}
}