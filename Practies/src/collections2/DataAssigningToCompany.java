package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataAssigningToCompany {
	
	public static void main(String[] args) {
	
		
		Company cmp1 = new Company(1,"siva");
		Company cmp2 = new Company(2,"sankar");
		Company cmp3 = new Company(3,"pindi");
		Company cmp4 = new Company(1,"siva");
		Company cmp5 = new Company(6,"siva");

		
		Set<Company> set = new HashSet<Company>();
		

		set.add(cmp4);
		set.add(cmp3);
		set.add(cmp2);
		System.out.println(set.size());
	
		cmp4.setId(4);
		System.out.println(set.size());
		
		set.add(cmp5);
		System.out.println(set.size());

	}

}
