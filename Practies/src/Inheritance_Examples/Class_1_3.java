package Inheritance_Examples;

public class Class_1_3 {
	public static void main(String[] args) {
		
		Class_1_2 c12= new Class_1_2();
		System.out.println(c12.a);
		
		Class_1_1 c11 = new Class_1_1();
		System.out.println(c11.a);
		
		Class_1_1 cp12 =new Class_1_2();
		
		System.out.println(cp12.a);   // hear comes parent class variabule value because it referce the reference variabule 
		
		
	}

}
