package Practies;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueeueExample {
	public static void main(String[] args) {
		
		        Queue<String> pq = new PriorityQueue<>();
		  
		        pq.add("Geeks");
		        pq.add("for");
		        pq.add("Geeks"); 
		        pq.add("siva");
		        pq.add("abcd");
		        pq.add("work");
		        pq.add("ball");
		        pq.add("dog");


		  
		        System.out.println(pq);
		        
		        
		        Queue<Integer> pq1 = new PriorityQueue<>();
				  
		        pq1.add(1);
		        pq1.add(10);
		        pq1.add(5); 
		        pq1.add(16);
		        pq1.add(17);
		        System.out.println(pq1);

		    
	}

}
