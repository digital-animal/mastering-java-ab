package com.zahid.dml;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/zahid/univ.db");
		
		Statement stm = conn.createStatement();
		
		/*stm.executeUpdate("insert into dept values(60,'IPE')");
		stm.executeUpdate("insert into dept values(70,'URP')");*/
		
//		stm.executeUpdate("delete from dept where deptno=70");
		stm.executeUpdate("update dept set dname='URP' where deptno=60");
		
		ResultSet rs = stm.executeQuery("select * from dept");
		
		while(rs.next()) {
			System.out.println(rs.getInt("deptno")+" "+rs.getString("dname"));
		}

		stm.close();
		conn.close();

	}

}
