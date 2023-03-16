package arraylist2;

public class UserClSS implements Comparable<UserClSS> {

	private int id;
	
	public  int getid() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserClSS(int id) {
	
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserClSS id=" + id;
	}

	@Override
	public int compareTo(UserClSS obj) {
		if(id==obj.id) 
			return 0;
		else if(id>obj.id)  
			return 1;  
			else  
			return -1;

	}

}
