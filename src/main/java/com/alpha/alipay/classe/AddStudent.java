package com.alpha.alipay.classe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddStudent extends JPanel implements ActionListener
{
    JLabel lbid,lbclass,name;
    JTextField tfid,tfname,classname;
    JButton jButton;
    public AddStudent()

    {
        setLayout(null);
        Font font = new Font("黑体", Font.BOLD, 16);

        lbid=new JLabel("ID：");
        lbid.setBounds(50,70,100,40);
        lbid.setFont(font);

        tfid =new JTextField();
        tfid.setBounds(100,70,140,40);

        name=new JLabel("Name：");
        name.setBounds(50,170,100,40);
        name.setFont(font);

        tfname =new JTextField();
        tfname.setBounds(100,170,140,40);

        lbclass=new JLabel("Class：");
        lbclass.setBounds(50,270,100,40);
        lbclass.setFont(font);

        classname =new JTextField();
        classname.setBounds(100,270,140,40);

        jButton = new JButton("Enroll");
        jButton.setBounds(300,170,100,40);
        jButton.addActionListener(this);

        add(lbid);
        add(tfid);
        add(name);
        add(tfname);
        add(lbclass);
        add(classname);
        add(jButton);

        setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {

        String name = tfname.getText();
        if("".equals(name))
        {
            JOptionPane.showMessageDialog(this, "Fill up the student Name！",
                    "Error Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //whether the id is empty
        String id = tfid.getText();
        if("".equals(id))
        {
            JOptionPane.showMessageDialog(this, "Fill up the student Id！",
                    "Error Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //whether the class is empty
        String classn = classname.getText();
        if("".equals(classn))
        {
            JOptionPane.showMessageDialog(this, "Fill up Class！",
                    "Error Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }

//        long num = 0;
        try
        {
           Long.parseLong(tfid.getText());
        } catch(Exception e1)
        {
            JOptionPane.showMessageDialog(this, "Id should be Digits！",
                    "Error Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        StudentDao studentDao = new StudentImpl();
        Student student = new Student();
        student.setId(tfid.getText());
        student.setName(tfname.getText());
        student.setClassname(classname.getText());
        boolean b = studentDao.addStudent(student);
        if(b)
        {
            JOptionPane.showMessageDialog(this, "You have successfully enrolled！");
            tfname.setText(null) ;
            tfid.setText(null);
            classname.setText(null);
        }else
        {
            JOptionPane.showMessageDialog(this, "This student already Exists！",
                    "Error Warning",JOptionPane.ERROR_MESSAGE);
        }
    }
}

