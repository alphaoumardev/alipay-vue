package com.alpha.alipay.javaclass;

import java.sql.*;

public class DBConnect {
	Connection conn = null;
	PreparedStatement ps = null;
	Statement stmt = null;
	ResultSet rs = null;

	// The link of the database
	public DBConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/house", "root", "bonjouroumar200");
//			 Connection stmt = (Connection) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE);
//			 ResultSet.CONCUR_READ_ONLY);
			stmt = conn.createStatement();
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "The link has an error");

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "It has an error");
		}
	}

	public Connection getConnection() {
		return conn;
	}

	public PreparedStatement getPS(String sql) throws SQLException {
		ps = conn.prepareStatement(sql);

		return ps;
	}

	public ResultSet executeQuery(String sql) 
	{
		try 
		{
			rs = stmt.executeQuery(sql);
			return rs;
		} 
		catch (SQLException e) {
			System.out.println("DBConnect.executeQuery():ERROR" + e.getMessage());
		}
		return rs;
	}

	public int executeUpdate(String sql) {
		int i = 0;
		try 
		{
			i = stmt.executeUpdate(sql);
			return i;
		} catch (SQLException e) {
			System.out.println("DBConnect.executeUpdate():ERROR" + e.getMessage());
		}
		return i;
	}
	public static void main(String[] args) 
	{ 
		DBConnect db=new DBConnect();
		String sql="insert into userinfo(username,userpass) values('You','me')";
		int i=db.executeUpdate(sql);
 
		if(i==1)
		{
			System.out.println("The database is linked");
		}
		else
		{
			System.out.println("Not connected");
		}
		
	}
	public void free() {

	try {
	if (rs != null)
	rs.close();
	if (stmt != null)
	stmt.close();
	if (conn != null)
	conn.close();
	} catch (SQLException e) {
	System.out.println("DBConnect.free():ERROR" + e.getMessage());
	}

	}
}

