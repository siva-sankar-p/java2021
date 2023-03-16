package LogicalPrograms;

public class Swaping {

	public static void main(String[] args) {
		 int a =15;
		 int b = 20;
	 //logic-1 by taking thired variable
	 	 
/*	int  t = a;
		 a=b; 
		 b=t;
		 System.out.println("a=  "+ a +"  b=  "+b); 
		 */
		//logic-2 by using + & -
		 
	/*	 a= a+b;  //15+20 =35
		 b=a-b;   //35-20 =15
		 a=a-b;   //35-15=20
		 
		System.out.println("a=  "+ a +"  b=  "+b); 
          */
		//logic-3 by using * & /
		
	/*	a= a*b;  //15*20 = 300
		 b=a/b;   //300-20 =15
		 a=a/b;   //300-15=20
		
		 System.out.println("a=  "+ a +"  b=  "+b);  
		 */
		 
		//logic-4 in single line
		 
		 b= a+b -(a=b);  //in java execution always start from right to left 
		                 // 15+20 - (20)
		 System.out.println("a=  "+ a +"  b=  "+b);  
	       }  

}
