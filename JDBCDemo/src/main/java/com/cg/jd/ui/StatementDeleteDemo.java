package com.cg.jd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDeleteDemo {
	public static void main(String[] args) {
		try (Connection con = 
				DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
				) {
			
			Statement st = con.createStatement();
			
			String sql = "DELETE FROM departments WHERE deptno = 101";
			
			int sqlQueryDelete = st.executeUpdate(sql);
			System.out.println(sqlQueryDelete + " Field deleted");
		}catch(SQLException excep) {
			System.out.println(excep.getMessage());
		}
	}
}
