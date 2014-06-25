package com.ty.java.testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	static String url = "jdbc:mySql://192.168.99.83:3306/testgroovy?useUnicode=true&characterEncoding=utf8&user=root&password=fXL2bO$RQgaRS^lH";
	static String dbDriver="com.mysql.jdbc.Driver";
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		TestDB.testInsert();
	}

	static void testSelect() {
		
		try {
			Class.forName(dbDriver);
			conn = DriverManager
					.getConnection(url);
			stmt = conn.createStatement();
			String sql = "SELECT s.id, s.name,s.age FROM testgroovy.student s;";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getInt("id"));
				System.out.println(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	static void testInsert() {
		Connection conn = null;
		Statement stmt = null;
		try {
//			Class.forName(dbDriver);
			conn = DriverManager
					.getConnection(url);
			stmt = conn.createStatement();
			String insertSql = "insert into student (name,age) values('张三','23')";
			System.out.println(stmt.executeUpdate(insertSql));
			String selectSql = "SELECT s.id, s.name,s.age FROM testgroovy.student s;";
			rs = stmt.executeQuery(selectSql);
			while (rs.next()) {
				System.out.print(rs.getInt("id"));
				System.out.println(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
