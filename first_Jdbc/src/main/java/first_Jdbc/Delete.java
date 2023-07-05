package first_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// step.2. establish a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc", "root", "Cb@64565120");
		//3.create a statement 
		Statement statement= connection.createStatement();
		//4..Execute statement 
	   statement.execute("delete from user where userid=1 ");
	    //5.close connection
	    connection.close();
		
	    
	    System.out.println("Deleted");
	}

}
