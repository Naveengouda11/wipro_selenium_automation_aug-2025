package javafilehandling;

import java.io.File;

public class Sample4 {

	public static void main(String[] args) {
		File obj = new File("info.txt");
		
		if(obj.delete()) {
			System.out.println("File deleted : " + obj.getName());
		}else {
			System.out.println("File Not Found");
		}

	}

}
