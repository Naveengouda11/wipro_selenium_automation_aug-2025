package javaThreads;

public class SampleThread2 implements Runnable{
//	Using Runnable interface
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleThread2 obj = new SampleThread2();
		Thread t1 = new Thread(obj);
		t1.start();

	}

}
