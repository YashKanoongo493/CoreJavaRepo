package exception_handling;

public class TestException {

	public static void main(String[] args) {
		try{ 
			double div = 30/0;
		System.out.println(div);
		}catch(ArithmeticException e) {
			System.out.println("You dont  have appropriate answer");
		}
	}
}
