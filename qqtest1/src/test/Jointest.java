package test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Jointest extends JFrame implements Runnable{
	JProgressBar p1=new JProgressBar();
	JProgressBar p2=new JProgressBar();
	int count=0;
	public Jointest() {
		super("进度条加载");
		this.add(p1,BorderLayout.CENTER);
	//	this.add(p2,BorderLayout.SOUTH);
		p1.setStringPainted(true);
		p2.setStringPainted(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setSize(100,100);
		this.show();
		
	}
	public static void main(String[] args) {
		Jointest j=new Jointest();
		Thread a=new Thread(j);
		a.start();
		
	}
	public void run() {
		for(int i=0;i<=100;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			p1.setValue(i);
		}
		JOptionPane.showMessageDialog(this, "电量已充满，请拔掉电源！");
	}
}
