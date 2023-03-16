package Arrey_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_Methods {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("prasiddha");
		l1.add("srinivasa");
		l1.add("bvc");
		l1.add("aims");
		l1.add("kimsa");
		System.out.println("l1 data= "+l1);
		List<String> l2 = new ArrayList<String>();
		l2.add("odalrevu bvc");
		l2.add("rajamandry bvc");
	    l2.addAll(0, l1);
		System.out.println("l1+ l2 data= "+l2);
		l2.remove(2);
		System.out.println("after removing 2nd index value  "+l2);
		l2.set(2, "bvc");
		System.out.println("after change the index 2 value "+l2);
		System.out.println(l2.get(1));
		
		Iterator itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// by using for loop
		System.out.println(" by for loop");
		for(String list:l2)
			System.out.println(list);
		
		
	}

}
