package encapsulation;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setBorderWidth(8);
		s.setColor("Blue");
		
		//String c = s.getColor();
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
	}
}
