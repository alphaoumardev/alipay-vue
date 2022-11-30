package com.alpha.alipay.javaclass;

import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class show_data extends JFrame 
{
    private static final long serialVersionUID = 1L;
    DefaultTableModel model = new DefaultTableModel();

    public show_data() {
        this.setTitle("AlphaOumar Diallo");

        JTable table = this.buildTable();
        JScrollPane jsp = new JScrollPane(table);

        JPanel jp1 = new JPanel();
        JButton jbmod = new JButton("Change");
        JButton jbrefresh=new JButton("Refresh");
        JButton jbadd = new JButton("Add");
        JButton jbdel = new JButton("Delete");
        JButton jbclose=new JButton("Close");
//input the buttons in the table jspane
        jp1.add(jbadd);
        jp1.add(jbmod);
        jp1.add(jbdel);
        jp1.add(jbrefresh);
        jp1.add(jbclose);

        this.add(jsp, "Center");
        this.add(jp1, "South");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public JTable buildTable() {
        Vector<String> title = new Vector<String>();
        title.add("First");
        title.add("Second");
        title.add("First");
        title.add("Second");
        
        select_data c = new select_data(); //from the select file
        
        model.setDataVector(c.getTheInfoFromTheClass(), title);
        // To get the data in the table
        JTable jtable;
        jtable = new JTable(model) 
        {
            private static final long serialVersionUID = 1L;
            public boolean isCellEditable(int row, int column) 
            {
                return false;
            }
        };

        return jtable;//finally return the table
    }
    public static void main(String[] args) 
    {
        new show_data(); //show the data 
    }
}
