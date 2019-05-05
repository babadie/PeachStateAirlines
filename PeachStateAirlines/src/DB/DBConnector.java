package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
	
	static String databaseURL = "jdbc:mysql://localhost:3306/airline?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String DBusername = "root";
	static String DBpassword = "1234abcd";
	
	public static void main(String[] args) {
		 boolean b = isValidUser("babadie", "12" );
		 System.out.println(b);
	}
	
	
	public static Connection getConnection() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection(databaseURL, DBusername, DBpassword);

		return con;
	}
	
	
	public static boolean isValidUser(String username, String pass) {
		
		username = "babadie";
		pass = "12";
		
		boolean isValid = false;
		
		try {
			Connection con = DBConnector.getConnection();
			
			String query = "SELECT username, pass FROM user";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				//this gets the username and password in each row
				String usernameFromDB = rs.getString("username");
				String passFromDB = rs.getString("pass");
				
				if (username.equals(usernameFromDB) && pass.equals(passFromDB) ) {
					isValid = true;
					con.close();
					break;
					
				}
				
				
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return isValid;

		
	}
	
	
	

}
