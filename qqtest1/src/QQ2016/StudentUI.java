package QQ2016;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import QQ2016.FindUI.MyTableModel;

public class StudentUI extends JFrame implements ActionListener,MouseListener{
	
	JButton jbfind,jbupdate,jbadd,jbdel;
	JButton jbexit;
	JPanel toppan,downpan;
	JTable dataTable;
	public StudentUI() {
		super("学生操作");
		 jbfind=new JButton("查找");
		 jbupdate=new JButton("修改");
		 jbdel = new JButton("删除");
		 jbadd=new JButton("添加");
		 toppan=new JPanel(new FlowLayout(FlowLayout.CENTER));
		 toppan.add(jbfind);
		 toppan.add(jbupdate);
		 toppan.add(jbadd);
		 toppan.add(jbdel);
		 dataTable=new JTable();
		 dataTable.setRowHeight(60);
		 add(new JScrollPane(dataTable));
		 
		 jbexit=new JButton("退出");
		 downpan = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		 downpan.add(jbexit);
		 jbfind.addActionListener(this);
		 jbupdate.addActionListener(this);
		 jbadd.addActionListener(this);
		 jbdel.addActionListener(this);
		 jbexit.addActionListener(this);
		 dataTable.addMouseListener(this);
		 
		 add(downpan,BorderLayout.SOUTH);
		 add(toppan,BorderLayout.NORTH);
		 setSize(800,500);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new StudentUI();
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
