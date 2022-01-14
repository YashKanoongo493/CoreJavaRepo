package polymorphism;

public class ArrayTestShape {
	public static void main(String[] args) {

		Shape [] s = new Shape[3];
			
			for (int i = 0; i < s.length; i++) {
				s[i] = getShape(i+1);
			}
			
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
		   public static Shape getShape(int i) {
			   if(i==1) return new Rectangle(10,20);
			   if(i==2) return new Circle(2);
			   if(i==3) return new Triangle(15,10);
		         Shape S1 = new Shape();
		         return S1;
		   }
}
