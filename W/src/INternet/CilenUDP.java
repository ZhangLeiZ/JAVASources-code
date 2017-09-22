package INternet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class CilenUDP {

	public static void main(String[] args) {
		byte buf[]={'H','E','L','L','O'};

	try {
		DatagramSocket ds = new DatagramSocket();
	    DatagramPacket dp = new DatagramPacket(buf,0,buf.length,InetAddress.getByName("localhost"),8000);
	    ds.send(dp);
	} catch (SocketException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
