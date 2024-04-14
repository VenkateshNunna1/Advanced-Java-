package jdbc.prepadstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class helper_class {
   public static Connection getconnection() throws SQLException {
	   Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
	   return con;
   }
}
