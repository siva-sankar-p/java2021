package LogicalPrograms;

import java.util.Arrays;

public class Find_Elementin_In_Array_In_Binary_Format {

	public static void main(String[] args) {

   // for searching element in binary format means 1) form arraye first find mid index value 
		// 2) if our finding value is leethen mid value seache from mid value to left other wise right
		//midvalue = starting index value + final index value /2 
		int num []= {10,20,30,40,50,60,70,80,90,100,120,130,140};
		int element= 80;
		float mid_index = (num.length)/2;
		int mid =  (int) mid_index;
		
		 System.out.println(mid_index);
		 System.out.println(num[ (mid)]);
		 
		 if(element<=num[mid])
		 {
			 for (int i=mid;i>=0;i--)
			 {
				 if(num[i]==element)
				 {
					 System.out.println("element index is  "+i+" "+num[i]);
				 }
			 }
		 }else 
		 {
			 for (int i=mid;i<num.length;i++)
			 {
				 if(num[i]==element)
				 {
					 System.out.println("element index is  "+i+" "+num[i]);
				 }
			 }
		 }
		 
		 
		 
     // logic -2 by using arrays.Bynary search
		 
	int index	= Arrays.binarySearch(num, element);
		 
		 System.out.println("ibdex of element is  "+index);
		 
	}

}
