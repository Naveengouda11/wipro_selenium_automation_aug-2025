package javaThreads;

class Task extends Thread{
	private Thread t;
	private String tname;
	
	Task(String name) {
		tname = name;
		System.out.println("Creating " + tname);
	}
	public void run() {
		System.out.println("Running " + tname );
		try {
			for(int i=4;i>0;i--) {
				System.out.println("Thread: " + tname + i);
				Thread.sleep(50);
			}
	}catch(InterruptedException ex) {
		System.out.println("Thread " + tname + " interrupted.");
	}
		System.out.println("Thread " + tname + " exiting.");
	
}

}

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1 = new Task("Thread -1");
		t1.start();
		
		Task t2 = new Task("Thread -2");
		t2.start();

	}

}
