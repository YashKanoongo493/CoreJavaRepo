package encapsulation;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a = new Automobile();
		a.setColor("magenta");
		a.setSpeed(180);
		a.setGear(5);
		a.setMake("CBR");
		
		System.out.println(a.getColor());
		System.out.println(a.getSpeed());
		System.out.println(a.getGear());
		System.out.println(a.getMake());
	}

}
