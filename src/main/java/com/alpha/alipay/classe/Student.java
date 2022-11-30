package com.alpha.alipay.classe;
import java.io.Serializable;

public class Student implements Serializable{
    private String id;
    private String name;
    private String classname;
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String id, String name, String classname) {
        super();
        this.id = id;
        this.name = name;
        this.classname = classname;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
}

