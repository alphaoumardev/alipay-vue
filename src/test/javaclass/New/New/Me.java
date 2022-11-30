package com.alpha.alipay.javaclass.New.New;

class Inheritance
{
  public void pere()
  {
    System.out.println("He is my Dad");
  }
}

 class Mere extends Inheritance
{
  public void mere()
  {
    System.out.println("She is my mother as well");
  }
}
 class Me extends Mere
{
  public void me()
  {
    System.out.println("I am Alpha oumar Diallo");
  }
  public static void main(String[] args)
  {
      Me my=new Me();
      my.pere();
      my.mere();
      my.me();
  }
}
