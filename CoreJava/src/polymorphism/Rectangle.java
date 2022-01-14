package polymorphism;

public class Rectangle  extends Shape
{
    private int length;
    private int Width;
   // public static final double PI =3.14;

   	public Rectangle() {

   	}
    public Rectangle(int len, int wid )
    {
   	 length = len;
   	 Width = wid;
    }

  /*  public int getRadius() {
   	return radius;
   }*/



   public double area() {
   	 int area = length*Width;
   	 System.out.println("Area of Rectangle is "+ area);
  	 return area;
    }

}
