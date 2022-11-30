package com.alpha.alipay.javaclass;

import java.util.ArrayList;
// import java.util.Collections;
public class Aray
{
  public static void main(String[] args)
  {
    ArrayList<String> animal=new ArrayList<String>();
    animal.add("cow");
    animal.add("sheep");
    animal.add("lion");
    animal.add("giraffe");
    animal.add("pig");
    animal.add("chien");
    System.out.println("The animal  are "+animal.set(3,"Rabit"));
    System.out.println("The animal i have seen there are "+animal);
    System.out.println("The animal  are "+animal.get(3));
    System.out.println("The animal  are "+animal.add("Cat"));
    System.out.println("The animal i have seen there are "+animal);
    System.out.println("The animal  "+animal.remove(2));
    System.out.println("The animal i have seen there are "+animal);
    // animal.clear();
    System.out.println("The animal Array size is "+animal.size()+";");
      for(int i=0;i<animal.size();i++)
      {
        System.out.println("The animals are "+i);
      }
      // or
      for(String the_variale_array:animal)
      {
        System.out.print("\t"+the_variale_array);
      }

    ArrayList<Integer> The_number=new ArrayList<Integer>();
    The_number.add(424);
    The_number.add(43);
    The_number.add(34);
    The_number.add(5643);
    The_number.add(543);
    The_number.add(454);
    System.out.println("The The_number  are "+The_number.set(3,546));
    System.out.println("The The_number i have seen there are "+The_number);
    System.out.println("The The_number  are "+The_number.get(3));
    System.out.println("The The_number  are "+The_number.add(5346));
    System.out.println("The The_number i have seen there are "+The_number);
    System.out.println("The The_number  "+The_number.remove(2));
    System.out.println("The The_number i have seen there are "+The_number);
    // The_number.clear();
    // Collections.sort(The_number);
    // for(Integer i:The_number)
    // {
    //   System.out.println("The The_number Array "+The_number);
    // }
    System.out.println("The The_number Array size is "+The_number.size()+";");
  }
}
