package com.alpha.alipay.javaclass;// import java.sql.*;
// class link_database 
// {
//     public static void main(String args[]) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection(
//             "jdbc:mysql://localhost:3306/oumar", "root", "bonjouroumar200");

//             System.out.println("I'm connected");
//             System.out.println();
//             // con.createStatement();
//             Statement stmt = con.createStatement();
//             String student="select * from tb_classinfo where classid='310171'";
//             ResultSet rs = stmt.executeQuery(student);

//             while (rs.next())
//                 System.out.println( rs.getString(1) +" "+rs.getString(2));
//             con.close();
//         } 
//         catch (ClassNotFoundException e) 
//         {
//           e.printStackTrace();
//         }
//         catch (SQLException e)
//         {
//             e.printStackTrace();
//         }
//     }

// 	public Connection getcon() {
//         return con;
//     }

//     public ResultSet executeQuery(String ssql) {
//         try {
//             rs = stmt.executeQuery(ssql);
//             return rs;
//         } catch (SQLException se) {
//             System.out.println("DBBean.executeQuery() ERROR:" + se.getMessage());
//             return rs;
//         }
//     }

//     public int executeUpdate(String ssql) {
//         int iupdate;
//         iupdate = 0;
//         try {
//             iupdate = stmt.executeUpdate(ssql);
//             return iupdate;
//         } catch (SQLException se) {
//             System.out.println("DBBean.executeUpdate() ERROR:" + se.getMessage());
//             return iupdate;
//         }

//     }

// }
