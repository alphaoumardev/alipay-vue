package com.alpha.alipay.javaclass;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainForm extends JFrame  
{
	
    private static final long serialVersionUID = 1L;
    JMenu minstall = new JMenu("Alpha oumar");
    JMenuItem installClass=new JMenuItem("diallo");
    JMenuItem installsubject=new JMenuItem("soup");
    JMenuItem mexit=new JMenuItem("Rice");
    
    JMenu minformation=new JMenu("youare");
    JMenuItem mstu=new JMenuItem("hungry");
    JMenuItem mtec=new JMenuItem("now");
    JMenuItem mbasicscore=new JMenuItem("right");
    
    JMenu mQuery=new JMenu("sounds");
    JMenuItem mbasic=new JMenuItem("like");
    JMenuItem mScore=new JMenuItem("youhave");
    
    JMenuBar mBar=new JMenuBar();
    
    public MainForm(){
    	super("The menu");
        setSize(700,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        minstall.add(installClass);
        minstall.add(installsubject);
        minstall.add(mexit);
        
        minformation.add(mstu);
        minformation.add(mtec);
        minformation.add(mbasicscore);
        
        mQuery.add(mbasic);
        mQuery.add(mScore);
       
        mBar.add(minstall);
        mBar.add(minformation);
        mBar.add(mQuery);
      
        setJMenuBar(mBar);
        
        this.setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
    	new MainForm();
    }

    

}
