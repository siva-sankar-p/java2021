package LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	 	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int num = sc.nextInt();   //1234   (nextInt() will capture the user entered value)
		
 		
		 
	//logic-1 using alogaritham	 
	  
	 
	 
//		int res=0;
//		while(num!=0)
//		{
//			res=res*10+num%10;   // 0+1234%10 =4   40+3 =43   430+2 =432   4320+1 =4321 
//			num=num/10;          // 1234/10 =123   123/10=12   12/10=1     1/10=0
//			
//			
//		}
//		System.out.println(res);
		
		
	//	logic-2 using StringBuffer class
		
	/*	StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer res=sb.reverse();
		System.out.println(res);
		
		*/
		
     //	logic-3 using StrinBilder
		
	     StringBuilder sb = new StringBuilder();
	   //  sb.append(num);
//	     StringBuilder	res=sb.reverse();
//	     
//	     System.out.println(res);
	     
	     
	     
	}

}
