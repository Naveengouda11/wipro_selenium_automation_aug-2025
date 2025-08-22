package testngdemo;

import org.testng.annotations.Test;

public class TestNGDemoGrp {
@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("test1 case Execution");
	}
@Test(groups = {"sanity"})
public void test2() {
	System.out.println("test2 case Execution");
	}

@Test(groups = {"regression"})
public void test3() {
	System.out.println("test3 case Execution");
}

@Test(groups = {"smoke","regression"})
public void test4() {
	System.out.println("test4 case Execution");
}
}
