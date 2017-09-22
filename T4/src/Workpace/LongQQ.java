package Workpace;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Savepoint;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LongQQ extends JFrame{

	
	JLabel lblpwd,lblreg,lblHamig;
	JButton btnlogin;
	JPasswordField txtpassword;
	JComboBox txtQQcode;
	JCheckBox cbjzpass,cbzdlongin;
	
	int x;
	int y;
	public LongQQ() {
		
		setUndecorated(true);
		Toolkit tool =Toolkit.getDefaultToolkit();
		Image icon = tool.getImage("Images/tubiao.jpg");
		setIconImage(icon);
		
		JLabel bg = new JLabel(new ImageIcon("Images/login.jpg"));
		bg.setLayout(null);
		add(bg);
		
		txtQQcode = new JComboBox();
		txtQQcode.setEditable(true);
		txtQQcode.setBounds(130, 185, 194, 30);
		txtQQcode.setToolTipText("QQ账号");
		bg.add(txtQQcode);
		txtpassword = new JPasswordField();
		txtpassword.setBounds(130, 215, 195, 30);
		txtpassword.setToolTipText("QQ密码");
        bg.add(txtpassword); 
		cbjzpass = new JCheckBox("记住密码");
		cbjzpass.setBounds(127, 244, 80, 30);
		bg.add(cbjzpass);
		cbzdlongin = new JCheckBox("自动登入");
		cbzdlongin.setBounds(254, 244, 80, 30);
		bg.add(cbzdlongin);
		lblpwd = new JLabel("      ");
		lblpwd.setBounds(335, 215, 80, 30);
		bg.add(lblpwd);
		lblreg = new JLabel("      ");
		lblreg.setBounds(335, 185, 80, 30);
		bg.add(lblreg);
		
		
		btnlogin = new JButton(new ImageIcon("Images/wanc.png"));
		btnlogin.setBounds(130, 278, 195, 30);
		bg.add(btnlogin);
	
		
		
		JLabel lblicon3 = new JLabel(new ImageIcon("Images/qqname.gif"));
		lblicon3.setBounds(0, 0, 430, 175);
		bg.add(lblicon3); 
		
		lblHamig = new JLabel(new ImageIcon("Images/0_l.png"));
		lblHamig.setBounds(70, 185, 60, 60);
		bg.add(lblHamig);
		
		setSize(427,321);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new LongQQ();
	}

	
	}
	
	

