package com.alpha.alipay.javaclass.New.New;// package SwingTest;/

// import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JpanelTest extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	JButton jb1;
	JPanel jp;

	
	JpanelTest(String title){
		super(title);
		jb1=new JButton("����");
		jp=new JPanel();
//		jp.setBorder(BorderFactory.createTitledBorder("Jpanel"));
		jp.add(jb1);
		this.add(jp);
		this.setSize(300,200);//���ÿ�ܴ�С
		this.setLocation(200, 200);//���ÿ����ʾ��λ��
//		this.setLocationRelativeTo(null);//������ʾ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ڱ��رյ�ʱ����˳�JVM
		this.setVisible(true);//�ɼ�
	}
	
	
	//������ʵ��������
	public static void main(String[] args) {
		new JpanelTest("���ʹ����ϰ");
	}
 
}
