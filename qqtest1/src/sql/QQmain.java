package sql;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QQmain extends JFrame{
	JPanel pan=new JPanel();
	JPanel pan2=new JPanel();;
	JLabel labim;
	JButton test=new JButton ("测试");
	public QQmain() {
		super("QQ主界面");
		ImageIcon ima=new ImageIcon("qqbeijing.jpg");
		labim=new JLabel(ima);
		labim.setBounds(0,0,ima.getIconWidth(),ima.getIconHeight());
		pan2.add(test);
		add(pan2,BorderLayout.NORTH);
		pan2.setOpaque(false);
		pan.add(labim);
		add(pan,BorderLayout.SOUTH);
		this.setSize(340,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new QQmain();
	}
}
