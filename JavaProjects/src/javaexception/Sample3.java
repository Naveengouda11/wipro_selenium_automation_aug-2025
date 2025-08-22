package javaexception;

public class Sample3 {

	public static void main(String[] args) {
		String name = null;
		
		try {
			System.out.println(name.length());
		}catch(NullPointerException n) {
			System.out.println("Null pointer exception is occured");
		}

	}

}
