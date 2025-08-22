package javaeightinterface.lambdaexp;

interface Calculation {
	
	int operation(int x,int y);
		
}

public class Sample3 {

	public static void main(String[] args) {
		
		Calculation add =(x,y) -> x + y;
		Calculation sub = (x,y) ->x - y;
		Calculation mul = (x,y) ->x * y;
		Calculation div = (x,y) ->x / y;
		
		System.out.println(add.operation(10, 20));
		System.out.println(sub.operation(20, 10));
		System.out.println(mul.operation(2, 5));
		System.out.println(div.operation(5, 2));
		

	}

}
