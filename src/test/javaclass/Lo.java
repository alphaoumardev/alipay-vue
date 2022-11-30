package com.alpha.alipay.javaclass;

import java.awt.GridLayout;

import javax.swing.*;

public class Lo extends JFrame {
	
    private static final long serialVersionUID = 1L;
    JLabel labName = new JLabel("Usermane");
    JLabel labPwd=new JLabel("Password");
    JLabel labtext=new JLabel("  ");
    JTextField txtName=new JTextField(20);
    JPasswordField txtPwd=new JPasswordField(20);
    JButton btnOk=new JButton("Ok");
    JButton btnCancel=new JButton("Cancel");
    JPanel pan=new JPanel();
    JPanel pan1=new JPanel();
    JPanel pan2=new JPanel();
    JPanel pan3=new JPanel();
    JPanel pan4=new JPanel();
  
    Lo(){
    	
        super("Title");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pan.setBorder(BorderFactory.createTitledBorder("Border"));
        pan.setLayout(new GridLayout(2,1));
        
      
        pan1.add(labName);
        pan1.add(txtName);
        pan2.add(labPwd);
        pan2.add(txtPwd);
     
        pan.add(pan1);
        pan.add(pan2);
        pan3.add(btnOk);
        pan3.add(btnCancel);
       
        add(pan,"Center");
        add(pan3,"South");
        
        this.setLocationRelativeTo(null);
        setVisible(true);
        
       
    }
    
    public static void main(String[] args) {
        new Lo();
    }
}
