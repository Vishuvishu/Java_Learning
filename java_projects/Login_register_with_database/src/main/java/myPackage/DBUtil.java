package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String URL = "jdbc:mysql://localhost:port/database";//port can be find from select @@port;
	private static final String USERNAME = "username";//can find throuh command in mysql select user();
	private static final String PASSWORD = "password"; //password
	
	static {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		public static Connection getConnection() throws	SQLException{
			System.out.println("connection builded");
			return DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}
	
}
