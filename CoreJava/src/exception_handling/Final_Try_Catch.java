package exception_handling;

public class Final_Try_Catch {
	public static void main(String[] args) {
		try {
			String s = "javacore";
			System.out.println(s.length());
			System.out.println(s.charAt(4));
			
			
			double div = 30 / 0;
			System.out.println(div);
		}
		
		catch (Exception e) {
              e.printStackTrace();
		
		}
	
		finally{
			try {
				String s = "javacore";
				System.out.println(s.length());
				System.out.println(s.charAt(4));
				
				
				double div = 30 / 0;
				System.out.println(div);
			}
			
			catch (Exception e) {
	              e.printStackTrace();
				
				
			}
			
	System.out.println("this is final output ");
		}
	}

}
