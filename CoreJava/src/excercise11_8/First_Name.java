package excercise11_8;

import java.util.Comparator;

public class First_Name implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getF_name().compareTo(o2.getF_name());
	}
	

}
