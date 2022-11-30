package com.alpha.alipay.javaclass;

import java.util.HashMap;
class Maping
{
  public static void main(String[] args)
  {
      HashMap<String,String> cities =new HashMap<String,String>();
      cities.put("USA","Washiton DC");
      cities.put("Guinea","Conakry");
      cities.put("England","London");
      System.out.println(cities.remove("England"));
      System.out.println(cities.get("Guinea"));
      // cities.clear();
      for(String i: cities.keySet())
      {
        System.out.println(i);
      }
      System.out.println(cities);

      HashMap<String,Integer> people =new HashMap<String,Integer>();
      people.put("Alpha",21);
      people.put("Barry",4);
      people.put("Diallo",53);
      System.out.println("The people "+people);
      for(Integer in: people.values())
      {
        System.out.println(in);
      }
      for(String out:people.keySet())
      {
        System.out.println(out);
      }
  }
}
