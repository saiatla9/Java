package com.cg.jd.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {

	public static void main(String[] args) {
		try (Connection con = 
				DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root")) {
			
			String sql = "{? = call 'SELECT NOW()'}";
			CallableStatement cs = con.prepareCall(sql);
			cs.execute();
			cs.registerOutParameter(1, Types.VARCHAR);
			String output = cs.getString(1);
			System.out.println(output);
			
		} catch(SQLException excep) {
			System.out.println(excep.getMessage());
		}
	}

}
