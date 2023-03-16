package LogicalPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word : ");
		String res = sc.next();
		String org_word= res;
		
		int l=res.length();
		String rev="";
		for(int i=l-1;i>=0;i--) 
		{
			rev=rev+ res.charAt(i);
		}
		/*
		StringBuffer sb = new StringBuffer(res);
		StringBuffer rev= sb.reverse();
		*/
		
		
		if(org_word.equals(rev))
		{
			System.out.println(org_word +"  is palindrome word ");
		}
		else
		{
			System.out.println(org_word +"  is not palindrome word ");
		}

	}

}
