package Collections;

import java.util.Collections;

public class UserClass  {
	int no;
	int dated;
	String name;
	
	public UserClass(int no,int dated,String name) {
		
		this.no=no;
		this.dated=dated;
		this.name= name;
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getDated() {
		return dated;
	}

	public void setDated(int dated) {
		this.dated = dated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " UserClass no=" + no + " dated=" + dated + " name=" + name ;
	}

//	@Override
//	public int compareTo(UserClass obj) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(obj.name);
//	}
	

}
