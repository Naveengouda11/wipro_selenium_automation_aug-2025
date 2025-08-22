package Javaloops;

import java.util.Scanner;

public class SumofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum += i;
			
		}
System.out.println("Sum : " + sum);
	}

}
