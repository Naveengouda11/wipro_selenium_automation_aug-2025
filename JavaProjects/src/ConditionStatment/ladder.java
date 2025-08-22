package ConditionStatment;

import java.util.Scanner;

public class ladder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int per = sc.nextInt();
		
		if(per >=85 && per <=100) {
			System.out.println("FCD !");
		}else if(per >=35 && per <85) {
			System.out.println("First Class");
		}else if(per>=0 && per <35) {
			System.out.println("Fail");
		}else {
			System.out.println("Enter the percentage between 1 to 100");
		}

	}

}
