package com.alpha.alipay.javaclass;

public class TestConn
{
	
	public static void main(String[] args) 
	{ 
    DBConnect db=new DBConnect();
    String sql="select * from books";
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

}
