package FILE;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class iotest extends JFrame implements ActionListener{
	JButton jbwrite,jbread;
	JTextArea text=new JTextArea();
	JButton delete=new JButton("清空");
	public iotest() {
		super("记事本");
		jbwrite=new JButton("写入文件");
		jbread=new JButton("读出文件");
		
		JPanel pan=new JPanel();
		pan.add(jbwrite);
		pan.add(jbread);
		pan.add(delete);
		add(pan,BorderLayout.SOUTH);
		add(new JScrollPane(text),BorderLayout.CENTER);
		jbwrite.addActionListener(this);
		delete.addActionListener(this);
		jbread.addActionListener(this);
		text.setBorder(BorderFactory.createLoweredBevelBorder());
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new iotest();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbwrite){
			String con=new Date().toLocaleString()+"\n";
			con+=text.getText()+"\n";
			byte[]b=con.getBytes();
			File file=new File("iotest.db");
			FileOutputStream fo;
			try {
				fo = new FileOutputStream(file,true);
				fo.write(b);
				text.setText("");
				fo.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
		}
		if(e.getSource()==jbread){
			byte[]b=new byte[1024];
			String str=text.getText()+"\n";
			try {
				File file=new File("iotest.db");
				FileInputStream fs=new FileInputStream(file);
				int n=0;
				
				while((n=fs.read(b,0,b.length))>0){
					str+=new String(b,0,n);
				}
				text.setText(str);
				fs.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		if(e.getSource()==delete){
			File file=new File("iotest.db");
			FileOutputStream fo;
			byte[]b={};
			try {
				fo = new FileOutputStream(file);
				fo.write(b);
				text.setText("");
				fo.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}	
		
	}
}
