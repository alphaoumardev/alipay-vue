package com.alpha.alipay.javaclass.New.New;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class select 
{
    public Vector getinfo() 
    {
        link db = new link();
        String student = "SELECT * FROM student_data_base.undergraduate LIMIT 100;";
        ResultSet rs = db.executeQuery(student);
        Vector data = new Vector();
        try {
            while (rs.next()) {
                // System.out.println(rs.getString(1)+" "+rs.getString(2));
                Vector<String> The_vector = new Vector<String>(); 
                The_vector.add(rs.getString(1));
                The_vector.add(rs.getString(2));
                The_vector.add(rs.getString(3));
                The_vector.add(rs.getString(4));
                data.add(The_vector);
            }
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }

        return data;
    }
}