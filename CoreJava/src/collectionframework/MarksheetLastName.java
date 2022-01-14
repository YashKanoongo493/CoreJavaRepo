package collectionframework;

import java.util.Comparator;

public class MarksheetLastName implements Comparator<Marksheet>{
	
	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		return o1.getF_name().compareTo(o2.getL_name());
	}

}
