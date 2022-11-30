package com.alpha.alipay.javaclass;// import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class The_File {
  private static FileWriter the_writting;

  public static void main(String[] args) throws IOException
  {
    the_writting = new FileWriter("File.txt");
    the_writting.write("Alpha oumar Diallo id is 16");
    System.out.println("You have succefully wrote the doc");

  }

}
