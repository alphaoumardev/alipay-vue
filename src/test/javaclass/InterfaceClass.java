package com.alpha.alipay.javaclass;

interface TheFirst
{
  public String my_name(String name);
  public double my_age(double age);//No body here
}
interface InterfaceClass
{
  public void sound();//The interface class has no body
  public void character();
}

class Animal implements TheFirst,InterfaceClass
{
  public void sound()
  {
    System.out.println("The animal has many kinds in the forest");
  }
  public void character()
  {
    System.out.println("The animal has many characters");
  }
  public String my_name(String name)
  {
    System.out.println("Your name is "+name);
    return name;
  }
  public double my_age(double age)
  {
    System.out.println("Your age is "+age);
    return age;
  }
}
