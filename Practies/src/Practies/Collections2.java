package Practies;

import java.util.*;

public class Collections2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);
		
	List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		
		list.addAll(2,list2);
	
		
		//Collections.sort(list);

	 // list.forEach(li->System.out.println(li));
	  
//	  Integer []a=(Integer[]) list2.toArray();
//	  System.out.println(Arrays.toString(a));
		
		Set set = new HashSet<Integer>(list);
		set.add(11);
		System.out.println(set);
	}
}
