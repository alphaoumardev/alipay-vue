package com.alpha.alipay.javaclass.New.New;

import java.io.Serial;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class table extends JFrame 
{
    
    @Serial
    private static final long serialVersionUID = 1L;
    
    DefaultTableModel model = new DefaultTableModel();
    String operation = "";
    JScrollPane jsp;
    JPanel jp1;
    JButton jbmod;
    JButton jbadd;
    JButton jbdel;
    JButton jbflush;
    JButton jbclose;

    JTable table;

    public table() {
        this.setTitle("AlphaOumar Diallo");

        table = this.buildTable();
        jsp = new JScrollPane(table);

        jp1 = new JPanel();
        jbmod = new JButton("Change");
        jbflush=new JButton("Refresh");
        jbadd = new JButton("Add");
        jbdel = new JButton("Delete");
        jbclose=new JButton("Close");

        jp1.add(jbadd);
        jp1.add(jbmod);
        jp1.add(jbdel);
        jp1.add(jbflush);
        jp1.add(jbclose);

        this.add(jsp, "Center");
        this.add(jp1, "South");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        // Ìí¼Ó´°¿ÚÊÂ¼þ¼àÌý

    }

    public JTable buildTable() {
        JTable jt;
        Vector<String> title = new Vector<String>();
        title.add("First");
        title.add("Second");
        title.add("First");
        title.add("Second");

        select c = new select();

        model.setDataVector(c.getinfo(), title);
        jt = new JTable(model) {
           
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        return jt;
    }

    public static void main(String[] args) {
        new table();

    }

}
