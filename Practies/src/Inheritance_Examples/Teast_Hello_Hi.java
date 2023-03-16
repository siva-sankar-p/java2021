package Inheritance_Examples;

public class Teast_Hello_Hi extends Hi {

	public static void main(String[] args) {

	     Hi obj = new Hi();
	      obj.show(); // show() method of Hi class is called. 

	// Superclass reference is equal to child class object. 
	     Hello obj1 = new Hi(); 
	      obj1.show();// TODO Auto-generated method stub

	     Hello obj2 = new Hello();
	}

}
