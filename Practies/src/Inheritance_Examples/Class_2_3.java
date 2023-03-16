package Inheritance_Examples;

public class Class_2_3 {
	public static void main(String[] args) {
		
		Class_2_1 c21 = new Class_2_1();
		c21.siva();
		System.out.println(" class c21 reference " +c21.a);
		
		Class_2_2 c22 = new Class_2_2();
		c22.sankar();
		System.out.println(" class c22 reference " +c22.a);
		
		Class_2_1 cp21 = new Class_2_2();    // hear we can axcess parent class methodes and variables because we have create the object as parent reference 
		cp21.siva();
		System.out.println(" class cp21 reference " +cp21.a);
			
			
			// if i override the methode in class2-1 to 2-2 then the output comes 10 because the polymorpysam comes to picture override methode jvm take object not a reference
	
//			Class_2_1 cp21 = new Class_2_2();    
//			cp21.siva();
//			System.out.println(" class cp21 reference by overrided " +cp21.a);
			
			
	}
}
