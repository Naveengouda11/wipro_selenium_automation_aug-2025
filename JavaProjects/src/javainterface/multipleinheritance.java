package javainterface;

interface I2 {
	void addition();
}
interface I3{
	void substraction();
}


public class multipleinheritance implements I2,I3{
public void addition() {
	System.out.println("Addition Function");
}
public void substraction() {
	System.out.println("substraction Function");
}
	public static void main(String[] args) {
		multipleinheritance ob = new multipleinheritance();
		ob.addition();
		ob.substraction();

	}

}
