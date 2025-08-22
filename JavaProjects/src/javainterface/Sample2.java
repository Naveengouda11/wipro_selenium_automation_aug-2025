package javainterface;

//anonymous inner class

interface Microphone{
	void valume();
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microphone obj = new Microphone() {
			
			@Override
			public void valume() {
				System.out.println("Volum is high!!!");
				
			}
		};
		obj.valume();

	}

}
