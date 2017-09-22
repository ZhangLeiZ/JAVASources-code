package Workpace;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class WorkFrame2 extends JFrame{

	//声明控件和定义变量
	int docid=1;
	JTextArea srcword;
	JLabel time;
	Timer timer;
	JTextArea destword;
	float count=0.0f;
	public WorkFrame2() {
		//对界面的基本设置标题，大小，可视化，是否居中，设入一个容器和界面的基本按钮；
		super("打字系统界面");
		this.setSize(600,500);
		this.setLocationRelativeTo(null);
		this.setContentPane(createContext());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JPanel createContext(){
		//定义一个panel容器设为边框布局分为东南西北；
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(8,8,8,8));
		panel.add(createTitle(),BorderLayout.NORTH);
		panel.add(createCentContext(),BorderLayout.CENTER);
		panel.add(createBtncontext(),BorderLayout.SOUTH);
		return panel;
	}
	public JPanel createTitle(){
		//定义一个容器将字体设到中部返回一个容器
		JPanel panel = new JPanel();
		panel.add(new JLabel("打字测试",JLabel.CENTER));
		return panel;
	}
	public JScrollPane createArea(){
		//滚动面版放入源文档
		JScrollPane rollpan = new JScrollPane();
		rollpan.setBorder(new TitledBorder("源文档"));
		srcword=new JTextArea();
		//读取源文件
		srcword.setText(readFile("text.properties"));
		//设为不可编辑
		srcword.setEditable(false);
		rollpan.getViewport().add(srcword);
		return rollpan;
	}
	private JPanel createCentContext(){
		JPanel panel = new JPanel();
		//将返回的两个容器设为边框布局的北部和中部并返回
		panel.add(createBtns(),BorderLayout.NORTH);
		panel.add(createAreaspane(),BorderLayout.CENTER);
		return panel;
	}
	private JPanel createBtns(){
		JPanel panel = new JPanel();
		//声明控件和容器并将控件放入容器中
		JButton next = new JButton("next");
		JButton prve = new JButton("prve");
		JButton start = new JButton("start");
		//将默认时间放入
		time = new JLabel("00:00:00");
		//实现一个监听，监听next的动作给出相应的结果
		next.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				destword.setText("");
				owdecid();
				srcword.setText(readFile("text.properties"));
			}
		});
		prve.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				owaddid();
				srcword.setText(readFile("text.properties"));
			}
		});
		start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				start();
				destword.setText("");
			}
		});
		panel.add(next);
		panel.add(prve);
		panel.add(start);
		panel.add(time);
		return panel;
	}
	private void owaddid(){
		//判断读取properties文件中的File后的数值是否大于或等于0并且小于5，为真时进入判断
		if(docid>=0&&docid<5){
			docid++;
		}else if(docid==5){//等于5时进入判断
			docid=1;//将其设为1
		}
	}
	//这里与上面是相反的操作起到切换上一文件和下一文件
	private void owdecid(){
		if(docid==1){
			docid=5;
		}else if(docid>1&&docid<=5){
			docid--;
		}
	}
	
	private JPanel createAreaspane(){
		JPanel panel = new JPanel(new GridLayout(3,1,0,8));
		panel.add(createArea());
		panel.add(createPointArea());
		return panel;
	}
	public void start(){
		final long end = System.currentTimeMillis();
		timer = new Timer();
		//此处可以在指定时间之后开始执行TimerTask()，可以设定秒数执行一次。
		timer.schedule(new TimerTask(){
			//timertask就是实现了runnable接口的。也就是说，通过timer来间隔一段时间执行一个操作，也是通过一个线程来做到的。
			@Override
			public void run() {
				//计算所花去的时间
				long show = System.currentTimeMillis()-end;
				//将其进行分割处理
				long hh = show / 1000 / 60 / 60;
				long mm = show / 1000 / 60 % 60;
				long ss = show / 1000 % 60;
			//通过三目运算符判断时间
				time.setText((hh<10?"0"+hh:hh)+":"+(mm<10?"0"+mm:mm)+":"+(ss<10?"0"+ss:ss));
			}
		},0,1000);
	}
	private JScrollPane createPointArea(){
		JScrollPane panel = new JScrollPane();
		//此处是可编辑的输入区
		panel.setBorder(new TitledBorder("输入区"));
		destword = new JTextArea();
		destword.setBounds(0, 70, 550, 400);
		destword.setLineWrap(true);//设置自动换行
		destword.setEditable(true);//可编辑
		//JScrollPane只有JViewport这个对象是可以用来显示组件对象的，
		//所以要想在JScrollPane中显示出来添加进去的组件就必须
		//使用getViewport().add(组件对象)添加组件对象了。
		panel.getViewport().add(destword);
		return panel;
	}
	private JPanel createBtncontext(){
		JPanel panel = new JPanel();
		JButton commit = new JButton("commit");
		JButton cancle = new JButton("cancle");
		commit.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				send();
			}
		});
		cancle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		panel.add(commit);
		panel.add(cancle);
		return panel;
	}
	private void send(){
		int value = JOptionPane.showConfirmDialog(WorkFrame2.this, "是否确定提交","消息提示", 0,1);
		if(value == JOptionPane.YES_NO_OPTION){
			checkword();
		}
	}
	private String readFile(String filename){
		//Properties主要用于读取Java的配置文件，
		Properties popes = new Properties();
		try {
			//以适合使用 load 方法加载到 Properties 表中的格式，  
			popes.load(new FileInputStream(filename));
			String file = "File"+docid;
			String doc = popes.getProperty(file);
			//利用文件输入流将文件内容输入到字符缓冲流中
			//BufferedReader 由Reader类扩展而来，提供通用的缓冲方式文本读取，而且提供了很实用的readLine，读取一个文本行，从字符输入流中读取文本，缓冲各个字符，从而提供字符、数组和行的高效读取。
			BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(doc))));
			StringBuffer buf = new StringBuffer();
			//依次循环读取
			String str;
			while((str=bReader.readLine())!=null){
				if(str.startsWith("#")){//遇到#符号则跳出循环
					continue;
				}
				//读取一个文本行。通过\n即可认为某行已终止进入下一行
				buf.append(str+"\n");
			}
			return buf.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "未找到";
	}
	private void checkword(){
		String srcstr = srcword.getText();
		char[] srch = srcstr.toCharArray();
		String deststr = destword.getText();
		char[] desch = deststr.toCharArray();
		//源文件数组和编辑后获取的文件数组进行循环对比是否相同这里起到检查作用
		for(int i=0;i<desch.length;i++){
			if(desch[i]==srch[i]){
				count++;//累计正确数
			}
		}
		//通过计算生成合格率
		String right = "正确率："+(count==0?(0.00+"%"):((count/desch.length)*100+"%"+"耗时："))+time.getText();
		JOptionPane.showConfirmDialog(WorkFrame2.this, right,"最后结果：", 0);
		count=0;
	}
	
	public static void main(String[] args) {
		
		WorkFrame2 wor = new WorkFrame2();
		wor.setVisible(true);
	}
	
}

