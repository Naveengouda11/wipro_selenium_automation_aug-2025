package javawrapperclass;

public class Sample1 {

	public static void main(String[] args) {
//		Primitive data type
		int number;
//		Integer Wrapper type
		Integer number1;
		
		number = 200;
//		Auto Boxing: converting primitive int to Integer object
		number1 = number;
		
		
		System.out.println("The peimitive int number is: " +number);
		System.out.println("The integer Object number1 is: " + number1);
		

	}

}
