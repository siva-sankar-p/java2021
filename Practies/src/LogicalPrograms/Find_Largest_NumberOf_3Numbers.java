package LogicalPrograms;

public class Find_Largest_NumberOf_3Numbers {

	public static void main(String[] args) {
		
	  int a,b,c;
	  a=10;
	  b=20;
	  c=30;
// logi -1
	  if( a>b && a>c)
	  {
		  System.out.println("a is larger num");
	  }
	  else if (b>a && b>c)
	  {
		  System.out.println("b is larger num");
	  }else
	  {
		  System.out.println("c is larger num");
	  }
		
//logic-2 by using ternary operator
	
	  int larg1 = a>b?a:b;
	  int larg2 = larg1>c?larg1:c;
	  System.out.println(larg2);
   //logc-3 in single ternary
	  
	  int larg= a>(b>c?b:c)?a:(b>c?b:c);
	  System.out.println(larg);
	}

}
