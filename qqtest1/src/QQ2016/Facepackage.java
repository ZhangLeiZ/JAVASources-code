package QQ2016;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Facepackage extends JFrame implements MouseListener{
	JLabel slb[];
	JLabel lbpan=new JLabel();
	String sicon[];
	ChatUI chat;
	private void Facepackagen() {
	}
	public Facepackage(ChatUI chat,int x,int y) {
		this.chat=chat;
		setUndecorated(true);
		setResizable(false);
		setAlwaysOnTop(true);
		Container con=getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		con.setBackground(Color.white);
		
		File file=new File("facepackge");
		sicon=file.list();
		slb=new JLabel[sicon.length];
		for(int i=0;i<sicon.length;i++){
			slb[i]=new JLabel(new ImageIcon("facepackge/"+sicon[i]));
			slb[i].setBorder(BorderFactory.createLineBorder(Color.white,2));
			slb[i].addMouseListener(this);
			add(slb[i]);
		}
		setSize(300,300);
		setVisible(true);
		//setLocationRelativeTo(null);
		setLocation(x, y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void mani() {
	}
	public void mouseClicked(MouseEvent e) {
		
			for(int i=0;i<sicon.length;i++){
				if(e.getButton()==1){
					if(e.getSource()==slb[i]){
						chat.sendtext.insertIcon(slb[i].getIcon());
						dispose();
						break;
					}
			}
		}
	}
	public void mouseEntered(MouseEvent e) {
		for(int i=0;i<sicon.length;i++){
			if(e.getSource()==slb[i]){
				slb[i].setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
				break;
			}
			
		}
		
	}
	public void mouseExited(MouseEvent e) {
		for(int i=0;i<sicon.length;i++){
			if(e.getSource()==slb[i]){
				slb[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
				break;
			}
			
		}
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
