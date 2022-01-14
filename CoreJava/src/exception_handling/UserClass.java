package exception_handling;

public class UserClass {

	public static void main(String[] args) throws LoginException {
		int val = 5;
			LoginException e = new LoginException();
				if(val<1)throw e;
			System.out.println(e.getMessage());

	}

}
