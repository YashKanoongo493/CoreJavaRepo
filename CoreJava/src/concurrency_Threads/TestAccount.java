package concurrency_Threads;

public class TestAccount extends Thread {

	public static Account acc = new Account();

	private String name;

	public TestAccount(String n) {
		this.name = n;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			acc.deposit(name, 1000);
		}
	}

	public static void main(String[] args) {
		TestAccount t1 = new TestAccount("Yash");
	    TestAccount t2 = new TestAccount("Kapil");
	    
	    t1.start();
	    t2.start();
	}
}
