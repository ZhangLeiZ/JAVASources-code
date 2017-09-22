package Thread;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JoinText extends JFrame implements Runnable{

	private Thread threadA,threadB;
	final JProgressBar jprogressBar1 = new JProgressBar();
	final JProgressBar jprogressBar2 = new JProgressBar();
	static int count=0,count2=0;
	static String s = "";
	public static void main(String[] args) {
		
		new JoinText();
	}
	public JoinText() {
		super("线程");
		getContentPane().add(jprogressBar1,BorderLayout.NORTH);
		getContentPane().add(jprogressBar2,BorderLayout.SOUTH);
		jprogressBar1.setStringPainted(true);
		jprogressBar2.setStringPainted(true);
		JoinText str = new JoinText();
		new Thread(str,"1").start();
		new Thread(str,"2").start();
		setSize(100,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
	}
	
	public void run() {
		while(true){
			synchronized(s){
			jprogressBar1.setValue(++count);
			jprogressBar2.setValue(++count2);				
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(count==100){
				break;
				}
			}
		}
		
	}
}

