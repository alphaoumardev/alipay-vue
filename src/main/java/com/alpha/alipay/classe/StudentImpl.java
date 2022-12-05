package com.alpha.alipay.classe;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class StudentImpl implements StudentDao
{
    private static List<Student> list= new ArrayList<>();
    private static final String filename="Student";
    static
    {
        File file =new File(filename);
        if (file.exists())
        {
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            try
            {
                fis = new FileInputStream(filename);
                ois=new ObjectInputStream(fis);
                list =(ArrayList<Student>) ois.readObject();

            }
            catch(EOFException e)
            {
                e.printStackTrace();
                list = new ArrayList<>();
            }
            catch (Exception e)
            {
                // TODO Auto-generated catch block
                JOptionPane.showMessageDialog(null, "读取学生数据文件错误！请检查文件！");
                e.printStackTrace();
            }finally
            {
                try
                {
                    if(ois!=null)
                        ois.close();
                } catch (Exception e2)
                {
                    // TODO: handle exception
                    e2.printStackTrace();
                }
            }
        }
    }

    public boolean addStudent(Student student)
    {
        // TODO Auto-generated method stub
        for(Student s:list)
        {
            if(student.getId().equals(s.getId()))
            {
                return false;
            }
        }
        list.add(student);
        save();
        return true;
    }

    private static void save()
    {
        // TODO Auto-generated method stub
        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try
        {
            fos = new FileOutputStream(filename);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "An Error occurs while reading the table！");
            e.printStackTrace();
        } finally
        {
            if (oos != null)
                try
                {
                    oos.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
        }
    }

    public String[][] getStudends()

    {
        // TODO Auto-generated method stub
        String[][] data = new String[list.size()][5];
        int row = 0;
        for (Student s : list)
        {
            data[row][0] = s.getId();
            data[row][1] = s.getName();
            data[row][2] = s.getClassname();
            row++;
        }
        return data;
    }

    public  Student getStudentById(String id)

    {
        Student student = null;
        for(Student s:list)
        {
            if(s.getId().equals(id))

            {
                student = s;
            }
        }
        return student;
    }
    public  Student getStudentByname(String name)
    {
        Student student = null;
        for(Student s:list)
        {
            if(s.getName().equals(name))

            {
                student = s;
            }
        }
        return student;
    }
    public void delStudent(String id)
    {
        // TODO Auto-generated method stub
        if("".equals(id)) return;
        list.removeIf(student -> id.equals(student.getId()));
        save();
    }
    public  boolean ifexitname(Student student)
    {
        // TODO Auto-generated method stub
        for(Student s:list)
        {
            if(student.getName().equals(s.getName()))
            {
                return true;
            }
        }
        return false;
    }
    public  boolean ifexitid(Student student)
    {
        // TODO Auto-generated method stub
        for(Student s:list)
        {
            if(student.getId().equals(s.getId()))
            {
                return true;
            }
        }
        return false;
    }
    public  void editStudent(Student student,String id)
    {
        delStudent(id);
        addStudent(student);
    }
}

