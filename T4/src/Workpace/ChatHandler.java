package Workpace;

import java.net.*;
import java.io.*;

class ChatHandler extends Thread {
	Socket theSocket;
	BufferedReader in;
	PrintWriter out;
	int thePort;
	ChatServer parent;
	String user = "";
	boolean disconnect = false;

	public ChatHandler(Socket socket, ChatServer parent) {
		try {
			theSocket = socket;
			this.parent = parent;
			in = new BufferedReader(new InputStreamReader(theSocket
					.getInputStream()));
			out = new PrintWriter(new OutputStreamWriter(theSocket
					.getOutputStream()), true);
			thePort = theSocket.getPort();
			start();
		} catch (IOException io) {
		}
	}

	public void sendMessage(String line) {
		out.println(line);
	}

	public void setupUserName(String setname) {
		user = setname;
		// System.out.print(user+"参加");
		parent.broadcastMessage("JOIN:" + user);
	}

	public void extractMessage(String line) {
		Message messageline;
		messageline = new Message(line);
		if (messageline.isValid()) {
			if (messageline.getType().equals("USER")) {
				setupUserName(messageline.getBody());
				parent.broadcastMessage("LIST:" + parent.returnUsernameList());
			} else if (messageline.getType().equals("MESSAGE")) {
				parent.broadcastMessage("MESSAGE:" + user + "说: "
						+ messageline.getBody());
			} else if (messageline.getType().equals("LEAVE")) {
				String c = disconnectClient();
				parent.broadcastMessage("REMOVE:" + c);
				parent.broadcastMessage("LIST:" + parent.returnUsernameList());
			}
		} else
			sendMessage("命令不存在!");
	}

	public String disconnectClient() {
		try {
			in.close();
			out.close();
			theSocket.close();
			parent.removeConnectionList(this);
			disconnect = true;
		} catch (Exception ex) {
		}
		return user;
	}

	public void run() {
		String line, name;
		boolean valid = false;
		try {
			while ((line = in.readLine()) != null) {
				System.out.println("收到:" + line);
				extractMessage(line);
			}
		} catch (IOException io) {
		}
	}
}