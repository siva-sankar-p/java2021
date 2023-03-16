package Practies;

import javax.xml.crypto.Data;

public class Practiesclass {
	
		private static int v;

		public static void main (String[] args) {
		 	
	 		
			String s="siva";
			int marks = 48;
			boolean status = true;
			
			System.out.println(s+"   "+ "marks= "+marks+"   status= "+ status);

			//result = siva   marks= 48   status= true
			
				System.out.println(100%3);
				System.out.println(100/3);
				
				int num = 1234567890;
				
				System.out.println(num);
				//result = 1234567890
				long lnum = 1234567890;
				System.out.println(lnum);
				//result = 1234567890
				
			double d = 32.564;
			int result=(int)Math.round(d);
			System.out.println(result);
			
			//result = 33
			
			double m= 32.564;
			int o =(int) m;
			System.out.println(o);
			
		//result = 32
			
			int i = 20;
			long l = i;
			System.out.println(l);
			
			//result = 20
			long l2= 123;
			int i2=(int)l2;
			System.out.println(i2);
			
			//result = 123
			
			byte a = 125;
			short q = a;
			System.out.println(q);
			
			//result = 125
			
			
			short w = 122;
			byte e = (byte)w;
			
			//result = 122
			System.out.println(e);
			
			
			long x = 9199999899999999999L;
			System.out.println(x);
			
			int g = 6;
			 g -= 3;
			 System.out.println(g);
			
			int z = 6;
		    z<<= 3;
		    System.out.println(z);  
		    
		    int f= 8;
		    
		    System.out.println((f>10|| f<6));
		    
		    String n = "siva sankar pindi from merakapalem";
		    System.out.println(n.length());
		    System.out.println(n.indexOf("pindi"));
		    System.out.println(n.toUpperCase());
		    		
		    
		  }
	} 
    
