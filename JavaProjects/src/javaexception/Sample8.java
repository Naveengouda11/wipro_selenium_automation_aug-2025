package javaexception;

class InvalidAgeException extends Exception {
	public InvalidAgeException (String msg) {
		super(msg);
	}
}
public class Sample8 {
	static void validate(int age) throws Exception{
		if(age<=18) {
			throw new InvalidAgeException("Age Must be above 18");
		}
	}

	public static void main(String[] args) {
		try {
			validate(17);
		}catch (Exception e) {
			System.out.println("Exception "+ e);
		}

	}

}
