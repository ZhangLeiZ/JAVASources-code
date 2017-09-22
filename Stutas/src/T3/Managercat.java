package T3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Managercat extends JFrame implements ActionListener{

	int sum;
	JLabel bg;
	JButton incat,outcat;
	ImagePanel p;
	CatQueue h;
	JPanel panel;
	public Managercat(int sum) {
		this.sum=sum+1;
		p=new ImagePanel(sum,this);
		Container c = getContentPane();
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		c.add(panel,BorderLayout.SOUTH);
		
		h=new CatQueue(this.sum);
		c.add(p);
		incat = new JButton("进站");
		incat.addActionListener(this);
		panel.add(incat);
		
		outcat = new JButton("出站");
		outcat.addActionListener(this);
		panel.add(outcat);
		
		this.setSize(760,340);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==incat){
			p.in();
			h.pushcat(p.getID());
		}else if(e.getSource()==outcat){
			p.out();
			h.popcat();
		}
		p.repaint();
	}
	class ImagePanel extends JPanel{
		int width=130;
		int height=120;
		boolean isclare=false;
		int max;
		int i=0;
		Managercat mf;
		ImageIcon []data={
				new ImageIcon("qq.jpg"),
				new ImageIcon("clear.jpg")
		};
		
		
		public ImagePanel(int max,Managercat mf){
			this.max=max;
			this.mf=mf;
		}
		public void setisclare(boolean isclare){
			this.isclare=isclare;
		}
		public void in(){
			if(i<max){
				this.setisclare(false);
				i++;
			}else{
				System.out.println("车位已满");
			}
		}
		public void out(){
			if(i>0){
				this.setisclare(true);
				i--;
			}else{
				System.out.println("车位空闲");
			}
		}
		public int getID(){
			return i;
		}
		@Override
		public void paint(Graphics g) {
			System.out.println("-----"+i);
			mf.setTitle("目前停车数量"+i);
			if(isclare==false){
				g.drawImage(data[0].getImage(), width*(i-1), 0, width, height, Color.BLUE,this);
			}
			if(isclare==true){
				g.drawImage(data[1].getImage(), width*i, 0, width, height, Color.BLUE, this);
			}
		}
	}
}
