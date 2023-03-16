package collections2;

import java.util.Objects;

public class Company implements Comparable<Company> {

	private int id;
	private String name;
	
	
	
	public Company(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Company id=" + id + ", name=" + name;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return id == other.id && Objects.equals(name, other.name);
	}



	@Override
	public int compareTo(Company o) {
		// TODO Auto-generated method stub
		
		
		//return this.name.compareTo(o.name);
		  return this.id-(o.id);

	}

}
