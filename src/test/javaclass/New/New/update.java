package com.alpha.alipay.javaclass.New.New;

public class update
{
    public static void main(String[] args) {
        String insert = "insert into student_data_base.undergraduate(student_id,stu_name,stu_sex,birth) values('217016','angel','female','19870627')";
        link li=new link();
        int al=li.executeUpdate(insert);
        System.out.println(al);
    }    
}
  