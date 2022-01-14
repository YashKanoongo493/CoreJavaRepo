package jdk8;

public interface HelloInt {

	//public int add (int a, int b);
	public void say();
	public default void  defMethod() {
		System.out.println("Test Default");
	}
	
}
