package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/wiprodb";
		String username = "root";
		String password = "Naveengouda@3346";
		
		String sql = "INSERT INTO Students(name,email) VALUES (?,?)";
		
		try(
				Connection con = DriverManager.getConnection(url,username,password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setString(1, "Alice Rock");
			pstmt.setString(2, "alice@gmail.com");
			
			int rowInserted = pstmt.executeUpdate();
			
			if(rowInserted > 0) {
				System.out.println("Student inserted sucessfully!");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
