package Inheritance_Examples;

public class Hi extends Hello{
	Hi() 
	   { 
	      System.out.println("Hi constructor"); 
	   } 
	void show() { // Override the show() method. 
	     System.out.println("Hi method"); 
	  } 
   public static void main(String[] args) {
	
	Hi h = new Hi();
	h.show();

}
}


