package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
	     Statement st = con.createStatement();
	     st.execute("insert into employee(id,name,role,yoe) values(1,'A','teacher',5)");
	     st.execute("insert into employee(id,name,role,yoe) values(2,'raju','teacher',4)");
	     st.execute("insert into employee(id,name,role,yoe) values(3,'venky','teacher',7)");
	     st.execute("insert into employee(id,name,role,yoe) values(4,'gani','teacher',5)");
	     System.out.println(" data inserted successfully");

	}

}
