package jdbc.prepadstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class fething_data {
	 public static void main(String args[]) throws SQLException {
		Connection con = helper_class.getconnection();
		Scanner in = new Scanner(System.in);
		System.out.println("enter id of the user:");
		int id = in.nextInt();
		 PreparedStatement ps= con.prepareStatement("select * from student where id=?");
		ps.setInt(1, id);
		ResultSet rs =ps.executeQuery();
		rs.next();
		try {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		}
		catch(SQLException se) {
			System.out.println("user not found");
		}

	}

}
