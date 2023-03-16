package LogicalPrograms;

public class Find_Max_And_MinValue_In_Array {

	public static void main(String[] args) {
		
		int num[] = {10,80,5,50,60,90};
		
		int max= num[0];
		for (int i=0;i<num.length;i++)
		{
			
			if(max<num[i])
			{
				max=num[i];
			}
		}
		System.out.println(max+"  is maximum number in array");
		int min=num[0];
		for (int i=0;i<num.length;i++)
		{
			
			if(min>num[i])
			{
				min=num[i]; 
			}
		}
		System.out.println(min +"  is minimum number in array");
	}

}
