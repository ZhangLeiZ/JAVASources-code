package sql;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class JFfind extends JFrame implements ActionListener,MouseListener{
	JLabel labtitle,labname,labqq;
	JTextField jtqq,jtname;
	JTable jtable;
	JComboBox cosex=new JComboBox(new String[]{"男","女"});
	JButton jbfind=new JButton("查询");
	JPopupMenu pmenu=new JPopupMenu();
	JMenuItem delete=new JMenuItem("删除");
	Vector<String>colName;
	Vector row;
	int a;
	public JFfind() {
		super("用户资料查询");
		labtitle=new JLabel("查询条件:",FlowLayout.RIGHT);
		labname=new JLabel("姓名:",FlowLayout.RIGHT);
		labqq=new JLabel("QQ:",FlowLayout.RIGHT);
		jtname=new JTextField(10);
		jtqq=new JTextField(10);
		JPanel pan=new JPanel(new FlowLayout(FlowLayout.LEFT));
		pan.add(labtitle);
		pan.add(cosex);
		pan.add(labname);
		pan.add(jtname);
		pan.add(labqq);
		pan.add(jtqq);
		pan.add(jbfind);
		jbfind.addActionListener(this);
		add(pan,BorderLayout.NORTH);
		
		
		addhead();
		row=new zhuceImp().find("","","");
		Table tb=new Table(colName,row);
		jtable=new JTable(tb);
		pmenu.add(delete);
		jtable.addMouseListener(this);
		delete.addActionListener(this);
		jtable.setRowHeight(30);
		add(new JScrollPane(jtable));
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public void addhead(){
		colName=new Vector<String>();
		colName.addElement("账号");
		colName.addElement("姓名");
		colName.addElement("密码");
		colName.addElement("性别");
		colName.addElement("电话");
		colName.addElement("QQ");
		colName.addElement("email");
		colName.addElement("说明");
		

	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbfind){
			String sex=cosex.getSelectedItem().toString();
			String name=jtname.getText().trim();
			String QQ=jtqq.getText().trim();
			row=new zhuceImp().find(name,QQ,sex);
			Table tb=new Table(colName,row);
			jtable.setModel(tb);
		}
		if(e.getSource()==delete){
			Vector v=(Vector)row.get(a);
			String sqldata=(String)v.get(0);
			//System.out.println(sqldata);
			new zhuceImp().delete(sqldata);
			row=new zhuceImp().find("","","");
			Table tb=new Table(colName,row);
			jtable.setModel(tb);
			JOptionPane.showMessageDialog(this, "删除成功！");
		}
	}
	
	
	public static void main(String[] args) {
		new JFfind();
	}
	class Table extends AbstractTableModel{
		private Vector<String>colName;
		private Vector data;
		public Table(Vector<String>colName,Vector data) {
			this.colName=colName;
			this.data=data;
		}
		public int getColumnCount() {
			return colName.size();
		}

		public int getRowCount() {
			return data.size();
		}
		 public String getColumnName(int col) {
	            return colName.get(col);
	        }
		 public Class getColumnClass(int c) {
	            return getValueAt(0, c).getClass();
	        }
		public boolean isCellEdit(int col,int row){
			if(col<2){
				return false;
			}else{
				return true;
			}
		}
		public Object getValueAt(int row, int col) {
			Vector v=(Vector)data.get(row);
			Object obj=v.get(col);
			return obj;
		}
		public void setValueAt(Object value,int row,int col){
			fireTableCellUpdated(row, col);
		}
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getButton()==1){
			 a=jtable.getSelectedRow();
			
		}
		if(e.getButton()==3){
			pmenu.show(this,e.getX(),e.getY()+70);
		}
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
