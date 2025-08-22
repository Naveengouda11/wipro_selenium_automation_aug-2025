package Arrays;

public class sample1 {

	public static void main(String[] args) {
		int marks[] = {99,98,95,92,30};
		System.out.println(marks.length);
		System.out.println(marks[2]);
		
//		For Loop
		
		System.out.println("------------");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
//		For Each
		System.out.println("------------");
		for (int i : marks) {
			System.out.println(i);
		}

	}

}
