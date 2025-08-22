package javaopps;

class Employee{
	
	int e_id;
	String e_name;
	
	 Employee() {
		System.out.println("Default constructor is executed");
		
	}
	 Employee(int e_id,String e_name) {
		 this.e_id = e_id;
		 this.e_name = e_name;
	 }
	 
	 void getinfo() {
		 System.out.println(this.e_id + " " + this.e_name);
	 }
	
}

public class paracons {

	public static void main(String[] args) {
		Employee eobj = new Employee(101 , "Name");
		eobj.getinfo();
		Employee eobj1 = new Employee(102 ,"Bob");
		eobj1.getinfo();
				

	}

}
