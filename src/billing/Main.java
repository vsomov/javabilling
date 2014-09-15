package billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		System.out.println("Accessing database...");
		try {
//			new com.mysql.jdbc.Driver();
			Class.forName("com.mysql.jdbc.Driver").newInstance();
// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing?user=root&password=");
			
// move connectors to the separate class, compile .jar from the command line, create .bat tool for the users. 			
			String connectionUrl = "jdbc:mysql://localhost:3306/billing";
			String connectionUser = "root";
			String connectionPassword = "";
			conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users");
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String balance = rs.getString("balance");
				System.out.println("ID: " + id + ", First Name: " + name
						+ ", Last Name: " + balance);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		System.out.println("Done reading from the database.");
	}
}