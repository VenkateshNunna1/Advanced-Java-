package jdbc.prepadstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deleteEmployeeDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
		 PreparedStatement ps = con.prepareStatement("delete from employee1 where id=?");
		 Scanner in = new Scanner(System.in);
		 System.out.println("enter id: ");
		 int id = in.nextInt();
		 ps.setInt(1, id);
		 ps.execute();
		 System.out.println("use data deleted successfully");

	}

}
