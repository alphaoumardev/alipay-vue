package com.alpha.alipay.javaclass.New.New;

import javax.swing.*;
// import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;

    JLabel name = new JLabel("名称");
    JLabel password = new JLabel("密码");
    JTextField tname = new JTextField(15);
    JPasswordField tpass = new JPasswordField(15);

    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    login() {
        super("Login");

        panel3.add(name);
        panel3.add(tname);

        panel4.add(password);
        panel4.add(tpass);
        panel1.add(panel3);
        panel1.add(panel4);

        panel2.add(ok);
        panel2.add(cancel);
        this.add(panel1);
        ok.addActionListener(this);
        cancel.addActionListener(this);

        this.add(panel2, "South");

        this.setVisible(true);
        this.setSize(300, 180);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//俺老婆和粉色的发达水平很高的事实的

    }


    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==ok)
        {
                String na=tname.getText().trim();
                String pa=tpass.getText().trim();
            if(na.equals("oumar")&&pa.equals("123"))
            {
                this.dispose();
                new Tables();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "There is a problem", "error", 1);
            }
        }
        if (e.getSource()==cancel)
        {
            tname.setText("text");
            tpass.setText("text");
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
