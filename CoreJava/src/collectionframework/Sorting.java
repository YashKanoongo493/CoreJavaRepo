package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {

		
		
		List l = new ArrayList();   //add
		l.add(12);
		l.add(23);
		l.add(25);
		l.add(1256);
		l.add(1234);
		  System.out.println( "list l is" + l);
		 System.out.println("        ");
		 
		  Collections.sort(l);
		  System.out.println(l);
		
		}
}
