package T3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Logincat extends JFrame implements ActionListener{
	JPanel panel;
	JLabel bg,msg;
	JTextField text;
	JButton sund,close;
	public Logincat() {
		super("停车场管理系统");
		bg = new JLabel(new ImageIcon(""));
		bg.setLayout(null);
		add(bg);
		
		msg = new JLabel("请输入最大停车数!!!");
		text = new JTextField(20);
		sund = new JButton("进入");
		close = new JButton("取消");
		
		msg.setBounds(155, 20, 115, 35);
		bg.add(msg);
		
		text.setBounds(120, 80, 200, 20);
		bg.add(text);
		
		sund.setBounds(100, 155, 90, 30);
		sund.addActionListener(this);
		bg.add(sund);
		
		close.setBounds(230, 155, 90, 30);
		close.addActionListener(this);
		bg.add(close);
		
		this.setSize(450,270);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Logincat();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sund){
			String sum = text.getText();
			int str = Integer.parseInt(sum);
			new Managercat(str).show();
			this.dispose();
		}else if(e.getSource()==close){
			System.exit(0);
		}
		
	}
}
