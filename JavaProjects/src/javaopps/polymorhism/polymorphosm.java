package javaopps.polymorhism;


class calculation {
	void addition(int a,int b) {
		int res = a + b;
		System.out.println("Sum of numbers : " + res);
	}
	void addition(int a,int b,int c) {
		int res = a + b + c;
		System.out.println("Sum of numbers : " + res);
	}
}

public class polymorphosm {

	public static void main(String[] args) {
		calculation obj = new calculation();
		obj.addition(10, 20);
		obj.addition(10, 20, 30);

	}

}
