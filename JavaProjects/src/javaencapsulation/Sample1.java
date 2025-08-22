package javaencapsulation;

public class Sample1 {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setemp_id(101);
		obj.setemp_name("Alice");
		obj.setEmp_email("alice@gmail.com");
		
		System.out.println(obj.getemp_id() + " " + obj.getemp_name() + " " + obj.getEmp_email());
		System.out.println(obj);

	}

}
