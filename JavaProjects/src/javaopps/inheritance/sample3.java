package javaopps.inheritance;

class a3 {
	String shape;
}
class b3 extends a3 {
	void circle() {
		shape = "Circle";
		System.out.println("Shape is : " + shape);
	}
}

class c3 extends b3 {
	void rect() {
		shape = "Rectangle";
		System.out.println("Shape is : " + shape);
	}
}
class d3 extends c3 {
	void sq() {
		shape = "Square";
		System.out.println("Shape is : " + shape);
	}
}
public class sample3 {

	public static void main(String[] args) {
		b3 obj = new b3();
		obj.circle();
		
		c3 obj1 = new c3();
		obj1.rect();
		
		d3 obj2 = new d3();
		obj2.sq();
		

	}

}
