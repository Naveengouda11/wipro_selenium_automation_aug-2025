package Arrays;

public class Sample2 {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Naveen";
		names[1] = "Bhee";
		names[2] = "Alice";
		names[3] = "Bob";
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		for(String i : names) {
			System.out.println(i);
		}
		

	}

}
