package Inheritance_Examples;

import java.security.PublicKey;

public class Multipul_Inhetitance_Class implements Multipul_Inheritance,Second_Interface{

	public void siva() {
		
		System.out.println("siva abstact method was implimented by inherit ");
	}
	public void sankar() {
		System.out.println("sankar abstact method was implimented by inherit ");
	}
	

	public static void main(String[] args) {
	
		

		Multipul_Inhetitance_Class minc= new Multipul_Inhetitance_Class();
		minc.siva();
		minc.sankar();
	
	}

}
