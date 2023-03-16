package LogicalPrograms;

import java.util.Scanner;

public class PattrenPrograms {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    int num=sc.nextInt();
	    
	    
	    //for inverse triangle
	    
//	     *
//	    **
//	   ***
//	  ****
//	 *****

//	    for(int i=1;i<=num;i++) {
//	    	// for spaces 
//	    	for(int j=num-i;j>=1;j--){
//	    		System.out.print(" ");
//	    	
//	    	}	
//	    	
//	    	for(int j=1;j<=i;j++) {
//	    		System.out.print("*");
//	    	}
//	    	System.out.println();
//	    }
	    
	    
	  //for piramid
	    
	    
//	     * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * * 

//	    for(int i=1;i<=num;i++) {
//	    	// for spaces 
//	    	for(int j=(num-i);j>=1;j--){
//	    		System.out.print(" ");
//	    	
//	    	}	
//	    	
//	    	for(int j=1;j<=i;j++) {
//	    		System.out.print("* ");
//	    	}
//	    	System.out.println();
//	    }
	   
	    
	    
	    //for triangle
	    
	    
//	    *
//	    **
//	    ***
//	    ****
//	    *****
//	    ****
//	    ***
//	    **
//	    *

	    
//	    for(int i=1;i<=num;i++) {
//	    	
//	    for(int j=1;j<=i;j++) {
//	    	System.out.print("*");
//	    }
//	    System.out.println();
//	    }
//	    
//	    
//	    for(int i=num-1;i>=0;i--) {
//	    	
//		    for(int j=1;j<=i;j++) {
//		    	System.out.print("*");
//		    }
//		    System.out.println();
//		    }
	    
	    
	    
	    
	    //fot triangle
	    
//	    *****
//	     ****
//	      ***
//	       **
//	        *

	    
//	    for(int i=num-1;i>=0;i--) {
//	    	for(int j=num-1;j>=i;j--) {
//	    		System.out.print(" ");
//	    	}
//	    	for(int k=0;k<=i;k++) {
//	    		System.out.print("*");
//	    	}
//	    	System.out.println();
//	    }
	    
	    
	    
	    
	    
	    
	    
//	     *
//	    **
//	   ***
//	  ****
//	 *****
//	******
//	 *****
//	  ****
//	   ***
//	    **
//	     *

	    

//	    for(int i=0;i<=num-1;i++) {
//	    	for(int j=num-1;j>=i;j--) {
//	    		System.out.print(" ");
//	    	}
//	    	for(int k=0;k<=i;k++) {
//	    		System.out.print("*");
//	    	}
//	    	System.out.println();
//	    }
//	    
//	    for(int i=num;i>=0;i--) {
//	    	for(int j=num-1;j>=i;j--) {
//	    		System.out.print(" ");
//	    	}
//	    	for(int k=0;k<=i;k++) {
//	    		System.out.print("*");
//	    	}
//	    	System.out.println();
//	    }
	  
	    
//	    *****
//	    ****
//	    ***
//	    **
//	    *
	    
//	    for(int i=num;i>=1;i--) {
//	    	for(int j=1;j<=i;j++) {
//	    		System.out.print("*");
//	    	}System.out.println();
//	    }
	    
	    
//	       * 
//	      * * 
//	     * * * 
//	    * * * * 
//	   * * * * * 

	    
//	    for(int i=0;i<=num-1;i++) {
//	    	
//	    	for(int j=num;j>=i;j--) {
//	    		System.out.print(" ");
//	    	}
//	    	for(int k=0;k<=i;k++) {
//	    		System.out.print("* ");
//	    	}System.out.println();
//	    }
	    
	    
	    
	    
	    
//	    * * * * * 
//	     * * * * 
//	      * * * 
//	       * * 
//	        * 
	    
	    for (int i=0;i<=num;i++) {
	    	for(int j=0;j<=i;j++) {
	    		System.out.print(" ");
	    	}for(int k=0;k<= num-1-i;k++) {
	    		System.out.print("*"+" ");
	    	}System.out.println();
	    }

	    
	    
	    
	    
	    
	    
	    
	    
	    }

}
