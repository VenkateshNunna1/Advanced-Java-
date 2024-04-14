package jdbc.prepadstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class allOperations {
	Connection con;
	Statement st;
	
	public allOperations(Connection con, Statement st) {
		this.con = con;
		this.st = st;
	}
	public void create() throws SQLException  {
		st.execute("create table student1(id int,name varchar(20),course varchar(20),age int)");
		
	}
	public void insert() throws SQLException {
		Scanner in =new Scanner(System.in);
	     System.out.println("enter id:");
	     int id = in.nextInt();
	     System.out.println("enter name:");
	     String name = in.next();
	     System.out.println("enter course:");
	     String course =in.next();
	     System.out.println("enter yoe:");
	     int age = in.nextInt();
	      PreparedStatement ps = con.prepareStatement("insert into employee1(id,name,role,yoe,salary) values(?,?,?,?,?)");
	      ps.setInt(1,id);
	      ps.setString(2, name);
	      ps.setString(3, course);
	      ps.setInt(4, age);
	      ps.execute();
	}
	public static void main(String[] args) throws SQLException {
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
	     Statement st = con.createStatement();
	     allOperations ap = new allOperations(con,st);
	     
	      System.out.println("values inserted successfully");
	     
	}

}
