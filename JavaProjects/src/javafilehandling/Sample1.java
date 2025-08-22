package javafilehandling;

import java.io.File;
import java.io.IOException;

public class Sample1 {

	public static void main(String[] args) {
		File obj = new File("info.txt");
		System.out.println("File Created");
		
		try {
			if(obj.createNewFile()) {
				System.out.println("File Created : " + obj.getName());
			}else {
				System.out.println("File Already Exsisted");
			}
		}catch (IOException i) {
			i.printStackTrace();
		}

	}

}
