package jdbc.prepadstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertEmployeeDynamically {
  public static void main(String[] args) throws SQLException {
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
	     Statement st = con.createStatement();
 //   st.execute("create table employee1(id int,name varchar(20),role varchar(20),yoe int,salary int)");
	     Scanner in =new Scanner(System.in);
	     System.out.println("enter id:");
	     int id = in.nextInt();
	     System.out.println("enter name:");
	     String name = in.next();
	     System.out.println("enter role:");
	     String role =in.next();
	     System.out.println("enter yoe:");
	     int yoe = in.nextInt();
	     System.out.println("enter salary:");
	     double salary = in.nextDouble();
	      PreparedStatement ps = con.prepareStatement("insert into employee1(id,name,role,yoe,salary) values(?,?,?,?,?)");
	      ps.setInt(1,id);
	      ps.setString(2, name);
	      ps.setString(3, role);
	      ps.setInt(4, yoe);
	      ps.setDouble(5, salary);
	      ps.execute();
	      System.out.println("values inserted successfully");
	     
	  
	  
}
}
