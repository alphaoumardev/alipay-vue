package com.alpha.alipay.classe;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Objects;

public class ShowStudents extends JPanel
{
    JComboBox<String> comboUnit;
    JLabel idLabel,namelabel,classnamelabel;
    JTable table =null;
    JButton btnDel=null;
    JButton b,edit;
    JPanel jPanel,editpanel;
    JTextField jTextField,id,name,classname;
    String [] title=
            {"Id","Name","Class"};
    StudentDao studentDao = new StudentImpl();
    String [][]data=studentDao.getStudends();
    public ShowStudents()
    {
        jPanel = new JPanel();
        comboUnit = new JComboBox<>();
        comboUnit.addItem("By name");
        comboUnit.addItem("By Id");
        comboUnit.setSelectedIndex(1);

        jTextField = new JTextField(5);

        b = new JButton("Confirm");
        jPanel.add(comboUnit);
        jPanel.add(jTextField);
        jPanel.add(b);
        add(jPanel,BorderLayout.NORTH);

        editpanel = new JPanel();
        idLabel = new JLabel("ID：");
        id = new JTextField(5);

        namelabel = new JLabel("Name:");
        name = new JTextField(5);

        classnamelabel = new JLabel("Class：");
        classname = new JTextField(5);

        edit = new JButton("Save Changes");

        editpanel.add(idLabel);
        editpanel.add(id);
        editpanel.add(namelabel);
        editpanel.add(name);
        editpanel.add(classnamelabel);
        editpanel.add(classname);
        editpanel.add(edit);
        add(editpanel,BorderLayout.SOUTH);

        table = new JTable(data,title);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane js = new JScrollPane(table);
        js.setPreferredSize(new Dimension(500, 240));
        add(js,BorderLayout.CENTER);
        btnDel = new JButton("Remove");
        btnDel.addActionListener(e ->
        {
            int c = JOptionPane.showConfirmDialog(ShowStudents.this, "Are you sure to remove？",
                    "Confirm",JOptionPane.YES_NO_OPTION);
            if(c!=JOptionPane.YES_OPTION)
            {
                return;
            }
            int row = table.getSelectedRow();
            if(row==-1)
            {
                JOptionPane.showMessageDialog(ShowStudents.this, "The table is empty！！",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return ;
            }

            String id = data[row][0];
            if(!"".equals(id))
            {
                studentDao.delStudent(id);
                JOptionPane.showMessageDialog(ShowStudents.this, "Successfully removed！");
            }
            data = studentDao.getStudends();
            DefaultTableModel tableModel = new DefaultTableModel(data, title);
            table.setModel(tableModel);
            table.getColumnModel().getColumn(2).setPreferredWidth(200);
        });
        add(btnDel);

        b.addActionListener(e ->
        {
            String name = Objects.requireNonNull(comboUnit.getSelectedItem()).toString();
            if(name.equals("By Name"))
            {
                Student student = new Student();
                student.setName(jTextField.getText());
                boolean b = studentDao.ifexitname(student);
                if(b)
                {
                    student = studentDao.getStudentByname(jTextField.getText());
                    data[0][0] = student.getId();
                    data[0][1] = student.getName();
                    data[0][2] = String.valueOf(student.getClassname());
                    DefaultTableModel tableModel = new DefaultTableModel(data, title);
                    table.setModel(tableModel);
                    table.getColumnModel().getColumn(2).setPreferredWidth(200);
                }

                else
                {
                    JOptionPane.showMessageDialog(null, "This student does not exits!!",
                            "Error",JOptionPane.ERROR_MESSAGE);
                    jTextField.setText(null);
                    return;
                }
            }if(name.equals("By Id"))
            {
                Student student = new Student();
                student.setId(jTextField.getText());
                boolean b = studentDao.ifexitid(student);
                if(b)
                {
                    student = studentDao.getStudentById(jTextField.getText());
                    data[0][0] = student.getId();
                    data[0][1] = student.getName();
                    data[0][2] = student.getClassname();
                    DefaultTableModel tableModel = new DefaultTableModel(data, title);
                    table.setModel(tableModel);
                    table.getColumnModel().getColumn(2).setPreferredWidth(200);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "This student does not exists!!",
                            "Error",JOptionPane.ERROR_MESSAGE);
                    jTextField.setText(null);
                }
            }
        });
        edit.addActionListener(e ->
        {
            Student student = new Student();
            student.setId(id.getText());
            student.setName(name.getText());
            student.setClassname(classname.getText());
            int row = table.getSelectedRow();
            if(row==-1)

            {
                JOptionPane.showMessageDialog(ShowStudents.this, "已经没有数据可以修改！！",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return ;
            }
            String idnum = data[row][0];
            if(!"".equals(idnum) && !"".equals(student.getId())&& !"".equals(student.getName())&& !"".equals(student.getClassname()))
            {
                if(!studentDao.ifexitid(student))
                {
                    studentDao.editStudent(student,idnum);
                    JOptionPane.showMessageDialog(ShowStudents.this, "Changes saved！");
                }else
                {
                    JOptionPane.showMessageDialog(ShowStudents.this, "This student does not exist!!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            data = studentDao.getStudends();
            DefaultTableModel tableModel = new DefaultTableModel(data, title);
            table.setModel(tableModel);
            table.getColumnModel().getColumn(2).setPreferredWidth(200);
        });
    }
}


