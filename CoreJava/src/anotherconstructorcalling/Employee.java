package anotherconstructorcalling;


	public class Employee extends Person {

		private String deisgnation = null;

		public Employee() {
			System.out.println("This is Default Constructor ");

		}

		public Employee(String fn, String ln, String des) {
			super(fn, ln);
			deisgnation = des;
			Person P = new Person(fn, ln, des);
			//System.out.println("3 parameterised Constructor ");

		}

		public static void main(String[] args) {
			Person P1 = new Employee("Rays", "Tech", "Developer");
			// Person p = new Employee("Yash", "Kanoongo", "Developer");
		}
}
