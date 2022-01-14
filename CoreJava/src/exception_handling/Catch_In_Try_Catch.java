package exception_handling;

public class Catch_In_Try_Catch {
	public static void main(String[] args) {
		try {
			String s = "javacore";
			System.out.println(s.length());
			System.out.println(s.charAt(4));
			
			
			double div = 30 / 0;
			System.out.println(div);
		}
		catch(RuntimeException e) {
		     // e.printStackTrace();
			try {
				String s = "javacore";
				System.out.println(s.length());
				System.out.println(s.charAt(4));
			      double div = 30 / 0;
				  System.out.println(div);
			}
		catch (Exception e1) {
	          e.printStackTrace();
			
			//System.out.println(e.getMessage());
		}
		}//outer catch
	}
	
	//System.out.println(e.getMessage());
}
