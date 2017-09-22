package box;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sun.awt.image.ToolkitImage;

public class pushbox {
	public static void main(String[] args) {
		 new mainframe();
	}
}
class mainframe extends JFrame implements ActionListener{
	JButton jbrela,jbback,jbnext,jblast,jbfirst,jbfront,jbselect,jbmusic;
	JLabel jltitle,jlmusic;
	JMenu jmselect,jmset,jmhelp;
	JMenuBar menubar;
	JComboBox cdmusic;
	JMenuItem backItem,replay,nextItem,frontItem,exit,selsctItem;
	JMenuItem m1,m2,m3,m4,m5,help;
	String stmusic[]={"泡泡堂","琴箫合奏","灌篮高手","eyes","默认"};
	String musicfile[]={"eyes on me.mid","guang.mid","nor.mid","popo.mid","qin.mid"};
	gamepane gamepaint;
	final int maxlevel=50;
	public mainframe() {
		super("全球限量版推箱子游戏");
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image im=tk.getImage("pic/3.gif");
		setIconImage(im);
		Container c=getContentPane();
		c.setLayout(null);
		setbutton(c);
		setmenu();
		jltitle=new JLabel("2016版推箱子全球限量版发行");
		jltitle.setFont(new Font("楷体",Font.BOLD,21));
		jltitle.setBounds(200, 20, 300, 30);
		gamepaint=new gamepane();
		gamepaint.setBounds(0, 60, 600, 600);
		c.add(gamepaint);

		c.add(jltitle);
		c.setBackground(Color.GREEN);
		setSize(720,720);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//监听
		help.addActionListener(this);
		gamepaint.requestFocus();

		
	}
	public void setbutton(Container c){
		jbrela=new JButton("重来(R)");
		jbback=new JButton("退后(B)");
		jbnext=new JButton("下一关");
		jblast=new JButton("最终关");
		jbfirst=new JButton("第一关");
		jbfront=new JButton("上一关");
		jbselect=new JButton("选关");
		jbmusic=new JButton("音乐关");
		jbrela.setBounds(610, 80, 80,30);
		jbback.setBounds(610, 130, 80,30);
		jbnext.setBounds(610, 180, 80,30);
		jblast.setBounds(610, 230, 80,30);
		jbfirst.setBounds(610, 280, 80,30);
		jbfront.setBounds(610, 330, 80,30);
		jbselect.setBounds(610, 380, 80,30);
		jbmusic.setBounds(610, 430, 80,30);
		jlmusic=new JLabel("选择音乐");
		cdmusic=new JComboBox(stmusic);
		jlmusic.setBounds(610, 460, 80, 30);
		cdmusic.setBounds(610, 490, 80, 30);
		jbfirst.addActionListener(this);
		jbfront.addActionListener(this);
		jblast.addActionListener(this);
		jbnext.addActionListener(this);
		jbselect.addActionListener(this);
		jbback.addActionListener(this);
		jbrela.addActionListener(this);
		jbrela.setMnemonic('R');
		jbback.setMnemonic('b');
		c.add(jbrela);
		c.add(jbback);
		c.add(jbnext);
		c.add(jblast);
		c.add(jbfirst);
		c.add(jbfront);
		c.add(jbselect);
		c.add(jbmusic);
		c.add(jlmusic);
		c.add(cdmusic);
	}
	
	public void setmenu(){
		jmselect=new JMenu("选项");
		jmset=new JMenu("设置(F)");
		jmset.setMnemonic('F');
		jmhelp=new JMenu("帮助");
		menubar=new JMenuBar();
		backItem=new JMenuItem("退一步");
		replay=new JMenuItem("重来");
		nextItem=new JMenuItem("下一关");
		frontItem=new JMenuItem("上一关");
		selsctItem=new JMenuItem("选关");
		help=new JMenuItem("帮助");
		exit=new JMenuItem("退出");
		backItem.addActionListener(this);
		replay.addActionListener(this);
		selsctItem.addActionListener(this);
		nextItem.addActionListener(this);
		frontItem.addActionListener(this);

		m1=new JMenuItem(stmusic[0]);
		m2=new JMenuItem(stmusic[1]);
		m3=new JMenuItem(stmusic[2]);
		m4=new JMenuItem(stmusic[3]);
		m5=new JMenuItem(stmusic[4]);
		jmset.add(m1);
		jmset.add(m2);
		jmset.add(m3);
		jmset.add(m4);
		jmset.add(m5);
		jmhelp.add(help);
		menubar.add(jmset);
		jmselect.add(backItem);
		jmselect.add(replay);
		jmselect.add(nextItem);
		jmselect.add(frontItem);
		jmselect.add(selsctItem);
		jmselect.addSeparator();
		jmselect.add(exit);
		menubar.add(jmselect);
		menubar.add(jmset);
		menubar.add(jmhelp);
		setJMenuBar(menubar);
	}
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==help){
			
			JOptionPane.showMessageDialog(this, "有任何疑问请登录官方网站:www.baidu.com","帮助",JOptionPane.INFORMATION_MESSAGE);
		}else if(a.getSource()==jbfirst){
			gamepaint.setLevel(0);
		}else if(a.getSource()==jbnext||a.getSource()==nextItem){
			gamepaint.setLevel(1);
		}else if(a.getSource()==jbfront||a.getSource()==frontItem){
			gamepaint.setLevel(-1);
		}else if(a.getSource()==jblast){
			gamepaint.setLevel(maxlevel);
		}else if(a.getSource()==jbselect||a.getSource()==selsctItem){
			String slevel=JOptionPane.showInputDialog(this, "请输入1-50之间的关卡编号", "选关",JOptionPane.OK_CANCEL_OPTION );
			if(slevel!=null){
				try{
				int	level=Integer.parseInt(slevel);
				if(level<=0||level>50){
					JOptionPane.showMessageDialog(this,"关卡不存在，请输入1-50之间的数字");
					return;
				}
				gamepaint.setLevel(level);
				}catch(Exception ex){
					JOptionPane.showMessageDialog(this,"非法字符，请输入1-50之间的数字");
					return;
				}
			}
		}else if(a.getSource()==jbback||a.getSource()==backItem){
			gamepaint.goback();
		}else if(a.getSource()==jbrela||a.getSource()==replay){
			gamepaint.setLevel();
		}
	}
}
class gamepane extends JPanel implements KeyListener{
	private int level=1,mx,my,map[][],tempmap[][];
	
	Toolkit took=Toolkit.getDefaultToolkit();
	Image ima[]={
			took.getImage("pic/0.gif"),
			took.getImage("pic/1.gif"),
			took.getImage("pic/2.gif"),
			took.getImage("pic/3.gif"),
			took.getImage("pic/4.gif"),
			took.getImage("pic/5.gif"),
			took.getImage("pic/6.gif"),
			took.getImage("pic/7.gif"),
			took.getImage("pic/8.gif"),
			took.getImage("pic/9.gif")};
	  
	public void readfile(int level){
		  ReadMap readmap=new ReadMap(level);
		  this.map=readmap.getMap();
		  this.mx=readmap.getMx();
		  this.my=readmap.getMy();
		  this.tempmap=new ReadMap(level).getMap();
		  repaint();
	}
	public gamepane() {
		this.addKeyListener(this);
		setSize(600,600);
		readfile(level);
		requestFocus();
	}
	//堆栈
	
	Stack<Integer>step=new Stack<Integer>();
	@Override
	public void paint(Graphics a) {
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
				a.drawImage(ima[tempmap[j][i]], i*30, j*30, 30, 30,this);
			}
		}
		a.setColor(new Color(178,122,111));
		a.setFont(new Font("楷体",Font.BOLD,30));
		a.drawString("现在是第"+level+"关", 210, 60);
	}
	public boolean win(){
		boolean result=true;
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
				if((map[i][j]==4||map[i][j]==9)&&tempmap[i][j]!=9){
					result=false;
					break;
				}
			}
			if(!result){
				break;
			}
		}
		return result;
	}
	public void setLevel(int level) {
		if(level==0){
			this.level=1;
		}else if(level==50){
			this.level=50;
		}else if(level>1){
			this.level=level;
		}
		else{
			this.level=this.level+level;
		}if(this.level<=0){
			this.level=1;
		}if(this.level>=50){
			this.level=50;
		}
		
		readfile(this.level);
		step.clear();
		requestFocus();
	}
	public void setLevel() {
		
		
		readfile(this.level);
		step.clear();
		requestFocus();
	}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==38){//上
			getup();
		}if(e.getKeyCode()==39){//右
			getright();
		}if(e.getKeyCode()==40){//下
			getdown();
		}if(e.getKeyCode()==37){//左
			getleft();
		}
		if(win()){
			JOptionPane.showMessageDialog(this, "恭喜你过关了，是否进入下一关");
			setLevel(1);
		}
	}
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void getleft(){//左
		if(tempmap[mx][my-1]==3||tempmap[mx][my-1]==9)
		{
			if(tempmap[mx][my-2]==2||tempmap[mx][my-2]==4)
			{
				if(tempmap[mx][my-2]==2)
				{
					tempmap[mx][my-2]=3;
					tempmap[mx][my-1]=6;
				}
				else
				{
					tempmap[mx][my-2]=9;
					tempmap[mx][my-1]=6;
				}
				if(map[mx][my]==4||map[mx][my]==9)//对比原始数据
				{
					tempmap[mx][my]=4;
				}
				else 
				{
					tempmap[mx][my]=2;
				}
				my--;
				repaint();
				step.push(1);
			}
			Toolkit.getDefaultToolkit().beep();
		}
		//草地
		else if(tempmap[mx][my-1]==2||tempmap[mx][my-1]==4||tempmap[mx][my-1]==5)
		{
			tempmap[mx][my-1]=6;
			
			if(map[mx][my]==4||map[mx][my]==9)
			{
				tempmap[mx][my]=4;
			}
			else
			{
				tempmap[mx][my]=2;
			}
			my--;
			repaint();
			step.push(11);
		}
		Toolkit.getDefaultToolkit().beep();
	}
	public void getup()
	{
		if(tempmap[mx-1][my]==3||tempmap[mx-1][my]==9)
		{
			if(tempmap[mx-2][my]==2||tempmap[mx-2][my]==4)
			{
				if(tempmap[mx-2][my]==2)
				{
					tempmap[mx-2][my]=3;
					tempmap[mx-1][my]=8;
				}
				else
				{
					tempmap[mx-2][my]=9;
					tempmap[mx-1][my]=8;
				}
				if(map[mx][my]==4||map[mx][my]==9)//对比原始数据
				{
					tempmap[mx][my]=4;
				}
				else 
				{
					tempmap[mx][my]=2;
				}
				mx--;
				repaint();
				step.push(3);
			}
			Toolkit.getDefaultToolkit().beep();
		}
		else if(tempmap[mx-1][my]==2||tempmap[mx-1][my]==4||tempmap[mx-1][my]==5)
		{
			tempmap[mx-1][my]=8;
			
			if(map[mx][my]==4||map[mx][my]==9)
			{
				tempmap[mx][my]=4;
			}
			else
			{
				tempmap[mx][my]=2;
			}
			mx--;
			repaint();
			step.push(33);
		}
		Toolkit.getDefaultToolkit().beep();
	}
	public void getdown(){//下
		//箱子
		if(tempmap[mx+1][my]==3||tempmap[mx+1][my]==9)
		{
			if(tempmap[mx+2][my]==2||tempmap[mx+2][my]==4)
			{
				if(tempmap[mx+2][my]==2)
				{
					tempmap[mx+2][my]=3;
					tempmap[mx+1][my]=5;
				}
				else
				{
					tempmap[mx+2][my]=9;
					tempmap[mx+1][my]=5;
				}
				if(map[mx][my]==4||map[mx][my]==9)//对比原始数据
				{
					tempmap[mx][my]=4;
				}
				else 
				{
					tempmap[mx][my]=2;
				}
				mx++;
				repaint();
				step.push(4);
			}
			Toolkit.getDefaultToolkit().beep();
		}
		//草地
		else if(tempmap[mx+1][my]==2||tempmap[mx+1][my]==4||tempmap[mx+1][my]==5)
		{
			tempmap[mx+1][my]=5;
			
			if(map[mx][my]==4||map[mx][my]==9)
			{
				tempmap[mx][my]=4;
			}
			else
			{
				tempmap[mx][my]=2;
			}
			mx++;
			repaint();
			step.push(44);
		}
		Toolkit.getDefaultToolkit().beep();
	}
	public void getright(){//右
		if(tempmap[mx][my+1]==3||tempmap[mx][my+1]==9)
		{
			if(tempmap[mx][my+2]==2||tempmap[mx][my+2]==4)
			{
				if(tempmap[mx][my+2]==2)
				{
					tempmap[mx][my+2]=3;
					tempmap[mx][my+1]=7;
				}
				else
				{
					tempmap[mx][my+2]=9;
					tempmap[mx][my+1]=7;
				}
				if(map[mx][my]==4||map[mx][my]==9)//对比原始数据
				{
					tempmap[mx][my]=4;
				}
				else 
				{
					tempmap[mx][my]=2;
				}
				my++;
				repaint();
				step.push(2);
			}
			Toolkit.getDefaultToolkit().beep();
		}
		//草地
		else if(tempmap[mx][my+1]==2||tempmap[mx][my+1]==4||tempmap[mx][my+1]==5)
		{
			tempmap[mx][my+1]=7;
			
			if(map[mx][my]==4||map[mx][my]==9)
			{
				tempmap[mx][my]=4;
			}
			else
			{
				tempmap[mx][my]=2;
			}
			my++;
			repaint();
			step.push(22);
		}
		Toolkit.getDefaultToolkit().beep();
	}
	public void goback(){
		if(step.isEmpty()){
			JOptionPane.showMessageDialog(null, "已是初始状态，不能再后退！");
			return;
		}
		int a=step.pop();
		switch (a) {
		case 1://左
		case 11:
			backleft(a);
			break;
		case 2://右
		case 22:
			backright(a);
			break;
		case 3://上
		case 33:
			backup(a);
			break;
		case 4://下
		case 44:	
			backdown(a);
			break;
		}
		requestFocus();
	}
	public void backleft(int step){
		if(step==11){ //没有推箱子
			tempmap[mx][my+1]=6;
			if(map[mx][my]==4||map[mx][my]==9){
				tempmap[mx][my]=4;
			}else{
				tempmap[mx][my]=2;
			}
			my++;
		}else{
			tempmap[mx][my+1]=6;
			if(map[mx][my]==4||map[mx][my]==9){
				tempmap[mx][my]=9;
			}else{
				tempmap[mx][my]=3;
			}
			if(map[mx][my-1]==4||map[mx][my-1]==9){
				tempmap[mx][my-1]=4;
			}else{
				tempmap[mx][my-1]=2;
			}
			my++;
		}
		repaint();
	}
	public void backright(int step){
		if(step==22){ //没有推箱子
			tempmap[mx][my-1]=7;
			if(map[mx][my]==4||map[mx][my]==9){
				tempmap[mx][my]=4;
			}else{
				tempmap[mx][my]=2;
			}
			my--;
		}else{
			tempmap[mx][my-1]=7;
			if(map[mx][my]==4||map[mx][my]==9){
				tempmap[mx][my]=9;
			}else{
				tempmap[mx][my]=3;
			}
			if(map[mx][my+1]==4||map[mx][my+1]==9){
				tempmap[mx][my+1]=4;
			}else{
				tempmap[mx][my+1]=2;
			}
			my--;
		}
		repaint();
	}
	public void backup(int step){
		if(step==33){ //没有推箱子
			tempmap[mx+1][my]=8;
			if(map[mx][my]==4||map[mx][my]==9){
				tempmap[mx][my]=4;
			}else{
				tempmap[mx][my]=2;
			}
			mx++;
		}else{
			tempmap[mx+1][my]=8;
			if(map[mx][my]==4||map[mx][my]==9){
				tempmap[mx][my]=9;
			}else{
				tempmap[mx][my]=3;
			}
			if(map[mx-1][my]==4||map[mx-1][my]==9){
				tempmap[mx-1][my]=4;
			}else{
				tempmap[mx-1][my]=2;
			}
			mx++;
		}
		repaint();
	}
	public void backdown(int step){
		if(step==44){ //没有推箱子
			tempmap[mx-1][my]=5;
			if(map[mx][my]==4||map[mx][my]==9){
				tempmap[mx][my]=4;
			}else{
				tempmap[mx][my]=2;
			}
			mx--;
		}else{
			tempmap[mx-1][my]=5;
			if(map[mx][my]==4||map[mx][my]==9){
				tempmap[mx][my]=9;
			}else{
				tempmap[mx][my]=3;
			}
			if(map[mx+1][my]==4||map[mx+1][my]==9){
				tempmap[mx+1][my]=4;
			}else{
				tempmap[mx+1][my]=2;
			}
			mx--;
		}
		repaint();
	}
}
class ReadMap
{
	private int level,mx,my;
	private int map[][];
	public ReadMap(int level) 
	{
		this.level=level;
		String content="";
		String filename="maps/"+level+".map";
		try 
		{
			FileReader fr=new FileReader(filename);
			BufferedReader br=new BufferedReader(fr);
			String temp="";
			
				while((temp=br.readLine())!=null)
				{
					content+=temp;
				}
				map=new int [20][20];
				int c=0;
				byte b[]=content.getBytes();
				
				for(int i=0;i<20;i++)
				{
					for(int j=0;j<20;j++)
					{
						map[i][j]=b[c]-48;
						
						c++;
						if(map[i][j]==5)
						{
							mx=i;
							my=j;
						}
					}
				}
			}
		catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
		catch (IOException e) 
		 {
			e.printStackTrace();
		}
	}
	public int getLevel() {
		return level;
	}
	public int[][] getMap() {
		return map;
	}
	public int getMx() {
		return mx;
	}
	public int getMy() {
		return my;
	}
}