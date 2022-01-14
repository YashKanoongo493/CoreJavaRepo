package concurrency_Threads;

public class TestWithoutThread {
public static void main(String[] args) {
	
	HelloWithoutThread t1 = new HelloWithoutThread("Kapil");
	HelloWithoutThread t2 = new HelloWithoutThread("Mayank");
	
	t1.run();
	t2.run();
}
}
