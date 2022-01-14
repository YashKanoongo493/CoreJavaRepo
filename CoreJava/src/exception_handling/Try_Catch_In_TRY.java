package exception_handling;

public class Try_Catch_In_TRY {
	public static void main(String[] args) {
		
		try {
		    try {
			String s = "javacore";
			System.out.println(s.length());
			System.out.println(s.charAt(4));
			
			
			double div = 30 / 0;
			System.out.println(div);
		}
		catch(RuntimeException e) {
		     // e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		    }//for first try
		catch (Exception e) {
	          e.printStackTrace();
		}	
		}
}
