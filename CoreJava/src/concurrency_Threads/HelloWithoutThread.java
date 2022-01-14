package concurrency_Threads;

public class HelloWithoutThread {

	String name;
	
	public HelloWithoutThread() {}
	
	public HelloWithoutThread (String threadName) {
		name = threadName;
		
	} 
 public void run() {
	 for (int i = 0; i < 50; i++) {
		 System.out.println(i+" "+"Hello Thread"+" "+name);
		
	}
 }
}
