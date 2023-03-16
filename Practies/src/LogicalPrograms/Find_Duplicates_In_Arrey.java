package LogicalPrograms;

import java.util.HashSet;

public class Find_Duplicates_In_Arrey {

	public static void main(String[] args) {
		
		
		int num[] = {1,2,3,4,3,6,4,7,8,9,9};
		
		/*
		
		for (int i =0;i<num.length;i++)
		{ 
			for (int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[j]);
				}
			}
		}
		*/
		
		//logic -2 by using hashset this method will return the false if duplicate value comes other wise true
		
		//int nu[] = {1,2,3,4,3,6,};
		
		boolean status=false;
		HashSet <Integer> valu=new HashSet<>();
	
		for(int l:num)
		{
			if(valu.add(l)==false)
			
			{
			System.out.println("duplicate element found  "+l);
			status=true;
			}
		} if(status==false)
		{
			
			System.out.println("duPlicate value not found");
		}
	}

}
