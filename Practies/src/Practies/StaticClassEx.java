package Practies;

public class StaticClassEx {
	
	public static void siva() {
		StaticClassEx st= new StaticClassEx();
		st.siva2();

		int a=10;
		//System.out.println("hai");
	}

public void siva2() {
		
		int a=10;
		System.out.println("hai2");
		
		StaticClassEx.siva();
	}
public static void main(String[] args) {
	 
	
	StaticClassEx st = new StaticClassEx();
	st.siva();
	
	
}
}
