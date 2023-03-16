package arraylist2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
	
		Map<Integer,String> maplist= new HashMap<Integer,String>();
		maplist.put(1, "siva");
		maplist.put(2, "mani");
		maplist.put(3, "naveen");
		maplist.put(4, "sankar");
		maplist.put(5, "pramod");

		
		System.out.println(maplist.get(2));
	Set set=	maplist.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext()) {
		Map.Entry ent =(Map.Entry) itr.next();
		System.out.println(ent.getKey()+" "+ent.getValue());
	}
	
	
	}

}
