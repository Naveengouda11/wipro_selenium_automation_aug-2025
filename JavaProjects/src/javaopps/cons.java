package javaopps;

class Student {
	int s_id;
	String name;
	
	Student() {
		s_id = 101;
		name = "Naveen";
		System.out.println("This is Default constructor is being excecuted");
	}
	void getinfo() {
		System.out.println(s_id + " " + name);
	}
}

public class cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sobj = new Student();
		sobj.getinfo();

	}

}
