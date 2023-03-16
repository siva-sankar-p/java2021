package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataAssigningToCompany2 {
	
	public static void main(String[] args) {
	
		
		Company2 cmp1 = new Company2(1,"siva");
		Company2 cmp2 = new Company2(2,"sankar");
		Company2 cmp3 = new Company2(3,"pindi");
		Company2 cmp4 = new Company2(1,"asiva");
		
		
		List<Company2> set1 = new ArrayList<Company2>();
		

		set1.add(cmp4);
		set1.add(cmp3);
		set1.add(cmp2);
		set1.add(cmp1);
		//set.add(cmp1);
		//List list = new ArrayList<Company>(set);

		Collections.sort(set1,Comparator.comparing(Company2::getId).thenComparing(Company2::getId));
		
		
		System.out.println(set1);
		
		
	

	}

}
