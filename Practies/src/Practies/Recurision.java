package Practies;

public class Recurision {

//	public static void main(String[] args) {
//
//
//		  int result = sum(10);
//		    System.out.println(result);
//		    
//		    Constr_modifier_ex cons= new Constr_modifier_ex();
//		   
/////		    cons.siva();
/////		    cons.name(); // this not posibule because we are provide the private modifier for method
//		   Constr_modifier_ex.sankar(); // method call by class name with out creating object
//		  }
//		  public static int sum(int k) {
//		    if (k > 0) {
//		      return k + sum(k - 1);
//		    } else {
//		      return 0;
//		    }
//	}

	
	public static int value(int a){
		
		if(a>0) {
			return a+value(a-1);
		}else
		{
			return 0;
		}
	}
		 public static void main(String[] args) {
			int re= value(10);
			System.out.println(re);
		} 
}
