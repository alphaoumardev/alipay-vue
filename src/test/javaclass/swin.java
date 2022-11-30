package com.alpha.alipay.javaclass;
// import javax.swing.BorderFactory;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class swin extends JFrame 
{

   
    private static final long serialVersionUID = 2L;
    JLabel jl = new JLabel("User");
    JLabel jl1 = new JLabel("pass");

    JPanel jp = new JPanel();
    JPanel jp1 =new JPanel();

    JPanel jp3=new JPanel();

    JTextField jt=new JTextField(15);
    JTextField jt1=new JTextField(15);
    
    JButton jb = new JButton("Cancel");
    JButton jb1 = new JButton("Confirm");


    public swin()
    {
        super("Diallo");
        this.setVisible(true);
        this.setSize(300,300);
        // this.setLocation(120,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jp.add(jl);
        jp.add(jt);
        jp1.add(jl1);
        jp1.add(jt1);

        jp3.add(jp);
        jp3.add(jp1);
        this.add(jp3);
        // this.add(jp3,"SOUTH");
        jp3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        

    }
    public static void main(String[] args) 
    {
        new swin();
    }
}