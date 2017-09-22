package QQ2016;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class ZhuceUI extends JFrame implements ActionListener{
	JLabel labimg, labqqcode,labnickName,labheadimg,labage,labpassword,labrepassword;
	JLabel labsex,labnation,labhobit,labid,labport,labremark,labolinestatus,lbyear,lbmonth,lbday;
	JTextField jtqqcode,jtnickName,jtheadimg,jtpassword,jtage;
	JTextField jthobit,jtid,jtport;
	JPasswordField jppassword,jprepa;
	JButton jbsave,jbexit;
	JComboBox cbnation,cbheadimg,cbyear,cbmonth,cbday;
	JRadioButton rman,rwomen;
	JTextArea jaremark=new JTextArea();
	ButtonGroup bg;
	String []snation={"汉族","藏族","壮族","苗族","白族","维吾尔族","满族","朝鲜族","土族","高山族"};
	String []sheadimg={"headimg/1.png","headimg/2.png","headimg/3.png","headimg/4.png","headimg/5.png","headimg/6.png","headimg/7.png","headimg/8.png","headimg/9.png","headimg/10.png"};
	String []syear={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
	String []smonth={"1","2","3","4","5","6","7","8","9","10","11","12"};
	String []sday={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
			"19","20","21","22","23","24","25","26","27","28","29","30"};
	ImageIcon []ima={
			new ImageIcon(sheadimg[0]),
			new ImageIcon(sheadimg[1]),
			new ImageIcon(sheadimg[2]),
			new ImageIcon(sheadimg[3]),
			new ImageIcon(sheadimg[4]),
			new ImageIcon(sheadimg[5]),
			new ImageIcon(sheadimg[6]),
			new ImageIcon(sheadimg[7]),
			new ImageIcon(sheadimg[8]),
			new ImageIcon(sheadimg[9]),

	};
	public ZhuceUI() {
		super("用户注册");
		ImageIcon imag=new ImageIcon("e/bgreg.jpg");
		JButton reg=new JButton("登录");
		labqqcode=new JLabel("QQ账号:");
		labnickName=new JLabel("昵称:");
		labheadimg=new JLabel("头像:");
		labage=new JLabel("生日:");
		lbyear=new JLabel("年:");
		lbmonth=new JLabel("月:");
		lbday=new JLabel("日:");
		labpassword=new JLabel("登录密码");
		labrepassword=new JLabel("确认密码");
		labsex=new JLabel("性别:");
		labnation=new JLabel("民族:");
		labhobit=new JLabel("爱好:");
		labid=new JLabel("ip:");
		labport=new JLabel("端口:");
		labremark=new JLabel("个人说明:");
		labolinestatus=new JLabel("状态");
		jtqqcode=new JTextField();
		jtqqcode.setText("系统随机生成！");
		jtqqcode.setEditable(false);
		jtnickName=new JTextField();
		jtheadimg=new JTextField();
		jtage=new JTextField();
		jthobit=new JTextField();
		jaremark.setBorder(BorderFactory.createLineBorder(Color.lightGray));
		InetAddress addr=null;
		try {
			addr=InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		jtid=new JTextField(addr.getHostAddress());
		jtport=new JTextField();
		jtport.setText("系统自动生成!");
		jtport.setEditable(false);
		jppassword=new JPasswordField();
		jprepa=new JPasswordField();
		cbheadimg=new JComboBox(ima);
		cbnation=new JComboBox(snation);
		cbyear=new JComboBox(syear);
		cbmonth=new JComboBox(smonth);
		cbday=new JComboBox(sday);
		rman=new JRadioButton("男");
		rwomen=new JRadioButton("女");
		jbsave=new JButton("注册");
		jbexit=new JButton("退出");
		bg=new ButtonGroup();
		labimg=new JLabel(imag);
		bg.add(rman);
		bg.add(rwomen);
		labimg.add(labqqcode);
		labimg.add(jtqqcode);
		labimg.add(labnickName);
		labimg.add(jtnickName);
		labimg.add(labheadimg);
		labimg.add(cbheadimg);
		labimg.add(labpassword);
		labimg.add(jppassword);
		labimg.add(labrepassword);
		labimg.add(jprepa);
		labimg.add(labsex);
		labimg.add(rman);
		labimg.add(rwomen);
		labimg.add(labage);
		labimg.add(lbmonth);
		labimg.add(lbyear);
		labimg.add(lbday);
		labimg.add(cbyear);
		labimg.add(cbday);
		labimg.add(cbmonth);
		labimg.add(cbnation);
		labimg.add(jthobit);
		labimg.add(jtid);
		labimg.add(jtport);
		labimg.add(labhobit);
		labimg.add(labid);
		labimg.add(labport);
		labimg.add(labremark);
		labimg.add(jaremark);
		labimg.add(labnation);
		labimg.add(jbsave);
		labimg.add(jbexit);
		labimg.add(reg);
		
		jprepa.setEchoChar('@');
		jppassword.setEchoChar('$');
		labqqcode.setBounds(60,160,50,30);
		jtqqcode.setBounds(130,160,170,30);
		labnickName.setBounds(60,200,50,30);
		jtnickName.setBounds(130,200,170,30);
		labheadimg.setBounds(380, 125, 80, 60);
		cbheadimg.setBounds(420, 135, 85, 60);
		labpassword.setBounds(50,240,70,30);
		jppassword.setBounds(130,240,170,30);
		labrepassword.setBounds(340,240,80,30);
		jprepa.setBounds(400,240,150,30);
		labsex.setBounds(50,280,70,30);
		rman.setBounds(130,280,50,30);
		rman.setOpaque(false);
		rwomen.setBounds(190,280,50,30);
		rwomen.setOpaque(false);
		labage.setBounds(50, 320, 40, 30);
		lbyear.setBounds(140,320,30,30);
		cbyear.setBounds(180,320,80,30);
		lbmonth.setBounds(290,320,30,30);
		cbmonth.setBounds(330, 320, 80, 30);
		lbday.setBounds(430,320,30,30);
		cbday.setBounds(470, 320, 80, 30);
		labnation.setBounds(340,200,50,30);
		cbnation.setBounds(400, 200, 150, 30);
		labhobit.setBounds(60,360,50,30);
		jthobit.setBounds(130,360,420,30);
		labid.setBounds(60,400,50,30);
		jtid.setBounds(130,400,100,30);
		labport.setBounds(340,400,50,30);
		jtport.setBounds(400,400,100,30);
		labremark.setBounds(60,440,70,30);
		jaremark.setBounds(130,440,415,100);
		jbsave.setBounds(200,550,100,40);
		jbsave.setFont(new Font("楷体",Font.BOLD,21));
		jbsave.setForeground(Color.DARK_GRAY);
		jbexit.setBounds(330,550,100,40);
		jbexit.setFont(new Font("楷体",Font.BOLD,21));
		jbexit.setForeground(Color.DARK_GRAY);
		
		//监听
		jbsave.addActionListener(this);
		jbexit.addActionListener(this);
		 
		labimg.setLayout(null);
		add(labimg);
		
		labimg.add(cbheadimg);
		labimg.setBounds(0, 0,imag.getIconWidth(),imag.getIconHeight());
		setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ZhuceUI();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbexit){
			System.exit(0);
		}
		if(e.getSource()==jbsave){
			String nickName=jtnickName.getText().trim();
			String brith=syear[cbyear.getSelectedIndex()]+"/";
			brith+=smonth[cbmonth.getSelectedIndex()]+"/";
			brith+=sday[cbday.getSelectedIndex()];
			if(nickName.equals("")){
				JOptionPane.showMessageDialog(this, "请输入昵称");
				return;
			}
			String pass=jppassword.getText().trim();
			String repss=jprepa.getText().trim();
			if(pass.equals("")){
				JOptionPane.showMessageDialog(this, "请输入密码");
				return;
			}
			if(!pass.equals(repss)){
				JOptionPane.showMessageDialog(this, "密码输入不一致，请重新输入");
				return;
			}
			AccountVO account=new AccountVO();
			account.setNickName(nickName);
			account.setPassword(pass);
			account.setHeadImg(sheadimg[cbheadimg.getSelectedIndex()]);
			account.setBrith(brith);
			if(rman.isSelected()){
				account.setSex("男");
			}else{
				account.setSex("女");
			}
			account.setNation(snation[cbnation.getSelectedIndex()]);
			account.setHobit(jthobit.getText());
			account.setIpAddr(jtid.getText());
			account.setRemark(jaremark.getText());
			BaseDAO based=new BaseDAO();
			account=based.saveAccount(account);
			int newqq=account.getQqCode();
			jtqqcode.setText(newqq+"");
			jtport.setText("0");
			if(JOptionPane.showConfirmDialog(this, "你的QQ号码为"+newqq+"是否登陆？","QQ注册",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
				new StartQQ();
				dispose();
			}
		}
		
	}
}
