package excercise11_8;


public class Employee4{

	private String f_name;
	private String l_name;
	private int salary;
	private int id;
	
	
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		
		if(!(obj instanceof Employee4))
			return false;		
		
		return false;	
	}
	public int hashCode(int id) {
		return id;
		
	}
	

}

