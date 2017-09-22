package INternet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InetAddress ip=InetAddress.getLocalHost();
//			String locail = ip.getHostName();
			String locaip = ip.toString();
			System.out.println("本机名："+ip.getHostName());
			System.out.println("本机ip:"+ip.getHostAddress());
			System.out.println(locaip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
