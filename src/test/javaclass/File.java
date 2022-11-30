package com.alpha.alipay.javaclass;

import java.io.FileWriter;
import java.io.IOException;

public class File {

  public static void main(String[] args) throws IOException
  {
    FileWriter the_writting = new FileWriter("File.txt");
    the_writting.write("Alpha oumar Diallo id is 16");
    System.out.println("You have succefully wrote the doc");
  }
}
