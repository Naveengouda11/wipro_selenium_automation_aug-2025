package javagenerics;

import java.util.ArrayList;

public class Sample4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Alex");
		al.add("Bob");
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}

		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
//		String s3 = (String) al.get(2); // String to int t
		
		System.out.println(s1);
		System.out.println(s2);
//		System.out.println(s3);
	}

}
