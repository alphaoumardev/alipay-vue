package com.alpha.alipay.javaclass;

public class exception
{
    public static void main(String[] args)
    {
        try 
        {
           String languages[]={"c/c++","java","python","javascript","ruby"}; 
           int i=0;
           while (i < 7)
           {
               System.out.println(languages[i]);
           }
        } 
        catch (Exception e) 
        {
            System.out.println("languages");
        }
        finally
        {
            System.out.println("The exception has been denied");
        }
    }
}