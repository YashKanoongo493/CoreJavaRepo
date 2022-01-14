package exception_handling;

public class TestLoginException {
	
		public static void main(String[] args) throws LoginException {
			auth("Vijay");
		}
		public static void auth(String name) throws LoginException {
			if(!name.equals("admin")) {
				LoginException e = new LoginException();
				System.out.println(e.getMessage());
				throw e;
			}
		}
}
