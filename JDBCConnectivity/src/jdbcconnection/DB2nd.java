package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class DB2nd {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/wiprodb";
		String uname = "root";
		String pwd = "Naveengouda@3346";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pwd);
			String sql = "insert into users(username,password) values(?,?)";
			java.sql.CallableStatement cs= con.prepareCall(sql);
			cs.setString(1, "jack");
			cs.setString(2, "98765");
			cs.execute();
			System.out.println("recored saved sucessfully");
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		}

	}

}
