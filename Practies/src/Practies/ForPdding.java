package Practies;

public class ForPdding {

	public static void main(String[] args) {

		String a="1234";
		int sr = Integer.valueOf(a);
		
		String s= String.format("%05d",sr);
		System.out.println(s);
//		int c=Integer.valueOf(s);
//		us.setZipCode(c);
//		System.out.println(c);
		
		int b=Integer.valueOf(s);
		System.out.println(s);
	}

}
