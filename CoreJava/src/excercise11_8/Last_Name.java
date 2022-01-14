package excercise11_8;

import java.util.Comparator;

public class Last_Name implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getL_name().compareTo(o2.getL_name())==0) {
			return o1.getF_name().compareTo(o2.getF_name());
			
		}
		return o1.getL_name().compareTo(o2.getL_name());
	}
	

}
