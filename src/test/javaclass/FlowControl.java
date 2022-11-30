package com.alpha.alipay.javaclass;

import java.util.Scanner;
public class FlowControl
{
  private static Scanner input;
  private static Scanner sc;
  private static Scanner bien;

  public static void main(String[] args)
  {
    input = new Scanner(System.in);
    int time=input.nextInt();
    System.out.println("Please prompt a couple of digital ");
    String variable=input.nextLine();
    double alphabets=0;
    double numero=0;
    double characters=0;
    for(int digit=0;digit<variable.length();digit++)
    {
      char the=variable.charAt(digit);
      if(the>='a'&&the<='z'||the>='A'&&the<='Z')
      {
        alphabets++;
      }
      else if(the>='0'&&the<='9')
      {
        numero++;
      }
      else
      characters++;
    }
    System.out.println("The number of alphabets is going to be :"+alphabets+"Digit"+numero+"And Characters are "+characters);


    String result;
    int x=54;
    int y=6;

  result=(time<14)?"morning":"afternoon or nigth\n";
  System.out.println(result);

  if(time<10)
  {
    System.out.println("good morning");
  }
  else if(time<18)
  {
    System.out.println("Bien a vous merci");
  }
  else
  {
    System.out.println("Good night bro");
  }


    if(x < y)
    {
      System.out.println("The number is greather than");
    }
    else
    {
      System.out.println("The number x is greather than y");
    }

      sc = new Scanner(System.in);
      int day=sc.nextInt();

      String month = switch (day) {
        case 1 -> "jaunary";
        case 2 -> "fabaury";
        case 3 -> "march";
        case 4 -> "April";
        case 5 -> "May";
        case 6 -> "june";
        case 7 -> "july";
        case 8 -> "september";
        case 9 -> "october";
        case 10 -> "november";
        default -> "August and December";
      };

    System.out.println(month);
      char operator;
      double a,b;
      bien = new Scanner(System.in);
      System.out.println("Please input your operator");
      operator=bien.next().charAt(0);
      System.out.println("Input your value");

      a=bien.nextDouble();
      b=bien.nextDouble();

      switch(operator)
      {
        case '+':
        System.out.println(a+"+"+b);
        break;
        case '-':
        System.out.println(a+"-"+b);
        break;
        case '*':
        System.out.println(a+"*"+b);
        break;

        case '/':
        System.out.println(a+"/"+b);
        break;
        default:
        System.out.println("There is no operator");


      }
      System.out.println(operator);
      int k=0;
      while(k<=100)
      {

        System.out.print(k+"\t");
        k+=5;
      }
      do
      {
        System.out.print(k+"\t");
        k++;
      }while(k<=200);

      String[] cars = {"BMW","Toyota","Benz","Tesla"};
      //cars[4]="Tesla";
      for(int l=0;l<cars.length;l++)
      {
        System.out.println("\n"+cars[l]);
      }
      /*for(String eachFor : cars)
      {for(String data: eachFor)
      {
      System.out.println(data);
    }

      }*/
      System.out.println("\n"+cars.length);

      String[][] friends={{"al","ibra","thirno"},{"kadia","diara","oumou"}};
      for (String[] friend : friends) {
        for (String s : friend) {
          System.out.println("\t" + s);
        }
    }


         for(int i=0;i<10;i++)
         {
           for(int j=0;j<=i;j++)
           System.out.println("\n"+i+"*"+j+"="+i*j);
           System.out.println();
         }
  }

}
