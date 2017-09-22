package IO;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CopyFileWind extends JFrame implements ActionListener{
	JButton totext = new JButton("...");
	JButton totext2 = new JButton("...");
	JTextField tftext = new JTextField(20);
	JTextField tftext2 = new JTextField(20);
	JButton copy = new JButton("复制");
	
	public CopyFileWind() {
		JPanel srcPanel = new JPanel();
		srcPanel.add(new JLabel("请选择要复制的文件："));
		srcPanel.add(tftext);
		srcPanel.add(totext);
		
		JPanel srcPanel2  = new JPanel();
		srcPanel.add(new JLabel("请选择存放的目录："));
		srcPanel.add(tftext2);
		srcPanel.add(totext2);
		
		JPanel srcPanel3 = new JPanel();
		srcPanel3.add(copy);
		totext.addActionListener(this);
		totext2.addActionListener(this);
		copy.addActionListener(this);
		
		this.setLayout(new GridLayout(3,1));
		this.add(srcPanel);
		this.add(srcPanel2);
		this.add(srcPanel3);
		this.setLocation(500, 300);
		this.setVisible(true);
		this.setResizable(false);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
	    JFrame.setDefaultLookAndFeelDecorated(true);
		new CopyFileWind();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==totext){
			JFileChooser chooser  = new JFileChooser(" ");
			//打开对话框（文件选择框）setDialogType();（对话模式）
			chooser.setDialogType(JFileChooser.OPEN_DIALOG);
			//选择文件  setFileSelectionMode();(文件选择方式)
			chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			//对话框标题
			chooser.setDialogTitle("请选择要复制的文件:");
			if(chooser.showOpenDialog(this)==chooser.APPROVE_OPTION){
				tftext.setText(chooser.getSelectedFile().getAbsolutePath());
			}
		}
		if(e.getSource()==totext2){
			JFileChooser chooser2 = new JFileChooser(" ");
			chooser2.setDialogType(JFileChooser.OPEN_DIALOG);
			chooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			chooser2.setDialogTitle("请选择目录存放文件：");
			if(chooser2.showOpenDialog(this)==chooser2.APPROVE_OPTION){
				tftext2.setText(chooser2.getSelectedFile().getAbsolutePath());
			}
			} 
		if(e.getSource()==copy){
				if(tftext.getText().equals(" ")||tftext2.getText().equals(" ")){
					JOptionPane.showMessageDialog(this, "请设定源文件和目录路径!");
				}else{
					File srcfile = new File(tftext.getText());
					String srcname = srcfile.getName();
					this.copyFile(tftext.getText(),tftext2.getText()+"/"+srcname);
				}
			}
		
	}
	public void copyFile(String srcfile,String tofile) {
		try {
			FileInputStream fis = new FileInputStream(srcfile);
			FileOutputStream fos = new FileOutputStream(tofile);
			byte[] len = new byte[1024];
			int a;
			while((a=fis.read(len))>0){
				fos.write(len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
