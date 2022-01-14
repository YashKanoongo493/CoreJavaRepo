package input_and_output;

import java.io.Serializable;

public class EmployeeSer implements Serializable {
private int id;
private String name;
private transient String pwd;


public EmployeeSer() {}
public EmployeeSer(int id, String name, String pwd) {
	this.id = id;
	this.name = name;
	this.pwd = pwd;
	
	
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getPwd() {
	return pwd;
}

}
