package com.alpha.alipay.javaclass;

public class adress
{
//	包括姓名、街道、市（县）、省（自治区）、国家（地区）。然后通过
		public  String road,city,province,country;
		public adress(String road,String city,String province,String country) 
		{
			this.road = road;
			this.city = city;
			this.province=province;
			this.country=country;
		}
		  
		public String toString()
		{
			return "The adress："+road+" "+city+" "+province+" "+country;
		}
        public static void main(String[] args) 
        {
			adress ad=new adress("chengde street","Huaian city","Jiangsu pro.","China");
			System.out.print(ad.toString());
		}
}
