package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Employee {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");
		//PreparedStatement ps = c.prepareStatement("insert into employees(empid,name)values(?,?)");
		//PreparedStatement p = c.prepareStatement("update Employees set name = 'Bhavana' where empId =123");
		//PreparedStatement s = c.prepareStatement("alter table Employees add city varchar(60)");
		
		//ps.setInt(1, 125);
		//ps.setString(2, "ridhu");
		//ps.setString(3,"pune");
		//ps.executeUpdate();
		//p.executeUpdate();
		//s.execute();
		
		System.out.println("Data is inserted...");
		c.close();
	}

}



