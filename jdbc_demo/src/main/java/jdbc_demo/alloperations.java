package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class alloperations {
	Connection con;
	Statement st;
	
	public alloperations(Connection con, Statement st) {
		this.con = con;
		this.st = st;
	}
	public Statement createtable(Statement st) throws SQLException {
		 st.execute("create table student(id int,name varchar(20),age int)");
		 return st;
	}
	public Statement insertdata(Statement st) throws SQLException {
		 st.execute("insert into student(id,name,age) values(1,'A',19)");
		 st.execute("insert into student(id,name,age) values(2,'gani',20)");
		 st.execute("insert into student(id,name,age) values(3,'venky',21)");   
		 st.execute("insert into student(id,name,age) values(4,'sudhi',21)");   
	     return st;
	}
	public Statement update(Statement st) throws SQLException {
		st.execute("update student set name='pavan' where name='A'");
		return st;
	}
	public Statement delete(Statement st) throws SQLException {
		st.execute("delete from student  where name='sudhi'");
		return st;
	}
	public void fetch() throws SQLException {
		ResultSet rs= st.executeQuery("select * from student");
	     while(rs.next()) {
	    	  System.out.println(rs.getInt(1));
		      System.out.println(rs.getString(2));
		      System.out.println(rs.getString(3));
		      System.out.println("-------------------------------------------------------");
	     }
	}

	public static void main(String[] args) throws SQLException {
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "venky");
	     Statement st = con.createStatement();
	     alloperations ap = new alloperations(con,st);
	     ap.createtable(st);
	     ap.insertdata(st);
	     ap.update(st);
	     ap.delete(st);
	     ap.fetch();
	     
	     
	     
	   
	     
	     
	     
	  
	    

	}

}
