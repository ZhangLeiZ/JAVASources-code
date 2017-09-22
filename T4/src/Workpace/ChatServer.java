package Workpace;

import java.net.*;
import java.io.*;

public class ChatServer {
	final static int thePort = 8189;
	ServerSocket theServer;
	ChatHandler[] chatters;
	int numbers = 0;

	public static void main(String args[]) {
		ChatServer app = new ChatServer();
		app.run();
	}

	public ChatServer() {
		try {
			theServer = new ServerSocket(thePort);
			chatters = new ChatHandler[10];
		} catch (IOException io) {
		}
	}

	public void run() {
		try {
			System.out.println("服务器已经建立！");
			while (numbers < 10) {
				Socket theSocket = theServer.accept();
				ChatHandler chatHandler = new ChatHandler(theSocket, this);
				chatters[numbers] = chatHandler;
				numbers++;
			}
		} catch (IOException io) {
		}
	}

	public synchronized void removeConnectionList(ChatHandler c) {
		int index = 0;
		for (int i = 0; i <= numbers - 1; i++)
			if (chatters[i] == c)
				index = i;
		for (int i = index; i < numbers - 1; i++)
			chatters[i] = chatters[i + 1];
		chatters[numbers - 1] = null;
		numbers--;
	}

	public synchronized String returnUsernameList() {
		String line = "";
		for (int i = 0; i <= numbers - 1; i++)
			line = line + chatters[i].user + ":";
		return line;
	}

	public void broadcastMessage(String line) {
		System.out.println("发布信息:" + line);
		for (int i = 0; i <= numbers - 1; i++)
			chatters[i].sendMessage(line);
	}
}