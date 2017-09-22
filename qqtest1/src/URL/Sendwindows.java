package URL;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.xml.internal.bind.v2.model.core.ID;


public class Sendwindows extends JFrame implements ActionListener{
	JLabel localport,ip,sendport;
	JTextField jtlocalport,jtip,jtsendport;
	JEditorPane sendmessage,writemessage;
	JButton rela=new JButton("发送");
	JButton exit=new JButton("退出");
	JButton con=new JButton("连接");
	JPanel pan2,pan3;
	public Sendwindows() {
		super("信息发送");
		JPanel pan=new JPanel(new FlowLayout());
		pan2=new JPanel(new GridLayout(2,11,10,25));
		pan3=new JPanel();
		localport=new JLabel("本地端口");
		ip=new JLabel("ip地址");
		sendport=new JLabel("发送端口");
		jtlocalport=new JTextField(10);
		jtip=new JTextField(10);
		jtsendport=new JTextField(10);
		sendmessage=new JEditorPane();
		sendmessage.setEditable(false);
		writemessage=new JEditorPane();
		sendmessage.setBorder(BorderFactory.createLoweredBevelBorder());
		writemessage.setBorder(BorderFactory.createLoweredBevelBorder());

		rela.setEnabled(false);
		pan.add(localport);
		pan.add(jtlocalport);
		pan.add(ip);
		pan.add(jtip);
		pan.add(sendport);
		pan.add(jtsendport);
		pan.add(con);
		pan2.add(sendmessage);
		pan2.add(writemessage);
		pan3.add(rela);
		pan3.add(exit);
		con.addActionListener(this);
		rela.addActionListener(this);
		exit.addActionListener(this);
		add(pan,BorderLayout.NORTH);
		add(pan2,BorderLayout.CENTER);
		add(pan3,BorderLayout.SOUTH);
		
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	class data extends Thread{
		DatagramSocket socket;
		public data() {
			int port=Integer.parseInt(jtlocalport.getText());
			try {
				socket=new DatagramSocket(port);
			} catch (SocketException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			byte[]b=new byte[1024];
			DatagramPacket packet=new DatagramPacket(b,b.length);
			while(true){
				try {
					socket.receive(packet);
					String str=new String(b,0,packet.getLength());
					String con=sendmessage.getText();
					con+=new Date().toLocaleString()+"\n";
					con+=str+"\n";
					sendmessage.setText(con);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		new Sendwindows();
	}
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==con){
			rela.setEnabled(true);
			con.setEnabled(false);
			new data().start();
		}
		if(e.getSource()==rela){
			String str=writemessage.getText().trim();
			if(str.equals("")){
				JOptionPane.showMessageDialog(this, "内容为空，请重新输入！");
				return;
			}
			String con=sendmessage.getText();
			con+=new Date().toLocaleString()+"\n";
			con+=str+"\n";
			sendmessage.setText(con);
			try {
				InetAddress ip=InetAddress.getByName(jtip.getText());
				int port=Integer.parseInt(jtsendport.getText());
				byte[]b=str.getBytes();
				DatagramPacket packet=new DatagramPacket(b,b.length,ip,port);
				DatagramSocket socket=new DatagramSocket();
				socket.send(packet);
				writemessage.setText("");
				
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			} catch (SocketException e2) {
				e2.printStackTrace();
			} catch (IOException e3) {
				e3.printStackTrace();
			}
		}
		if(e.getSource()==exit){
			System.exit(0);
		}
	}
}
