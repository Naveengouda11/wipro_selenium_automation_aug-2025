package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class DBConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/wiprodb";
		String uname = "root";
		String pwd = "Naveengouda@3346";
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connected to db");
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
		try {
			String sql = "INSERT INTO users(username,password) VALUES (?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Daniel");
			stmt.setString(2, "123456");
			stmt.executeUpdate();
			System.out.println("Record is Saved");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			String sql = "Select * from users";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				System.out.println(id + " " + username + " " + password);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
