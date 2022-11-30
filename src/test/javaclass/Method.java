package com.alpha.alipay.javaclass;

import java.util.Scanner;
public class Method
{
  private static Scanner nian;


  public void carspeed(int speed)
  {
    System.out.println("The carspeed is "+speed);
  }
  public void carclor(String color)
  {
    System.out.println("The carclor is "+ color);
  }
  static int myAge()
  {
    int nianling;
    nian = new Scanner(System.in);
    nianling=nian.nextInt();
    if(nianling<18)//using flow control in oop class
    {
      System.out.println("You can't acced as you're a teneeger ");
    }
    else if(nianling<25)
    {
      System.out.println("You migth be married");
    }
    else
    {
      System.out.println("You are adult");
    }return nianling;
  }


  public void alpha()
  {
    System.out.println("welcome");
  }

  static double Bien(String name,double age)// methods overloading it like in c++
  {
    return age;
  }
  static float Bien(String name, float age)
  {
    return age;
  }


  static int Bien(String name,int age)//methods with parameters and return value "age"
  {
    for(int i=0;i<1000;i++)
    {
      for(int j=0;j<=i;j++)
      System.out.print(i+"*"+j+"="+i*j);
      System.out.println();
      System.out.println(name+","+age);

    }return 43+age;
  }


  public static void main(String[] args)
  {
    Method obj = new Method();//creating the object "obj"
    obj.alpha();
    obj.carspeed(549);
    obj.carclor("''Red''");
    Bien("Diallo",90);
    Bien("alphaOumar",20);
    System.out.println(Bien("Diallo",43));
    System.out.println(Bien("Alpha",22.34553));
    System.out.println(Bien("name+",54.45));
    myAge();
  }
}
