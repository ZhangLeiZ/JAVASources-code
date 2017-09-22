package FILE;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Coptfiel extends JFrame implements ActionListener{
	JButton jbscrea,jbrela;
	JTextField jt1,jt2;
	JButton jbcopy=new JButton("复制");
	public Coptfiel() {
		super("文件复制");
		jbscrea=new JButton("选择文件");
		jbrela=new JButton("选择路径");
		jt1=new JTextField(30);
		jt2=new JTextField(30);
		JPanel pane1=new JPanel();
		JPanel pane2=new JPanel();
		JPanel pane3=new JPanel();
		pane1.add(jbscrea);
		pane1.add(jt1);
		pane2.add(jbrela);
		pane2.add(jt2);
		pane3.add(jbcopy);
		jbscrea.addActionListener(this);
		jbrela.addActionListener(this);
		jbcopy.addActionListener(this);
		this.setLayout(new GridLayout(3,1));
		this.add(pane1);
        this.add(pane2);
        this.add(pane3);
        this.setVisible(true);
        this.setLocation(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
		this.pack();

	}
	public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);

		new Coptfiel();
		
	}
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==jbscrea){
			JFileChooser jc=new JFileChooser();
			jc.setDialogTitle("选择复制文件");
			jc.setDialogType(jc.OPEN_DIALOG);
			jc.setFileSelectionMode(jc.FILES_ONLY);
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION){
				jt1.setText(jc.getSelectedFile().getAbsolutePath());
			}
		}
		if(a.getSource()==jbrela){
			JFileChooser jc2=new JFileChooser();
			jc2.setDialogTitle("选择目标路径");
			jc2.setDialogType(jc2.OPEN_DIALOG);
			jc2.setFileSelectionMode(jc2.DIRECTORIES_ONLY);
			if(jc2.showOpenDialog(this)==jc2.APPROVE_OPTION){
				jt2.setText(jc2.getSelectedFile().getAbsolutePath());
			}
		}
		if(a.getSource()==jbcopy){
			if(jt1.getText().equals("")||jt2.getText().equals("")){
				
				JOptionPane.showMessageDialog(this, "请选择源文件或目标路径");
			}
			File file=new File(jt1.getText());
			String cont=file.getName();
			this.copy(jt1.getText(),jt2.getText()+"/"+cont);
		}
	}
	public void copy(String copyfile,String tofile){
		try {
			//读取文件
			FileInputStream fns=new FileInputStream(copyfile);
			//书写文件
			FileOutputStream fos=new FileOutputStream(tofile);
			byte []a=new byte[2048];
			int c=0;
			while((c=fns.read(a))>0){
				fos.write(a,0,c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
