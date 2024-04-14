package jdbc.prepadstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateEmployeeDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
		 PreparedStatement ps = con.prepareStatement("update employee1 set name=? where id =?");
		 Scanner in = new Scanner(System.in);
		 System.out.println("enter name: ");
		 String name = in.next();
		 System.out.println("enter id: ");
		 int id = in.nextInt();
		 ps.setString(1, name);
		 ps.setInt(2, id);
		 ps.execute();
		 System.out.println("data updated successfully....");
	}

}
