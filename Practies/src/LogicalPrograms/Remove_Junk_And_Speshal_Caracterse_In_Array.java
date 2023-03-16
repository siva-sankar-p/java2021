package LogicalPrograms;

public class Remove_Junk_And_Speshal_Caracterse_In_Array {

	public static void main(String[] args) {
		//  by using replaseAll method 
		
		String data  = "siva !@##$%^&**()%$ sankar PINDI 48";
		
		String s=data.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		String a  = "siva !@##$%^&**()%$ sankar PINDI 48";
	
	a=   a.replaceAll("[^a-z]", "");
	System.out.println(a);
	} 

}
