package com.alpha.alipay.classe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StudentManage extends JFrame implements ActionListener
{
    JPanel centerPanel;
    public StudentManage()
    {
        init();
    }
    private void init()
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StudentManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        setIconImage(new ImageIcon("lala.png").getImage());
        setSize(600,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel topjpanel = new JPanel();
        JLabel toplab = new JLabel("BIENVENUE A LA PLATEFORME DES ETUDIANTS");
        toplab.setFont(new Font("黑体", Font.BOLD, 20));
        topjpanel.add(toplab,BorderLayout.CENTER);
        add(topjpanel, BorderLayout.NORTH);

        JPanel menupanel = new JPanel();
        menupanel.setLayout(new GridLayout(3,1));
        String [] strings ={"Enroll","Search","Quit"};
        JButton [] buts = new JButton[strings.length];

        for (int i = 0; i < strings.length; i++)
        {
            buts[i] = new JButton(strings[i]);
            buts[i].addActionListener(this);
            buts[i].setFont(new Font("黑体", Font.BOLD, 18));
            menupanel.add(buts[i]);
        }
        add(menupanel, BorderLayout.WEST);


        centerPanel = new JPanel();
        JLabel centerlab = new JLabel(new ImageIcon("/login_img.png"));
        centerlab.setFont(new Font("宋体", Font.BOLD, 36));
        centerPanel.add(centerlab);
        add(centerPanel);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if ("Enroll".equals(e.getActionCommand()))
        {
            centerPanel.setVisible(false);
            centerPanel = new AddStudent();
            add(centerPanel);
        }else if ("Search".equals(e.getActionCommand()))
        {
            centerPanel.setVisible(false);
            centerPanel = new ShowStudents();
            add(centerPanel);
        }else
        {
            dispose();
        }
        validate();
    }
}


