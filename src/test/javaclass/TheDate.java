package com.alpha.alipay.javaclass;

import java.time.LocalDateTime;
import java.time.LocalDate;
// import java.format.DateTimeFormatter;


class TheDate
{
  public static void main(String[] args)
  {
    LocalDate date=LocalDate.now();
    LocalDateTime the_time=LocalDateTime.now();
    System.out.println("The date is "+date);
    System.out.println("The time right now is "+the_time);

  }
}
