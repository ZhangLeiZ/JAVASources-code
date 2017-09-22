package sql;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JFzhuce extends JFrame implements ActionListener{
	JLabel labuser,labname,labpassword,labrelapass,labsex,title;
	JLabel labnumb,labQQ,labemail,labmessage;
	JButton jbsave,jbrela,jbfind;
	JTextField jtuser,jtname,jtnumb,jtQQ,jtemail;
	JComboBox cosex;
	JPasswordField jppa,jprepa;
	JTextArea jamessage;
	JPanel pan1,pan2,pan;
	String []sex={"男","女"};
	public JFzhuce() {
		super("注册登记表");
		title=new JLabel("用户注册窗口",JLabel.CENTER);
		title.setFont(new Font("黑体",Font.BOLD,31));
		title.setForeground(Color.RED);
		labuser=new JLabel("用户账号",FlowLayout.LEFT);
		labname=new JLabel("用户姓名",FlowLayout.LEFT);
		labpassword=new JLabel("密码",FlowLayout.LEFT);
		labrelapass=new JLabel("确认密码",FlowLayout.LEFT);
		labsex=new JLabel("性别",FlowLayout.LEFT);
		labnumb=new JLabel("电话",FlowLayout.LEFT);
		labQQ=new JLabel("QQ",FlowLayout.LEFT);
		labemail=new JLabel("email",FlowLayout.LEFT);
		labmessage=new JLabel("说明",FlowLayout.LEFT);
		jbsave=new JButton("保存(S)");
		jbrela=new JButton("确认(R)");
		jbfind=new JButton("查询(F)");
		jbsave.setMnemonic('S');
		jbrela.setMnemonic('R');
		jbfind.setMnemonic('F');
		
		Toolkit took=Toolkit.getDefaultToolkit();
		Image ima=took.getImage("pic/4.jpg");
		setIconImage(ima);
		jbfind.addActionListener(this);
		jbsave.addActionListener(this);
		jbrela.addActionListener(this);
		pan=new JPanel(new FlowLayout(FlowLayout.CENTER));
		pan.add(title);
		pan1=new JPanel(new GridLayout(9,2,3,3));
		pan2=new JPanel(new FlowLayout(FlowLayout.CENTER));
		pan2.add(jbsave);
		pan2.add(jbrela);
		pan2.add(jbfind);
		pan.setBackground(Color.CYAN);
		pan1.setBackground(Color.BLUE);
		pan2.setBackground(Color.ORANGE);
		jtuser=new JTextField(20);
		jtname=new JTextField(20);
		jppa=new JPasswordField(20);
		jprepa=new JPasswordField(20);
		cosex=new JComboBox(sex);
		jtnumb=new JTextField(20);
		jtQQ=new JTextField(20);
		jtemail=new JTextField(20);
		jamessage=new JTextArea(5,40);
		jppa.setEchoChar('$');
		jprepa.setEchoChar('@');
		pan1.add(labuser);
		pan1.add(jtuser);
		pan1.add(labname);
		pan1.add(jtname);
		pan1.add(labpassword);
		pan1.add(jppa);
		pan1.add(labrelapass);
		pan1.add(jprepa);
		pan1.add(labsex);
		pan1.add(cosex);
		pan1.add(labnumb);
		pan1.add(jtnumb);
		pan1.add(labQQ);
		pan1.add(jtQQ);
		pan1.add(labemail);
		pan1.add(jtemail);
		pan1.add(labmessage);
		pan1.add(jamessage);
		add(pan,BorderLayout.NORTH);
		add(pan1,BorderLayout.CENTER);
		add(pan2,BorderLayout.SOUTH);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbsave){
			save2();
		}
		if(e.getSource()==jbrela){
			System.exit(0);
		}
		if(e.getSource()==jbfind){
			new JFfind();
		}
	}
	
	public void save2(){
		if(jppa.getText().equals("")||!jppa.getText().equals(jprepa.getText()))
		{
			JOptionPane.showMessageDialog(this, "确认密码不一致");
			return;
		}
		zhuceVo use=new zhuceVo();
		use.setUser(Integer.parseInt(jtuser.getText().trim()));
		use.setName(jtname.getText().trim());
		use.setPassword(jppa.getText().trim());
		use.setSex(sex[cosex.getSelectedIndex()]);
		use.setNumber(jtnumb.getText().trim());
		use.setQq(jtQQ.getText().trim());
		use.setEmail(jtemail.getText().trim());
		use.setMessage(jamessage.getText().trim());
		Iuzhuce useiu=new zhuceImp();
		useiu.add(use);
	}
	public static void main(String[] args) {
		new JFzhuce();
	}
	public void save(){
		if(jppa.getText().equals("")||!jppa.getText().equals(jprepa.getText()))
		{
			JOptionPane.showMessageDialog(this, "确认密码不一致");
			return;
		}
	
		Connection con=new PDBC().openDB();
		Statement sta;
		try {
			sta = con.createStatement();
			String sql="insert into userQQ values('";
			sql+=jtuser.getText().trim()+"',";
			sql+="'"+jtname.getText().trim()+"',";
			sql+="'"+jppa .getText().trim()+"',";
			sql+="'"+sex[cosex.getSelectedIndex()]+"',";
			sql+="'"+jtnumb.getText().trim()+"',";
			sql+="'"+jtQQ.getText().trim()+"',";
			sql+="'"+jtemail.getText().trim()+"',";
			sql+="'"+jamessage.getText().trim()+"')";
			System.out.println(sql);
			sta.executeUpdate(sql);
			JOptionPane.showMessageDialog(this, "注册成功！");
			sta.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
