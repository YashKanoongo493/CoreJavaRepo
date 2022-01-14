package collectionframework;

	import java.util.HashSet;
	import java.util.Set;
	import java.util.TreeSet;
	import java.util.*;

	public class Set_Interface {
	public static void main(String[] args) {

		Set S1 = new TreeSet<>();
		S1.add(12);
		S1.add(4);
		S1.add("JAV");
		S1.add('j');
		S1.add(01123);
		System.out.println(S1);
		System.out.println(" ");
		
		
		
	//Give output in any random order
		/*Set S = new HashSet<>();
		S.add(125);
		S.add(45);
		S.add("JAVA");
		S.add('y');
		S.add(125);
		S.add(132);
		S.add(156);
		System.out.println("add output is "+S);*/
	}

}
