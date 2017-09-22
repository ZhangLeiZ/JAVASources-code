package T6;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Querarry extends JFrame implements ActionListener{

		JLabel stab;
		JButton squery;
		JTextField sphone;
		JPanel spanel;
		JTable stable;
		String head[]={"姓名","电话"};
		String data[][];
		JButton adds;
		public Querarry() {
			super("家家乐通信录");
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image image = toolkit.getImage("qq.jpg");
			setIconImage(image);
			readline();
			
			
			stable = new JTable(data,head);
			stable.setRowHeight(40);
			//table.setEnabled(false);
			add(new JScrollPane(stable));
			//add(table);
			spanel = new JPanel();
			stab = new JLabel("姓名");
			sphone = new JTextField(13);
			squery = new JButton("查询");
			squery.addActionListener(this);
			adds = new JButton("新增");
			adds.addActionListener(this);
			spanel.add(adds);
			spanel.add(stab);
			spanel.add(sphone);
			spanel.add(squery);
			add("South",spanel);
		
			this.setSize(400, 500);
			this.setVisible(true);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==squery){
				String name = sphone.getText().trim();
				int index=-1;
				for(int i=0;i<data.length;i++){
					if(data[i][0].equals(name)){
						index=i;
						break;
					}
				}
				if(index<0){
					JOptionPane.showConfirmDialog(this,"没有找到这个人");
					return;
				}else{
					stable.setRowSelectionInterval(index, index);
				}
				
			}else if(e.getSource()==adds){
				new queradd();
			}
			
		}
		public void readline(){
			File file = new File("adder.txt");
			if(!file.exists()){
				JOptionPane.showConfirmDialog(this,"没有找到通讯录");
				System.exit(0);
			}
			try{
				BufferedReader br = new BufferedReader(new FileReader(file));
				String msg="";
				String smsg="";
				String arr[]={};
				while((smsg=br.readLine())!=null){
					msg+=smsg+";";
					arr=msg.split(";");
				}
				System.out.print(msg);
				int size = arr.length;
				data = new String[size][0];
				for(int i=0;i<size;i++){
					data[i]=arr[i].split("@_@");
				}
			}catch (Exception e) {
				System.out.println("读取文件失败");
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			new Querarry();
		}
}
class queradd extends JFrame implements ActionListener{
	JTextField text,textph;
	JLabel name,idphone;
	JButton add;
	JPanel panel;
	public queradd() {
		name = new JLabel("姓名：");
		text = new JTextField(20);
		idphone = new JLabel("号码：");
		textph = new JTextField(20);
		add = new JButton("添加");
		panel = new JPanel();
		add.addActionListener(this);
		panel.add(name);
		panel.add(text);
		panel.add(idphone);
		panel.add(textph);
		panel.add(add);
		add("Center",panel);
		
		this.setSize(300, 150);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add){
			File file = new File("adder.txt");
			try {
				FileOutputStream fileout = new FileOutputStream(file,true);
				String phone = text.getText()+"@_@"+textph.getText()+";";
				byte byt[]=phone.getBytes();
				fileout.write(byt,0,byt.length);
				fileout.close();
				JOptionPane.showMessageDialog(this, "添加成功");
				dispose();
				new Querarry();
			} catch (Exception e1) {
				System.out.println("输入文件失败");
			}
		}
		
	}
	
}

