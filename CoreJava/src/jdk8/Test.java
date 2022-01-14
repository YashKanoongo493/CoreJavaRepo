package jdk8;

public class Test {
	public static void main(String[] args) {

		HelloInt h = () -> {
			System.out.println("Hello Say");
		};
		h.say();
	}
}
