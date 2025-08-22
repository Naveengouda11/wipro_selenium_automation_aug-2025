package javaCollections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("Alex");
		stack.push("Bob");
		stack.push("Jhon");
		stack.push("Cleark");
		stack.push("Rock");
		
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		System.out.println("");
		
		stack.pop();
		System.out.println("-----------");
		
		 itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}

}
