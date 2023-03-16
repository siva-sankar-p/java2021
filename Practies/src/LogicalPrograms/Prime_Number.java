package LogicalPrograms;

public class Prime_Number {

	public static void main(String[] args) {
		
		
		// 1) number is >1  
        // 2) number should divisibule by only itself and 1 is called prime numbers 
		
	// 1,3,5,7,11,13,17,19,23... prime numbers
	// 2,4,6,8,9,10,1,2,14,15,16,18,20 ... not a prime numbers
		
		
		int num= 6;
		int count=0;
		
		if(num>1)
			
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				
					count++;
			}
				if(count==2)
				{
					System.out.println(num+"  is prime number");
				}
				else 
				{
					System.out.println("  is not a prime number");
				}
			}else 
				
				System.out.println(num+"  is not  prime number");
		
		
			
		
	}

}
