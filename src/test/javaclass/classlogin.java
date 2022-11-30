package com.alpha.alipay.javaclass;// import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// import javax.swing.border.Border;

public class classlogin extends JFrame {
    private static final long serialVersionUID = 1L;

    // private static final Border BorderFactory = null;

    JLabel name =new JLabel("ClassNum.");
    JLabel password =new JLabel("ClassNam.");
    JTextField tname=new JTextField(15);
    JTextField tpass=new JTextField(15);

    JButton ok=new JButton("Confirm");
    JButton cancel=new JButton("Cancel");

    JPanel panel1 =new JPanel();
    JPanel panel2 =new JPanel();
    JPanel panel3 =new JPanel();
    JPanel panel4 =new JPanel();
    JPanel panel5 =new JPanel();

    classlogin()
    {
        super("Class Add");

        panel3.add(name);
        panel3.add(tname);

        panel4.add(password);
        panel4.add(tpass);

        
        // panel1.setLayout(new GridLayout());
        // panel1.setBorder(  BorderFactory).createTitleBorder("username"));
        panel1.add(panel3);
        panel1.add(panel4);
        this.add(panel1);
        
        panel2.add(ok);
        panel2.add(cancel);
        
        this.add(panel2,"South");


        this.setVisible(true);
        this.setSize(350,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
    public static void main(String[] args) 
    {
        new classlogin();
    }
}