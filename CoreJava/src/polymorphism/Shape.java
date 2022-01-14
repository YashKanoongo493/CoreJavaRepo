package polymorphism;

public class Shape {

	
	private int BorderWidth;
	private String color;
	 
	public double area() {
		return 0;                                                                         
	}
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
//Setter Getter//


/*	public int getBorderWidth() {
		return BorderWidth;
	}


	public void setBorderWidth(int borderWidth) {
		BorderWidth = borderWidth;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}*/



