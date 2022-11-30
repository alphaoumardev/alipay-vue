package com.alpha.alipay.javaclass;

import java.sql.*;

public class link1 
{
    Connection con = null;
    ResultSet rs = null;
    Statement stmt = null;

    public link1() {

		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/easybuy", "root","bonjouroumar200");

            System.out.println("I'm connected");

			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

    public Connection getconn() {
        return con;
    }

    public ResultSet executeQuery(String student) {
        try {
            rs = stmt.executeQuery(student);
            return rs;
        } catch (SQLException e) {
            System.out.println("DBBean.executeQuery() ERROR:" + e.getMessage());
            return rs;
        }
    }

    public int executeUpdate(String student) {
        int upgrade = 0;
        try {
            upgrade = stmt.executeUpdate(student);
            return upgrade;
        } catch (SQLException e) {
            System.out.println("DBBean.executeUpdate() ERROR:" + e.getMessage());
            return upgrade;
        }

    }


	
    // public static void main(String[] args) {
    //     new link1();
    // }
}
