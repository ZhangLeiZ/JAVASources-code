package QQ2016;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class reg extends JFrame{
	JLabel lbimabg;
	AccountVO acc;
	public reg() {
		lbimabg=new JLabel(new ImageIcon("e/qq.gif"));
		add(lbimabg);
		setUndecorated(true);
		setVisible(true);
		
		
		pack();
		
		setLocation(1050, 50);
		
		try {
					
			Thread.sleep(5000);
//			setVisible(false);
			dispose();
	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new reg();
		
	}
}
