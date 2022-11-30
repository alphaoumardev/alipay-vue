package com.alpha.alipay.javaclass;

public class Encapsulation
{
   double cercle()
  {
    final double pi=3.14;
    double radius=5.23;
    double area;
    area=pi*radius*radius;
    System.out.println("The area of the cercle is "+area);
    return area;
  }

  protected int ball=1;
  private String name="Diallo";
   public String getName(){return name;}
  int getBall(){return ball;}
  int setBall(int newBall)
  {
    this.ball=newBall;
    return newBall;
  }
   public void setName(String newName)
  {
    this.name=newName;
  }
  // public static void main(String[] args)
  // {
  //   Encapsulation me = new Encapsulation();
  //   me.setName("Alpha j");
  //   System.out.println(me.getName());
  //   //me.cercle();
  // }
}

//Two ways to encapsulate


class Fn extends Encapsulation
{
  public static void main(String[] args)
  {
    Fn me = new Fn();
    me.cercle();
    me.setName("Oumar");
    System.out.println(me.getName());
    me.setBall(234);
    System.out.println(me.getBall());
  }
}
 
