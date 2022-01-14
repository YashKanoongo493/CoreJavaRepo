package excercise11_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Excercise3 {
public static void main(String[] args) {
	

	Employee e1 = new Employee();
	e1.setSalary(8960);
	e1.setF_name("Yash");
	e1.setL_name("Kanoongo");
	
	Employee e2 = new Employee();
	e2.setSalary(14000);
	e2.setF_name("Kapil");
	e2.setL_name("Malviya");
	
	Employee e3 = new Employee();
	e3.setSalary(5200);
	e3.setF_name("Mayank");
	e3.setL_name("Gupta");
	
	Employee e4 = new Employee();
	e4.setSalary(15000);
	e4.setF_name("Dheeraj");
	e4.setL_name("Gupta");
	
	Employee e5 = new Employee();
	e5.setSalary(10000);
	e5.setF_name("Vishu");
	e5.setL_name("Lumba");
	
	ArrayList l = new ArrayList<>();
	l.add(e1);
	l.add(e2);
	l.add(e3);
	l.add(e4);
	l.add(e5);
	Collections.sort(l,new Last_Name());
	Iterator it = l.iterator();
	while(it.hasNext()) {
		Employee ee = (Employee)it.next();
		System.out.println(ee.getF_name()+" "+ee.getL_name()+"  "+ee.getSalary());
		
}
}
}

