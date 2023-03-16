package arraylist2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Data_Assigning_To_vbgroup {
public static void main(String[] args) {
	
	vbgroup vb4= new vbgroup("siva sankar pindi", 4);
	vbgroup vb1= new vbgroup("siva", 1);
	vbgroup vb3= new vbgroup("siva pindi", 3);
	vbgroup vb2= new vbgroup("siva sankar ", 2);

	ArrayList<vbgroup> list = new ArrayList<vbgroup>();
	list.add(vb4);
	list.add(vb1);
	list.add(vb3);
	list.add(vb2);

//	Iterator itr = list.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
	//based on group
	
	//Collections.sort(list,Comparator.comparing(vbgroup::getId).thenComparing(vbgroup::getEmpname));
	
	
	//based on empnane 
	
	Comparator<vbgroup> vbn=Comparator.comparing(vbgroup::getEmpname);
	Collections.sort(list,vbn);
	
	System.out.println(list);
}
}
