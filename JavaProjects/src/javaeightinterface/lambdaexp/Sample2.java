package javaeightinterface.lambdaexp;

interface ZeroParameter {
	void display();
}

public class Sample2 {

	public static void main(String[] args) {
		ZeroParameter obj  = () -> System.out.println("No Parametar");
		obj.display();

	}

}
