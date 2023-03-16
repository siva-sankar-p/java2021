package Collections;

import java.util.ArrayList;  
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_for_User_Class {
	
	public static void main(String[] args) {
		
	
	
	UserClass uc1 = new UserClass(1, 12,"siva");
	UserClass uc2 = new UserClass(4, 13,"sankar");
	UserClass uc3 = new UserClass(3, 22,"pindi");
	
	
	List<UserClass> uc = new ArrayList<UserClass>();
	List<String> st = new  ArrayList<String>();
	
	uc.add(uc1);
	uc.add(uc2);
	uc.add(uc3);
	System.out.println(uc);
	
	
   	Collections.sort(uc,Comparator.comparing(UserClass::getNo).thenComparing(UserClass::getName));
	System.out.println(uc);
	}
}
