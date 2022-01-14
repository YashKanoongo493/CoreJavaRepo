package concurrency_Threads;

public class RunnableInterface extends HelloWithThread implements Runnable {

	public RunnableInterface(String n) {
		super(n);
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
			//System.out.println("Hello From Thread");
		}
		

	}

	public static void main(String[] args) {
		HelloWithThread t1 = new HelloWithThread("YASH");
		HelloWithThread t2 = new HelloWithThread("KAPIL");
		
		Thread th = new Thread(t1);
		Thread tt = new Thread(t2);
		th.start();
		tt.start();
	}

}
