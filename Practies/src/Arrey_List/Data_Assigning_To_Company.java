package Arrey_List;

import java.util.ArrayList;

public class Data_Assigning_To_Company {
	
	public static void main(String[] args) {
		
		Company clist1 = new Company(12,"siva", "sankar");
		Company clist2 = new Company(22,"kumar", "ponnamanda");
		Company clist3 = new Company(33,"merakapalem", "sankar");
		Company clist4 = new Company(44,"pindi", "sankar");
		
		ArrayList<Company> clist= new ArrayList<Company>();
		
		clist.add(clist1);
		clist.add(clist2);
		clist.add(clist3);
		clist.add(clist4);
		
		
		Company list = new Company();
		
		list.Display_Employee_Data(clist);
	}

}
