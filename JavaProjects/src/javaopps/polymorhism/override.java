package javaopps.polymorhism;

class A {
	void add(int a, int b) {
		int res = a+b;
		System.out.println("Sum of numbers is : " + res);
	}
	
	
}
class B extends A {
	void add(int a,int b) {
		int res = a + b;
		System.out.println("Sum of numbers : "  + res);
	}
}

public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob = new B();
		ob.add(10,30);

	}

}
