package Workpace;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.AncestorListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
public class ChatUI extends Thread  implements ActionListener{
	String user = "";
	String userList[] = new String[10];
	Socket theSocket;
	BufferedReader in;
	PrintWriter out;
	boolean connected = false;
	Thread thread;
	JTextArea message,users;
	
	JButton btnclose,btnsend;
	JButton btnface,btncolor,btnshske,btnfile,jieping;
	JComboBox cbfont,cbsize;
	Font font;
	int x,y;
	JLabel close2,mosth,fuwuqi,duankou,username;
	JTextField messageField, IDField, ipField, portField;
	JButton connect, disconnect;
	String sFont[] = {"宋体","黑体","楷体","隶书"};
	String sSize[]={"8","10","12","14","16","18","24","28","32","36","72"};
	public JPanel createComponents() {
		JPanel buttonPanel = new JPanel();
		JLabel mainimage = new JLabel(new ImageIcon("tubiao/beijing.jpg"));
		buttonPanel.add(mainimage);
		mainimage.setLayout(null);

	    
	    close2 = new JLabel(new ImageIcon("tubiao/close2.png"));
	    close2.setBounds(600, 0, 20, 22);
	    mainimage.add(close2);
	    mosth = new JLabel(new ImageIcon("tubiao/qqmin.png"));
	    mosth.setBounds(575, 0, 20, 22);
	    mainimage.add(mosth);
	    
	    messageField = new JTextField(50);
		ipField = new JTextField("LocalHost");
		portField = new JTextField("8189");
		
		connect = new JButton("连 接");
		disconnect = new JButton("断 开");
		disconnect.setEnabled(false);
		connect.setBounds(10, 60, 70, 30);
		disconnect.setBounds(85, 60, 70, 30);
		
		fuwuqi = new JLabel("服务器IP:");
		ipField = new JTextField("LocalHost");
		fuwuqi.setBounds(10, 20, 65, 25);
		ipField.setBounds(70, 20, 65, 25);
		mainimage.add(ipField);
		mainimage.add(fuwuqi);
		
		duankou =new JLabel("端口：");
		portField = new JTextField("8189");
		duankou.setBounds(135, 20, 65, 25);
		portField.setBounds(170,20,65,25);
		mainimage.add(duankou);
		mainimage.add(portField);
		
		username = new JLabel("用户名：");
		IDField = new JTextField(5);
		username.setBounds(240, 20, 65,25);
		IDField.setBounds(285, 20, 65, 25);
		mainimage.add(username);
		mainimage.add(IDField);
		
		
		
	
		mainimage.add(connect);
		mainimage.add(disconnect);

       
		message = new JTextArea();
		message.setBounds(0, 92, 450, 250);
		message.setEditable(false);
		message.setOpaque(false);
	    mainimage.add(message);
	    users = new JTextArea();
	    users.setBounds(450, 60, 190, 300);
	    users.setEditable(false);
	    users.setOpaque(false);
	    users.setBorder(BorderFactory.createTitledBorder("在线用户"));
	    mainimage.add(users);
	    
	    
	    cbfont = new JComboBox(sFont);
	    cbfont.setOpaque(false);
	    cbfont.setBounds(1, 344, 55, 22);
	    mainimage.add(cbfont);
	    
	   
	    cbsize = new JComboBox(sSize);
	    cbsize.setOpaque(false);
	    cbsize.setBounds(57, 344, 55, 22);
	    mainimage.add(cbsize);
	    
	    btnface = new JButton(new ImageIcon("tubiao/fase.png"));
	    btnface.setMargin(new Insets(0,0,0,0));
	    btnface.setBounds(114, 344, 22, 22);
	    mainimage.add(btnface);
	    
	    btncolor = new JButton(new ImageIcon("tubiao/mofa.png"));
	    btncolor.setBounds(138, 344, 22, 22);
	    mainimage.add(btncolor);
	    
	    btnshske = new JButton(new ImageIcon("tubiao/doudong.png"));
	    btnshske.setMargin(new Insets(0,0,0,0));
	    btnshske.setBounds(162, 344, 22, 22);
	    mainimage.add(btnshske);
	    
	    JButton tuyu = new JButton(new ImageIcon("tubiao/tuyu.png"));
	    tuyu.setBounds(186, 344, 100, 22);
	    mainimage.add(tuyu);
	    

	    
	   jieping = new JButton(new ImageIcon("tubiao/jieping.png"));
	   jieping.setMargin(new Insets(0,0,0,0));
	   jieping.setBounds(312, 344, 30, 22);
	    mainimage.add(jieping);
	    
	    
	    messageField = new JTextField();
	    messageField.setOpaque(false);
	    messageField.setBounds(0, 366, 450, 90);
	    mainimage.add(messageField);
	    
	    btnclose = new JButton("关闭(X)"); 
	    btnclose.setMnemonic('X');
	    btnclose.setBorder(BorderFactory.createBevelBorder(0));
	    btnclose.setBackground(new Color(0,0,0,0));
	    btnclose.setOpaque(false);
	    btnclose.setBounds(292, 430, 80, 20);
	    mainimage.add(btnclose);
	    btnsend = new JButton("发送(S)"); 
	    btnsend.setBorder(BorderFactory.createBevelBorder(0));
        btnsend.setMnemonic('S');
	    btnsend.setBackground(new Color(0,0,0,0));
	    btnsend.setOpaque(false);
	    btnsend.setBounds(372, 430, 80, 20);
	    mainimage.add(btnsend);
	    connect.addActionListener(this);
		disconnect.addActionListener(this);
		messageField.addActionListener(this);
		IDField.addActionListener(this);
		ipField.addActionListener(this);
      
       return buttonPanel;
	}
	

	public static void main(String[] args) {
		JFrame frame = new JFrame("聊天室");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ChatUI cc = new ChatUI();
		JPanel content = cc.createComponents();
		frame.getContentPane().add(content);
		frame.setSize(620, 510);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == connect) {
			//JOptionPane.showConfirmDialog(ChatUI.this, "nihsfodh");
			user = IDField.getText();
			String ip = ipField.getText();
			int port = Integer.parseInt(portField.getText());
			System.out.println(user+"-"+ip+"-"+port);
			if (!user.equals("") && connectToServer(ip, port, user)) {
				disconnect.setEnabled(true);
				connect.setEnabled(false);
			}
		}
		if (e.getSource() == disconnect)
			disconnectFromServer();
		if (e.getSource() == messageField)
			if (theSocket != null) {
				out.println("MESSAGE:" + messageField.getText());
				messageField.setText("");
			}
	}

	public void disconnectFromServer() {
		if (theSocket != null) {
			try {
				connected = false;
				out.println("LEAVE:" + user);
				disconnect.setEnabled(false);
				connect.setEnabled(true);
				thread = null;
				theSocket.close();
			} catch (IOException io) {
			}
			theSocket = null;
			message.setText("");
			users.setText("");
		}
	}

	public boolean connectToServer(String ip, int port, String ID) {
		if (theSocket != null)
			return false;
		try {
			theSocket = new Socket(ip, port);
			in = new BufferedReader(new InputStreamReader(theSocket
					.getInputStream()));
			out = new PrintWriter(new OutputStreamWriter(theSocket
					.getOutputStream()), true);
			out.println("USER:" + user);
			message.setText("");
			connected = true;
			thread = new Thread();
			thread.start();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void extractMessage(String line) {
		System.out.println(line);
		Message messageline;
		messageline = new Message(line);
		if (messageline.isValid()) {
			if (messageline.getType().equals("JOIN")) {
				user = messageline.getBody();
				message.append(user + "进入了聊天室\n");
			} else if (messageline.getType().equals("LIST"))
				updateList(messageline.getBody());
			else if (messageline.getType().equals("MESSAGE"))
				message.append(messageline.getBody() + "\n");
			else if (messageline.getType().equals("REMOVE"))
				message.append(messageline.getBody() + "离开了聊天室\n");
		} else
			message.append("出现问题：" + line + "\n");
	}

	public void updateList(String line) {
		users.setText("");
		String str = line;
		for (int i = 0; i < 10; i++)
			userList[i] = "";
		int index = str.indexOf(":");
		int a = 0;
		while (index != -1) {
			userList[a] = str.substring(0, index);
			str = str.substring(index + 1);
			a++;
			index = str.indexOf(":");
		}
		for (int i = 0; i < 10; i++)
			users.append(userList[i] + "\n");
	}

	public void run() {
		try {
			String line = "";
			while (connected && line != null) {
				line = in.readLine();
				if (line != null)
					extractMessage(line);
			}
		} catch (IOException e) {
		}
	}
   
}
