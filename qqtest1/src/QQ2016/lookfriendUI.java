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

public class lookfriendUI extends JFrame implements ActionListener,MouseListener{
	JLabel labimg, labqqcode,labnickName,labage,lbclose,lbmin;
	JLabel labsex,labnation,labhobit,labremark;
	JButton jbadd=new JButton("添加好友");
	int jfx,jfy;
	AccountVO info,myinfo;
	public lookfriendUI(){};
	public lookfriendUI(AccountVO info,AccountVO myinfo) {
		super("好友资料");
		this.info=info;
		this.myinfo=myinfo;
		ImageIcon imag=new ImageIcon("e/bg6.jpg");
		labqqcode=new JLabel("QQ账号:"+info.getQqCode(),JLabel.LEFT);
		labnickName=new JLabel("昵称: "+info.getNickName(),JLabel.LEFT);
		labage=new JLabel("生日: "+info.getBrith(),JLabel.LEFT);
		//去修饰框
		setUndecorated(true);
		
		lbclose=new JLabel("×");
		lbmin=new JLabel("▂");
		lbmin.setForeground(Color.white);
		lbclose.setForeground(Color.white);
		lbclose.setFont(new Font("黑体",Font.BOLD,18));
		labsex=new JLabel("性别: "+info.getSex(),JLabel.LEFT);
		labnation=new JLabel("民族: "+info.getNation(),JLabel.LEFT);
		labhobit=new JLabel("爱好: "+info.getHobit(),JLabel.LEFT);
		labremark=new JLabel("个人说明: "+info.getRemark(),JLabel.LEFT);
		labimg=new JLabel(imag);
		labimg.add(lbclose);
		labimg.add(lbmin);
		labimg.add(labqqcode);
		labimg.add(labnickName);
		labimg.add(labsex);
		labimg.add(labage);
		labimg.add(labhobit);
		labimg.add(labremark);
		labimg.add(labnation);
		labimg.add(jbadd);
		lbclose.setBounds(350,7,20,20);
		lbmin.setBounds(330,7,20,20);
		labqqcode.setBounds(50,20,120,20);
		labnickName.setBounds(50,50,80,20);
		labsex.setBounds(50,80,70,20);
		labage.setBounds(50, 110, 100, 20);
		labnation.setBounds(50,140,100,20);
		labhobit.setBounds(50,170,150,20);
		labremark.setBounds(50,200,200,20);
		jbadd.setBounds(285,240,90,35);
		//监听
		jbadd.addActionListener(this);
		lbmin.addMouseListener(this);
		lbclose.addMouseListener(this);
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
		if(e.getSource()==jbadd){
			String str="是否添加"+info.getNickName()+"为您的好友";
			if(JOptionPane.showConfirmDialog(this,str,"添加好友",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
				
				 SendMsg msg=new SendMsg();
				 msg.cmd=Cmd.CMD_ADDFRI	;
				 msg.myinfo=myinfo;
				 msg.friendinfo=info;
				 new SendCmd().Send(msg);
				
			}
			dispose();
		}
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==lbclose){
			if(e.getButton()==1){
				dispose();
			}
		}
		if(e.getSource()==lbmin){
			if(e.getButton()==1){
				this.setState(JFrame.HIDE_ON_CLOSE);
			}
		}
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		 
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
