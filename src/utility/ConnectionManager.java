package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import java.io.InputStream;

public class ConnectionManager {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//Register the driver class
		Class.forName("oracle.jdbc.OracleDriver");
		
		//create the connection object
		Connection con = null;
		con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Anant007");
		
		return con;
	}
	
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);in.close();
		return prop; 
		} 
	
}
