package Interface;

public class City implements State,Country,Continent {

	 public void showContinent()
	  { 
	    System.out.println("Asia"); 
	  } 
	public void showCountry()
	{ 
	  System.out.println("India"); 
	 } 
	public void showState()
	{ 
	   System.out.println("Amalapuram"); 
	 } 
	
	
	public static void main(String[] args) {
		
		City c = new City();
		
		c.showState();
		
	}
}
