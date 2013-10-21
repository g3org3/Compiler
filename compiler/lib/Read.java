package compiler.lib;

import java.util.Scanner;

public class Read {
	Scanner sc;
	
	public Read(){
		sc = new Scanner(System.in);
	}

	public String nextLine(){
		return sc.nextLine();
	}

}