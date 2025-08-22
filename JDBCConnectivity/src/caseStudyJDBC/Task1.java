package caseStudyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/wiprodb";
		String uname = "root";
		String pass = "Naveengouda@3346";
		Connection con = null;
		
		String[][] student = {
	            {"John", "Doe", "2002-05-14", "john.doe@example.com", "9876543210", "123 Main St"},
	            {"Alice", "Smith", "2001-04-12", "alice.smith@example.com", "9123456780", "456 Oak St"},
	            {"Bob", "Brown", "2000-10-10", "bob.brown@example.com", "9988776655", "789 Pine St"},
	            {"Clara", "Jones", "1999-07-25", "clara.jones@example.com", "8877665544", "321 Maple St"},
	            {"David", "Wilson", "2003-01-30", "david.wilson@example.com", "7766554433", "654 Cedar St"}
	        };
		
		String[][] courses = {
	            {"Web Development", "Learn HTML, CSS, JavaScript", "4"},
	            {"Data Structures", "Learn arrays, linked lists, trees", "3"},
	            {"Database Systems", "Learn SQL, normalization, indexing", "4"}};
		
		String[][] enrollments = {
			    {"1", "1", "A"},
			    {"2", "2", "B"},
			    {"3", "1", "C"}
			};
//		Creation And Insertion to the Student table
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pass);
			System.out.println("Connected to Database!");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			String sql = "INSERT INTO Student(first_name,last_name,dob,email,phone,address) VALUES (?,?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			
			for(String[] stu : student) {
				st.setString(1, stu[0]);
				st.setString(2, stu[1]);
				st.setString(3, stu[2]);
				st.setString(4, stu[3]);
				st.setString(5, stu[4]);
				st.setString(6, stu[5]);
				
				st.executeUpdate();
				System.out.println("Record is inserted");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
//		Creation And Insertion to the Course table
		try {
			String sql = "INSERT INTO Courses(course_name,course_description,credits) VALUES(?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			for(String[] course : courses) {
			st.setString(1, course[0]);
			st.setString(2, course[1]);
			st.setInt(3, Integer.parseInt(course[2]));
			 
			st.executeUpdate();
			
			System.out.println("Recoed Saved");
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
//		Creation And Insertion to the Enrollment table
		try {
			String sql = "INSERT INTO enrollments(student_id,course_id,enrollment_date,grade) values(?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			
			for(String[] enroll : enrollments) {
				st.setInt(1, Integer.parseInt(enroll[0]));
				st.setInt(2,Integer.parseInt(enroll[1]));
				st.setDate(3, new java.sql.Date(System.currentTimeMillis()));
				st.setString(4, enroll[2]);
				
				st.executeUpdate();
				System.out.println("Recorded saved");
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		Read Operation for Student table
		try {
			String sql = "SELECT *  from student";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("student_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String dob  = rs.getString("dob");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				
				System.out.println(id + " " + firstName + " " + lastName + " " + dob + " " + email + " " +phone + " " +address);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
//		Update Operation 
		try {
			String sql = "UPDATE student SET phone = ? where student_id = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, "9999999999");
			st.setInt(2, 1);
			
			int rowUpdate = st.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}

//		Delete Operation
		try {
			String sql = "DELETE From enrollments where enrollment_id = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, 1);
			
			int rowDeleted = st.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
