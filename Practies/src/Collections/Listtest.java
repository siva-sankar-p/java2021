package Collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Listtest {
   public static void main(String[] args) {
	
	   List<String> l1= new ArrayList<String>();
	   
	   l1.add("siva sankar");
	   l1.add("merakapalem");
	   l1.add("ok");
	   l1.add(1,"pindi");
	   System.out.println(l1);
	   List<String> l2= new ArrayList<String>();
	   
	   l2.add("sankar");
	   l2.add(1,"kumar");
	   l2.add("magatapalli");
	   l2.addAll(2,l1);   
	   System.out.println(l2);
//	   
//	  Iterator it1 =l1.iterator();
//	  while( it1.hasNext()){
//	  System.out.println(it1.next());
//	  }
//	  
//	 ListIterator it2= l1.listIterator();
//	 
//	 while( it2.hasNext()){
//		  System.out.println(it2.next());
//		  }
//	   System.out.println(" bu using reverse order by previous ");
//	 while( it2.hasPrevious()){
//		  System.out.println(it2.previous());
//		  }
	   
//	   for(int i=0;i<l2.size();i++)
//	   {
//		   System.out.println(l2.get(i));
//	   }
//	   //by using for each loop
//	   
//	   System.out.println("by for each loop");
//	   for(String ele:l2) {
//		   System.out.println(ele);
//	   }
	   
	   // by using while loop

//	   int i=0;
//	   while(l2.size()>i) {
//		   System.out.println(l2.get(i));
//		   i++;
//	   }
//	   
	   //by using iterator
	   
	   Iterator itr=l2.iterator();
	   
	   while(itr.hasNext()) {
		Object s=   itr.next();
		   System.out.println(s);
		   if(s.equals("magatapalli")) {
			   
			   itr.remove();
			   System.out.println(l2);
		   }
		   
	   }
}
}
