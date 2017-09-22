package Student;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.EventListener;

public class CopyFileWindow extends JFrame implements ActionListener {
	//源文件路径
    JTextField srctext = new JTextField(20);
    //选择源文件的按钮
    JButton srcbutton = new JButton("...");
    //目标文件路径
    JTextField totext = new JTextField(20);
    //选择目标路径
    JButton tobutton = new JButton("...");
    //复制按钮
    JButton copybutton = new JButton("复制");

    public CopyFileWindow() {
        JPanel srcpanel = new JPanel();
        srcpanel.add(new JLabel("请选择要复制的文件："));
        srcpanel.add(srctext);
        srcpanel.add(srcbutton);

        JPanel topanel = new JPanel();
        topanel.add(new JLabel("请选择文件存放目录："));
        topanel.add(totext);
        topanel.add(tobutton);

        JPanel copypanel = new JPanel();
        copypanel.add(copybutton);

        srcbutton.addActionListener(this);
        tobutton.addActionListener(this);
        copybutton.addActionListener(this);

        this.setLayout(new GridLayout(3, 1));
        this.add(srcpanel);
        this.add(topanel);
        this.add(copypanel);
        //设置窗口位置
        this.setLocation(300, 300);
        
        this.setResizable(false); //禁止最大化按钮
        //根据窗口的布局和控件所占的控件，由系统自动决定窗口的大小
        this.pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new CopyFileWindow().show();
    }

    public void actionPerformed(ActionEvent e) {
        //当点击选择原文件按钮时候
        if (e.getSource() == srcbutton) {
        	//文件选择对话框
            JFileChooser chooser = new JFileChooser(" ");
            //设置对话框类型是打开文件对话框
            chooser.setDialogType(JFileChooser.OPEN_DIALOG);
            //设置只能选择文件
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            //给对话框设置标题
            chooser.setDialogTitle("请选择要复制的文件");
            //打开对话框并判断是否打开成功
            if (chooser.showOpenDialog(this) == chooser.APPROVE_OPTION) {
            	//把选中的文件及路径显示在文本框中
                srctext.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        }

        //当点击选择文件存放按钮时候
        if (e.getSource() == tobutton) {
            JFileChooser chooser = new JFileChooser(" ");
            chooser.setDialogType(JFileChooser.OPEN_DIALOG);
            //设置只能选择目录
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setDialogTitle("请选择文件存放目录");
            //打开对话框并判断是否打开成功
            if (chooser.showOpenDialog(this) == chooser.APPROVE_OPTION) {
                totext.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        }
        //当选择复制按钮时候
        if (e.getSource() == copybutton) {
            if (srctext.getText().equals("") || totext.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "请设定源文件或目录路径");
            } else {
                File srcfile = new File(srctext.getText());
                //获取文件名称
                String filename = srcfile.getName();
                this.copyFile(srctext.getText(),
                              totext.getText() + "/" + filename);
            }
        }
    }
    //复制文件的方法
    public void copyFile(String srcfile,String tofile){
       try{
    	   	//创建输入流，读取文件内容
            FileInputStream fin = new FileInputStream(srcfile);
            //创建输出流，写文件内容
            FileOutputStream fos = new FileOutputStream(tofile);
            byte[] b = new byte[1024];
            int a;
            //每次以1024个字节读入
            while((a = fin.read(b))>0){
                fos.write(b,0,a);
            }
            System.out.println("拷贝成功！！！");
       }catch(Exception e){
          e.printStackTrace();
       }
    }
}
