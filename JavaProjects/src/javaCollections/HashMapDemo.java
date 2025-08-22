package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Alex");
		hm.put(2, "Bob");
		hm.put(3, "Jhon");
		hm.put(4, "Paul");
		
		System.out.println("Value for 1 : " + hm.get(1));
		
		for(Map.Entry<Integer, String> e: hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
