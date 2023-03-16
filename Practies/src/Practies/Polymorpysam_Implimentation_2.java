package Practies;

public class Polymorpysam_Implimentation_2{
	
	public void m1(Polymorpysam p ) {
		System.out.println("parent class varabule method");
	}
	public void m1(Polymorpysam_Implimentation pi ) {
		System.out.println("chiled class varabule method");
	}
	
	    public static void main(String[] args) {
		
	
		Polymorpysam_Implimentation_2 pom2= new Polymorpysam_Implimentation_2();
		
		
		
		Polymorpysam po= new Polymorpysam();
		po.name("parent name method");
		
		pom2.m1(po);//prent reference take because parent class object passed
	
		Polymorpysam_Implimentation po1 = new Polymorpysam_Implimentation();
		po1.name(12);//chiled class
		
		
		pom2.m1(po1); // chiled reference take because chiled class object passed
		
		Polymorpysam pom= new Polymorpysam_Implimentation(); 
		
		pom.name("this also parent method ");  //hear we create object with chiled class but over load method always see parent reference
		pom.sankar();  // this is chiled class because override method alwas see the chiled class 
	
		
		pom2.m1(pom);  // parent class reference will take for over load method
		
	}

}
