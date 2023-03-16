package Arrey_List;

import java.util.ArrayList;

public class Retrive_The_Data_Of_Employee {
	
	public static void main(String[] args) {
		
	Add_Employee_Data empdata= new Add_Employee_Data();
	
	ArrayList<Employee> empr =  empdata.emplist();
	
	for(Employee em:empr)
	{
		
		System.out.println(em.date+"  "+em.name+"  "+em.no);
		
	}
	
	}
}
