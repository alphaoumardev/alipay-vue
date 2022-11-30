package com.alpha.alipay.javaclass;

import java.util.Scanner;

public class InOut
{

  public static void main(String []args)

  {
    Scanner input = new Scanner(System.in);
    System.out.println("Your name please");
    String name = input.nextLine();
    System.out.println("age");
    int age = input.nextInt();
    System.out.println("java_score");
    double java_score= input.nextDouble();
    System.out.println("studentId");
    long student_ID = input.nextLong();
    System.out.println("visa");
    byte visa = input.nextByte();
    System.out.println("your hIGH");
    float high = input.nextFloat();
    System.out.println("weigth");

    short weigth = input.nextShort();
    System.out.println("My name is "+name);
    System.out.println(" Age "+age);
    System.out.println(" ID "+student_ID);
    System.out.println(" The visa "+visa+"Years");
    System.out.println(" High "+high);
    System.out.println(" Weigth "+weigth);
    System.out.println(" Score at the final Exam "+java_score);




    // String ss =new String("This string ");
    // String easier =ss+ "is the easiest way ";
    // System.out.println(easier);
  }
}
