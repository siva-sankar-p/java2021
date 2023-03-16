package LogicalPrograms;

import java.nio.IntBuffer;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();
		int org_num = num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10; 
			num=num/10;
			
		}
		System.out.println(rev);
		if(org_num==rev)
		{
			System.out.println(org_num+"  is palindrome number");
		}
		else
		{
			System.out.println(org_num+"  is not palindrome number");
		}
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(res));
		 StringBuffer re =sb.reverse();
		 System.out.println(re);
         */
	}

}
  