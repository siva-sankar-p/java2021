package LogicalPrograms;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {
		
		 
		int val= 123456;
		int count = 0;
		  while(val>0) 
		  {
			  int rem = val%10;
			  count++;
			  val=val/10;
			  
		  }
             System.out.println(count);
             
             
	}

}
