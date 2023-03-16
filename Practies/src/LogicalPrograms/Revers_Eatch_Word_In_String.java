package LogicalPrograms;

import java.util.Arrays;

public class Revers_Eatch_Word_In_String {
	
	public static void main (String [] args) {
		
		String data = "welcome to java daveloper";
		
		//logic-1

		/*
		String [] words=data.split(" ");
		String Reverse_String="";
		
		
		for(String a:words)
		{
			String revares_word = "";
			
			for(int i=a.length()-1;i>=0;i--)
			{
				revares_word= revares_word+a.charAt(i);
				
			}
			Reverse_String= Reverse_String+ revares_word+" ";
			
			
		}
		System.out.println(Reverse_String);
		
		*/
		
		//logic-2 by using Arrey.reverse method
		
		String [] words=data.split("\\s");
		String Reverse_String="";
		
		for(String a:words)
		{
			StringBuilder sb= new StringBuilder(a);
			sb.reverse();
			Reverse_String = Reverse_String+sb.toString()+" ";
		}
			System.out.println(Reverse_String);
	}

}
