package javaeightinterface;

interface I2 {
	void m2();
	
	default void log(String msg) {
		System.out.println("I2 log msg:: " + msg);
	}
}

public class Sample2 implements I1,I2{
	
	public void m() {
		System.out.println("Method invoked!!!");
	}

	public void m2() {
		System.out.println("Method invoked!!!");
	}
	public void log(String msg) {
		System.out.println("Sample2 log::" + msg);
	}
	public static void main(String[] args) {
		Sample2 obj = new Sample2();
		
		obj.m();
		obj.m2();
		obj.log("Start from a sample2 Program");

	}

}
