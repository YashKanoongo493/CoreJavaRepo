package methodoverloading;

public class Addition {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, float b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, float c) {
		System.out.println(a + b + c);
	}

	public double add(double a, int b) {
		return (a + b);
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(50,68);
	}
}
