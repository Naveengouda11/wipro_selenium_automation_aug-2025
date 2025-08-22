package javagenerics;

import java.util.ArrayList;
// Array List witout generics

public class Sample3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Alex");
		al.add("Bob");
		al.add(30); // Which give classcast exception to to String type cant be cast to integer
		
		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
		String s3 = (String) al.get(2); // String to int t
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
