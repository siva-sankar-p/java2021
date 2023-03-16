package arraylist2;

import java.util.ArrayList;

public class vbgroup {

private	String empname;
private int id;

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public vbgroup(String empname,int id) {
	this.empname=empname;
	this.id=id;	
}

public String toString() {
	return "vbgroup empname=" + empname + ", id=" + id;
}

}
