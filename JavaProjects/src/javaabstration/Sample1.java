package javaabstration;

abstract class RBI {
//	Non abstract Method
	void studentlone() {
		System.out.println("The rate of interest for educational loan 5%");
	}
//	Abstract method
	abstract void personalloan();	
}

class HDFC extends RBI {
	void personalloan() {
		System.out.println("Rate of interest is for personal loan:8%");
	}
}
class KarnatakaBank extends RBI {
	void personalloan() {
		System.out.println("Rate of interest is for personal loan:9%");
	}
}



public class Sample1 {

	public static void main(String[] args) {
		KarnatakaBank obj = new KarnatakaBank();
		obj.studentlone();
		obj.personalloan();

	}

}
