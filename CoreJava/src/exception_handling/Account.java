package exception_handling;

public class Account {

	private String number;
	private String type;
	private double balance;
	String getNumber() {
		return number;
	}
	void setNumber(String number) {
		this.number = number;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdrawl(double w)
	
	{
		balance = balance-w;
		System.out.println("My Balance"+ balance);
	}
	public void deposit(double d) {
	balance = balance+d;
	System.out.println("My Balance"+ balance);
    }
}
