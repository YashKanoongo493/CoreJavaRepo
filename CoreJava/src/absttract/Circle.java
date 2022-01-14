package absttract;


	public class Circle extends Shape{
		private int radius;
		 public static final double PI =3.14;

			public Circle() {

			}
		 public Circle(int r)
		 {
			 radius= r;
		 }

		 public int getRadius() {
			return radius;
		}



		public double area() {
			 double area = PI*radius;
			 System.out.println("Area of Circle is "+ area);
			 return area;
		 }

	}

