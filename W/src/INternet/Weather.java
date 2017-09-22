package INternet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Weather extends Thread{
      String weather = "六块腹肌道路空间大口径";
      InetAddress address=null;
      MulticastSocket socket = null;
      public Weather() {
		try {
			address = InetAddress.getByName("224.225.10.0");
			socket = new MulticastSocket(9897);
			socket.setTimeToLive(1);
			socket.joinGroup(address);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
      @Override
    public void run() {
    	  while(true){
    	DatagramPacket packet = null;
    	byte data[]=weather.getBytes();
    	packet = new DatagramPacket(data,data.length,address,9886);
    	System.out.println(new String(data));
    	try {
			socket.send(packet);
			sleep(3000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  }
    }
	public static void main(String[] args) {
		Weather w = new Weather();
		w.start();

	}

}
