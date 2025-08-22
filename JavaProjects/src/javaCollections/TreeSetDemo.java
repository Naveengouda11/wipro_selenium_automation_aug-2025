package javaCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Alex");
		ts.add("Sunny");
		ts.add("Bob");
		ts.add("Alex");
		ts.add("John");
		
		Iterator<String> itr = ts.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
