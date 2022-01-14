package exception_handling;

public class LoginException extends Exception {
	 public LoginException ()
	 {
		 super("Invalid userId/Password ");
	 }
}
