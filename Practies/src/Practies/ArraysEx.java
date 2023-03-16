package Practies;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		
		
		
		//2dimentional arrays
		
		int [][]a= {{1,4,8,1},{10,15,7},{19,17}};
		
//		//for printing the value by using for loop 
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.println(a[i][j]);
//			}
//		}
		
		//for printing the value by using forEach loop 

//		for(int[] b:a) {
//			for(int num:b) {
//				System.out.println(num);
//			}
//		}
		
		//3dimentional array
		
		
		int[][][]b= {   
				    {{1,2,5,6},{7,8,0,1}},
				    {{157,181,109,660},{123,134,169,200},{188,909,818,500}}
				    };
		
//		for(int i=0;i<b.length;i++) {
//			for(int j=0;j<b[i].length;j++) {
//				for(int k=0;k<b[i][j].length;k++) {
//					System.out.println(b[i][j][k]);
//				}
//			}
//		}
		
		for(int[][]k:b) {
			for(int[]l:k) {
				for(int m:l) {
					System.out.print(m+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
