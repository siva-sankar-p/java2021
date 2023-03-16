package Arrey_List;

import java.util.ArrayList;

public class Add_Employee_Data {

	ArrayList<Employee> emplist(){
		
		Employee em1= new Employee("siva", 12, 40);
		Employee em2= new Employee("pindi", 55, 99);
		Employee em3= new Employee("sankar", 10, 880);
		Employee em4= new Employee("ok ", 2, 890);
		
	ArrayList< Employee> emp = new ArrayList<Employee>();
	emp.add(em1);
	emp.add(em2);
	emp.add(em3);
	emp.add(em4);
	
	return emp;
	}
	}
