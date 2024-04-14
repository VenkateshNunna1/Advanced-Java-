package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
	     Statement st = con.createStatement();
	     st.execute("delete from employee where name='pavan'");
	     System.out.println("deleted successfully");

	}

}
