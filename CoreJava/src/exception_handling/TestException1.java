package exception_handling;

public class TestException1 {
	public static void main(String[] args) {
		try {
			String s = "javacore";
			System.out.println(s.length());
			System.out.println(s.charAt(4));
			
			
			double div = 30 / 0;
			System.out.println(div);
		}
		/*catch(RuntimeException e) {
		      e.printStackTrace();
			
			System.out.println(e.getMessage());
		}*/
		catch (Exception e) {
              e.printStackTrace();
			
			//System.out.println(e.getMessage());
		}
	
		finally{
			
			
	System.out.println("this is final output ");
		}
	}
}


/*	catch (NullPointerException e) {
System.out.println("Enter value here ");
} 

catch (ArithmeticException e) {
System.out.println("You dont  have appropriate answer");
}*/

