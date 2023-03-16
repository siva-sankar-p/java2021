package LogicalPrograms;

public class Print_Even_And_Odd_In_Arrey {

	public static void main(String[] args) {
		
		int  value[]= {1,16,3,4,12,6,7,8,13,10,11,17};
		
		//logic-1 usinfg for loop
		
		System.out.println("these are even num");
		for(int i=0;i<value.length;i++)
		{
			if(value[i]%2==0)
			{
				System.out.println(value[i]);
				
			}
			}
			System.out.println("these are odd num");
			for(int j=0;j<=value.length-1;j++)
			{
				if(value[j]%2!=0)
				{
					System.out.println(value[j]);
					
				}
				}
		

			//logic-2 usinfg enhanced for loop
			System.out.println("these are even num");
			for(int a:value)
			{
				if(a%2==0)
					System.out.println(a);
			}
			
			System.out.println("these are odd num");
			for(int a:value)
			{
				if(a%2!=0)
					System.out.println(a);
			}
	}

}
