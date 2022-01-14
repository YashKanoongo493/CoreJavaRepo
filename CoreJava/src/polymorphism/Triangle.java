package polymorphism;

public class Triangle extends Shape {
	private int base;
	private int Height;
	
public Triangle() {
	
}
public Triangle (int base, int height) {
	this.base = base;
	this.Height = height;
}
public int getBase() {
	return base;
}

public int getHeight() {
	return Height;
}
 
public double area() {
	double area = (base*Height)/2;
	System.out.println("Area of rectangle is "+area);
	 return area;
}

}
