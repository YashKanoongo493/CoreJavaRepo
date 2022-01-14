package collectionframework;

import java.util.Comparator;

public class MarksheetComparatorPhysics implements Comparator<Marksheet> {


	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		//return o1.getPhy()-o2.getPhy(); //RestString for all things we use (-)
		return o2.getPhy()-o1.getPhy(); //for decreasing
	}

}
