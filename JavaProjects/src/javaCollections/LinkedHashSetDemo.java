package javaCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Alex");
		lhs.add("Bob");
//		lhs.add("bob");
		lhs.add("Alex");
		lhs.add("John");
		lhs.add("Sunny");
		
		
		
		Iterator<String> itr = lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
