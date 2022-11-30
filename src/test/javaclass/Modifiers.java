package com.alpha.alipay.javaclass;

public class Modifiers
{
  protected double PI=3.145345;
  private String name;
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name=name;
  }
    public static void main(String[] args)
    {
    Modifiers consta =new Modifiers();
    System.out.println("The constant PI ="+consta.PI);
    consta.setName("Would you like to make me smile?");
    System.out.println(consta.getName());
    }
}
