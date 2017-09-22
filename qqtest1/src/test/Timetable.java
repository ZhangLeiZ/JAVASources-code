package test;

import java.awt.Color;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Timetable {
	public static void main(String[] args) {
		new mainframe();
	}
}
class mainframe extends JFrame implements Runnable{
	JLabel timescreen=new JLabel("2016/10/15/ 10:06:");
	
	public mainframe() {
		super("电子表");
		this.add(timescreen);
		this.setBackground(Color.PINK);
		this.pack();
		this.setVisible(true);
		new Thread(this).start();
	}
	public void run() {
		while(true){
			timescreen.setText(new Date().toLocaleString());
		}
	}
	
}