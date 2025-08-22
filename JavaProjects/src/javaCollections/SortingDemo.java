package javaCollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Zeo");
		al.add("Alex");
		al.add("Tony");
		al.add("Paul");
		al.add("Jack");
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);

	}

}
