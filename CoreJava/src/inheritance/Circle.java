package inheritance;

public class Circle  extends Shape {
	  private int radius;

	  public int getRadius() {
	  	return radius;
	  }

	  public void setRadius(int radius) {
	  	this.radius = radius;
	  }
	    public void area()
	    {
	  	  double ar = 3.14*radius*radius;
	  	  System.out.println(ar);
	  	  }

}
