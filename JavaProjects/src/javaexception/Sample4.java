package javaexception;

public class Sample4 {

	public static void main(String[] args) {
		int marks[] = {89,58,75,96,100};
		System.out.println("Begin");
		try {
		System.out.println(marks[5]);
		}catch(ArrayIndexOutOfBoundsException arr) {
			System.out.println("ArrayIndex Out of bound exception occured!");
		}

		System.out.println("End");
	}

}
