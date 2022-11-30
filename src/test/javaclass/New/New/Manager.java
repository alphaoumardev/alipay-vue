package com.alpha.alipay.javaclass.New.New;

class Manager
{
   String name;
    double salary;
   String adress;
  public Manager(String name, double salary,String adress)
  {
    this.name=name;
    this.salary=salary;
    this.adress=adress;
  }

  public void show()
  {
    System.out.println("Diallo "+name+salary+" Huaian"+adress);
  }
}
 class Employee extends Manager
{
  public Employee(String name, double salary, String adress) {
		super(name, salary, adress);
	}

public int department;

  public Employee(String name, double salary,String adress,int department)
  {
    super(name,salary,adress);
    this.department=department;
  }


}
 class Director extends Manager
{
 public String transport;
 public Director(String name, double salary,String adress ,String transport)
 {
   super(name,salary,adress);
   this.transport=transport;
 }

 public static void main(String[] args)
 {
   Manager man =new  Manager("sdfnd",43.3,"tretrge");
  man.show();
 }
}

