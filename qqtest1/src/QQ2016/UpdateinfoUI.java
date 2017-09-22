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

public class UpdateinfoUI extends JFrame implements ActionListener{
	JLabel labimg, labqqcode,labnickName,labheadimg,labage;
	JLabel labsex,labnation,labhobit,labremark,labolinestatus,lbyear,lbmonth,lbday;
	JTextField jtqqcode,jtnickName,jtage;
	JTextField jthobit;
	JButton jbsave,jbexit;
	JComboBox cbnation,cbheadimg,cbyear,cbmonth,cbday;
	JRadioButton rman,rwomen;
	JTextArea jaremark;
	ButtonGroup bg;
	AccountVO myinfo;
	MainUI mainui;
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
	public UpdateinfoUI() {}
	public UpdateinfoUI(AccountVO myinfo,MainUI mainui) {
		super("修改用户资料");
		this.myinfo=myinfo;
		this.mainui=mainui;
		//去修饰框
		setUndecorated(true);
		ImageIcon imag=new ImageIcon("e/bgreg.jpg");
		JButton reg=new JButton("登录");
		labqqcode=new JLabel("QQ账号:");
		labnickName=new JLabel("昵称:");
		labheadimg=new JLabel("头像:");
		labage=new JLabel("生日:");
		lbyear=new JLabel("年:");
		lbmonth=new JLabel("月:");
		lbday=new JLabel("日:");
		labsex=new JLabel("性别:");
		labnation=new JLabel("民族:");
		labhobit=new JLabel("爱好:");
		labremark=new JLabel("个人说明:");
		labolinestatus=new JLabel("状态");
		jtqqcode=new JTextField();
		jtqqcode.setText(myinfo.getQqCode()+"");
		jtqqcode.setEditable(false);
		jtnickName=new JTextField(myinfo.getNickName());
		
		
		jtage=new JTextField();
		jthobit=new JTextField(myinfo.getHobit());
		jaremark=new JTextArea(myinfo.getRemark());
		jaremark.setBorder(BorderFactory.createLineBorder(Color.lightGray));
		InetAddress addr=null;
		try {
			addr=InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		cbheadimg=new JComboBox(ima);
		//设置头像
		for(int i=0;i<sheadimg.length;i++){
			if(myinfo.getHeadImg().equals(sheadimg[i])){
				cbheadimg.setSelectedIndex(i);
				break;
			}
		}
		cbnation=new JComboBox(snation);
		for(int i=0;i<snation.length;i++){
			if(myinfo.getNation().equals(snation[i])){
				cbnation.setSelectedIndex(i);
				break;
			}
		}
		cbyear=new JComboBox(syear);
		cbyear.setEditable(true);
		cbmonth=new JComboBox(smonth);
		cbmonth.setEditable(true);
		cbday=new JComboBox(sday);
		cbday.setEditable(true);
		if(myinfo.getSex().equals('男')){
			rman=new JRadioButton("男",true);
			rwomen=new JRadioButton("女");
		}else{
			rman=new JRadioButton("男");
			rwomen=new JRadioButton("女",true);
		}
		
		jbsave=new JButton("修改");
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
		labimg.add(labhobit);
		labimg.add(labremark);
		labimg.add(jaremark);
		labimg.add(labnation);
		labimg.add(jbsave);
		labimg.add(jbexit);
		labimg.add(reg);
		
		labqqcode.setBounds(60,170,50,30);
		jtqqcode.setBounds(130,170,170,30);
		labnickName.setBounds(60,220,50,30);
		jtnickName.setBounds(130,220,170,30);
		labheadimg.setBounds(380, 170, 80, 60);
		cbheadimg.setBounds(420, 180, 85, 60);
		labsex.setBounds(50,260,70,30);
		rman.setBounds(130,260,50,30);
		rman.setOpaque(false);
		rwomen.setBounds(190,260,50,30);
		rwomen.setOpaque(false);
		labage.setBounds(50, 310, 40, 30);
		lbyear.setBounds(140,310,30,30);
		cbyear.setBounds(180,310,80,30);
		lbmonth.setBounds(290,310,30,30);
		cbmonth.setBounds(330, 310, 80, 30);
		lbday.setBounds(430,310,30,30);
		cbday.setBounds(470, 310, 80, 30);
		labnation.setBounds(340,260,50,30);
		cbnation.setBounds(400, 260, 150, 30);
		cbnation.setEditable(true);
		labhobit.setBounds(60,360,50,30);
		jthobit.setBounds(130,360,420,30);
		labremark.setBounds(60,420,70,30);
		jaremark.setBounds(130,420,415,100);
		jbsave.setBounds(200,550,100,40);
		jbsave.setFont(new Font("楷体",Font.BOLD,20));
		jbsave.setForeground(Color.DARK_GRAY);
		jbexit.setBounds(330,550,100,40);
		jbexit.setFont(new Font("楷体",Font.BOLD,20));
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new UpdateinfoUI();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbexit){
			dispose();
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
			
			myinfo.setNickName(nickName);
			myinfo.setHeadImg(sheadimg[cbheadimg.getSelectedIndex()]);
			myinfo.setBrith(brith);
			if(rman.isSelected()){
				myinfo.setSex("男");
			}else{
				myinfo.setSex("女");
			}
			myinfo.setNation(snation[cbnation.getSelectedIndex()]);
			myinfo.setHobit(jthobit.getText());
			myinfo.setRemark(jaremark.getText());
			BaseDAO based=new BaseDAO();
			myinfo=based.updateAccount(myinfo);
			JOptionPane.showMessageDialog(this, "恭喜你修改成功！");
			ImageIcon icon=new ImageIcon(myinfo.getHeadImg());
			String str=myinfo.getNickName()+"("+myinfo.getQqCode()+")"+myinfo.getHobit();
			mainui.labinfo.setIcon(icon);
			mainui.labinfo.setText(str);
		}
		
	}
}
