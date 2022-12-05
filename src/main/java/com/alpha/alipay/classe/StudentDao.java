package com.alpha.alipay.classe;

public interface StudentDao
{
    boolean addStudent(Student s);

    String[][] getStudends();

    Student getStudentById(String id);

    Student getStudentByname(String name);

    void delStudent(String id);

    boolean ifexitname(Student student);

    boolean ifexitid(Student student);

    void editStudent(Student student,String id);
}

