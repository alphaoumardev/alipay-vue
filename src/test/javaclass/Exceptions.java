package com.alpha.alipay.javaclass;

import java.util.Arrays;

public class Exceptions
{
  private static final char[] Name = null;

  public static void main(String[] args) {

    int[] numbers = new int[0];
    try {
      numbers = new int[]{1, 3, 4, 5};
      System.out.println(numbers[2]);
    } catch (Exception e) {
      System.out.println("Something is going wrong");
    }
    System.out.println("HELLO");
    System.out.println(Arrays.toString(numbers));
  }

}
