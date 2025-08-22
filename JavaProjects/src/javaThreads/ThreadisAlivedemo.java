package javaThreads;

public class ThreadisAlivedemo extends Thread{
	
	public void run() {
		System.out.println("Thread is running: ");
		try {
		Thread.sleep(300);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thread Execution is Done");
	}

	public static void main(String[] args) {
		ThreadisAlivedemo tob1 = new ThreadisAlivedemo();
		ThreadisAlivedemo tob2 = new ThreadisAlivedemo();
		
		tob1.start();
		tob2.start();
		
		System.out.println(tob1.isAlive());
		System.out.println(tob2.isAlive());

	}

}
