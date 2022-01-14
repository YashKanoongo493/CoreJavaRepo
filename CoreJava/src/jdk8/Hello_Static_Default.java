package jdk8;

public interface Hello_Static_Default {

	public int add(int a , int b);
	
	public default void defaultMethod() {
		System.out.println("Test default");
	}
	
	public static void staticMethod() {
		System.out.println("Test Static");
	}
	
}
