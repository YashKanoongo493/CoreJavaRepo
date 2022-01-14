package inheritance;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle  t = new Triangle();
		t.setBase(45);
		t.setHeight(56);

		t.area();
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		}
}
