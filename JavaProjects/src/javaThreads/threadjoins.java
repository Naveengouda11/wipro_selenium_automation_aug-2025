package javaThreads;

class Task2 implements Runnable {
	Task2(){
		System.out.println("Thread : " + Thread.currentThread().getName() + ", " + "State : New");
	}
	public void run() {
		System.out.println("Thread : " +Thread.currentThread().getName() + ", " + " State : Running");
		for(int i=4;i>0;i--) {
			System.out.println("Thread : " + Thread.currentThread().getName() + ", " + i);
			
		}
		System.out.println("Thread : " + Thread.currentThread().getName() + ", " + "State: Dead");
	}
}

public class threadjoins {

	public static void main(String[] args) throws InterruptedException {
		Thread tobj1 = new Thread(new Task2(), "Scanning");
		Thread tobj2 = new Thread(new Task2(), "Printing");
		Thread tobj3 = new Thread(new Task2(), "Counting");
		
		tobj1.start();
		tobj1.join();
		tobj2.start();
		tobj2.join();
		tobj3.start();

	}

}
