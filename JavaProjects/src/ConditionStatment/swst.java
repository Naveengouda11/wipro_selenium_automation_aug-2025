package ConditionStatment;

import java.util.Scanner;

public class swst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		
		switch(day) {
		case "one" :
			System.out.println("Monday");
			break;
			
		case "two" :
			System.out.println("Tuseday");
			break;
			
		case "three" :
			System.out.println("Wednesday");
			break;
			
		case "four" :
			System.out.println("Thursday");
			break;
			
		case "five" :
			System.out.println("Firday");
			break;
			
		case "six" :
			System.out.println("Saturday");
			break;
			
		case "seven" :
			System.out.println("Sunday");
			break;
		default:System.out.println("Enter the number between 1 to 7");
			
			
		}
		

	}

}
