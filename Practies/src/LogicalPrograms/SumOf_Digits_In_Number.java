package LogicalPrograms;

public class SumOf_Digits_In_Number {

	public static void main(String[] args) {
		
		
		int num = 123456;
		
		int sum =0;
		while(num>0)
		{
			int rem = num%10;
			sum =sum+rem;
			num=num/10;
		}
        System.out.println("Total sum of number is = "+sum);
	}

}
