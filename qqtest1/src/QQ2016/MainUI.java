package QQ2016;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;



public class MainUI extends JFrame implements ActionListener,MouseListener,MouseMotionListener,WindowListener,ItemListener{
	JLabel labima,labinfo,lbclose,lbmin,lbfind,lbchange,lbstr,lbsousuo;
//	JLabel 
	JTextField jtsousuo;
	JList friendlist,classmatelist,filmylist,hatelist;
	JTabbedPane tapan;
	JPanel pan,toppan;
	JPopupMenu pomenu;
	JComboBox cbstatus;
	JMenuItem ichat,movefriend,moveclassmate,movefilmy,movehate,lookinfo,idelfriend;
	AccountVO myinfo,friendinfo,filmyinfo,classmateinfo,hateinfo;
	Vector<AccountVO>vallinfo,vfriendinfo,vclassmateinfo,vfilmyinfo,vhateinfo;
	Hashtable<Integer, ChatUI> chathash=new Hashtable<Integer, ChatUI>();
	BaseDAO baseDAO=new BaseDAO();
	StyledDocument vdoc;
	TrayIcon trayicon;
	int x,y;
	public MainUI() {}
	public MainUI(AccountVO myinfo) {
//		super("QQ");
//		Toolkit tk=Toolkit.getDefaultToolkit();
//		Image ima3=tk.getImage("touxiang1.png");
//		setIconImage(ima3);
//		this.myinfo=myinfo;
//		friendlist=new JList();
//		classmatelist=new JList();;
//		filmylist=new JList();;
//		hatelist=new JList();;
//		setResizable(false);
//		cbstatus=new JComboBox(Cmd.STATUS);
//		cbstatus.removeItemAt(1);
//		labima=new JLabel(new ImageIcon("e/bgmain3.jpg"));
//		labima.setLayout(new BorderLayout());
//		jbfind=new JButton("查找");
//		jbchange=new JButton("换肤");
//		pan=new JPanel();
//		pan.setOpaque(false);
//		ImageIcon icon=new ImageIcon(myinfo.getHeadImg());
//		String str=myinfo.getNickName()+"("+myinfo.getQqCode()+")"+myinfo.getHobit();
//		labinfo=new JLabel(str,icon,JLabel.LEFT);
//		labima.add(labinfo,BorderLayout.NORTH);
//		add(labima);
//		vallinfo=new Vector<AccountVO>();
//		vfriendinfo=new Vector<AccountVO>();
//		vclassmateinfo=new Vector<AccountVO>();
//		vfilmyinfo=new Vector<AccountVO>();
//		vhateinfo=new Vector<AccountVO>();
//		refrsh();
//		creatmenu();
//		
//		friendlist.setOpaque(false);
//		classmatelist.setOpaque(false);
//		filmylist.setOpaque(false);
//		hatelist.setOpaque(false);
//		friendlist.setBackground(new Color(0,0,0,0));
//		classmatelist.setBackground(new Color(0,0,0,0));
//		filmylist.setBackground(new Color(0,0,0,0));
//		hatelist.setBackground(new Color(0,0,0,0));
//		UIManager.put("TabbedPane.contentOpaque", false);
//		tapan=new JTabbedPane();
//		tapan.setOpaque(false);
//		tapan.add("好友",friendlist);
//		tapan.add("同学",classmatelist);
//		tapan.add("家人",filmylist);
//		tapan.add("黑名单",hatelist);
//		pan.add(jbfind);
//		pan.add(jbchange);
//		pan.add(cbstatus);
//		labima.add(pan,BorderLayout.SOUTH);
//		labima.add(tapan);
//		//监听
//		
//		cbstatus.addItemListener(this);
//		friendlist.addMouseListener(this);
//		classmatelist.addMouseListener(this);
//		filmylist.addMouseListener(this);
//		hatelist.addMouseListener(this);
//		labinfo.addMouseListener(this);
//		jbchange.addActionListener(this);
//		jbfind.addActionListener(this);
//		addWindowListener(this);
//		//启动线程
//		settrayicon();
//		trayicon.addMouseListener(new MouseAdapter(){
//			public void mouseClicked(MouseEvent e) {
//				if(e.getClickCount()==1){
//					//获取系统托盘
//					SystemTray tray = SystemTray.getSystemTray();
//					//删除图标
//					tray.remove(trayicon);
//					//显示主窗口
//					MainUI.this.setVisible(true);
//					//恢复到正常状态
//					MainUI.this.setState(JFrame.NORMAL);
//				}
//			}
//		});
//		new recveThread().start();
//		new SendCmd().sendAll(vallinfo, myinfo,Cmd.CMD_ONLINE);
//		setSize(300, 700);
//		setVisible(true);
//		setLocation(1050, 50);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super("QQ");
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image ima3=tk.getImage("touxiang1.png");
		setIconImage(ima3);
		setUndecorated(true);
		this.myinfo=myinfo;
		friendlist=new JList();
		classmatelist=new JList();
		filmylist=new JList();
		hatelist=new JList();
		
		setResizable(false);
		cbstatus=new JComboBox(Cmd.STATUS);
		cbstatus.removeItemAt(1);
		labima=new JLabel(new ImageIcon("e/bgmain3.jpg"));
		labima.setLayout(null);
		lbfind=new JLabel("查找");
		lbchange=new JLabel(new ImageIcon("e/pifu.png"));
		lbsousuo=new JLabel(new ImageIcon("e/sousuo.png"));
		jtsousuo=new JTextField();
		
		jtsousuo.setToolTipText("查找好友账号");
		lbclose=new JLabel("×");
		lbmin=new JLabel("▂");
		lbmin.setForeground(Color.white);
		lbclose.setForeground(Color.white);
		lbclose.setFont(new Font("黑体",Font.BOLD,18));
		labima.add(lbclose);
		lbclose.setBounds(270,5,20,20);
		labima.add(lbmin);
		lbmin.setBounds(250,3,20,20);
		ImageIcon icon=new ImageIcon(myinfo.getHeadImg());
		String str=myinfo.getNickName()+"("+myinfo.getQqCode()+")"+myinfo.getHobit();
		lbstr=new JLabel(str);
		labinfo=new JLabel(icon,JLabel.LEFT);
		labima.add(labinfo);
		labima.add(lbstr);
		lbstr.setBounds(76,50,200,20);
		labinfo.setBounds(5,20,70,70);
		labima.add(cbstatus);
		cbstatus.setBounds(75,70,55,20);
		labima.add(jtsousuo);
		labima.add(lbsousuo);
		lbsousuo.setBounds(265,91,33,24);
		jtsousuo.setBounds(0,91,265,24);
		add(labima);
		vallinfo=new Vector<AccountVO>();
		vfriendinfo=new Vector<AccountVO>();
		vclassmateinfo=new Vector<AccountVO>();
		vfilmyinfo=new Vector<AccountVO>();
		vhateinfo=new Vector<AccountVO>();
		jtsousuo.setOpaque(false);
		friendlist.setOpaque(false);
		classmatelist.setOpaque(false);
		filmylist.setOpaque(false);
		hatelist.setOpaque(false);
		friendlist.setBackground(new Color(0,0,0,0));
		classmatelist.setBackground(new Color(0,0,0,0));
		filmylist.setBackground(new Color(0,0,0,0));
		hatelist.setBackground(new Color(0,0,0,0));
		UIManager.put("TabbedPane.contentOpaque", false);
		tapan=new JTabbedPane();
		tapan.setOpaque(false);
		tapan.add("好友",friendlist);
		tapan.add("同学",classmatelist);
		tapan.add("家人",filmylist);
		tapan.add("黑名单",hatelist);
		labima.add(lbfind);
		lbfind.setBounds(270,580,40,20);
		lbfind.setOpaque(false);
		labima.add(lbchange);
		lbchange.setBounds(132,70,30,20);
		
		
		
		refrsh();
		creatmenu();
		
		labima.add(tapan);
		tapan.setBounds(0,117,300,460);
		//监听
		lbsousuo.addMouseListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		lbclose.addMouseListener(this);
		lbmin.addMouseListener(this);
		cbstatus.addItemListener(this);
		friendlist.addMouseListener(this);
		classmatelist.addMouseListener(this);
		filmylist.addMouseListener(this);
		hatelist.addMouseListener(this);
		labinfo.addMouseListener(this);
		lbchange.addMouseListener(this);
		lbfind.addMouseListener(this);
		addWindowListener(this);
		//启动线程
		settrayicon();
		trayicon.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==1){
					//获取系统托盘
					SystemTray tray = SystemTray.getSystemTray();
					//删除图标
					tray.remove(trayicon);
					//显示主窗口
					MainUI.this.setVisible(true);
					//恢复到正常状态
					MainUI.this.setState(JFrame.NORMAL);
				}
			}
		});
		new recveThread().start();
		new SendCmd().sendAll(vallinfo, myinfo,Cmd.CMD_ONLINE);
		
		
		
		//启动线程
		setSize(300, 600);
		setVisible(true);
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		int width = toolkit.getScreenSize().width-300;
//		int height = toolkit.getScreenSize().height-700;
//		setLocation(width, height);
		setLocationRelativeTo(null);
		Vector offdata=new Vector();
		
		offdata=new BaseDAO().readoff(myinfo.getQqCode());
		System.out.println("打印数据"+offdata.size());
		if(offdata.size()!=0){
			int qq=((Integer)offdata.get(0));
			AccountVO offsendinfo=baseDAO.getselectfriends(qq);
			String str5="你的好友"+offsendinfo.getNickName()+"给你发来消息，是否接收";
			if(JOptionPane.showConfirmDialog(null, str5,"消息提醒",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
				ChatUI chat=chathash.get(offsendinfo.getQqCode());
				if(chat==null){
					chat=new ChatUI(myinfo,offsendinfo);
					chathash.put(offsendinfo.getQqCode(), chat);
				}
				chat.show();
				String str2=offdata.get(3).toString();
				String name=offsendinfo.getNickName();
				Date date=new Date();
				SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				String time=sf.format(date);
				String s=name+""+time+"\n"+str2+"\n";
				System.out.println(str2);
				chat.recvepan.setText(s);
			}
			
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		baseDAO.deloffmsg(myinfo.getQqCode());
	}
	public static void main(String[] args) {
		new MainUI();
	}
	class recveThread extends Thread{
		public recveThread() {

		}
		@Override
		public void run() {
			try {
				DatagramSocket socket=new DatagramSocket(myinfo.getPort());
				while(true){
					byte[]b=new byte[1024*512];
					DatagramPacket pocket=new DatagramPacket(b,0,b.length);
					socket.receive(pocket);
					ByteArrayInputStream bis=new ByteArrayInputStream(b);
					ObjectInputStream os=new ObjectInputStream(bis);
					SendMsg msg=(SendMsg)os.readObject();
					
					myinfo=msg.friendinfo;
					friendinfo=msg.myinfo;
					switch (msg.cmd) {
					case Cmd.CMD_ONLINE:
						refrsh();
						new TipUI(friendinfo);
						break;
					case Cmd.CMD_LEVEL:
					case Cmd.CMD_BUYS:
						refrsh();
						break;
					case Cmd.CMD_OFFLINE:
						refrsh();
						new TipUI(friendinfo);
						break;
					case Cmd.CMD_CHANGESTATUS:
						refrsh();
						break;
					case Cmd.CMD_SEND:	
						System.out.println("有消息来了111");
						new sounds();
						ChatUI chat=openchat();
						chat.appendview(msg.myinfo.getNickName(),msg.doc);
						break;
					case Cmd.CMD_SHAKE:
						chat=openchat();
						chat.shnake();
						break;
					case Cmd.CMD_ADDFRI:
						new sounds();
						
						String str = "【"+friendinfo.getNickName()+"】请求添加你为好友，是否同意？";
						SendMsg msg2 = new SendMsg();
						if(JOptionPane.showConfirmDialog(null, str,"添加好友",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
							msg2.cmd = Cmd.CMD_AGREE;
							baseDAO.addfriend(myinfo.getQqCode(), friendinfo.getQqCode());
							refrsh();
						}else{
							msg2.cmd = Cmd.CMD_REFUSE;
						}
						msg2.myinfo = myinfo;
						msg2.friendinfo = friendinfo;
						new SendCmd().Send(msg2);
						break;
					case Cmd.CMD_DELETEFRI:
						refrsh();
						break;
					case Cmd.CMD_AGREE:
						refrsh();
						break;
					case Cmd.CMD_REFUSE:
						String str1="("+friendinfo.getNickName()+")拒绝添加你为好友";
						JOptionPane.showMessageDialog(null, str1);
						break;
					case Cmd.CMD_FILE:
						String filestr=friendinfo.getNickName()+"发送了一个("+msg.filename+"文件)给你";
						if(JOptionPane.showConfirmDialog(null, filestr+"是否接收文件?","接收文件",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){	
							JFileChooser jfs=new JFileChooser("");
							jfs.setDialogType(JFileChooser.SAVE_DIALOG);
							jfs.setDialogTitle("保存文件");
							if(jfs.showOpenDialog(null)==jfs.APPROVE_OPTION){
								String ext=msg.filename.substring(msg.filename.indexOf('.'),msg.filename.length());
								String filename=jfs.getSelectedFile().getAbsolutePath()+ext;
								FileOutputStream fos=new FileOutputStream(filename);
								fos.write(msg.b);
								fos.flush();
								fos.close();
							}
						}
						break;	
					}
				}
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
			
		}
	}
	public void creatmenu(){
		pomenu=new JPopupMenu();
		ichat=new JMenuItem("发送信息");
		movefriend=new JMenuItem("移至好友分组");
		moveclassmate=new JMenuItem("移至同学分组");
		movefilmy=new JMenuItem("移至家人分组");
		movehate=new JMenuItem("移至黑名单分组");
		lookinfo=new JMenuItem("查看信息");
		idelfriend=new JMenuItem("删除好友");
		ichat.addActionListener(this);
		movefriend.addActionListener(this);
		moveclassmate.addActionListener(this);
		movefilmy.addActionListener(this);
		movehate.addActionListener(this);
		lookinfo.addActionListener(this);
		idelfriend.addActionListener(this);
		pomenu.add(ichat);
		pomenu.add(movefriend);
		pomenu.add(moveclassmate);
		pomenu.add(movefilmy);
		pomenu.add(movehate);
		pomenu.add(lookinfo);
		pomenu.add(idelfriend);
	}
	public void settrayicon(){
		Image ima=new ImageIcon("e/trayicon.jpg").getImage();
		trayicon=new TrayIcon(ima,"QQ2012");
		trayicon.setImageAutoSize(true);
	}
	public void refrsh(){
		vallinfo=baseDAO.getFriend(myinfo.getQqCode());
		vclassmateinfo.clear();
		vfriendinfo.clear();
		vfilmyinfo.clear();
		vhateinfo.clear();
		for(AccountVO acc:vallinfo){
			String grounpname=acc.getGroupname();
		//	GROUPNAME={"同学","好友","家人","黑名单"};
			if(grounpname.equals(Cmd.GROUPNAME[0])){
				vclassmateinfo.add(acc);
			}
			if(grounpname.equals(Cmd.GROUPNAME[1])){
				vfriendinfo.add(acc);
			}
			if(grounpname.equals(Cmd.GROUPNAME[2])){
				vfilmyinfo.add(acc);
			}
			if(grounpname.equals(Cmd.GROUPNAME[3])){
				vhateinfo.add(acc);
			}
		}
		friendlist.setModel(new DataModel(vfriendinfo));
		classmatelist.setModel(new DataModel(vclassmateinfo));
		filmylist.setModel(new DataModel(vfilmyinfo));
		hatelist.setModel(new DataModel(vhateinfo));
		friendlist.setCellRenderer(new MyHeadImg(vfriendinfo));
		classmatelist.setCellRenderer(new MyHeadImg(vclassmateinfo));
		filmylist.setCellRenderer(new MyHeadImg(vfilmyinfo));
		hatelist.setCellRenderer(new MyHeadImg(vhateinfo));
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==idelfriend){
			baseDAO.delfriends(myinfo.getQqCode(), friendinfo.getQqCode());
			refrsh();
			SendMsg msg=new SendMsg();
			msg.myinfo=myinfo;
			msg.friendinfo=friendinfo;
			msg.cmd=Cmd.CMD_DELETEFRI;
			new SendCmd().Send(msg);
		}
		if(e.getSource()==trayicon){
			SystemTray tray = SystemTray.getSystemTray();
			//删除图标
			tray.remove(trayicon);
			//显示主窗口
			MainUI.this.setVisible(true);
			//恢复到正常状态
			MainUI.this.setState(JFrame.NORMAL);
		}
		if(e.getSource()==ichat){
			openchat();
		}
		
		if(e.getSource()==lookinfo){
				new lookinfoUI(friendinfo);
		}
		if(e.getSource()==movefriend){
			String groupname=Cmd.GROUPNAME[1];
			new BaseDAO().movegroup(myinfo.getQqCode(), friendinfo.getQqCode(), groupname);
			refrsh();
		}
		if(e.getSource()==movefilmy){
			String groupname=Cmd.GROUPNAME[2];
			new BaseDAO().movegroup(myinfo.getQqCode(), friendinfo.getQqCode(), groupname);
			refrsh();
		}
		if(e.getSource()==moveclassmate){
			String groupname=Cmd.GROUPNAME[0];
			new BaseDAO().movegroup(myinfo.getQqCode(), friendinfo.getQqCode(), groupname);
			refrsh();
		}
		if(e.getSource()==movehate){
			String groupname=Cmd.GROUPNAME[3];
			new BaseDAO().movegroup(myinfo.getQqCode(), friendinfo.getQqCode(), groupname);
			refrsh();
		}
	}
	class DataModel extends AbstractListModel {
		Vector<AccountVO>data;
		public DataModel() {}
		public DataModel(Vector<AccountVO> data) {
			this.data = data;
		}
	    //系统自动运行，下标从0开始计算
	    public Object getElementAt(int index) {
	    	AccountVO info = data.get(index);
	    	return info.getNickName()+"("+info.getQqCode()+")【"+info.getRemark()+"]";
	    }

	    public int getSize() {
	        return data.size();
	    }
	    
	}
	//打开窗口
	public ChatUI openchat(){
		
			
			ChatUI chat=chathash.get(friendinfo.getQqCode());
			if(chat==null){
				chat=new ChatUI(myinfo,friendinfo);
				chathash.put(friendinfo.getQqCode(), chat); 
				
			}
			chat.show();
			return chat;
	}
	// 获取好友头像
	class MyHeadImg extends DefaultListCellRenderer{
		Vector<AccountVO> datas;
		public MyHeadImg(Vector<AccountVO> datas) {
			this.datas = datas;
		}
		@Override
		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {
			Component c = super.getListCellRendererComponent(list, value,
					index, isSelected, cellHasFocus);
			if (index >= 0 && index < datas.size()) {
				AccountVO user =  datas.get(index);
				String status = user.getOlinestatus();
				String headImg = user.getHeadImg();
//				STATUS={"在线","离线","忙碌","隐身"};
				String filename = "";
				if(status.equals(Cmd.STATUS[0])){
					filename = headImg;
				}else if(status.equals(Cmd.STATUS[1])){
					int pos = headImg.indexOf('.');
					String pre = headImg.substring(0,pos);
					String fix = headImg.substring(pos,headImg.length());
					filename = pre + "_h"+fix;
				}else if(status.equals(Cmd.STATUS[2])){
					int pos = headImg.indexOf('.');
					String pre = headImg.substring(0,pos);
					String fix = headImg.substring(pos,headImg.length());
					filename = pre + "_l"+fix;
				}else if(status.equals(Cmd.STATUS[3])){
					int pos = headImg.indexOf('.');
					String pre = headImg.substring(0,pos);
					String fix = headImg.substring(pos,headImg.length());
					filename = pre + "_w"+fix;
				}
				// 给列表中好友状态设置头像
				setIcon(new ImageIcon(filename));
				//设置文本内容
				setText(user.getNickName()+"("+user.getQqCode()+")【"+user.getRemark()+"]");
			}
			// 设置字体颜色
			if (isSelected) {
				setBackground(list.getSelectionBackground());
				setForeground(list.getSelectionForeground());
			} else {
				setBackground(list.getBackground());
				setForeground(list.getForeground());
			}
			//设置有效
			setEnabled(list.isEnabled());
			//设置默认字体
			setFont(list.getFont());
//			setFont(new Font("宋体",Font.BOLD,14));
			//设置透明背景
			setOpaque(false);
			return this;
		}
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==lbsousuo){
			if(e.getButton()==1){
				String findqq=jtsousuo.getText().trim();
				if(findqq.equals("")){
					JOptionPane.showMessageDialog(this, "请输入你要查找的QQ号码");
					return;
				}
				String sql="select *from account where qqcode='"+findqq+"'";
				AccountVO vcdata=baseDAO.sousuofriend(sql);
				new lookfriendUI(vcdata,myinfo);
			}
		}
		if(e.getSource()==labinfo){
			if(e.getClickCount()==2){
				new UpdateinfoUI(myinfo,this);
			}
		}
		if(e.getSource()==lbclose){
			if(e.getButton()==1){
				
				baseDAO.changestatus(myinfo.getQqCode(), Cmd.STATUS[1]);
				myinfo.setOnlinestatus(Cmd.STATUS[1]);
				new SendCmd().sendAll(vallinfo, myinfo, Cmd.CMD_OFFLINE);
				System.exit(0);
			}
		}
		if(e.getSource()==lbmin){
			if(e.getButton()==1){
				this.setState(JFrame.HIDE_ON_CLOSE);
			}
		}
		if(e.getSource()==lbfind){
			if(e.getButton()==1){
				new FindUI(myinfo);
			}
		}
		if(e.getSource()==lbchange){
			if(e.getButton()==1){
				JFileChooser jfile=new JFileChooser();
				jfile.setDialogType(JFileChooser.OPEN_DIALOG);
				jfile.setFileSelectionMode(JFileChooser.FILES_ONLY);
				jfile.setDialogTitle("更换皮肤");
				if(jfile.showOpenDialog(this)==jfile.APPROVE_OPTION){
					File file=jfile.getSelectedFile();
					String path=file.getPath();
					labima.setIcon(new ImageIcon(path));
				}
			}
		}
		if(e.getSource()==friendlist){
			if(friendlist.getSelectedIndex()>=0){
				friendinfo=vfriendinfo.get(friendlist.getSelectedIndex());
			}
			if(e.getButton()==3){
				if(friendlist.getSelectedIndex()>=0){
					pomenu.show(friendlist,e.getX(),e.getY());
				}
			}
			if(e.getClickCount()==2){
					openchat();
			}
		}
		if(e.getSource()==filmylist){
			if(filmylist.getSelectedIndex()>=0){
				friendinfo=vfilmyinfo.get(filmylist.getSelectedIndex());
			}
			if(e.getButton()==3){
				if(filmylist.getSelectedIndex()>=0){
					pomenu.show(filmylist,e.getX(),e.getY());
				}
			}
			if(e.getClickCount()==2){
					openchat();
			}
		}
		if(e.getSource()==classmatelist){
			if(classmatelist.getSelectedIndex()>=0){
				friendinfo=vclassmateinfo.get(classmatelist.getSelectedIndex());
			}
			if(e.getButton()==3){
				if(classmatelist.getSelectedIndex()>=0){
					pomenu.show(classmatelist,e.getX(),e.getY());
				}
			}
			if(e.getClickCount()==2){
					openchat();
			}
		}
		if(e.getSource()==hatelist){
			if(hatelist.getSelectedIndex()>=0){
				hateinfo=vhateinfo.get(hatelist.getSelectedIndex());
			}
			if(e.getButton()==3){
				if(hatelist.getSelectedIndex()>=0){
					pomenu.show(hatelist,e.getX(),e.getY());
				}
			}
			
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
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==cbstatus){
			changestatus();
			String status=cbstatus.getSelectedItem().toString();
			baseDAO.changestatus(myinfo.getQqCode(), status);
			new SendCmd().sendAll(vallinfo, myinfo, Cmd.CMD_CHANGESTATUS);
		}
	}
	public void changestatus(){
		String filename = myinfo.getHeadImg();
		String status=cbstatus.getSelectedItem().toString();
		String headImg=myinfo.getHeadImg();
		if(status.equals(Cmd.STATUS[0])){
			filename = headImg;
		}
		else if(status.equals(Cmd.STATUS[2])){
			int pos = headImg.indexOf('.');
			String pre = headImg.substring(0,pos);
			String fix = headImg.substring(pos,headImg.length());
			filename = pre + "_l"+fix;
		}else if(status.equals(Cmd.STATUS[3])){
			int pos = headImg.indexOf('.');
			String pre = headImg.substring(0,pos);
			String fix = headImg.substring(pos,headImg.length());
			filename = pre + "_w"+fix;
		}
		labinfo.setIcon(new ImageIcon(filename));
	}
	public void windowActivated(WindowEvent e) {
		
	}
	public void windowClosed(WindowEvent e) {
		
	}
	public void windowClosing(WindowEvent e) {
		//JOptionPane.showMessageDialog(this, "窗口即将关闭");
		
	}
	public void windowDeactivated(WindowEvent e) {
		
	}
	public void windowDeiconified(WindowEvent e) {
		
	}
	public void windowIconified(WindowEvent e) {
		//获取系统托盘
		SystemTray tray = SystemTray.getSystemTray();
		if(trayicon!=null){
			tray.remove(trayicon);
		}
		try {
			tray.add(trayicon);
			//隐藏当前窗口
			MainUI.this.setVisible(false);
		} catch (AWTException e1) {
			e1.printStackTrace();
		}
	}
	public void windowOpened(WindowEvent e) {
		
	}
	public void mouseDragged(MouseEvent e) {
		int jfx=this.getLocation().x;
		int jfy=this.getLocation().y;
		this.setLocation(jfx+e.getX()-x,jfy+e.getY()-y);
	}
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
