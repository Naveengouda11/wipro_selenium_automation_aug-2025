package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
	int rollNo;
	String name;
	
	Student(int rollNo,String name) {
		this.rollNo = rollNo;
		this.name = name;
		
	}
	
	public String toString() {
		return rollNo + " " + name;
	}
}

class SortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.rollNo - o2.rollNo;
	}
	
}

public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		
		List<Student> sObj = new ArrayList<>();
		sObj.add(new Student(110, "Paul"));
		sObj.add(new Student(130, "Alex"));
		sObj.add(new Student(101, "Jack"));
		sObj.add(new Student(150, "Jhon"));
		sObj.add(new Student(120, "Rock"));
		
		Collections.sort(sObj,new SortByRollNo());
		System.out.println("Sorted All numbers :");
		
		Iterator<Student> itr = sObj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
