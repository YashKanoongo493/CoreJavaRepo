package encapsulation;

public class Shape {
	private int BorderWidth;
	   private String color;
	int getBorderWidth() {
		return BorderWidth;
	}
	void setBorderWidth(int borderWidth) {
		BorderWidth = borderWidth;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
}
