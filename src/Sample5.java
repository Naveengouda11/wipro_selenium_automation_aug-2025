import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class Sample5 {
	
	static int addition(int a,int b) {
		int res = a + b;
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Num2 : ");
		int num2 = sc.nextInt();
		int res;
		res = addition(num1,num2);
		System.out.println("Sum of Two Numbers : " + res);
		

	}

}
