package com.alpha.alipay.javaclass;

public  class SumPlay
{
  public static void main(String []args)
  {
    System.out.println(summ(2,8));
    System.out.println(summ(34.34,4.4));

    Play p1 =new Play(0, 0);
    p1.attack();
  }
  public static int summ(int a, int b)
  {
    return a+b;
  }
  public static double summ(double a, double b)
  {
    return a+b;
  }
}
