package Practies;

public class OuterClass1 {

	
	int a= 10;
	 public void siva() {
		 System.out.println("outer class");
	 }
	 
	 public static class InnerClass {
		 int b= 20;
		 
		 public void sankar() {
			 System.out.println(" inner class");
		 }
		 
	 }
	 public static void main(String[] args) {
		
		 
		 OuterClass1 ou1= new OuterClass1();
		 
		System.out.println(ou1.a); 
		ou1.siva();
		
		OuterClass1.InnerClass inc= new InnerClass();
		
		 
	}
}
