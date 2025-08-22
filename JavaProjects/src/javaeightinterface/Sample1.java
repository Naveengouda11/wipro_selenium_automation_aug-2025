package javaeightinterface;

interface I1 {
	void m();
	default void log(String msg) {
		System.out.println("I1 log:: " + msg);
	}
}

public class Sample1 implements I1{
public void m() {
	System.out.println("Method is invoked!!");
}
	public static void main(String[] args) {
		
		Sample1 ob = new Sample1();
		ob.log("Start the Program");
		ob.m();
	}

}
