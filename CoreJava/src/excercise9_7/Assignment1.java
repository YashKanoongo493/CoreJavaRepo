package excercise9_7;

public class Assignment1 {
	public static void main(String[] args) {
		try {
			String s = "javacore";
			System.out.println(s.length());
			System.out.println(s.charAt(4));
			
			
			double div = 30 / 0;
			System.out.println(div);
		}
		
		catch (Exception e) {
			System.out.println("You dont  have appropriate answer");
			System.exit(0);
		}
	
		finally{
			System.out.println("this is final output ");
		}
	}
}
