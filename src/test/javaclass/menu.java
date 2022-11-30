package com.alpha.alipay.javaclass;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menu extends JFrame
{
        private static final long serialVersionUID = 1L;
        // Menu
                JMenuBar jmbar=new JMenuBar();
                JMenu jm1=new JMenu("File");
                JMenu jm2=new JMenu("Edit");
                JMenu jm3=new JMenu("Selection");
        
        // Menu bar items File
                JMenuItem jmi1=new JMenuItem("open");
                JMenuItem jmi2=new JMenuItem("save");
        
                JMenu jmi3=new JMenu("preferences");//to make another  INNER MENU 
                    JMenuItem jmi_file1=new JMenuItem("settings");
                    JMenuItem jmi_file2=new JMenuItem("extentions");
                    JMenuItem jmi_file3=new JMenuItem("keymaps");
        
        // Menu bar items Edit
                JMenuItem jmi4=new JMenuItem("cut");
                JMenuItem jmi5=new JMenuItem("copy");
                JMenuItem jmi6=new JMenuItem("paste");
        
        //Menu bar items Selection
                JMenuItem jmi7=new JMenuItem("expand");
                JMenuItem jmi8=new JMenuItem("move");
                JMenuItem jmi9=new JMenuItem("duplicate");
        // the bar

    menu()
    {
        // the constructure
        super("Menu");
        jmbar.add(jm1);
        jmbar.add(jm2);
        jmbar.add(jm3);
// menubar FILE
        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.add(jmi3);
            jmi3.add(jmi_file1);
            jmi3.add(jmi_file2);
            jmi3.add(jmi_file3);

                // this.add(jmi3);
// Menu bar Edit
        jm2.add(jmi4);
        jm2.add(jmi5);
        jm2.add(jmi6);
//Menu bar Selection
        jm3.add(jmi7);
        jm3.add(jmi8);
        jm3.add(jmi9);

        this.setJMenuBar(jmbar);
        // this.add(jmbar);
        
        this.setSize(400,250);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) 
    {
        new menu();
    }
}
