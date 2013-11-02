package compiler.opt;
import compiler.irt.Irt;
import java.util.ArrayList;

public class ConstantFolding {
	//campos
	public ArrayList<String> code;
	// contructor
	public ConstantFolding(){
		code = new ArrayList<String>();
	}
	public ConstantFolding(Irt irt){
		code = irt.getCode();
		checkAdd();
		checkAsign();
	}
	public void checkAsign(){
		ArrayList newCode = new ArrayList<String>();
		String aux1 = ""; String aux2 = "";
		boolean inRange, entro;
		int sum = 0; int n = 0;

		for (int i=0; i<code.size(); i++) {
			entro = false;
			aux1 = code.get(i);
			inRange = (i+1)<code.size();
			if(inRange) {
				if(aux1.indexOf("lw")!=-1){
					if(code.get(i+1).indexOf("sw")!=-1){
						aux1 = aux1.substring(7, aux1.indexOf("("));
						aux2 = code.get(i+1);
						aux2 = aux2.substring(7, aux2.indexOf("("));
						if(aux1.equals(aux2)) {
							entro = true;
							i++;
							//newCode.add("#opt elimination");
						}
					}
				} /*else if(aux1.indexOf("sw")!=-1){
					if(code.get(i+1).indexOf("lw")!=-1){
						aux1 = aux1.substring(7, aux1.indexOf("("));
						aux2 = code.get(i+1);
						aux2 = aux2.substring(7, aux2.indexOf("("));
						if(aux1.equals(aux2)&&code.get(i).indexOf("sw $v0")!=-1) {
							entro = true;
							i++;
							newCode.add(code.get(i)+" #opt elimination");
						}
					}
				}*/
			}

			if(!entro)
				newCode.add(aux1);
		}
		code = newCode;
	}
	public void checkAdd(){
		ArrayList newCode = new ArrayList<String>();
		String aux1 = ""; String aux2 = "";
		boolean inRange, entro;
		int sum = 0; int n = 0;

		for (int i=0; i<code.size(); i++) {
			entro = false;
			aux1 = code.get(i);
			inRange = (i+8)<code.size();
			if(inRange) {
				if(code.get(i).indexOf("li $v0")!=-1) {
					if(code.get(i+4).indexOf("li $v0")!=-1) {
						if(code.get(i+8).indexOf("add $v0 $a0 $a1")!=-1 || code.get(i+8).indexOf("sub $v0 $a0 $a1")!=-1) {

							aux1 = aux1.substring(aux1.indexOf("0")+2, aux1.length());
							aux2 = code.get(i+4);
							aux2 = aux2.substring(aux2.indexOf("0")+2, aux2.length());
							try{
								n = Integer.parseInt(aux1);
								sum = Integer.parseInt(aux2);
								aux1 = code.get(i+8);
								aux1 = aux1.substring(0,3);
								if(aux1.equals("add"))
									sum = sum + n;
								else
									sum = n - sum;
								newCode.add("li $v0 "+sum+" #opt");
							}catch (Exception e) {}
							i += 8;
							entro = true;
						}
					}
				}
			}
			if(!entro){
				newCode.add(aux1);
			}
		}
		code = newCode;
	}
	public String toString(){
		String str = "";
		for (int i=0; i<code.size(); i++)
			str = str + code.get(i) + "\n";

		return str;
	}
}