package listenerstest;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed : " + result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed : " + result.getName());
	}
}
