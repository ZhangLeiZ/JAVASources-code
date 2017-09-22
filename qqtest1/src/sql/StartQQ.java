package sql;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class StartQQ extends JFrame{
	JPanel pan1,pan2,pan3;
	JLabel labsymbel;
	JButton jbzhuce,jbfindback;
	JButton jbrela=new JButton(" 登录  ");
	JTextField jtnumbel,jtpassword;
	public StartQQ() {

		Toolkit tk=Toolkit.getDefaultToolkit();
		ImageIcon ima=new ImageIcon("qqname.png");
		ImageIcon ima2=new ImageIcon("pic/5.gif");
		labsymbel=new JLabel(ima);
		jbzhuce=new JButton("注册账号");
		jbfindback=new JButton("找回密码");
		JLabel labimgname=new JLabel(ima2);
		JButton jbexit=new JButton("  退出  ");
		jtnumbel=new JTextField(20);
		jtpassword=new JTextField(20);
		pan2=new JPanel(null);
		pan3=new JPanel();
		pan2.add(labimgname);
		labimgname.setBounds(50,5,40,40);
		pan2.add(jtnumbel);
		jtnumbel.setBounds(90,10,150,30);
		pan2.add(jtpassword);
		jtpassword.setBounds(90,45,150,30);
		pan2.add(jbzhuce);
		jbzhuce.setBounds(250,10,95,30);
		jbzhuce.setContentAreaFilled(false);
		pan2.add(jbfindback);
		jbfindback.setBounds(250,45,95,30);
		jbfindback.setContentAreaFilled(false);
		pan3.add(jbrela,BorderLayout.CENTER);
		pan3.add(jbexit,BorderLayout.CENTER);
		this.add(labsymbel,BorderLayout.NORTH);
		add(pan3,BorderLayout.SOUTH);
		add(pan2,BorderLayout.CENTER);
		//监听
		
		
		
		
		
		//UIManager.setLookAndFeel(com.sun.java.swing.plaf.motif.MotifLookAndFeel);
		setUndecorated(true);
		this.setSize(430,330);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		new StartQQ();
	}
	
}
