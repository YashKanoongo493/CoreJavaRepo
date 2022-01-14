package inheritance;

public class TestCircle {
	public static void main(String[] args) {
		Circle c =new Circle();
		c.setRadius(6);
		c.setBorderWidth(9);
		c.setColor("Black");
		
		c.area();
		System.out.println(c.getRadius());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
	}
}
