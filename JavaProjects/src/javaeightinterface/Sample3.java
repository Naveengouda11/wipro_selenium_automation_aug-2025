package javaeightinterface;

interface MyData {
	default void display(String msg) {
		if(!isNull(msg)) {
			System.out.println("Message is : " + msg);
		}else {
			System.out.println("Message is Null");
		}
		 
	}
	
	static boolean isNull(String msg) {
		return msg == null ? true: "".equals(msg) ? true : false;
	}
}

public class Sample3 implements MyData{

	public static void main(String[] args) {
		
		Sample3 ob = new Sample3();
		ob.display("Welocome Naveen to the Wipro");

	}

}
