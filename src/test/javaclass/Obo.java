package com.alpha.alipay.javaclass;

public class Obo {
    private int the = 3443;
    private String studentName = "Diallo";

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static void main(String[] args)
    {
    System.out.println("Use 'NEW'from the class to the main function");
    Obo object = new Obo();
    System.out.println(object.the);
    }
}
