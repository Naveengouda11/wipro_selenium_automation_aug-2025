package javafilehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Sample2 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("info.txt");
			writer.write("Learning File Handling in Java");
			writer.close();
			System.out.println("Sucessfully Written...");
			
		}catch (IOException e) {
			System.out.println("An error Occured...");
			e.printStackTrace();
		}

	}

}
