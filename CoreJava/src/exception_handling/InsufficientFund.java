package exception_handling;

public class InsufficientFund extends Exception{

	public InsufficientFund() {
		super ("insufficient balance");
	}
}
