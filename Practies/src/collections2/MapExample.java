package collections2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		
		Map< Integer, String> map1= new HashMap<Integer, String>();
		
		map1.put(1,"siva");
		map1.put(2,"sankar");
		map1.put(3,"pindi");
		map1.put(1,"mkp");
		map1.put(4,null);
		
//		Set set = map1.entrySet();
//		
//		Iterator itr =  set.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for(Map.Entry list:map1.entrySet()) {
			System.out.println(list.getKey()+"  "+list.getValue());
		}
	}

}
