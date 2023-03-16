 package Practies;

public class StringMethods {
	public static String data= "electrical";
	
	public  void siva ()
	{
	//String data= "i have experience in electrical designing";
		 char c =data.charAt(4);
		System.out.println(c);
	}
	public static void main (String arg[]) {
		 
			
		System.out.println(data.codePointCount(0, data.length()));
		System.out.println(data.length());

		StringMethods s = new StringMethods();
		s.siva();
	String f = "klectrical " ;
	
	data.contains(f);
   int res=f.compareTo(data);
   System.out.println(res);
	
	String h ="i have three years of \"experience\" in it";
	String j ="i have three years of \'experience\' in it";
	String k ="i have three years of \\experience\\ in it";
	
	System.out.println(h);
	System.out.println(j);
	System.out.println(k);
	
			}

}
