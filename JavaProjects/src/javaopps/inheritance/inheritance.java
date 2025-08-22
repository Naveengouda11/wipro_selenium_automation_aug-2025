package javaopps.inheritance;

class A {
	int number1 =10;
}
class B extends A{
	int number2 = 30;
	int res;
	
	void add() {
		res = number1 +number2;
		System.out.println("Result is : " + res);
	}
}

public class inheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.add();

	}

}
