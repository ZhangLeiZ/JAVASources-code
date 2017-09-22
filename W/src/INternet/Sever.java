
package INternet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {

	public static void main(String[] args) {
	ServerSocket server;
	try {
		server = new ServerSocket(8998,5);
		Socket socket = server.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		new PrintStream(socket.getOutputStream()).println("欢迎来到本服务器");
		System.out.println("服务端接收//"+br.readLine());
		socket.close();
		server.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
		}
	}


