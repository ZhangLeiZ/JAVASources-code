package INternet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Recaive extends javax.swing.JFrame implements Runnable,ActionListener {

	int port;
	InetAddress group =null;
	MulticastSocket socket = null;
	JButton ince = new JButton("开始接收");
	JButton stop = new JButton("停止接收");
	JTextArea inceAr = new JTextArea(10,10);
	JTextArea inced = new JTextArea(10,10);
	Thread thready;
	boolean b = false;
	public Recaive() {
		super("播报数据报");
		thready = new Thread(this);
		ince.addActionListener(this);
		stop.addActionListener(this);
		JPanel south = new JPanel();
		inceAr.setForeground(Color.GREEN);
		south.add(ince);
		south.add(stop);
		JPanel north = new JPanel();
		north.add(inceAr);
		north.add(inced);
		add(south,BorderLayout.SOUTH);
		north.setLayout(new GridLayout(1,2));
		add(north,BorderLayout.CENTER);
		//validate();
		port=9886;
		
		try {
			group = InetAddress.getByName("224.225.10.0");
			socket =new MulticastSocket(port);
			socket.joinGroup(group);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(100,50,360,380);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void run() {
		while(true){
			byte data[]=new byte[1024];
			DatagramPacket packet=null;
			packet=new DatagramPacket(data,data.length,group,port);
		
			try {
				socket.receive(packet);
				String message = new String(packet.getData(),0,packet.getLength());
				inceAr.setText("正在接收内容：\n"+message);
				inced.append(message+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(b==true){break;}
		}

	}
	
	public static void main(String[] args) {
		Recaive rec = new Recaive();
		rec.setSize(560, 400);
	}
	
	public void actionPerformed(ActionEvent e) {
	    if(e.getSource()==ince){
	    	ince.setBackground(Color.RED);
	    	stop.setBackground(Color.YELLOW);
	    	
	    	if(!(thready.isAlive())){
	    		thready=new Thread(this);
	    	}
	    	
	    	thready.start();
	    	b=false;
	    	}else if(e.getSource()==stop){
	    		ince.setBackground(Color.YELLOW);
	    		stop.setBackground(Color.RED);
	    		b=true;
	    	}
	}
	
}
