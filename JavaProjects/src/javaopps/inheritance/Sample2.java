package javaopps.inheritance;

class A1 {
	int num1 = 10;
}
class B1 extends A1{
	int num2 = 20;
}
class C extends B1{
	int num3 = 30;
	
	void add() {
		int res;
		res = num1+num2+num3;
		System.out.println("Result is : " + res);
	}
}

public class Sample2 {
	public static void main(String[] args) {
		C obj = new C();
		obj.add();
	}

}
