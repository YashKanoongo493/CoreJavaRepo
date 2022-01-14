package excercise11_8;

import java.util.ArrayList;
import java.util.Iterator;

public class Excercise1 {
	public static void main(String[] args) {
		
		ArrayList a= new ArrayList<>();
		
		a.add(45);
		a.add("harshit");
		a.add(463);
		a.add(241);
		a.add('g');
		a.add(624);
		a.add(48);
		a.add(14);
		a.add(85);
		
		Iterator i = a.iterator();
		
		while (i.hasNext()) {
			Object ob = (Object) i.next();
			System.out.println("ArrayList    "+ob);
			
		}
		
	}
}
