/*package billing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
public class loadprops {
  public Properties run() {

	Properties prop = new Properties();
	InputStream input = null;
	
	String	propdb = null;
	String	propusr = null;
	String	proppwd = null;

	
	String filename = "config.properties";	
	try {
		input = new FileInputStream("config.properties");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
				if(input==null){
	            System.out.println("Sorry, unable to find " + filename);
		}

		//load a properties file from class path, inside static method
		try {
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
 //       get the property value and print it out
      System.out.println(prop.getProperty("database"));
      System.out.println(prop.getProperty("dbuser"));
      System.out.println("Password " + (prop.getProperty("dbpassword")));
	
	
	try {
 
		String filename = "config.properties";
		input = Main.class.getClassLoader().getResourceAsStream(filename);
		if(input==null){
	            System.out.println("Sorry, unable to find " + filename);
		    return;
		}
		input = new FileInputStream("config.properties");
 
		// load a properties file
		prop.load(input);
 
		// get the property value and print it out
		System.out.println(prop.getProperty("database"));
		System.out.println(prop.getProperty("dbuser"));
		System.out.println(prop.getProperty("dbpassword"));
		
		propdb = prop.getProperty("database");
		propusr = prop.getProperty("dbuser");
		proppwd = prop.getProperty("dbpassword");
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	System.out.println(prop);
	return prop;
  } 
}*/