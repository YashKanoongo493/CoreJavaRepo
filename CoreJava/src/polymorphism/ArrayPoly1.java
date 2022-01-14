package polymorphism;

public class ArrayPoly1 {
	   public static void main(String[] args) {
			Shape [] s = new Shape[3];
			
			s[0] = new Rectangle(6,10);
			s[1] = new Circle(5);
			s[2] = new Triangle(5,10);
			
			double totalArea = calArea(s);
			System.out.println(totalArea);
			
			
		}
		   private static double calArea(Shape[] s) {
			   double totalArea = 0 ;
			   for (int i = 0; i < s.length; i++) {
				totalArea += s[i].area();
			}
			   return totalArea;
		   }
}
