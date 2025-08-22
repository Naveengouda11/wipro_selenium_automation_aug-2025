package javaexception;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 20;
int div = 0;
try {
	int res = num / div;
	System.out.println(res);
    }catch(ArithmeticException e) {
	System.out.println("Excption occured can't divide by zero  ");
}
	}

}
