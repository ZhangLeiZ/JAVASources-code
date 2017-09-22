package T5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.org.apache.xml.internal.security.Init;

public class Lottery extends JFrame implements ActionListener{
	JTextArea text;
	JTextField text1,text2,text3,text4,text5,text6,text7;
	JButton begin,sort,close,remove;
	JRadioButton macselect,pickhand;
	JPanel panel;
	int input[];
	public Lottery() {
		super("家家乐彩票机");
		//this.setUndecorated(true);
		Container c = getContentPane();
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		c.add(panel);
		
		text = new JTextArea(10,35);
		panel.add(text);
		
		macselect = new JRadioButton("机选");
		panel.add(macselect);
		macselect.addActionListener(this);		
		pickhand = new JRadioButton("手选");
		panel.add(pickhand);
		pickhand.addActionListener(this);
		
		text1 = new JTextField(6);
		panel.add(text1);
		text2 = new JTextField(6);
		panel.add(text2);
		text3 = new JTextField(6);
		panel.add(text3);
		text4 = new JTextField(6);
		panel.add(text4);
		text5 = new JTextField(6);
		panel.add(text5);
		text6 = new JTextField(6);
		panel.add(text6);
		text7 = new JTextField(6);
		panel.add(text7);
		
		begin = new JButton("开始");
		panel.add(begin);
		begin.addActionListener(this);
		sort = new JButton("排序");
		panel.add(sort);
		sort.addActionListener(this);
		close = new JButton("退出");
		close.addActionListener(this);
		panel.add(close);
		
		remove = new JButton("清除");
		remove.addActionListener(this);
		panel.add(remove);
		
		input=new int[7];
		
		this.setSize(550,300);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Lottery();
	}
	
	public void actionPerformed(ActionEvent e) {
		String msg="";
		if(e.getSource()==begin){
			if(macselect.isSelected()){
				this.rand();
			}
		}else if(pickhand.isSelected()){
				try{
				input[0]=Integer.parseInt(text1.getText());
				input[1]=Integer.parseInt(text2.getText());
				input[2]=Integer.parseInt(text3.getText());
				input[3]=Integer.parseInt(text4.getText());
				input[4]=Integer.parseInt(text5.getText());
				input[5]=Integer.parseInt(text6.getText());
				input[6]=Integer.parseInt(text7.getText());
				for(int i=0;i<input.length;i++){
					System.out.print("数组input["+i+"]"+input[i]);
				}
				this.psort(input);
				msg=this.getLottery();
				System.out.println("=="+msg);
				text.append(msg+"\n");
				}catch (Exception s) {
					JOptionPane.showConfirmDialog(this, "请输入1~100的数字！！！");
				}
			}else if(e.getSource()==sort){
			this.psort(input);
			msg=this.getLottery();
			System.out.println("=="+msg);
			text.append(msg+"\n");
		}else if(e.getSource()==close){
			System.exit(0);
		}else if(e.getSource()==remove){
			text1.setText("");
			text2.setText("");
			text3.setText("");
			text4.setText("");
			text5.setText("");
			text6.setText("");
			text7.setText("");
		}
		
	}
	public void psort(int intput[]){
		int t=0;
		for(int i=0;i<=input.length;i++){
			for(int j=i+1;j<=(input.length)-1;j++){
				if(input[i]>input[j]){
					t=input[i];
					input[i]=input[j];
					input[j]=t;
				}
			}
		}
		
	}
	public String getLottery(){
		String msg="";
		for(int i=0;i<input.length;i++){
			msg+=input[i]+"   ";
		}
		return msg;
	}
	public void rand(){
		Random rand = new Random();
		for(int i=0;i<7;i++){
			int temp=rand.nextInt();
			if(temp<0){
				temp=-temp;
			}
			input[i]=temp%30+1;
		}

		text1.setText(input[0]+"");
		text2.setText(input[1]+"");
		text3.setText(input[2]+"");
		text4.setText(input[3]+"");
		text5.setText(input[4]+"");
		text6.setText(input[5]+"");
		text7.setText(input[6]+"");
	}
	
}
