package Practies;

public class Method_Over_Loading {

	

	public void sankar(int a, long b ) 
	{
		 System.out.println("1st method");
			
		}
		public void sankar(int a,int b)  
		{
			System.out.println("2nd method");  
			
		}
		public void sankar (long a,int b)  
		{
			System.out.println("3rd method");
	}
		
	
		public static void main(String[] args) {
			
		Method_Over_Loading si = new Method_Over_Loading();

			si.sankar(10L,20);
			si.sankar(20, 70L);
			si.sankar(12, 30);
			
			ok k= new ok();
	//		k.pindi(20, 123);    // ambiguity
		} 
}
		 class ok{
			void pindi(int c, long n) {
	
				System.out.println("2-1 method ");
			}
			void pindi (long c,int n) {
				
				System.out.println("2-2 method ");
			}

}
	