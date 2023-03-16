package LogicalPrograms;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_Elements_In_Array_using_Builtin_Method {

	public static void main(String[] args) {
		
		
		
		// logic-1 using Arrays.parellelsort();
		
		int num[] = {10,3,2,8,40,50};
		System.out.println("before sorting  "+Arrays.toString(num));
		Arrays.parallelSort(num);
		System.out.println("after sorting  "+Arrays.toString(num));
   
		//logic-2 using onley sort();
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		//logic-3 and writen in desending order by using collections.reversorder
		
		Integer a[] = {10,3,2,12,8,40,50};
		Arrays.sort(a,Collections.reverseOrder());  //this collections.reverseorder method doesnot sapport the primitive data type 
		                                           // so we convert into non primitive data type
	    System.out.println(Arrays.toString(a));                                             
	}                                            
	 

}
