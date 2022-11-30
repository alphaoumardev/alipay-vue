package com.alpha.alipay.javaclass;

public class Box
{
    double length;
 double width;
 double hight;
 public Box(double length,double width,double hight)
 {
   this.length=length;
   this.width=width;
   this.hight=hight;
 }
 public double getArea()
 {
   return 2*(length*width+width*hight+length*hight);
 }
 public double  surface()
 {
   return length*width*hight;
 }
 
 public static void main(String[] args)
     {
       Box box= new Box(24.4,544.4,64.46);
       System.out.println("The Box surface is going to be :"+ box.surface());
       System.out.println("The Box area is:"+ box.getArea());
     }

}
