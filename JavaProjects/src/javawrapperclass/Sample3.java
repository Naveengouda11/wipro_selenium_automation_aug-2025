package javawrapperclass;

import java.util.ArrayList;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'a';
		Character character = ch;
		
		ArrayList<Character> al = new ArrayList<Character>();
		al.add(character);
		System.out.println(al.get(0));
		
	}

}
