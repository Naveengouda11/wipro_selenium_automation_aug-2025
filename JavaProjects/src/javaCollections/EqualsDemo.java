package javaCollections;

class Employee {
	int emp_id;
	String emp_name;
	
	
	public Employee(int emp_id,String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		
		if(obj == null || obj.getClass()!= this.getClass())
			return false;
		
		Employee employee = (Employee) obj;
		return (employee.emp_name == this.emp_name && employee.emp_id == this.emp_id);
	
	}
	public int hashCode() {
		return this.emp_id;
	}
}

public class EqualsDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Alex");
		Employee emp2 = new Employee(101, "Alex");
		
		if(emp1.hashCode() == emp2.hashCode()) {
			if(emp1.equals(emp2)) {
				System.out.println("Both Object are Equal");
			}else {
				System.out.println("Both Object are not equal");
			}
		}else {
			System.out.println("Both Objects are not equal");
		}

	}

}

