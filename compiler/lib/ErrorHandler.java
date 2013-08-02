package compiler.lib;

public class ErrorHandler extends Exception {

	// contructor
	public ErrorHandler(){
		
	}

	public ErrorHandler(String message){
		super(message);
	}

}