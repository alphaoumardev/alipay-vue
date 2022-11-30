package com.alpha.alipay.javaclass;

import java.util.ArrayList;
// import java.util.Collections;
public class collection
{
	public static void main(String[] args)
	  {
	    ArrayList<String> adress=new ArrayList<String>();
	    // adress.add("chengde street", "Huaian city", "Jiangsu pro.", "China");
	    System.out.println("The my_adress i have seen there are "+adress);
	    
	    System.out.println("The addre Array size is "+adress.size()+";");
	      for(int i=0;i<adress.size();i++)
	      {
	        System.out.println("The addres are "+i);
	      }
	      // or
	      for(String the_variale_array:adress)
	      {
            System.out.print("\t"+the_variale_array);
	      }
    }
}
