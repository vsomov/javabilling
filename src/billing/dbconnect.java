package billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnect {
	public Connection run(String database, String dbuser, String dbpassword){
//		public Connection run(String database, String dbuser, String dbpassword){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
//			new com.mysql.jdbc.Driver();
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing?user=root&password=");
			
// move connectors to the separate class, compile .jar from the command line, create .bat tool for the users. 			
//			String database = "jdbc:mysql://localhost:3306/billing";
			conn = DriverManager.getConnection(database, dbuser, dbpassword);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
