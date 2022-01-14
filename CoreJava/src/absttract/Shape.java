package absttract;

public abstract class Shape {
	private int BorderWidth;
	private String color;

	public abstract double area();

	public Shape() {

	}

	public Shape(String s, int b) {
		color = s;
		BorderWidth = b;
	}

	public int getBorderWidth() {
		return BorderWidth;
	}

	public String getColor() {
		return color;
	}
}
