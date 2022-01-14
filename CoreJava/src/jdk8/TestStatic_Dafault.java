package jdk8;

public class TestStatic_Dafault {

	public static void main(String[] args) {

		Hello_Static_Default h = (a, b) -> {
			return a + b;
		};
		//h.add(5,3);
		int c = h.add(50, 33);
		System.out.println("Addition of a and b is "+c);
		
	}

}