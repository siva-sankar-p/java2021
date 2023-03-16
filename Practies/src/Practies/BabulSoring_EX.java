package Practies;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BabulSoring_EX {

	
		 
		public void bubbleSorting(int[] arr) {
			
			for (int i=0;i<arr.length-1;i++) {
				
				for(int j=0;j<arr.length-1;j++) {
					
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			
		}
		
		public static void main(String[] args) {
			BabulSoring_EX bu= new BabulSoring_EX();
			int[]values= {1,2,3,10,15,4,7,9};
			bu.bubbleSorting(values);
			System.out.println(Arrays.toString(values));
		}
}
