package Practies;


  public  class Constr_modifier_ex {

	  
     public Constr_modifier_ex()
     {
    	System.out.println("constructor implimentation"); 
     }	
     
     protected void siva()
     {
    	 System.out.println("protected modifier");
     }
     
     private void name() {
		System.out.println("private modifier");
	}
     
     public static void sankar()
     {
    	 System.out.println("static method without creating object");
     }
    
//     public static void main(String[] args) {
//		
//	
//		Constr_modifier_ex con= new Constr_modifier_ex();
//		
//     }
}
