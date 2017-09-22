package SQL;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Textqq extends javax.swing.JFrame implements ActionListener {
	JLabel lblname,lblpassword,lblquepass,lblage;
	JLabel lblsex,lblQQ,lblEmail,lblcardno,lbltitle,lblRemark;
	JButton btosave,btoexit,btofond;
	JTextField tename,teage,teQQ,teEmail,tecardno;
	JPasswordField texpassword,texquePass;
	JTextArea texRemark;
	JComboBox cbsex;
	String Ssex[]={"男","女"};
	public Textqq() {
		
		super("QQ注册");
		lbltitle = new JLabel("用户注册：");
		JPanel conpanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		conpanel.add(lbltitle);
		
		lblname = new JLabel("用户名称：",JLabel.RIGHT);
		lblpassword = new JLabel("用户密码：",JLabel.RIGHT);
		lblquepass = new JLabel("确认密码：",JLabel.RIGHT);
		lblage = new JLabel("用户年龄：",JLabel.RIGHT);
		lblsex = new JLabel("用户性别：",JLabel.RIGHT);
		lblQQ = new JLabel("QQ号码：",JLabel.RIGHT);
		lblEmail = new JLabel("用户邮箱：",JLabel.RIGHT);
		lblcardno = new JLabel("身份证：",JLabel.RIGHT);
		lblRemark = new JLabel("个人说明：",JLabel.RIGHT);
		tename = new JTextField();
		teage = new JTextField();
		teQQ = new JTextField();
		teEmail = new JTextField();
		tecardno =new JTextField();
		texpassword = new JPasswordField();
		texquePass = new JPasswordField();
		cbsex = new JComboBox(Ssex);
		texRemark = new JTextArea(50,4);
		JPanel topanel = new JPanel(new GridLayout(9,2,10,10));
		topanel.add(lblname);
		topanel.add(tename);
		topanel.add(lblpassword);
		topanel.add(texpassword);
		topanel.add(lblquepass);
		topanel.add(texquePass);
		topanel.add(lblage);
		topanel.add(teage);
		topanel.add(lblsex);
		topanel.add(cbsex);
		topanel.add(lblQQ);
		topanel.add(teQQ);
		topanel.add(lblEmail);
		topanel.add(teEmail);
		topanel.add(lblcardno);
		topanel.add(tecardno);
		topanel.add(lblRemark);
		topanel.add(texRemark);
		
		texpassword.setEchoChar('@');
		texquePass.setEchoChar('@');
		btosave = new JButton("注册(W)");
		btosave.setMnemonic('W');
		btoexit = new JButton("退出(T)");
		btoexit.setMnemonic('T');
		btofond = new JButton("查询(C)");
		btofond.setMnemonic('C');
		JPanel topanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		topanel2.add(btofond);
		topanel2.add(btosave);
		topanel2.add(btoexit);
		add(conpanel,BorderLayout.NORTH);
		add(topanel,BorderLayout.CENTER);
		add(topanel2,BorderLayout.SOUTH);
		btoexit.addActionListener(this);
		btosave.addActionListener(this);
		btofond.addActionListener(this);
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new Textqq();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btosave){
			Save();
			JOptionPane.showMessageDialog(this, "注册成功");
		}else if(e.getSource()==btoexit){
			System.exit(0);
		}else if(e.getSource()==btofond){
			new Selectqq();
		}
		
	} 
	public void Save(){
      if(texpassword.getText().equals("") || !texpassword.getText().equals(texquePass.getText())){
    	  JOptionPane.showMessageDialog(this, "密码确认密码不相同...");
    	  return;
    	  }
      try {
    	  Integer.parseInt(teage.getText().trim());
	} catch (Exception e) {
		JOptionPane.showMessageDialog(this,"年龄含有非法字符");
		return;
	}
	
	UserVo user = new UserVo();
	
	user.setUsername(tename.getText().trim());
	user.setPassword(texpassword.getText().trim());
	user.setSex(Ssex[cbsex.getSelectedIndex()]);
	user.setAge(Integer.parseInt(teage.getText().trim()));
	user.setCardno(tecardno.getText().trim());
	user.setQqcode(teQQ.getText().trim());
	user.setEmail(teEmail.getText().trim());
	user.setRemark(texRemark.getText().trim());
	DBCinter userdao = new Usersql();
	userdao.add(user);
	}

}
