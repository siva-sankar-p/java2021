package Practies;

public class Java12_10_2022 {

	public static void main(String[] args) {
		
	//Escape character	
		String h ="i have three years of \"experience\" in it";
		String j ="i have three years of \'experience\' in it";
		String k ="i have three years of \\experience\\ in it";

		System.out.println(h);
		System.out.println(j);
		System.out.println(k);
		
	//speshal charecters		
		String l ="i have three years of \nexperience in it";
		String z ="i have three years of\texperience in it";
		String x ="i have three years of\bexperience in it";
		String c ="i have three years of \fexperience in it";

		System.out.println(l);
		System.out.println(z);

		System.out.println(x);
		System.out.println(c);
		
		
	//Java Math
		
	int a=10,b=20,d=30;
	   
	  //math.max()
	
	int large = Math.max(d, b);
	 System.out.println(large);
	 
	   //math.min()
	 
	 int minim = Math.min(a, d);
		System.out.println(minim);
		
		//math.sqrt
	
	int sqrt = (int) Math.sqrt(62);
	    System.out.println(sqrt);

		//math.abs
	    
	 double r = -12.67;
	 System.out.println(Math.abs(r));
	 
	    //math.random
	 
	 System.out.println(Math.random());
	 System.out.println(Math.random()*200);
	 
	 
	   //terinary operator
	 
	 int time = 20;
	    String result;
	    result = time < 18 ? "Good day" : "Good evening";
	    System.out.println(result);
	 
	}

}
