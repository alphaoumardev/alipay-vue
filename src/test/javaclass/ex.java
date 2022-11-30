package com.alpha.alipay.javaclass;

import java.util.Scanner;
public class ex 
{
    private static Scanner diallo;
    public static void main(String[] args) 
    {
       try {
            diallo = new Scanner(System.in);
            System.out.println("Please input a number");
            int a=diallo.nextInt();
            System.out.println("Please input a number");
            int b = diallo.nextInt();
            int result =a+b;
            System.out.println("The result is "+result);
        }
        catch(Exception alpha)
        {
            System.out.println("The code has no error");
        }
    }
}
