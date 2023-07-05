package first_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// stablish a connection 
		
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc", "root", "Cb@64565120");
	
	//3. create a statement 
	
	Statement statement = connection.createStatement();
	
	//4.excute satte 
	
	statement.execute("insert into user values(3,'Cb',333333)");
	// 5. connection close
	
	connection.close();
	
	System.out.println("inserted");
	}

}
