package concurrency_Threads;

import java.lang.System.Logger;

public class ThreadInfo {
	public static void main(String[] args) {
		Thread t = new Thread("My Thread");
		log(" ", t);
	}

	private static void log(String indent, Thread t) {

		System.out.println(indent + "Thread Name" + t.getName());
		System.out.println(indent + "ID "+t.getId());
		System.out.println(indent+ "prioroty "+t.getPriority());
		System.out.println(indent+ "state "+t.getState());
		System.out.println(indent+ "ThreadGroup "+t.getThreadGroup().getName());
		System.out.println(indent+ "Is Alive "+t.isAlive());
		System.out.println(indent+ "Is Deamon "+t.isDaemon()+"\n");

	}
}
