package concurrency_Threads;

public class TimeThread extends HelloWithThread {

	private String name;

	public TimeThread() {
	}

	public TimeThread(String n) {
		name = n;
	}

	public void run() {

		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i + " " + name);
		}
	}
	public static void main(String[] args) {
		
		TimeThread t1 = new TimeThread("YASH");
		TimeThread t2 = new TimeThread("Kanoongo");
		
		t1.start();
		t2.start();
	}
}
