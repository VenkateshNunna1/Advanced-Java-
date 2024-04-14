package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetching {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
	     Statement st = con.createStatement();
	     ResultSet rs= st.executeQuery("select * from employee where id =2");
	     rs.next();
	      System.out.println(rs.getInt(1));
	      System.out.println(rs.getString(2));
	      System.out.println(rs.getString(3));
	      System.out.println(rs.getInt(4));
	      System.out.println("data fetched successfiully");
	      ResultSet rs1= st.executeQuery("select * from employee ");
	      rs1.next();
	      System.out.println(rs1.getInt("id"));
	      System.out.println(rs1.getString("name"));
	      System.out.println(rs1.getString("role"));
	      System.out.println(rs1.getInt("yoe"));
	      System.out.println("data fetched successfiully");

	      
	      
	      
	}

}
