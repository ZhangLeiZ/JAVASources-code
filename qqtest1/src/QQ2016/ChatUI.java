package QQ2016;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import javax.swing.text.Element;

import com.sun.org.apache.bcel.internal.generic.FNEG;

import sun.net.www.content.image.jpeg;

public class ChatUI extends JFrame implements ActionListener,ItemListener,MouseListener{
	JLabel title,lbima;
	JTextPane recvepan,sendtext;
	JButton jbsend,jbclose,jbface,jbfile,jbcolor,jbshake,jbjieping;
	JComboBox cbfont,cbsize;
	AccountVO myinfo,friendinfo;
	JPanel sendpan,centerpan,downpan;
	Font font;
	String sfont[]={"宋体","黑体","楷体","隶书"};
	String ssize[]={"8","15","16","18","19","23","27","29","32","34","36","37","45","57","70"};
	public ChatUI(AccountVO myinfo ,AccountVO friendinfo) {
		super("QQ");
		String str=myinfo.getNickName()+"("+myinfo.getQqCode()+")和";
		str += friendinfo.getNickName()+"("+friendinfo.getQqCode()+")正在聊天...";
		setTitle(str);
		this.myinfo = myinfo;
		this.friendinfo = friendinfo;
		setIconImage(new ImageIcon(friendinfo.getHeadImg()).getImage());
		title = new JLabel(str,new ImageIcon(myinfo.getHeadImg()),JLabel.LEFT);
		lbima=new JLabel(new ImageIcon("e/chatbg.jpg"));
		lbima.setLayout(new BorderLayout());
		lbima.add(title,BorderLayout.NORTH);
		centerpan=new JPanel(new GridLayout(2,1,1,1));
		sendpan=new JPanel(new BorderLayout());
		recvepan=new JTextPane();
		recvepan.setEditable(false);
		sendtext=new JTextPane();
		centerpan.add(new JScrollPane(recvepan));
		JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		cbfont = new JComboBox(sfont);
		cbsize = new JComboBox(ssize);
		jbface=new JButton(new ImageIcon("e/sendFace.png"));
		//设置按钮大小和图片一致
		jbface.setMargin(new Insets(0,0,0,0));
		jbfile=new JButton("文件");
		jbcolor=new JButton("颜色");
		jbjieping=new JButton("截屏");
		jbshake=new JButton(new ImageIcon("e/zd.png"));
		jbshake.setMargin(new Insets(0,0,0,0));
		btnPanel.add(new JScrollPane(cbfont));
		btnPanel.add(new JScrollPane(cbsize));
		btnPanel.add(jbcolor);
		btnPanel.add(jbshake);
		btnPanel.add(jbface);
		btnPanel.add(jbfile);
		btnPanel.add(jbjieping);
		sendpan.add(btnPanel,BorderLayout.NORTH);
		sendpan.add(new JScrollPane(sendtext),BorderLayout.CENTER);
		JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jbsend=new JButton("发送(F)");
		jbclose=new JButton("关闭(X)");
		jbclose.setMnemonic('X');
		jbsend.setMnemonic('F');
		bottomPanel.add(jbsend);
		bottomPanel.add(jbclose);
		sendpan.add(bottomPanel,BorderLayout.SOUTH);
		centerpan.add(sendpan);
		lbima.add(centerpan);
		JPanel rightPanel = new JPanel(new GridLayout(2,1,1,1));
		lbima.add(rightPanel,BorderLayout.EAST);
		JLabel lblboy = new JLabel(new ImageIcon("e/boy.gif"));
		JLabel lblgirl = new JLabel(new ImageIcon("e/girl.gif"));
		rightPanel.add(lblboy);
		rightPanel.add(lblgirl);
		//透明
	//	lbima.setOpaque(false);
		rightPanel.setOpaque(false);
		centerpan.setOpaque(false);
		sendpan.setOpaque(false);
		bottomPanel.setOpaque(false);
		//监听
		jbjieping.addActionListener(this);
		cbfont.addItemListener(this);
		cbsize.addItemListener(this);
		jbclose.addActionListener(this);
		jbcolor.addActionListener(this);
		jbface.addActionListener(this);
		jbfile.addActionListener(this);
		jbsend.addActionListener(this);
		jbshake.addActionListener(this);
		add(lbima);
		setSize(600,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void appendview(String name,StyledDocument xx)throws BadLocationException{
		StyledDocument vdoc=recvepan.getStyledDocument();
		Date date=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time=sf.format(date);
		SimpleAttributeSet as=new SimpleAttributeSet();
		String s=name+" "+time+"\n";
		vdoc.insertString(vdoc.getLength(), s, as);
		int end=0;
		while (end < xx.getLength()) {
			// 获得一个元素
			javax.swing.text.Element e0 = xx.getCharacterElement(end);
			//获取对应的风格，
			SimpleAttributeSet as1 = new SimpleAttributeSet();
			StyleConstants.setForeground(as1, StyleConstants.getForeground(e0.getAttributes()));
			StyleConstants.setFontSize(as1, StyleConstants.getFontSize(e0.getAttributes()));
			StyleConstants.setFontFamily(as1, StyleConstants.getFontFamily(e0.getAttributes()));
			//获取该元素的内容
			s = e0.getDocument().getText(end, e0.getEndOffset() - end);
			// 将元素加到浏览窗中
			if("icon".equals(e0.getName())){
				vdoc.insertString(vdoc.getLength(), s, e0.getAttributes());
			}
			else{
				vdoc.insertString(vdoc.getLength(), s, as1);
//				saveRecord(name,s+"\n");//保存聊天记录
			}
			//getEndOffset（）函数就是获取当前元素的长度
			end = e0.getEndOffset(); 
		}
		// 输入一个换行
		vdoc.insertString(vdoc.getLength(), "\n", as);
		
		// 设置显示视图加字符的位置与文档结尾，以便视图滚动
		recvepan.setCaretPosition(vdoc.getLength());
	}
	
	public static void main(String[] args) {
		new ChatUI(null,null);
	}
	public void shnake(){
		int x=this.getLocation().x;
		int y=this.getLocation().y;
		for(int i=0;i<15;i++){
			if(i%2==0){
				this.setLocation(x+1, y+1);
			}else{
				this.setLocation(x-1, y-1);
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbjieping){
			 RectD rd = new RectD();
		        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment()
		                .getDefaultScreenDevice();
		        gd.setFullScreenWindow(rd);
		}
		if(e.getSource()==jbclose){
			dispose();
		}
		if(e.getSource()==jbcolor){
			JColorChooser colorlg=new JColorChooser();
			Color color=colorlg.showDialog(this, "请选择字体颜色", Color.black);
			sendtext.setForeground(color);
		}
		if(e.getSource()==jbface){
			int x,y;
			x=this.getLocation().x+220;
			y=this.getLocation().y-28;
			new Facepackage(this,x,y);
			
		}
		if(e.getSource()==jbfile){
			FileDialog fd=new FileDialog(this,"请选择要发送的文件",FileDialog.LOAD);
			fd.show();
			String filename=fd.getDirectory()+fd.getFile();
			if(filename.equals("")){
				return;
			}
			try {
				FileInputStream fs=new FileInputStream(filename);
				int size=fs.available();
				byte[]b=new byte[size];
				fs.read(b);
				SendMsg msg=new SendMsg();
				msg.b=b;
				msg.myinfo=myinfo;
				msg.friendinfo=friendinfo;
				msg.cmd=Cmd.CMD_FILE;
				msg.filename=filename;
				new SendCmd().Send(msg);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			
		}
		if(e.getSource()==jbsend){
			if(sendtext.getText().equals("")){
				JOptionPane.showMessageDialog(this, "请输入要发送的内容");
			}
			try {
				appendview(myinfo.getNickName(),sendtext.getStyledDocument());
				friendinfo = new BaseDAO().getOneFriend(friendinfo.getQqCode());
				if(friendinfo.getOlinestatus().equals(Cmd.STATUS[1])){
					String offmsg=sendtext.getText();
					System.out.println("yao发送离线消息");
					new BaseDAO().saveoff(myinfo.getQqCode(), friendinfo.getQqCode(), Cmd.CMD_SEND, offmsg);
					sendtext.setText("");
					return;
				}
					
				SendMsg msg=new SendMsg();
				System.out.println("要发送在线消息了");
				msg.cmd=Cmd.CMD_SEND;
				msg.myinfo=myinfo;
				msg.friendinfo=friendinfo;
				System.out.println("要给"+friendinfo.getNickName()+"发消息了");
				msg.doc=sendtext.getStyledDocument();
				new SendCmd().Send(msg);
				sendtext.setText("");
				
			} catch (BadLocationException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource()==jbshake){
			SendMsg msg=new SendMsg();
			msg.cmd=Cmd.CMD_SHAKE;
			msg.myinfo=myinfo;
			msg.friendinfo=friendinfo;
			new SendCmd().Send(msg);
			shnake();
		}
	}
	public void setfont(){
		String sf=sfont[cbfont.getSelectedIndex()];
		String ss=ssize[cbsize.getSelectedIndex()];
		font=new Font(sf,Font.PLAIN,Integer.parseInt(ss));
		sendtext.setFont(font);
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==cbfont){
			setfont();
		}
		if(e.getSource()==cbsize){
			setfont();
		}
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent e) {
		 
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
