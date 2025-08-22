package javaeightinterface.lambdaexp;

interface FuncInterface {
	void abstractFunc(int x);
	
	default void func() {
		System.out.println("Default Func");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		FuncInterface obj= (int x) -> System.out.println(2 * x);
		obj.abstractFunc(5);

	}

}
