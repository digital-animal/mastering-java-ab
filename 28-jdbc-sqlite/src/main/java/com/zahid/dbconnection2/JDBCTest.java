package com.zahid.dbconnection2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.sqlite.JDBC"); // Drive invoked
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:database/univ.db"); // connection established
		
		Statement stm = conn.createStatement(); // statement created
		
		ResultSet rs = stm.executeQuery("select * from departments"); // executing query
		
		int deptID;
		String deptName;
		while(rs.next()) {
			deptID = rs.getInt("dept_no");
			deptName = rs.getString("dept_name");
			System.out.println(deptID+" "+deptName);
		}
		
		conn.close();

	}

}
