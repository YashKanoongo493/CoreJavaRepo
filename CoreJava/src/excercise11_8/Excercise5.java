package excercise11_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Excercise5 {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		ArrayList a = new ArrayList<>();

		for (int i = 1; i <= 100000; i++) {

			a.add(i);
			// System.out.println(i);
		}

		HashSet h = new HashSet<>();
		h.addAll(a);

		System.out.println(h);

		for (int j = 1; j <= 50; j++) {
			System.out.println(j);
			System.out.println("Is Arraylist contains? " + a.contains(j));
			
		}

		System.out.println("Time taken by ArrayList: " + (System.currentTimeMillis()));
		System.out.println(" ");
		
		for (int k = 0; k <= 50; k++) {
			System.out.println(k);
			System.out.println("Is HashSet contains? " + h.contains(k));
			

		}

		System.out.println("Time taken by strngbuffr2: " + (System.currentTimeMillis()));
	}
}
