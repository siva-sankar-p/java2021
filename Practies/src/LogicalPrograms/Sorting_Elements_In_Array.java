package LogicalPrograms;

import java.util.Arrays;

public class Sorting_Elements_In_Array {

	public static void main(String[] args) {
		
		// logic -1
		// 1) if we sorting the elements we will run the pass as n-1 (means elements-1)
		// 2) then compare the first two elements if first one is larger the second one tnterchange both and continue the process  
           int num []= {1,2,5,4,3,12,49,32,56,78,17,19,80,52,6};
           System.out.println("Before sorting the elements "+ Arrays.toString(num));
         
           int n= num.length;
           for (int i=0;i<n-1;i++)
           {
        	  for(int j=0;j<n-1;j++)
        	  {
        		 if(num[j]<num[j+1])
        		 {
        			 int tem =num[j];
        			 num[j]=num[j+1];
        			 num[j+1]=tem;
        		 }
        	  }
           }
           System.out.println("after sorting the elements "+ Arrays.toString(num));
           
           
	}

}
