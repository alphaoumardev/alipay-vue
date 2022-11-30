package com.alpha.alipay.classe;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Login extends JFrame implements ActionListener {

    //定义组件
    JButton jb1,jb2=null;
    JRadioButton jrb1,jrb2=null;
    JPanel jp1,jp2,jp3,jp4=null;
    JTextField jtf=null;
    JLabel jlb1,jlb2,jlb3=null;
    JPasswordField jpf=null;
    ButtonGroup bg=null;

    //设定用户名和密码
    final String stu_name="6";
    final String stu_pwd="1";
    final String tea_name="5";
    final String tea_pwd="1";

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Login  ms=new Login();
    }
    public Login()
    {
        //创建组件
        jb1=new JButton("登录");
        jb2=new JButton("重置");
        //设置监听
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        jrb1=new JRadioButton("教师");
        jrb2=new JRadioButton("学生");
        bg=new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb2.setSelected(true);

        jp1=new JPanel();
        jp2=new JPanel();
        jp3=new JPanel();
        jp4=new JPanel();

        jlb1=new JLabel("用户名：");
        jlb2=new JLabel("密    码：");
        jlb3=new JLabel("权    限：");

        jtf=new JTextField(10);
        jpf=new JPasswordField(10);
        //加入到JPanel中
        jp1.add(jlb1);
        jp1.add(jtf);

        jp2.add(jlb2);
        jp2.add(jpf);

        jp3.add(jlb3);
        jp3.add(jrb1);
        jp3.add(jrb2);

        jp4.add(jb1);
        jp4.add(jb2);

        //加入JFrame中
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        //设置布局管理器
        this.setLayout(new GridLayout(4,1));
        //给窗口设置标题
        this.setTitle("学生成绩管理系统");
        //设置窗体大小
        this.setSize(300,200);
        //设置窗体初始位置
        this.setLocation(600, 300);
        //设置当关闭窗口时，保证JVM也退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示窗体
        this.setVisible(true);
        this.setResizable(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(Objects.equals(e.getActionCommand(), "登录"))
        {
            //如果选中教师登录
            if(jrb1.isSelected())
            {
                tealogin();
            }else if(jrb2.isSelected()) //学生在登录系统
            {
                stulogin();
            }

        }else if(Objects.equals(e.getActionCommand(), "重置"))
        {
            clear();
        }

    }

    //学生登录判断方法
    public void stulogin()
    {
        if(stu_name.equals(jtf.getText())&&stu_pwd.equals(jpf.getText()))
        {
//			System.out.println("登录成功");
            JOptionPane.showMessageDialog(null,"登录成功！","提示消息",JOptionPane.WARNING_MESSAGE);
            clear();
        }else if(jtf.getText().isEmpty()&&jpf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"请输入用户名和密码！","提示消息",JOptionPane.WARNING_MESSAGE);
        }else if(jtf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"请输入用户名！","提示消息",JOptionPane.WARNING_MESSAGE);
        }else if(jpf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"请输入密码！","提示消息",JOptionPane.WARNING_MESSAGE);
        }else
        {
            JOptionPane.showMessageDialog(null,"用户名或者密码错误！\n请重新输入","提示消息",JOptionPane.ERROR_MESSAGE);
            //清空输入框
            clear();
        }
    }
    //教师登录判断方法
    public void tealogin()
    {
        if(tea_name.equals(jtf.getText())&&tea_pwd.equals(jpf.getText()))
        {
//			System.out.println("登录成功");
            JOptionPane.showMessageDialog(null,"登录成功！","提示消息",JOptionPane.WARNING_MESSAGE);
            clear();
        }else if(jtf.getText().isEmpty()&&jpf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"请输入用户名和密码！","提示消息",JOptionPane.WARNING_MESSAGE);
        }else if(jtf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"请输入用户名！","提示消息",JOptionPane.WARNING_MESSAGE);
        }else if(jpf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"请输入密码！","提示消息",JOptionPane.WARNING_MESSAGE);
        }else
        {
            JOptionPane.showMessageDialog(null,"用户名或者密码错误！\n请重新输入","提示消息",JOptionPane.ERROR_MESSAGE);
            //清空输入框
            clear();
        }
    }
    //清空文本框和密码框
    public	void clear()
    {
        jtf.setText("");
        jpf.setText("");
    }

}