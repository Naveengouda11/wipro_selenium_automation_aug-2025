package javaencapsulation;

public class Employee {
	private int emp_id;
	private String emp_name;
	private String Emp_email;
	
	void setemp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	int getemp_id() {
		return emp_id;
	}
	
	void setemp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	String getemp_name() {
		return emp_name;
	}
	
	void setEmp_email(String Emp_email) {
		this.Emp_email = Emp_email;
	}
	
	String getEmp_email() {
		return Emp_email;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", Emp_email=" + Emp_email + "]";
	}

}
