 package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class create_database {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "venky");
        Statement st = con.createStatement();
        st.execute("create database university");
        System.out.println("database created successfully");
	}

}
