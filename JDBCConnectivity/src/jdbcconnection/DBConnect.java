package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/wiprodb";
		String username = "root";
		String password = "Naveengouda@3346";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to DB!");
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
