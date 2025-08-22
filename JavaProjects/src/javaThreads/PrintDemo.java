package javaThreads;

public class PrintDemo {
	public void PrintCount() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Counter " + i);
			}
		}catch (Exception e) {
			System.out.println("Thread Interrupted");
		}
	}
	
	class Task2 extends Thread {
		private Thread t;
		private String tName;
		PrintDemo PD;
		
		Task2(String tName,PrintDemo PD) {
			this.tName = tName;
			this.PD = PD;
			
		}
		public void run() {
			synchronized (PD) {
				PD.PrintCount();
			}
			PD.PrintCount();
			System.out.println("Thread " + tName + " existing.");
		}
		public void start() {
			System.out.println("Thread is Starting...");
			if(t == null) {
				t = new Thread(this,tName);
				t.start();
			}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDemo PD = new PrintDemo();
		PrintDemo.Task2 t1 = PD.new Task2("Thread - 1", PD);
		PrintDemo.Task2 t2 =PD.new Task2("Thread - 2 ", PD);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch (Exception e) {
			System.out.println("Interupted");
		}

	}

}
