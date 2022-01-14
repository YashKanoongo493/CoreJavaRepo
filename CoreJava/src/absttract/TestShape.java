package absttract;


	public  abstract class TestShape {
		public static void main(String[] args) {

			Shape s = new Circle(5); // provide memory to circle

			Shape s1 = new Rectangle(10, 20); // For memory to rectangle
			s1.area();

			Shape s2 = new Triangle(15, 10); // For memory to Triangle
			s2.area();

			s.area();
		}
	}

	//System.out.println(s.getBorderWidth());
	// System.out.println(s.getColor());

	//s.setBorderWidth(9);
	//s.setColor("Blue"); 

