package exception_handling;

public class TestLoginException1 {
	public static void main(String[] args) {
		
		try {
			auth("Vijay");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
}

private static void auth(String name) throws LoginException {
	// TODO Auto-generated method stub
	if (!name.equals("admin"));
	{
		LoginException e = new LoginException();
		throw e;
	}
}
}
