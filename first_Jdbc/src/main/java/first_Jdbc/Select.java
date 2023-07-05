package first_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc", "root", "Cb@64565120");
		Statement statement= connection.createStatement();
		//4..Execute statement 
	   ResultSet resultSet= statement.executeQuery("select * from user");
	   while(resultSet.next()) {
		   System.out.println(resultSet.getInt(1));
		   System.out.println(resultSet.getString(2));
		   System.out.println(resultSet.getLong(3));
	   }
	    //5.close connection
	    connection.close();
		
	    
	    System.out.println("All details are done");
	}

}
