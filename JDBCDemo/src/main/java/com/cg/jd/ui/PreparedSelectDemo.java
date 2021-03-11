package com.cg.jd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedSelectDemo {

	public static void main(String[] args) {
		try (Connection con = 
				DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root")) {
			
			String sql = "SELECT empno, ename, doj, salary FROM employees ORDER BY salary DESC";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			System.out.println("empno\tename\t\tdoj\tsalary");
			System.out.println("---------------------------------------------");
			
			while (rs.next()) {
				System.out.printf("%-5d%-15s%-15s%.1f\n", rs.getInt("empno"), rs.getString("ename"), rs.getString("doj"),rs.getDouble("salary"));
			}
			
			rs.close();
			ps.close();
			
		} catch(SQLException excep) {
			System.out.println(excep.getMessage());
		}
	}

}
