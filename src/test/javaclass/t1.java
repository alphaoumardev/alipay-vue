package com.alpha.alipay.javaclass;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class t1 extends JFrame {
	private static final long serialVersionUID = 1L;

	t1() {
		super("Menu");

		JMenuBar jm = new JMenuBar();

		JMenu jm1 = new JMenu("File");
		JMenu jm2 = new JMenu("Edit");

		JMenuItem jmi1 = new JMenuItem("open");
		JMenuItem jmi2 = new JMenuItem("close");
		JMenu jm3 = new JMenu("New");
		JMenuItem jmi3 = new JMenuItem("Java Project");

		jm.add(jm1);
		jm.add(jm2);

		jm1.add(jmi1);
		jm1.addSeparator();
		jm1.add(jmi2);
		jm1.add(jm3);
		jm3.add(jmi3);

		this.setJMenuBar(jm);

		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new t1();

	}

}
