package com.alpha.alipay.javaclass;

import java.sql.*;
import java.util.Vector;

public class select1 
{
    public void sel() 
    {
        link1 li = new link1();
       Vector data = new Vector();
        String student = "select * from product";
        ResultSet rs = li.executeQuery(student);
            try 
            {
                while (rs.next()) 
                {
                    // System.out.println(rs.getString(1)+" "+rs.getString(2));
                    Vector<String> the_data = new Vector<String>(); // Ò»ÐÐÊý¾Ý
                    the_data.add(rs.getString(1));
                    the_data.add(rs.getString(2));
                    data.add(the_data);
                }
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
                // return data;
    }
}
