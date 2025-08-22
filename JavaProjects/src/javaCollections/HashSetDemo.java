package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Alex");
		hs.add("Bob");
		hs.add("John");
		hs.add("Sunny");
		hs.add("Alex");
		hs.add("bob");
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
