package IO;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class InterruptendDome extends javax.swing.JFrame {

	Thread thread;
	public static void main(String[] args) {
		init(new InterruptendDome(),100,100);
		
	}
    public InterruptendDome() {
		super("jindut");
		final JProgressBar proBor = new JProgressBar();
		getContentPane().add(proBor,BorderLayout.NORTH);
		proBor.setStringPainted(true);
		thread = new Thread(new Runnable(){
			int count = 0;
			public void run() {
				while(true){
					proBor.setValue(++count);
					try {
						thread.sleep(100);
					} catch (InterruptedException e) {
//						System.out.println("当前程序被中断");
//						break;
					}
				}
				
			}
		});
		thread.start();
		//thread.interrupt();
	}
    public static void init(JFrame frame,int width,int height){
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(width,height);
    	frame.setVisible(true);
    }
}
