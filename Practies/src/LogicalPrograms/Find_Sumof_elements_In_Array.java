package LogicalPrograms;

public class Find_Sumof_elements_In_Array {

	public static void main(String[] args) {
		
		
		int value[]= {10,20,30,2,4,5};
		int sum=0;
		
		//logic-1 using for loop
		
		/*
		for(int i=0;i<=value.length-1;i++)
		{
		sum=sum+value[i];
		}
		System.out.println(sum);
		*/
		
		//logic-2 using enhanced for loop
		
		for(int a:value)
		{
			sum=sum+a;
			
		}
		System.out.println(sum);
	  }

    }
