package excercise11_8;

import java.util.LinkedList;

public class Excercise7 {
public static void main(String[] args) {
	
	 LinkedList<String> animals  = new LinkedList<String>();
	 animals.add("Dog");
	 animals.add("cat");
	 animals.add("elephant");
	 animals.add("pig");
	 animals.add("cow");
	 
	 System.out.println("Linked list: "+ animals);
	 
	 String middle = animals.get(animals.size()/2);
	 System.out.println("Middle Element: "+middle);
}
}
