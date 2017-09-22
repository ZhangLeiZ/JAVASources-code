package jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Dengru extends JFrame implements ActionListener{
	JLabel user,pass;
	JTextField username;
	JPasswordField password;
	JButton Send,Resit;
	Tongxunimple impl = new Tongxunimple();
	public Dengru() {
		super("通讯录");
		JLabel imagemess = new JLabel(new ImageIcon("lu/s1.jpg"));
		imagemess.setLayout(null);
		add(imagemess);
		
		
		user = new JLabel("用户名：");
		username = new JTextField(10);
		user.setBounds(130,160, 65, 25);
		username.setBounds(190, 160, 200, 25);
		imagemess.add(user);
		imagemess.add(username);
		
		pass = new JLabel("密码：");
		password = new JPasswordField();
		pass.setBounds(130,210, 65, 25);
		password.setBounds(190,210, 200, 25);
		imagemess.add(pass);
		imagemess.add(password);
		
		Send = new JButton("登入");
		Send.setBounds(150, 260, 70, 30);
		imagemess.add(Send);
		Send.addActionListener(this);
		
		Resit = new JButton("重置");
		Resit.setBounds(310, 260, 70, 30);
		imagemess.add(Resit);
		Resit.addActionListener(this);
		
		setSize(550,370);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(Send)){
			boolean isok = impl.chlick(username.getText(), password.getText());
			if(isok){
				System.out.println("sdfsdgds");
				new Mainpage();
			}else{
				JOptionPane.showMessageDialog(Dengru.this, "该用户不存在或是密码输入错误！！！");
			}
		}else if(e.getSource().equals(Resit)){
			username.setText("");
			password.setText("");
		}
		
	}
	public static void main(String[] args) {
		new Dengru();
	}
}
