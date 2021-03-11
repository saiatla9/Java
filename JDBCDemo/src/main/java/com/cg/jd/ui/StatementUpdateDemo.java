package com.cg.jd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementUpdateDemo {
	public static void main(String[] args) {
		try (Connection con = 
				DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
				) {
			
			Statement st = con.createStatement();
			
			String sql = "UPDATE departments SET location = 'Bapatla' WHERE deptno = 103";
			
			int sqlQueryResult = st.executeUpdate(sql);
			System.out.println(sqlQueryResult + "location has been updated sucessfully");
		}catch(SQLException excep) {
			System.out.println(excep.getMessage());
		}
	}
}
