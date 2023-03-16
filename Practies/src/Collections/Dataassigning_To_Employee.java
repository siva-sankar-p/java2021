package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dataassigning_To_Employee {
public static void main(String[] args) {
	

	Set<Employee> listmap= new HashSet();
	
	Employee emp1 = new Employee("siva", 1);
	Employee emp2= new Employee("devi", 4);
	Employee emp3 = new Employee("mani", 2);
	Employee emp4= new Employee("pramod", 5);
	Employee emp5= new Employee("siva", 1);

	listmap.add(emp1);
	listmap.add(emp2);
	listmap.add(emp3);
	listmap.add(emp4);
	listmap.add(emp5);
	
	System.out.println(listmap.size());  // hear come size 5 because we srote the value as object so its dont know wether its duplicate or not it will print

// if we want to dont alloe the duplicates frome employee class we can add hashcode method and equalsmethod
	
	Iterator itr = listmap.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());	
		
//		emp3.setId(11);
//		emp3.setName("ch naveen");
//		
	}
}	
}
