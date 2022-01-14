package anotherconstructorcalling;

public class Person {

	protected String fname = null;
	protected String lname = null;
	protected String address = null;

	public Person() {
		
		System.out.println("This is Default Constructor ");
		
	}

	public Person(String fn, String ln) {
		this();
		fname = fn;
		lname = ln;
		
		System.out.println("2 Parameteriesed Constructor is called " + fname + lname);
	}

	public Person(String fn, String ln, String add) {
		//fname = fn;
		//lname = ln;
		this(fn,ln);
		address = add;
		System.out.println("3 Parameteriesed Constructor is called " + fn + " " + ln + " " + add);
	}

	public static void main(String[] args) {
		Person p = new Person("Rays", "Tech", "Indore");
		System.out.println();
	}
}
