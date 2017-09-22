package QQ2016;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.UIManager;

public class lookinfoUI extends JFrame implements ActionListener,MouseListener{
	JLabel labimg, labqqcode,labnickName,labage;
	JLabel labsex,labnation,labhobit,labremark;
	public lookinfoUI(){};
	public lookinfoUI(AccountVO info) {
		super("好友资料");
		ImageIcon imag=new ImageIcon("e/bg6.jpg");
		labqqcode=new JLabel("QQ账号:"+info.getQqCode(),JLabel.LEFT);
		labnickName=new JLabel("昵称: "+info.getNickName(),JLabel.LEFT);
		labage=new JLabel("生日: "+info.getBrith(),JLabel.LEFT);
		//去修饰框
		setUndecorated(true);
		labsex=new JLabel("性别: "+info.getSex(),JLabel.LEFT);
		labnation=new JLabel("民族: "+info.getNation(),JLabel.LEFT);
		labhobit=new JLabel("爱好: "+info.getHobit(),JLabel.LEFT);
		labremark=new JLabel("个人说明: "+info.getRemark(),JLabel.LEFT);
		labimg=new JLabel(imag);
		labimg.add(labqqcode);
		labimg.add(labnickName);
		labimg.add(labsex);
		labimg.add(labage);
		labimg.add(labhobit);
		labimg.add(labremark);
		labimg.add(labnation);
		
		labqqcode.setBounds(50,10,120,20);
		labnickName.setBounds(50,40,80,20);
		labsex.setBounds(50,70,70,20);
		labage.setBounds(50, 100, 100, 20);
		labnation.setBounds(50,130,100,20);
		labhobit.setBounds(50,160,150,20);
		labremark.setBounds(50,190,200,20);
		
		//监听
		 
		labimg.setLayout(null);
		this.addMouseListener(this);
		add(labimg);
		
		labimg.setBounds(0, 0,imag.getIconWidth(),imag.getIconHeight());
		setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new lookinfoUI();
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	public void mouseClicked(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		dispose();
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
