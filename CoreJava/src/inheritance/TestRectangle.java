package inheritance;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r =new Rectangle();
		r.setLength(8);
		r.setWidth(9);
		
		r.area();
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
	
	}
}
