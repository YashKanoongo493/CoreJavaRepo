package concurrency_Threads;

public class HelloWithThread extends Thread {

private String name;

public HelloWithThread() {}

public HelloWithThread(String threadName) {
	name = threadName;
	
}
public void run(){
	for (int i = 0; i < 50; i++) {
		System.out.println(i+" "+" "+name);
	}
}

}
