package javaopps.polymorhism;

class cal {
	void add(int a,int b) {
		int res = a + b;
		System.out.println("Sum of numbers is : " + res);
	}
	
	void add(double a,double b) {
		double res = a + b;
		System.out.println("Sum of numners is : " + res);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		cal ob = new cal();
		ob.add(20.5, 10);
		ob.add(20, 30);

	}

}
