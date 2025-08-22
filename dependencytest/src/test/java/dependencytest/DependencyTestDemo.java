package dependencytest;

import org.testng.annotations.Test;

public class DependencyTestDemo {
	
	@Test
	public void startApp() {
		System.out.println("App Started");
	}
	
	@Test(dependsOnMethods = {"startApp"})
	public void login() {
		System.out.println("Logged in");
	}
	
}
