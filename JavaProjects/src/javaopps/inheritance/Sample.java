package javaopps.inheritance;

class a4 {
	double pi = 3.142;
}
class b4 extends a4 {
	void area_of_circle() {
		double res;
		res = 2 * pi * 5;
		System.out.println("Area os Circle :" + res);
	}
}
class c4 extends a4 {
	void area_of_surface() {
		double res;
		res = 4 * pi * 5;
		System.out.println("Surface of the : " + res);
	}
}
class d4 extends c4 {
	
}

public class Sample {

	public static void main(String[] args) {
		b4 obj = new b4();
//		obj.area_of_circle();
		

	}

}
