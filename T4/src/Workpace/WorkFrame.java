package Workpace;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class WorkFrame extends JFrame{

	int docid=1;
	JTextArea srcword;
	JLabel time;
	Timer timer;
	JTextArea destword;
	float count=0.0f;
	public WorkFrame() {
		super("打字系统界面");
		this.setSize(600,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setContentPane(createContext());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JPanel createContext(){
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(8,8,8,8));
		panel.add(createTitle(),BorderLayout.NORTH);
		panel.add(createCentContext(),BorderLayout.CENTER);
		panel.add(createBtncontext(),BorderLayout.SOUTH);
		return panel;
	}
	public JPanel createTitle(){
		JPanel panel = new JPanel();
		panel.add(new JLabel("打字测试",JLabel.CENTER));
		return panel;
	}
	public JScrollPane createArea(){
		JScrollPane rollpan = new JScrollPane();
		rollpan.setBorder(new TitledBorder("源文档"));
		srcword=new JTextArea();
		srcword.setText(readFile("F:\\www.txt"));
		srcword.setEditable(false);
		rollpan.getViewport().add(srcword);
		return rollpan;
	}
	private JPanel createCentContext(){
		JPanel panel = new JPanel();
		panel.add(createBtns(),BorderLayout.NORTH);
		panel.add(createAreaspane(),BorderLayout.CENTER);
		return panel;
	}
	private JPanel createBtns(){
		JPanel panel = new JPanel();
		JButton next = new JButton("next");
		JButton prve = new JButton("prve");
		JButton start = new JButton("start");
		time = new JLabel("00:00:00");
		next.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				destword.setText("");
				owaddid();
				srcword.setText(readFile("E:\\Java\\eeee.txt"));
			}
		});
		prve.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				destword.setText("");
				owdecid();
				srcword.setText(readFile("E:\\Java\\eeee.txt"));
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
		if(docid>=0&&docid<5){
			docid++;
		}else if(docid==5){
			docid=1;
		}
	}
	private void owdecid(){
		if(docid==1){
			docid=5;
		}else if(docid>1&&docid<=5){
			docid--;
		}
	}
	
	private JPanel createAreaspane(){
		JPanel panel = new JPanel(new GridLayout(2,1,0,8));
		panel.add(createArea());
		panel.add(createPointArea());
		return panel;
	}
	public void start(){
		final long end = System.currentTimeMillis();
		timer = new Timer();
		timer.schedule(new TimerTask(){

			@Override
			public void run() {
				long show = System.currentTimeMillis()-end;
				long hh = show / 1000 / 60 / 60;
				long mm = show / 1000 / 60 % 60;
				long ss = show / 1000 % 60;
				time.setText((hh<10?"0"+hh:hh)+":"+(mm<10?"0"+mm:mm)+":"+(ss<10?"0"+ss:ss));
			}
		},0,1000);
	}
	private JScrollPane createPointArea(){
		JScrollPane panel = new JScrollPane();
		panel.setBorder(new TitledBorder("输入区"));
		destword = new JTextArea();
		destword.setLineWrap(true);
		destword.setEditable(true);
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
		int value = JOptionPane.showConfirmDialog(WorkFrame.this, "是否确定提交","消息提示", 0,1);
		if(value == JOptionPane.YES_NO_OPTION){
			checkword();
		}
	}
	private String readFile(String filename){
		//Properties popes = new Properties();
		try {
//			popes.load(new FileInputStream(filename));
//			String file = "File"+docid;
//			String doc = popes.getProperty(file);
			BufferedReader bReader = BufferedReader(new InputStreamReader(new FileInputStream(new File(filename))));
			StringBuffer buf = new StringBuffer();
			String str;
			while((str=bReader.readLine())!=null){
				if(str.startsWith("#")){
					continue;
				}
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
		for(int i=0;i<desch.length;i++){
			if(desch[i]==srch[i]){
				count++;
			}
		}
		String right = "正确率："+(count==0?(0.00+"%"):((count/desch.length)*100+"%"+"耗时："))+time.getText();
		time.setText(right);
		count=0;
	}
	private BufferedReader BufferedReader(InputStreamReader inputStreamReader) {
		return null;
	}
	public static void main(String[] args) {
		new WorkFrame();
	}
	
}
