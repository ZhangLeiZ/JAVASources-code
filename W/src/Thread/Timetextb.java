package Thread;

import java.awt.Frame;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Timetextb extends Frame {

	Label label = new Label("100",1);
    public Timetextb() {

          
          this.add(label);
          this.setSize(150,50);
	     this.setVisible(true);
	   
	     
	     Time time = new Time(label);
	     new Thread(time).start();
}
	public static void main(String[] args) {
		new Timetextb();
	}
}
class Time implements Runnable {
	Label a;
	public Time(Label label) {
		a=label;
	}

	public void run() {
		try {
				for(int i=1;i<=100;i++){
					a.setText(String.valueOf(i));
					Thread.sleep(1000);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

