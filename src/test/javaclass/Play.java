package com.alpha.alipay.javaclass;

public class Play
{
  double first,second;
  public Play(double first, double second)
  {
    this.first=first;
    this.second=second;
  }
        public int addition(int first,int second)
        {
          System.out.println("The Integer addition");
          return first+second;
        }
        public double addition(double first,double second)
        {
          System.out.println("The double addition ");
          return first+second;
        }
        public float addition(float first,float second)
        {
          System.out.println("The float addition ");
          return first+second;
        }
  public static void main(String[] args)
  {
    Play numbers = new Play(4,6);
    System.out.println(numbers.addition(53,32));
    System.out.println(numbers.addition(543.34,57.8));
    System.out.println(numbers.addition(5.3f,45.342f));
  }
public void attack() {
}
}
