package multithread;

import org.testng.annotations.Test;

public class MultiThreadTask {

	@Test(threadPoolSize = 3, invocationCount = 6 ,timeOut = 1000)
	public void testMultiThread() {
		
		System.out.println("Thread ID: " + Thread.currentThread().getId());
	}
}
