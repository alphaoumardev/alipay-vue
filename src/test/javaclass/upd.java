package com.alpha.alipay.javaclass;

public class upd
{
    public static void main(String[] args) {
        String insert = "insert into orders values('3137','java','423','22'8)";
        link1 li = new link1();
        int al = li.executeUpdate(insert);
        System.out.println(al);
    }
}
