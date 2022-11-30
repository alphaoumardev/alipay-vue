package com.alpha.alipay.javaclass;

abstract class Abstract
{
  public abstract void animal();
  public void animal_sound()
  {
    System.out.println("The animal sound sounds good");
  }
}
 class Lion extends Abstract
{
  public void animal()
  {
    System.out.println("The lion is the king of the animals in the jungle");
  }
}
class Main
{
  public static void main(String []args)
  {
    Lion lion =new Lion();
    lion.animal();
    lion.animal_sound();
  }
}
