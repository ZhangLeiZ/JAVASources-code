package INternet;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UDPchat extends javax.swing.JFrame implements ActionListener {

	private JLabel lblport,lblIP,lblport2;
	private JTextField txtport,txtIP,txtport2;
	private JButton btncund,btnsend,btnclose;
	private JEditorPane EdRecervi,Edsend;
	public UDPchat() {
		super("UDP通讯");
		JPanel conpenel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    lblport = new JLabel("本机端口",JLabel.RIGHT);
	    lblIP = new JLabel("对方IP",JLabel.RIGHT);
	    lblport2 = new JLabel("对方端口",JLabel.RIGHT);
	    
	    InetAddress IPdd =null;
	    try {
			IPdd = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    txtport = new JTextField("9999",10);
	    txtIP = new JTextField(IPdd.getHostAddress(),10);
	    txtport2 = new JTextField("8888",10);
	    btncund = new JButton("连接");
	    conpenel.add(lblport);
	    conpenel.add(txtport);
	    conpenel.add(lblIP);
	    conpenel.add(txtIP);
	    conpenel.add(lblport2);
	    conpenel.add(txtport2);
	    conpenel.add(btncund);
	    
	    JPanel  conpenel2 =new JPanel(new GridLayout(2,1,5,10));
	    EdRecervi = new JEditorPane();
	    Edsend = new JEditorPane();
	    conpenel2.add(EdRecervi);
	    conpenel2.add(Edsend);
	    
	    JPanel conpenel3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    btnsend = new JButton("发送(S)");
	    btnsend.setMnemonic('S');
	    btnclose = new JButton("退出(C)");
	    btnclose.setMnemonic('C');
	    conpenel3.add(btnsend);
	    conpenel3.add(btnclose);
	    
	    EdRecervi.setBorder(BorderFactory.createLoweredBevelBorder());
	    Edsend.setBorder(BorderFactory.createLoweredBevelBorder());
	    EdRecervi.setEditable(false);
	    btnsend.setEnabled(false);
	    
	    add(conpenel,BorderLayout.NORTH);
	    add(conpenel2,BorderLayout.CENTER);
	    add(conpenel3,BorderLayout.SOUTH);
	    
	    btncund.addActionListener(this);
	    btnsend.addActionListener(this);
	    btnclose.addActionListener(this);
	    
	    setSize(600,500);
	    setVisible(true);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new UDPchat();
	}
	class Revervithread extends Thread{
		DatagramSocket socket;
		public Revervithread() {
			try {
				int port = Integer.parseInt(txtport.getText().trim());
				socket = new DatagramSocket(port);
			} catch (SocketException e) {
			      e.printStackTrace();
			}
			
		}
		@Override
		public void run() {
			byte[] b = new byte[1024];
			DatagramPacket packet = new DatagramPacket(b,b.length);
			while(true){
				try {
					//接收数据
					socket.receive(packet);
					//转换为字符串
					String str = new String(b,0,packet.getLength());
					//显示在接收框
					String content = EdRecervi.getText();
					content += new Date().toLocaleString()+"\n";
					content += str+"\n";
					EdRecervi.setText(content);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btncund){
			btnsend.setEnabled(true);
			btncund.setEnabled(false);
			new Revervithread().start();
		}else if(e.getSource()==btnsend){
			String str = Edsend.getText().trim();
			if(str.equals("")){
				JOptionPane.showMessageDialog(this, "请输入要发送的内容");
				return;
			}
			//把要发送的内容显示到接收框
			String content = EdRecervi.getText();
			content += new Date().toLocaleString()+"\n";
			content += str+"\n";
			EdRecervi.setText(content);
			try {
				//设置对方IP地址
				InetAddress ip = InetAddress.getByName(txtIP.getText().trim());
				//设置对方的端口
				int port = Integer.parseInt(txtport2.getText().trim());
				//创建发送包
				byte b[] = str.getBytes();
				DatagramPacket p = new DatagramPacket(b,b.length,ip,port);
				//创建DatagramSocket发送
				DatagramSocket socket = new DatagramSocket();
				//发送
				socket.send(p);
				//清空发送框的内容
				Edsend.setText("");
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			} catch (SocketException e2) {
				e2.printStackTrace();
			} catch (IOException e3) {
				e3.printStackTrace();
			}
			}else if(e.getSource()==btnclose){
			System.exit(0);
		}
		
		
	}
}
