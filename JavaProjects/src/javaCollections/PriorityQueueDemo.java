package javaCollections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(20);
		pq.add(15);
		
//		Printitng the top element of the priorityqueue
		System.out.println("Printing Top element");
		System.out.println(pq.peek());
		
//		Removing the top element from the priorityqueue
		System.out.println("Remving the top element");
		System.out.println(pq.poll());
		
		System.out.println("Printing the top element in the natural order");
		System.out.println(pq.peek());
	}

}
