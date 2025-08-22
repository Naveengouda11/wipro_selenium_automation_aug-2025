package javainterface;

interface I1 {
	void educationalloan();
	void personalloan();
}

class sbi implements I1 {
	public void educationalloan() {
		System.out.println("Rate of interest for educational loan : 7%");
		
	}
	public void personalloan() {
		System.out.println("Rate of interest for personal loan : 11%");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		I1 ob = new sbi();
		ob.educationalloan();
		ob.personalloan();
		

	}

}
