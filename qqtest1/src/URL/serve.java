package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serve {
	public static void main(String[] args) {
		try {
			ServerSocket sso=new ServerSocket(8000,5);
			Socket clienSocket=sso.accept();
			System.out.println("有客户端连接。。。。。");
			InputStream is=clienSocket.getInputStream();
			OutputStream os=clienSocket.getOutputStream();
			InputStreamReader sr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(sr);
			PrintStream ps=new PrintStream(os);
			
				System.out.println("服务器端接收："+br.readLine());
			
			String s="扒皮哥还钱！！！还我血汗钱！！！";
			ps.write(s.getBytes());
			clienSocket.close();
			sso.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
