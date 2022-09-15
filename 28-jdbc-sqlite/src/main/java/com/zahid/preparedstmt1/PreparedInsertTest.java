package com.zahid.preparedstmt1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.sqlite.JDBC");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:database/univ.db");
		
		PreparedStatement stm = conn.prepareStatement("insert into students values(?,?,?,?)");
		
		int roll;
		String name;
		String city;
		int deptno;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("# Enter roll> ");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.print("# Enter name> ");
		name = sc.nextLine();
		
		System.out.print("# Enter city> ");
		city = sc.nextLine();
		System.out.print("# Enter deptno> ");
		deptno = sc.nextInt();

		stm.setInt(1, roll);
		stm.setString(2, name);
		stm.setString(3, city);
		stm.setInt(4, deptno);
		
		stm.executeUpdate();
		System.out.println("Inserted");
		
		/*ResultSet rs = stm.executeQuery("select * from students");
		
		
		while(rs.next()) {
			roll = rs.getInt("roll");
			name = rs.getString("name");
			city = rs.getString("city");
			deptno = rs.getInt("deptno");
			
			System.out.println(roll+" "+name+" "+city+" "+deptno);
		}*/
		
		sc.close();
		conn.close();

	}

}
