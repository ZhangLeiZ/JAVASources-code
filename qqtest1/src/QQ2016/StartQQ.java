package QQ2016;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.StyledDocument;

import sun.security.util.PendingException;

public class StartQQ extends JFrame implements MouseListener,ActionListener,ItemListener,MouseMotionListener{
	JPanel pan1,pan2,pan3;
	JLabel labsymbel,lblMin,lblClose,lbzhuce,lbfindback,labimgname;
	JCheckBox ckmima,ckreg;
	JButton jbrela=new JButton(" 登录  ");
	JPasswordField jtpassword;
	JComboBox cbQQcode;
	HashMap<Integer, AccountVO>user=null;
	ImageIcon ima2=new ImageIcon("touxiang1.png");
	int x,y;
	TrayIcon trayicon;
	SystemTray tray;
	public StartQQ() {
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		ImageIcon ima=new ImageIcon("e/qqname.gif");
		ImageIcon ima4=new ImageIcon("touxiang1.png");
		Image ima3=tk.getImage("touxiang1.png");
		setIconImage(ima3);
		lblMin = new JLabel("");
		lblMin.setForeground(Color.WHITE);
		lblClose = new JLabel("");
		lblClose.setForeground(Color.WHITE);
		lblClose.setFont(new Font("黑体",Font.BOLD,18));
		lblMin.setBounds(375, 0, 20, 20);
		lblClose.setBounds(400, 7, 20, 20);
		lblMin.addMouseListener(this);
		lblClose.addMouseListener(this);
		
		
		labsymbel=new JLabel(ima);
		labsymbel.setLayout(null);
		labsymbel.add(lblClose);
		labsymbel.add(lblMin);
		lbzhuce=new JLabel("注册账号");
		lbfindback=new JLabel("找回密码");
		labimgname=new JLabel(ima2);
		cbQQcode=new JComboBox();
		cbQQcode.setToolTipText("查找联系人");
		jtpassword=new JPasswordField(20);
		jtpassword.setToolTipText("密码");
		jtpassword.setEchoChar('*');
		pan2=new JPanel(null);
		
		pan2.add(labimgname);
		labimgname.setBounds(40,10,70,70);
		pan2.add(cbQQcode);
		cbQQcode.setBounds(130,10,200,30);
		cbQQcode.setEditable(true);
		pan2.add(jtpassword);
		jtpassword.setBounds(130,40,200,30);
		pan2.add(lbzhuce);
		lbzhuce.setBounds(340,10,95,30);
		lbzhuce.setForeground(Color.BLUE);
		pan2.add(lbfindback);
		lbfindback.setBounds(340,45,95,30);
		lbfindback.setForeground(Color.BLUE);
		ckmima=new JCheckBox("记住密码");
		ckreg=new JCheckBox("自动登录");
		pan2.add(ckmima);
		ckmima.setForeground(Color.DARK_GRAY);
		ckmima.setBounds(125,70,80,30);
		pan2.add(ckreg);
		ckreg.setBounds(230,70,80,30);
		ckreg.setForeground(Color.darkGray);
		
		
		
		pan2.add(jbrela);
		jbrela.setBounds(130,105,200,28);
		jbrela.setForeground(Color.white);
		jbrela.setFont(new Font("楷体",Font.BOLD,21));
		jbrela.setBackground(Color.BLUE);
		this.add(labsymbel,BorderLayout.NORTH);
		add(pan2,BorderLayout.CENTER);
		//监听a
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		jtpassword.addMouseListener(this);
		jbrela.addActionListener(this);
		lbzhuce.addMouseListener(this);
		cbQQcode.addItemListener(this);
		ckmima.addItemListener(this);
		
		
		readfile();
		//UIManager.setLookAndFeel(com.sun.java.swing.plaf.motif.MotifLookAndFeel);
		//去修饰框
		setUndecorated(true);
		this.setSize(430,330);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args) {
		new StartQQ();
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==lblMin){
			this.setState(JFrame.HIDE_ON_CLOSE);
			
		}
		if(e.getSource()==lblClose){
			System.exit(0);
		}
		if(e.getSource()==lbzhuce){
			new ZhuceUI();
		}
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	public void mousePressed(MouseEvent e) {
		x=e.getX();
		y=e.getY();
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseDragged(MouseEvent e) {
		int jfx=this.getLocation().x;
		int jfy=this.getLocation().y;
		this.setLocation(jfx+e.getX()-x,jfy+e.getY()-y);
	}
	public void mouseMoved(MouseEvent e) {
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbrela){
			String qqcode="";
			String password=jtpassword.getText().trim();
			if(cbQQcode.getSelectedItem()==null||cbQQcode.getSelectedItem().toString().equals("")){
				JOptionPane.showMessageDialog(this, "请输入账号！");
				
				return;
			}
			if(password.equals("")){
				JOptionPane.showMessageDialog(this, "请输入密码");
				return;
			}
			qqcode=cbQQcode.getSelectedItem().toString();
			AccountVO acc=new AccountVO();
			acc.setQqCode(Integer.parseInt(qqcode));
			acc.setPassword(password);
			acc=new BaseDAO().sback(acc);
			if(acc==null){
				JOptionPane.showMessageDialog(this, "登录失败！");
				return;
			}else{
				//JOptionPane.showMessageDialog(this, "登录成功！");
				
					save(acc);
					dispose();
					new MainUI(acc);
					
				
				
				
				
				
			}
		}
		
	}
	public void save(AccountVO acc){
		HashMap<Integer, AccountVO>user=null;
		File file=new File("account.dat");
		try{
			if(!file.exists()){
				file.createNewFile();
				user=new HashMap<Integer, AccountVO>();
			}else{
				FileInputStream fs=new FileInputStream(file);
				ObjectInputStream os=new ObjectInputStream(fs);
				user=(HashMap<Integer, AccountVO>)os.readObject();
				fs.close();
				os.close();
			}
			user.put(acc.getQqCode(), acc);
			ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("account.dat"));
			os.writeObject(user);
			os.flush();
			os.close();
			
		}catch(Exception e){
			
		}
	}
	public void readfile(){
		try{
			File file=new File("account.dat");
			if(!file.exists()){
				return;
			}
			FileInputStream fs=new FileInputStream(file);
			ObjectInputStream os=new ObjectInputStream(fs);
			user=(HashMap<Integer, AccountVO>)os.readObject();
			Set<Integer> set=user.keySet();
			Iterator<Integer> it=set.iterator();
			while(it.hasNext()){
				cbQQcode.addItem(it.next());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void tray(){
		tray=SystemTray.getSystemTray();
		
	}
	public void itemStateChanged(ItemEvent a) {
		if(a.getSource()==cbQQcode){
			if(!cbQQcode.getSelectedItem().toString().equals("") && user !=null){
				
				int qqcode=Integer.parseInt(cbQQcode.getSelectedItem().toString());
				System.out.println(qqcode);
				AccountVO acc=user.get(qqcode);
				if(acc!=null){
					labimgname.setIcon(new ImageIcon(acc.getHeadImg()));
					jtpassword.setText(acc.getPassword());
				}
				
			}
			
		}
		
	}
}
