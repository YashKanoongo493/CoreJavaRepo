package excercise11_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Excercise6 {
public static void main(String[] args) {
	Set s1 = new HashSet<>();
	s1.add(12);
	s1.add("Rays");
	s1.add(21);
	s1.add(25);
	s1.add(85);
	s1.add(87);
	s1.add(32);
	s1.add(78);
	s1.add(98);
	Iterator i = s1.iterator();
	while(i.hasNext()) {
		Object h1 = (Object) i.next();
		System.out.println("HashSet is "+" "+h1);
	}
	
	
	Set s2 = new LinkedHashSet<>();
	s2.add(123);
	s2.add("Tech");
	s2.add(22);
	s2.add(45);
	s2.add(66);
	s2.add(77);
	s2.add(55);
	s2.add(88);
	s2.add(91);
	Iterator i1 = s2.iterator();
	while(i1.hasNext()) {
		
		Object h2 = (Object) i1.next();
		System.out.println("LinkedHashSet is "+" "+h2);
	}
	

	Set s3 = new TreeSet<>();
	s3.add(0112);
	
	s3.add(54);
	s3.add(65);
	s3.add(89);
	s3.add(82);
	s3.add(34);
	s3.add(71);
	s3.add(73);
	Iterator i2 = s3.iterator();
	while(i2.hasNext()) {
		
		Object h3 = (Object) i2.next();
		System.out.println("TreeSet is "+" "+h3);
	}
}
}
