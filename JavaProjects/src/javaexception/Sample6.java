package javaexception;

public class Sample6 {

	public static void main(String[] args) {
		int num = 10;
		int div= 0;
		
		try {
			System.out.println(num/div);
		}catch(Exception e) {
			System.out.println("Exception occured"+e.getMessage());
		}finally {
			System.out.println("Finally block is executed");
		}

	}

}
