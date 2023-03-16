package Inheritance_Examples;

public class Test_Class_AA_and_BB {

	
//	// senario-1
//	public static void main(String[] args) {
//		
//	AA a= new BB();   
//	
//	System.out.println(" Value of x = "+a.x);
//	System.out.println(" Value of y = "+a.y);   // hear parent y varible value comes not comes chiled y variable
////	System.out.println(" Value of x = "+a.z);  // Error comes because z varibule not in parent class 
//
//	
//	a.msg1();
//	a.msg2();    // heare chiled class msg2 method will execute because parent class msg2 overrided by chiled class msg2 method 
////a.msg3();   // error comes because msg3 methoed not in parent class
//	}

	
	// senario-2
	
//	public static void main(String[] args) {
//		
//		AA a= new AA();
//		BB b = new BB();
//		a=b;
//		System.out.println(" Value of x = "+a.x);
//		System.out.println(" Value of y = "+a.y);   // hear parent y varible value comes not comes chiled y variable
////		System.out.println(" Value of x = "+a.z);  // Error comes because z varibule not in parent class 
//	
//		
//		a.msg1();
//		a.msg2();    // heare chiled class msg2 method will execute because parent class msg2 overrided by chiled class msg2 method 
////		a.msg3();   // error comes because msg3 methoed not in parent class
//		
//	}
	
	
	//Senario-3
	
	public static void main(String[] args) {
		
		  AA a = new BB(); 
		  BB b = new BB(); 
		  b = (BB)a; // It looks like superclass assigned to subclass but it translates internally to // BB b=new BB(); // It is equivalent to 2nd scenario.
		   System.out.println("Value of x: " +a.x); 
		   System.out.println("Value of y: " +a.y); 
		// System.out.println("Value of z: " +a.z); // Error because z does not exist in class AA. 

		    a.msg1(); 
		    a.msg2(); 
		 // a.msg3(); // Compilation error. 
	}
}
