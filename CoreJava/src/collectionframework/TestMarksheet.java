package collectionframework;                                                                                    

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
public static void main(String[] args) {
	Marksheet m1 = new Marksheet ();
	m1.setRoll_no("DS162");
	m1.setF_name("Ritik");
	m1.setL_name("Saxena");
	m1.setPhy(89);
	m1.setChem(88);
	m1.setMath(87);
	
	
	Marksheet m2 = new Marksheet ();
	m2.setRoll_no("DS161");
	m2.setF_name("Ishan");
	m2.setL_name("Mehta");
	m2.setPhy(78);
	m2.setChem(81);
	m2.setMath(88);

	Marksheet m3 = new Marksheet ();
	m3.setRoll_no("DS164");
	m3.setF_name("Tarun");
	m3.setL_name("Patidar");
	m3.setPhy(85);
	m3.setChem(83);
	m3.setMath(80);

	Marksheet m4 = new Marksheet ();
	m4.setRoll_no("DS163");
	m4.setF_name("Raju");
	m4.setL_name("Sharma");
	m4.setPhy(99);
	m4.setChem(98);
	m4.setMath(97);

	Marksheet m5 = new Marksheet ();
	m5.setRoll_no("DS160");
	m5.setF_name("Raju");
	m5.setL_name("Verma");
	m5.setPhy(78);
	m5.setChem(77);
	m5.setMath(74);

	ArrayList l = new ArrayList<>();
	l.add(m1);
	l.add(m2);
	l.add(m3);
	l.add(m4);
	l.add(m5);
	
	
	
	
	Collections.sort(l,new MarksheetComparatorName());
	Iterator it = l.iterator();
	while(it.hasNext()) {
		Marksheet m = (Marksheet)it.next();
		System.out.println(m.getRoll_no()+" "+ m.getF_name()+" "+m.getL_name()+" "+m.getPhy()+" "+m.getChem()+" "+m.getMath());
	}
	
}
}
