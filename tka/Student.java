package com.tka;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Student {
	//firstly we need to add the jar file
	
	public static void main(String args[]) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded successfully.....");
		// build the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");
		
		// statement / prepared statement
		Statement s = c.createStatement();	
		
		//s.executeUpdate("UPDATE stu set stuname='ram' WHERE rollno = 101");
//		s.execute("create table students(name varchar(70))");
//		System.out.println("table inserted successfully");
//		s.executeUpdate("insert into students(name)values('Shruti')");
//		s.executeUpdate("insert into students(name)values('madhu')");
//		s.executeUpdate("insert into students(name)values('Shrutika')");

//		System.out.println("data inserted");
//		s.executeUpdate("UPDATE students set name = 'rudra' where name = 'shrutika'");
//		System.out.println("updated successfully......");
//		
		
//		ResultSet rs = s.executeQuery("select * from stu");
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+" "+rs.getString(3));
//		}
		
		System.out.println("data inserted successfully.....");
		c.close();
	}

}
