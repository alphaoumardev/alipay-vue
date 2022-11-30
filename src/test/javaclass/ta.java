package com.alpha.alipay.javaclass;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ta extends JFrame {
    private static final long serialVersionUID = 1L;
    String[] title = { "ClassNum", "ClassName" };
    String[][] data = { { "1", "Diallo", "Daojia" }, { "2", "Bah", "Tencent" }, { "3", "Barry", "Sofia" } };

    ta() {
        super("Classs settings");
        JTable tab = new JTable(data, title);
        JScrollPane jsp = new JScrollPane(tab);
        JButton bt1 = new JButton("Add");
        JButton bt2 = new JButton("Change");
        JButton bt3 = new JButton("Delete");
        JButton bt4 = new JButton("We");
        JButton bt5 = new JButton("Close");

        JPanel button =new JPanel();
            button.add(bt1);
            button.add(bt2);
            button.add(bt3);
            button.add(bt4);
            button.add(bt5);

            
        this.add(jsp);
        this.add(button,"North");

        this.setVisible(true);
        this.setSize(500,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) 
    {
        new ta();    
    }
}

