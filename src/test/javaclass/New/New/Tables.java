package com.alpha.alipay.javaclass.New.New;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.*;


public class Tables extends JFrame implements ActionListener 
{
    private static final long serialVersionUID = 1L;
    JLabel the_title=new JLabel("学生信息与成绩表");
    JPanel the_panel =new JPanel();
    JLabel jl1 = new JLabel("Stu_Id");
    JLabel jl2 = new JLabel("Name");
    JLabel jl3 = new JLabel("Sex");
    JLabel jl4 = new JLabel("Birthday");

    
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3 = new JPanel();
    JPanel jp4 = new JPanel();
    JPanel jp = new JPanel();

    JTextField jtf1 = new JTextField(8);
    JTextField jtf2 = new JTextField(8);
    JTextField jtf3 = new JTextField(8);
    JTextField jtf4 = new JTextField(8);

    JButton bt1 = new JButton("Add");
    JButton bt2 = new JButton("Change");
    JButton insert = new JButton("Insert");
    JButton bt3 = new JButton("Delete");
    JButton bt4 = new JButton("Refresh");
    JButton bt5 = new JButton("Close");
    
    JPanel button = new JPanel();
    DefaultTableModel dt_model = new DefaultTableModel();
    JTable tab = new JTable(dt_model);
    JScrollPane jsp = new JScrollPane(tab);

    public JTable buildTable() 
    {
        Vector<String> title = new Vector<String>();
        title.add("Stu_Id");
        title.add("Name");
        title.add("Sex");
        title.add("Birthday");
        select c = new select();

        dt_model.setDataVector(c.getinfo(), title);
        tab = new JTable(dt_model) {

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        return tab;
    }
    
    Tables() {
       super("AlphaOumar Diallo");

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        insert.addActionListener(this);

        the_panel.add(the_title);
        jp1.add(jl1);
        jp1.add(jtf1);

        jp2.add(jl2);
        jp2.add(jtf2);

        jp3.add(jl3);
        jp3.add(jtf3);

        jp4.add(jl4);
        jp4.add(jtf4);

        jp.add(jp1);
        jp.add(jp2);
        jp.add(jp3);
        jp.add(jp4);
        // jp.add(the_panel);

        button.add(bt1);
        button.add(insert);
        button.add(bt2);
        button.add(bt3);
        button.add(bt4);
        button.add(bt5);

        this.add(the_panel);
        this.add(jp,"North");
        this.add(jsp,"Center");
        this.add(button, "South");
        this.setVisible(true);
        this.setSize(800, 300);
        tab = this.buildTable(); // Displaying the table

        // jp.setLayout(new GridLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setLocation(120,500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action performed Everything is going well");

        String name = jtf1.getText();
        String id = jtf2.getText();
        String com = jtf3.getText();
        String number = jtf4.getText();
        Vector<String> data = new Vector<String>();
        data.add(name);
        data.add(id);
        data.add(com);
        data.add(number);

        int the_row=tab.getSelectedRow();
        if (e.getSource() == bt1) {
            dt_model.addRow(data);
        }
        if (e.getSource() == bt2) {
            if (the_row == -1)
            {
                JOptionPane.showMessageDialog(this, "The row is empty");
            }
            else
            {
                dt_model.setValueAt(id, the_row, 0);
                dt_model.setValueAt(name, the_row, 1);
                dt_model.setValueAt(com, the_row, 2);
                dt_model.setValueAt(number, the_row,3);
            }

        }
        if (e.getSource() == bt3)
        {
            if(the_row==-1)
            {
                JOptionPane.showMessageDialog(this, "The row is empty");
            }
            else
            {
                dt_model.removeRow(the_row);
            }
        }
        if (e.getSource() == insert) 
        {
            dt_model.insertRow(0,data);
        }
        if (e.getSource() == bt4) 
        {
            dt_model.addRow(data);
        }
        if (e.getSource() == bt5) 
        {
            dt_model.addRow(data);
        }
    }
    public static void main(String[] args) {
        new Tables();
    }
}
