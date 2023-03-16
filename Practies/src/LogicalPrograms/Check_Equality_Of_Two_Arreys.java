package LogicalPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Check_Equality_Of_Two_Arreys {

	public static void main(String[] args) {
	
		
		//logic -1 bu using arraeys.eqality
		
		
		int name[]= {1,2,30,40,10};
		int name2[]= {1,2,33,40,10};
		/*
		Boolean status=Arrays.equals(name, name2);
		
		if(status==true)
		{
			System.out.println("bothe the arrays are same");
		}
		else
		{
			System.out.println("bothe the arrays are note same");
		}
		
		*/
		
		//logic-2 but conditon is both arrays length is same then only this method applicable
		boolean status=true;
		if(name.length==name2.length)
		{
			for(int i=0;i<name.length;i++)
			{
				
				
					if(name[i]!=name2[i])
					{
						status =false;
					}
				
			}
		}
		else
		{
			System.out.println("bothe the arrays length is difrent");
		}
		if(status==true)
		{
			System.out.println("arreys are eqale");
		}else 
		{
			System.out.println("arreys are not eqale");
		}
	}

}
