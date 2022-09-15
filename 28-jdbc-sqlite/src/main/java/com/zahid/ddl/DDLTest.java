package com.zahid.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDLTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.sqlite.JDBC");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:database/univ.db");
		
		Statement stm = conn.createStatement();
		
//		stm.executeUpdate("create table temp(a integer, b float)");
		stm.executeUpdate("drop table teachers");
		
		stm.close();
		conn.close();
	}

}
