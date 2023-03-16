package LogicalPrograms;

import java.util.Arrays;

public class Check_Two_Strings_in_Anagram {

	public static void main(String[] args) {
		
		String s1= "Mother In Law";
		String s2= "Hitler Woman";
	String	so1=s1.replaceAll(" ","");
	String	so2=s2.replaceAll(" ","");
	System.out.println(so1);
	System.out.println(so2);
	char[]c1=so1.toLowerCase().toCharArray();
	char[]c2=so2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
		System.out.println("its anagram");
		}else {
			System.out.println("its not a anagram");
		}
		

	}

}
