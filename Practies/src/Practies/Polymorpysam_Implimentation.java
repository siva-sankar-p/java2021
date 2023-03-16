package Practies;

public class Polymorpysam_Implimentation extends Polymorpysam {
	
	
	public void siva() {
		System.out.println("chield class siva method");
	}
	public void sankar() {
		System.out.println("chiled class sankar method");
	}

	public void pindi() {
		System.out.println("chiled class pindi method");
	}
	public void name(int ids) {
		System.out.println("chiled class name method ");
	}
	
	public static void main(String[] args) {
	
	Polymorpysam pom= new Polymorpysam();
	pom.siva();
	
	
	Polymorpysam pom2 = new Polymorpysam_Implimentation();
	pom2.siva();;
	pom2.sankar();
	pom2.name("ok");
//	pom2.name(2);   // compile time error because in method overloading if create the object with parent class reference jvm alys sees parent class 
//	pom2.pindi(); // complie time error because the prent class has dont have same method
	Polymorpysam_Implimentation pom3 = new Polymorpysam_Implimentation();
	pom3.pindi();  // compile time error because
	
	
}
}