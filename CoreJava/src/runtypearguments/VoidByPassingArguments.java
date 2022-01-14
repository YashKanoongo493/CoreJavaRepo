package runtypearguments;

public class VoidByPassingArguments {
	public void add (int a,int b)
	{
		System.out.println(a+b);
		}
	public static void main(String[] args) 
	{
		VoidByPassingArguments v = new VoidByPassingArguments();
		
		v.add(45, 56);
	}
}
