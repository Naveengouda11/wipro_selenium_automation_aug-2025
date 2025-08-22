package javaCollections;

import java.util.ArrayDeque;

//Dequeue Adding and removing element from both end in queue
public class DqDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		System.out.println(dq);
		
		dq.clear();
		dq.addFirst(50);
		dq.addFirst(51);
		dq.addLast(31);
		dq.addLast(29);
		System.out.println(dq);
		

	}

}
