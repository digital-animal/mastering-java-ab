package com.zahid.preparedstmt2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.sqlite.JDBC");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:database/univ.db");
		
		// PreparedStatement stm = conn.prepareStatement("select * from students where roll=?");
		PreparedStatement stm = conn.prepareStatement("select * from students where dept_no=?");
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("# Enter student id> ");
		System.out.print("# Enter dept no> ");
		int dno = sc.nextInt();
		stm.setInt(1, dno);
		
		ResultSet rs = stm.executeQuery();
		
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
		
		sc.close();
		conn.close();
	}

}
