package LogicalPrograms;

import java.util.Iterator;

public class Find_Duplicates_In_String {

	public static void main(String[] args) {
		
		
		String s= "siva sankar pindi";
		
        String  s1 =s.replaceAll(" ","");
       char[] c = s1.toCharArray();
       System.out.println(c);
      int count=0;
    	   for(int j=0;j<c.length;j++){
    		  
    		   
    	   for(int i=j+1;i<c.length;i++) {
    		   
    		   if(c[j]==c[i])
    		   {
    			  count++ ;
    			   
    			  
    		   }   
    	   }if(count!=0) {
    		   System.out.println(c[j]+ " has duplicat it is comes  "+count+" time");
    		   }	count=0;
    	   }
    	   
    	  
		}
       }    
	


