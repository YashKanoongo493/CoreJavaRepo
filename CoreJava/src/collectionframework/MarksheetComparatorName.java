package collectionframework;

import java.util.Comparator;

public class MarksheetComparatorName implements Comparator<Marksheet>{
	
	@Override
	public int compare(Marksheet o1, Marksheet o2) {
	if( o1.getF_name().compareTo(o2.getF_name())==0) {
		
		return o1.getL_name().compareTo(o2.getL_name());
		
	}else {
		return o1.getF_name().compareTo(o2.getF_name());
	}
	}
}
