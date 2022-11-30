package com.alpha.alipay.javaclass;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameAdd extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	JButton jb1;

	
	JFrameAdd(String title){
		super(title);
		jb1=new JButton("Alpha");
//		this.add(jb1);
//		this.add(jb1,"North");
//		this.add(jb1,"South");
//		this.add(jb1,"East");
		this.add(jb1,"West");
		this.setSize(300,200);
		this.setLocation(200, 200);
//		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JFrameAdd("this is my first Jframe");
	}
 
}
