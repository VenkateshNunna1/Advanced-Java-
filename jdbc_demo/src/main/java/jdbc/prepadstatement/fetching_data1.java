package jdbc.prepadstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class fetching_data1 {
   public static void main(String[] args) throws SQLException {
	   Connection con = helper_class.getconnection();
		Scanner in = new Scanner(System.in);
		System.out.println("enter name of the user:");
		String name = in.next();
		PreparedStatement ps= con.prepareStatement("select * from student where name=?");
		ps.setString(1,name);
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
