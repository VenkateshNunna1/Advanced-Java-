package com.java.Batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Statement_BatchProcessing {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
	     Statement st = con.createStatement();
	     st.addBatch("insert into employee1(id,name,role,yoe,salary) values(2,'sumanth','trainee',4,10000)");
	     st.addBatch("insert into employee1(id,name,role,yoe,salary) values(3,'sudheer','trainee',6,100000)");
	     st.addBatch("insert into employee1(id,name,role,yoe,salary) values(4,'swetha','trainee',3,9999)");
	     st.addBatch("insert into employee1(id,name,role,yoe,salary) values(5,'ganesh','manager',8,500000)");
	     st.addBatch("insert into employee1(id,name,role,yoe,salary) values(6,'venkatesh','trainee',2,10000)");
	     st.addBatch("update employee1 set name='pavan kumar' where id=1");
	     st.executeBatch();
	     System.out.println("batch executed successfully");

	}

}
