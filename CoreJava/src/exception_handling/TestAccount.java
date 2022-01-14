package exception_handling;

public class TestAccount {
	public static void main(String[] args) {

		Account ab= new Account();
		ab.setNumber("12345678990");
		ab.setType("Current account");
		

		
		
		System.out.println("AccountNo "+ ab.getNumber());
		System.out.println("AccountType "+ ab.getType());
		System.out.println("AccountBal " +ab.getBalance());

	try {	
		ab.deposit(1);
		ab.setBalance(5000);
		ab.withdrawl(4700);
		
		
		auth(ab.getBalance());

		System.out.println(ab.getBalance());
	}catch(InsufficientFund e) {
		System.out.println(e.getMessage());
		
	}
}

	private static void auth(double balance) throws InsufficientFund {
		// TODO Auto-generated method stub
		if(balance<=500) {
			InsufficientFund f = new InsufficientFund();
		throw f;
		//throw new InsufficientFund();
	}
	
}
}
