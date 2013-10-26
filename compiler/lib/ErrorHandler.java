package compiler.lib;

public class ErrorHandler extends Exception {

	// contructor
	public ErrorHandler(){
		
	}

	public ErrorHandler(String message){
		super(message);
	}

	public void displayError(int type){
		switch (type) {
			case -1:
				displayError();
				break;
			case 0:
				System.out.println("No ha escrito ningun argumento ha ejecutar.");
				break;
			case 1:
				System.out.println("No se ha encontrado opcion valida.");
				break;
			case 2:
				System.out.println("Faltan argumentos.");
				break;
			case 3:
				System.out.println("No se ha encontrado el archivo a compilar.");
				break;
			case 4:
				System.out.println("El archivo de salida debe tener extension \'.s\'.");
				break;
			case 6:
				System.out.println("La opcion del target es incorrecta.");
				break;
			case 5:
				System.out.println("Ejecutado incorrectamente!");
				break;
			case 7:
				System.out.println("La opcion de opt es incorrecta.");
				break;
			case 8:
				System.out.println("La opcion de debug es incorrecta.");
		}
		if(type!=-1){
			System.out.println("Para desplegar la ayuda ejecute:");
			System.out.println("\tjava Compiler -h");
			System.out.println("-------------------------------------------------------------------------------------");
			System.exit(1);
		}
	}
	public void displayError(){
		System.out.println("\n\t\t\t\t::Ayuda::");
		System.out.println("Para poder ejecuar el compilador correctamente necesita ingresar en la linea de");
		System.out.println("comandos 'java Compiler <opcion> <filename>' donde <opcion> puede ser una lista");
		System.out.println("de opciones que se le otorga a usted el usuario para el compilador, las opciones");
		System.out.println("se le especifican con detalle adelante. Y <filename> sera el archivo el cual");
		System.out.println("sera compilado y tiene que ser ingresado correctamente como '(filename).dcf'.");
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t::Opciones::");
		System.out.println("Estas son las opciones que seran aceptadas por el compilador:");
		System.out.println(" ");
	    System.out.println("-o\t<outname>\tEsta opcion es la cual <outname> es el archivo que sera");
		System.out.println("\t\t\tel destino donde el compilador dejara lo generado.");
		System.out.println(" ");
		System.out.println("-target\t<stage>\t\tEsta opcion lo que realiza es que lleva a un punto en ");
		System.out.println("\t\t\tespecifico el compilador de su eleccion donde <stage> ");
		System.out.println("\t\t\tpodria ser (scan, parse, ast, irt, semantic o codegen).");
		System.out.println(" ");
		System.out.println("-opt\t<optimization>\tEsta opcion es la cual optimiza el compilador y ");
		System.out.println("\t\t\t<optimization> puede ser constant o algebraic.");
		System.out.println(" ");
		System.out.println("-debug\t<stage>\t\tEsta opcion es la cual debuguea su programa o archivo ");
		System.out.println("\t\t\tingresado y <stage> hasta donde usted desea que se");
		System.out.println("\t\t\tdebuguee y puede ser ingresado de esta manera ");
		System.out.println("\t\t\t'scan:parse:ast:irt:semantic:codegen:'.");
		System.out.println(" ");
		System.out.println("-h\t\t\tEsta opcion es la cual usted utiliza para que se le ");
		System.out.println("\t\t\totorgue la ayuda.");
		System.out.println("-------------------------------------------------------------------------------------");
		System.exit(1);
	}

}