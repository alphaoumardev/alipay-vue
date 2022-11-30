package com.alpha.alipay.javaclass;// package SwingTest;

import javax.swing.JFrame;

public class JFrameshow extends JFrame{
	
	private static final long serialVersionUID = 1L;

	JFrameshow(String title){
		super(title);
		
		this.setSize(300,200);
		this.setLocation(200, 200);
//		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new JFrameshow("Jframe");
	}
 
}
