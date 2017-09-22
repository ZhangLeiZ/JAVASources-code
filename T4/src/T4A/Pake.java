package T4A;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Pake extends JFrame {

	JPanel pansouth,pancenter;
	JLabel lblname,lbldcon;
	JButton btnok,btnclose;
	JTextField textname;
	JPasswordField textdcon;
	JLabel lblme;
	public Pake() {
	
		super("登入测试");
//		Icon icon = new ImageIcon("Images/untitled7.jpg");
//		lblme = new JLabel(icon);
//	    add(lblme);
		Container c = getContentPane();
	    Image image = new ImageIcon("Images/untitled8.jpg").getImage();
	    image = image.getScaledInstance(500, 400, 0);
	    JLabel label = new JLabel();
	    label.setIcon(new ImageIcon(image));
	    c.add(label);
	    
	   
	    
	    btnok = new JButton("确定");
	    btnclose = new JButton("取消");
	    pansouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    pansouth.add(btnok);
	    pansouth.add(btnclose);
	    c.add(pansouth,BorderLayout.SOUTH);
	   
	    
	    
//        pancenter = new JPanel(null);
//	    lblname = new JLabel("账号：");
//	    lbldcon = new JLabel("密码：");
//	    lblname.setBounds(150,100,100,30);
//	    lbldcon.setBounds(150, 150, 100, 30);
//	    pancenter.add(lblname);
//	    pancenter.add(lbldcon);
//	    c.add(pancenter);
//	    
	    
		setSize(500, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Pake();
	}
	
}
