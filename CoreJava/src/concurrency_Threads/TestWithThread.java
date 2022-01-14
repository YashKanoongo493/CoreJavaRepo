package concurrency_Threads;

public class TestWithThread {
public static void main(String[] args) {
	
	HelloWithThread t1 = new HelloWithThread("KAPIL");
	HelloWithThread t2 = new HelloWithThread("MALVIYA");
	
	t1.start();
	t2.start();
	
	
t1.setPriority(10);
t2.setPriority(1);
	//for (int i = 0; i < 500; i++) {
		//System.out.println("Main Thread");
	//}
}
}
