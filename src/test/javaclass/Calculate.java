package com.alpha.alipay.javaclass;

import java.util.Scanner;
public class Calculate
{
  int n1;
  int n2;
private static Scanner alpha;
  public Calculate(int n1,int n2)
  {
    this.n1=n1;
    this.n2=n2;
  }
    public int addition()
    {
        return (n1+n2);
    }
    public int subtration()
    {
        return (n1-n2);
    }

  public static void main(String[] args)
  {
      Calculate Calculate= new Calculate(78,95);
      System.out.println("The summe of the two numbers is:"+ Calculate.addition());
      System.out.println("It subtration is going to be :"+"\b"+Calculate.subtration());



    System.out.println("Today is which day please?");
    
    alpha = new Scanner(System.in);
    int day=alpha.nextInt();

    String week;
    switch (day)
    {
      case 1:week="Monday";
      break;
      case 2:week="Tuesday";
      break;
      case 3:week="Wednesday";
      break;
      case 4:week="Thursday";
      break;
      case 5:week="Friday";
      break;
      case 6:week="saturday";
      break;
      default:
      week="Sunday";
    }
    System.out.println(week);

    System.out.println("Please input the student java score");
    int score=alpha.nextInt();

       if (score > 90)
       {
          System.out.println("The student has past with excellent grade 'A++'");
       }
       else if (score>80 )
       {
          System.out.println("He has the grade A-");
       }
       else if (score>70 )
       {
          System.out.println("He has the grade B");
       }
       else if (score>=60 )
       {
          System.out.println("The present student has the exam with grade C");
       }

       else
       {
          System.out.println("The student has fall this exam");
       }
    }
}
