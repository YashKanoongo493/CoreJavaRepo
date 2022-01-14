package excercise11_8;

import java.util.ArrayList;
import java.util.Iterator;

public class Excercise4 extends Employee4 {
public static void main(String[] args) {
	Employee4 e1 = new Employee4();
	e1.setSalary(8960);
	e1.setF_name("yash");
	e1.setL_name("Kanoongo");
	
	Employee4 e2 = new Employee4();
	e2.setSalary(14000);
	e2.setF_name("Kapil");
	e2.setL_name("malviya");
	
	Employee4 e3 = new Employee4();
	e3.setSalary(5200);
	e3.setF_name("mayank");
	e3.setL_name("gupta");
	
	Employee4 e4 = new Employee4();
	e4.setSalary(15000);
	e4.setF_name("Dheeraj");
	e4.setL_name("vishwakarma");
	
	Employee4 e5 = new Employee4();
	e5.setSalary(10000);
	e5.setF_name("vishu");
	e5.setL_name("lumba");
	
	ArrayList<Employee4> l = new ArrayList<Employee4>();
	l.add(e1);
	l.add(e2);
	l.add(e3);
	l.add(e4);
	l.add(e5);
	
	Iterator<Employee4> it = l.iterator();
	while (it.hasNext()) {
		Employee4 employee4 = (Employee4) it.next();
		
		
		
	}
	
}
}
