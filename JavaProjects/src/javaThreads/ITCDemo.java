package javaThreads;

class Chat {
	boolean flag = false;
	public synchronized void Question(String msg) {
		if(flag) {
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag = true;
		notify();
	}
	public synchronized void Answer(String msg) {
		if(!flag) {
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag = false;
		notify();
	}
	}
	

class Task3 implements Runnable{
	Chat m;
	String s1[] = {"Hi","How are you? "," I am also doing fine"};
	

	@Override
	public void run() {
		for(int i=0;i<s1.length;i++) {
			m.Question(s1[i]);
		}
		
	}
	public Task3 (Chat m) {
		this.m = m;
		new Thread(this,"Question").start();
		
	}
	
}
class Task4 implements Runnable{
	Chat m;
	String s2[] = {"Hello","I am fine , What about you ?"," Great!!"};
	

	@Override
	public void run() {
		for(int i=0;i<s2.length;i++) {
			m.Answer(s2[i]);
		}
		
	}
	Task4 (Chat m) {
		this.m = m;
		new Thread(this,"Answer").start();
		
	}
	
}


public class ITCDemo {

	public static void main(String[] args) {
		Chat c = new Chat();
		
		new Task3(c);
		new Task4(c);
		

	}

}
