package concurrency_Threads;

public class Account {

	private int balance;
	
	//public synchronized void deposit(String msg, int amt) {   type 1 synchronization
		
		public void deposit(String msg, int amt) {
			
		 synchronized (this) {
			 int bal = getBalance();
				setBalance(bal+amt);
				System.out.println(msg+" "+" balance:  "+getBalance());
		}
		
	}
	
	public int getBalance() {
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
