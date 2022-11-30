package com.alpha.alipay.javaclass;

public class delete
{
    public static void main(String[] args) {
        String insert = "delete from student_data_base.undergraduate where student_id='217016'"; 
        link li = new link();
        int al = li.executeUpdate(insert);
        System.out.println(al);
    }    
}
