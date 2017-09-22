package INternet;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerUDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte buf[]=new byte[5];
		try {
			DatagramSocket ds = new DatagramSocket(8000);
			DatagramPacket dp = new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			for(int i=0;i<buf.length;i++){
				System.out.print((char)buf[i]);
			}
			System.out.println("服务器");
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
