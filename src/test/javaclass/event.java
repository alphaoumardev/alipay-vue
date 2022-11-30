package com.alpha.alipay.javaclass;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class event 
{
    public event() 
    {
        JFrame jf = new JFrame("The event");
        jf.setBounds(200, 300, 400, 300);
        JButton btn1 = new JButton("Event_1");
        JButton btn2 = new JButton("Event_2");
        JPanel jp = new JPanel();
        // add the button in the panel
        jp.add(btn1);
        jp.add(btn2);
        jf.add(jp, "North");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) 
    {
        new event(); 
    }
    // public void actionPerformed(ActionEvent e)   
    // {

    // }
}
