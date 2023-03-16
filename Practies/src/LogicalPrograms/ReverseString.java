package LogicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		 
		 
		//logic-1 by using for loop
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word : ");
		String s=sc.next();
		 */
		/*
		String s= "abcde qryty";
		String res = "";
		int l=s.length();
		System.out.println(l);
		for(int i= l-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}

		System.out.println(res);
		
		
		/*
		String q = "siva sankar";
		int l=q.length();
		System.out.println(l);
		*/
		
		//logic-2 by using StringBuffer();
		
		String s= "siva sankar";
		 StringBuffer sb = new StringBuffer(s);
		System.out.println( sb.reverse());
		
		
	}

}
