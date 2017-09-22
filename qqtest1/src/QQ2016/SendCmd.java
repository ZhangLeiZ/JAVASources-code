package QQ2016;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Vector;

import javax.swing.text.StyledDocument;

public class SendCmd {
	public void Send(SendMsg msg){
		try {
			DatagramSocket socket=new DatagramSocket();
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
				ObjectOutputStream os=new ObjectOutputStream(bos);
				os.writeObject(msg);
				byte[]b=bos.toByteArray();
				InetAddress addr=InetAddress.getByName(msg.friendinfo.getIpAddr());
				int port=msg.friendinfo.getPort();
				DatagramPacket packet=new DatagramPacket(b,0,b.length,addr,port);
				socket.send(packet);
				System.out.println(msg.cmd+"==发送消息");
				socket.close();
				os.close();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void sendAll(Vector<AccountVO>allinfo,AccountVO myinfo,int cmd){
		for(AccountVO acc:allinfo){
			if(!acc.getOlinestatus().equals(Cmd.STATUS[1])&& acc.getQqCode()!=myinfo.getQqCode()){
				SendMsg msg=new SendMsg();
				msg.cmd=cmd;
				msg.myinfo=myinfo;
				msg.friendinfo=acc;
				Send(msg);
			}
		}
	}
	public void sendAll(Vector<AccountVO>allinfo,AccountVO myinfo,int cmd,StyledDocument doc){
		for(AccountVO acc:allinfo){
			if(!acc.getOlinestatus().equals(Cmd.STATUS[1])&& acc.getQqCode()!=myinfo.getQqCode()){
				SendMsg msg=new SendMsg();
				msg.cmd=cmd;
				msg.myinfo=myinfo;
				msg.friendinfo=acc;
				msg.doc=doc;
				Send(msg);
			}
		}
	}
}
