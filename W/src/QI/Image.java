package QI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Image extends JFrame{

	JButton btnok,btnclose;
	JPanel pancenter,pansouth;
	public Image() {
		super("图像");
	
		btnok = new JButton();
		btnclose = new JButton();
		setSize(400, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		
	}
	
}
