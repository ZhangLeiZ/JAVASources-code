package INternet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cilent {


	public static void main(String[] args) {
		try {
			Socket server = new Socket("127.0.0.1",8998);
			System.out.println("连接成功");
			new PrintStream(server.getOutputStream()).println("客户端请求连接");
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			System.out.println("客户端获取服务端数据//"+br.readLine());
			server.close(); 
		} catch (UnknownHostException e){
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 

	}

}
