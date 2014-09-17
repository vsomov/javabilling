package billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class Main {
	public static void main(String[] args) throws SQLException {
		
		Properties prop = new Properties();
//		Properties mainprops = null;
//    	InputStream input = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		loadprops lp = new loadprops();
		dbconnect dbc = new dbconnect();
		System.out.println("Accessing database...");

		prop = lp.run();
		
	    conn = dbc.run(prop.getProperty("database"), prop.getProperty("dbuser"), prop.getProperty("dbpassword"));
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users");
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String balance = rs.getString("balance");
				System.out.println("ID: " + id + ", First Name: " + name
						+ ", Last Name: " + balance);
			}

      System.out.println(prop.getProperty("database"));
//      System.out.println(prop.getProperty("dbuser"));
//      System.out.println("Password " + (prop.getProperty("dbpassword")));

//		try {
			 
//    		String filename = "config.properties";
//    		input = Main.class.getClassLoader().getResourceAsStream(filename);
//    		if(input==null){
//    	            System.out.println("Sorry, unable to find " + filename);
//    		    return;
//    		}
// 
//    		//load a properties file from class path, inside static method
//    		prop.load(input);
 
                //get the property value and print it out
//                System.out.println(prop.getProperty("database"));
//    	        System.out.println(prop.getProperty("dbuser"));
//    	        System.out.println("Password " + (prop.getProperty("dbpassword")));
//    	        
//    	        conn = dbc.run(prop.getProperty("database"), prop.getProperty("dbuser"), prop.getProperty("dbpassword"));
//				stmt = conn.createStatement();
//				rs = stmt.executeQuery("SELECT * FROM users");
//				while (rs.next()) {
//					String id = rs.getString("id");
//					String name = rs.getString("name");
//					String balance = rs.getString("balance");
//					System.out.println("ID: " + id + ", First Name: " + name
//							+ ", Last Name: " + balance);
//				}
//    	} catch (IOException ex) {
//    		ex.printStackTrace();
//        } finally{
//        	if(input!=null){
//        		try {
//				input.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//        		
//				
//				System.out.println("Done reading from the database.");
//					
//			}
//        }
		
		
	}
}