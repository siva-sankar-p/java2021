package Arrey_List;

import java.util.ArrayList;

public class Company {
	int id ;
	String name,status;
	
	Company(int id,String name,String status) {
		this.id=id;
		this.name=name;
		this.status=status;
	}
	public Company() {
	}
	
     public void Display_Employee_Data(ArrayList<Company> clist) {
    	 for(Company comlist:clist)
    	 System.out.println("id ="+comlist.id+"  name= "+comlist.name+"  status = "+comlist.status );
    	 
    	 
    	 
     }
}
