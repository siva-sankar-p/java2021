package Practies;

 public class OuterClass {

	String a="ok";
	public void siva () {
		System.out.println("outer class siva method ");
	}
	
  public class InnerClass {
	
		String b ="dobule";	
	public void sankar(){
			
			System.out.println("inner class siva method ");
		}
	}
  public static void main(String[] args) {
		
	  OuterClass oc= new OuterClass();
	  oc.siva();
	  oc.a="11";

	  OuterClass.InnerClass ic= oc.new InnerClass();  // object creation for inner class 

	  ic.sankar();
	  ic.b="ok";
	  
	  
	//  OuterClass.InnerClass inobj= new OuterClass.InnerClass();   // if the inner class is static no need to create the outer class object directley create the object for inner class by this way 
	  

	  
	}
 }
