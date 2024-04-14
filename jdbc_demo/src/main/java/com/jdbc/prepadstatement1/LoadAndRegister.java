package com.jdbc.prepadstatement1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadAndRegister {
	public void LoadAndEegister() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");//loading the driver
		System.out.println(DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky"));
	}

}
