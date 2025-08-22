package javaexception;

public class Sample7 {
	
	private static int divide(int a,int b) throws Exception {
		if(b == 0) {
			throw new Exception("Second argument can't be zero");
		}
		return a/b;
	}
	

	public static void main(String[] args) {
		
		int a = 5;
		int b =0;
		
		try {
			System.out.println("Result : " + divide(a,b));
		}catch (Exception e) {
			System.out.println("Exception " + e);
		}

	}

}
