package javafilehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Task implements Serializable {
	int num;
	String name;
	public Task(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

}

public class SerializationDemo {

	public static void main(String[] args) {
		
		Task tobj = new Task(101, "Paul");
		String filename = "my_file";
		
		try {
		FileOutputStream f = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(f);
		out.writeObject(tobj);
		out.close();
		System.out.println("Object is serialized");
	}catch (IOException e) {
		e.printStackTrace();
	}
		
//		Deserilization
		Task tobj1 = null;
		try {
			FileInputStream fis= new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fis);
			tobj1 = (Task) in.readObject();
			fis.close();
			in.close();
			System.out.println("Object Has been de serialized");
			System.out.println("Number : " + tobj.num);
			System.out.println("Name : " + tobj1.name);
			
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
