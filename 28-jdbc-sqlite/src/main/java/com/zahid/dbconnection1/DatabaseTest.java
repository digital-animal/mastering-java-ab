package com.zahid.dbconnection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.sqlite.JDBC"); // registering sqlite jdbc driver
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:database/univ.db");
		
		Statement stm = conn.createStatement();
		
		ResultSet rs = stm.executeQuery("select * from students order by name");
		
		int roll;
		String name;
		String city;
		int deptNo;

		while(rs.next()) {
			roll = rs.getInt("roll");
			name = rs.getString("name");
			city = rs.getString("city");
			deptNo = rs.getInt("dept_no");
			
			System.out.println(roll+" "+name+" "+city+" "+deptNo);
		}
		
		stm.close();
		conn.close();
	}

}

