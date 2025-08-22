package javaCollections;

import java.util.Arrays;

class Number implements Comparable<Number> {
	
	int v;



	Number(int v) {
		this.v = v;
	}
	
	

	@Override
	public String toString() {
		return String.valueOf(v);
	}

	@Override
	public int compareTo(Number o) {
		
		return this.v -o.v;
	}
	
}

public class ComparableInterfaceDemo {

	public static void main(String[] args) {
		Number[] n = {new Number(4),new Number(7),new Number(1),new Number(9),new Number(3),new Number(5),};
		System.out.println("Before Sorting: " + Arrays.toString(n));
		Arrays.sort(n);
		System.out.println("After Sorting: " + Arrays.toString(n));
		

	}

}
