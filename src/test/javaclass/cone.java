package com.alpha.alipay.javaclass;

import java.sql.*;

public class cone {
	Connection con = null;
	ResultSet rs = null;
	Statement stmt = null;

	public cone() {
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433; DatabaseName=dbStudent",
					"sa", "123"); 

//	        Class.forName("com.mysql.jdbc.Driver");
//			
//			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstudent?characterEncoding=utf-8","root","root");
//			
		    
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public Connection getconn(){
		return con;
	}

	public ResultSet executeQuery(String ssql)  {
		try {
			rs = stmt.executeQuery(ssql);
			return rs;
		} catch (SQLException se) {
			System.out
					.println("DBBean.executeQuery() ERROR:" + se.getMessage());
			return rs;
		}
	}

	public int executeUpdate(String ssql)  {
		int iupdate;
		iupdate = 0;
		try {
			iupdate = stmt.executeUpdate(ssql);
			return iupdate;
		} catch (SQLException se) {
			System.out.println("DBBean.executeUpdate() ERROR:"
					+ se.getMessage());
			return iupdate;
		}

	}

}
