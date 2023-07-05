package first_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// step.2. stablish a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc", "root", "Cb@64565120");
		//3.create a statement 
		Statement statement= connection.createStatement();
		//4..excute satte 
	   int count= statement.executeUpdate("update user set username='ravi' where userid=1 ");
	    //5.close connection
	    connection.close();
		
	    
	    System.out.println("threre are count of updating "+count);
	}

}
