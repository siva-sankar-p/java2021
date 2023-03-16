package LogicalPrograms;

public class Find_Missing_Number_In_Array {

	public static void main(String[] args) {
		
		// {1,2,4,5,6} sum1= 1+2+4+5+6=18
		//range of element from1 to 6 sum2= 1+2+3+4+5+6=20
        //sum2-sum1=18-20=3 so 3 is missing number so same logic we need to appley
           
		int num[]= {1,2,3,5,6};
		int sum1=0;
		for(int i=0;i<num.length;i++)
		{
			sum1=sum1+num[i];
		}
	   System.out.println(sum1);
	   int sum2=0;
	   for(int i=1;i<=6;i++)
	   {
		   sum2=sum2+i;
	   }
	   
	   System.out.println(sum2);
	   System.out.println("missing number is; "+(sum2-sum1));
	}

}
