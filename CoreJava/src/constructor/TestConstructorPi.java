package constructor;

public class TestConstructorPi {

	public static void main(String[] args) {
		ConstructorPi t = new ConstructorPi("black",567);
		System.out.println(t.getBorderWidth());
		System.out.println(t.getColor());
		System.out.println(t.PI);
	}
}
