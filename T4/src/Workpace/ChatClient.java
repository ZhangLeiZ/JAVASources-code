package Workpace;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.net.*;
import java.io.*;

public class ChatClient extends Thread implements ActionListener {
	JTextField messageField, IDField, ipField, portField;
	JTextArea message, users;
	JButton connect, disconnect;
	JLabel close2,mosth,fuwuqi,duankou,username;

	String user = "";
	String userList[] = new String[10];
	Socket theSocket;
	BufferedReader in;
	PrintWriter out;
	boolean connected = false;
	Thread thread;

	public static void main(String args[]) {
		JFrame frame = new JFrame("聊天室");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ChatClient cc = new ChatClient();
		JPanel content = cc.createComponents();
		frame.getContentPane().add(content);
		frame.setSize(620, 510);
		frame.setVisible(true);
	}

	public JPanel createComponents() {
		JPanel buttonPanel = new JPanel();
		message = new JTextArea(15, 40);
		message.setEditable(false);
		message.setBorder(BorderFactory.createTitledBorder("聊天内容"));
		buttonPanel.add(message);
		users = new JTextArea(15, 10);
		users.setBorder(BorderFactory.createTitledBorder("在线用户:"));
		buttonPanel.add(users);
		messageField = new JTextField(50);
		//messageField.setBounds(0, 366, 450, 90);
		IDField = new JTextField(5);
		ipField = new JTextField("LocalHost");
		portField = new JTextField("8189");
		connect = new JButton("连 接");
		disconnect = new JButton("断 开");
		disconnect.setEnabled(false);
		
		fuwuqi = new JLabel("服务器IP:");
		duankou =new JLabel("端口：");
		username = new JLabel("用户名：");
		connect.setBounds(10, 60, 70, 30);
		disconnect.setBounds(85, 60, 70, 30);
		fuwuqi.setBounds(10, 20, 65, 25);
		ipField.setBounds(70, 20, 65, 25);
		duankou.setBounds(135, 20, 65, 25);
		portField.setBounds(170,20,65,25);
		username.setBounds(240, 20, 65,25);
		IDField.setBounds(285, 20, 65, 25);
		message.setBounds(0, 92, 450, 250);
		users.setBounds(450, 60, 190, 300);
		
		messageField.setPreferredSize(new Dimension (220,120)); 
		buttonPanel.add(fuwuqi);
		buttonPanel.add(ipField);
		buttonPanel.add(duankou);

		buttonPanel.add(portField);
		buttonPanel.add(username);
		buttonPanel.add(IDField);
		buttonPanel.add(connect);
		buttonPanel.add(disconnect);
		buttonPanel.add(messageField);
		
		connect.addActionListener(this);
		disconnect.addActionListener(this);
		messageField.addActionListener(this);
		IDField.addActionListener(this);
		ipField.addActionListener(this);
		return buttonPanel;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == connect) {
			user = IDField.getText();
			String ip = ipField.getText();
			int port = Integer.parseInt(portField.getText());
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
			thread = new Thread(this);
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
