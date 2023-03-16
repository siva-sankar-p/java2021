package LogicalPrograms;

import java.util.Scanner;

public class Count_The_Words_In_String {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter the words");
		  
		String a = sc.nextLine();
		int count = 1;
		int l= a.length();
		
		for(int i=0;i<l-1;i++)
		{
			if((a.charAt(i)==' ')&&(a.charAt(i+1)!=' '))
           {
				count++;
				
				
	}
		}
		
		System.out.println(count);
	}

}
