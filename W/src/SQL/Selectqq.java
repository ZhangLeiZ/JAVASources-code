package SQL;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

public class Selectqq extends javax.swing.JFrame implements ActionListener{

	JLabel lbltitle,lblusername,lblqqcode;
	JTextField tetitle,teusername,teqqcode,Userid;
	JComboBox Ssex;
	JButton btnfind,btndelete;
	JTable dateTable;
	Vector<String> columnsname;
	Vector rowdata;
	public Selectqq() {
	  super("资料查找");
	  lbltitle = new JLabel("请输入查找条件",JLabel.RIGHT);
	  lblusername = new JLabel("用户名称",JLabel.RIGHT);
	  lblqqcode = new JLabel("QQ号码",JLabel.RIGHT);
	  teusername = new JTextField(10);
	  teqqcode = new JTextField(10);
	  Userid = new JTextField();
	  Ssex = new JComboBox(new String[]{"男","女"});
	  btnfind = new JButton("查询(C)");
	  btnfind.setMnemonic('C');
	  btndelete = new JButton("删除(D)");
	  btndelete.setMnemonic('D');
	  JPanel conpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	  conpanel.add(lbltitle);
	  conpanel.add(lblusername);
	  conpanel.add(teusername);
	  conpanel.add(lblqqcode);
      conpanel.add(teqqcode);
	  conpanel.add(Ssex);
	  conpanel.add(btnfind);
	  conpanel.add(btndelete);
      btnfind.addActionListener(this);
      btndelete.addActionListener(this);
      add(conpanel,BorderLayout.NORTH);
      
      addhead();
      rowdata = new Usersql().find("", "", "");
      Mytablemodel model = new Mytablemodel(columnsname,rowdata);
      dateTable = new JTable(model);
      dateTable.setRowHeight(30);
		add(new JScrollPane(dateTable));
      
      setSize(700,500);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Selectqq();
	}
	public void addhead(){
		columnsname = new Vector<String>();
		columnsname.addElement("用户编号");
		columnsname.addElement("用户名称");
		columnsname.addElement("用户密码");
		columnsname.addElement("性别");
		columnsname.addElement("年龄");
		columnsname.addElement("身份证号码");
		columnsname.addElement("QQ号码");
		columnsname.addElement("邮箱地址");
		columnsname.addElement("备注");
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnfind){
			String sex = Ssex.getSelectedItem().toString();
			String userName = teusername.getText().trim();
			String qqCode = teqqcode.getText().trim();
			//查找符合条件的用户资料;
			rowdata = new Usersql().find(userName, sex, qqCode);
			//更新表格的数据
			Mytablemodel model = new Mytablemodel(columnsname,rowdata);
			dateTable.setModel(model);
		}else if(e.getSource()==btndelete){
//		    int userid=Userid(char).getTitle();
//			rowdata =new Usersql().delete(userid);
			 Mytablemodel model = new Mytablemodel(columnsname,rowdata);
				dateTable.setModel(model);
		}
}

class Mytablemodel extends AbstractTableModel{
	private Vector<String>columnanmes;
	private Vector data;
	public Mytablemodel(Vector<String>columnanmes,Vector data) {
		this.columnanmes=columnanmes;
		this.data=data;
	}

	public int getColumnCount() {
		return columnanmes.size();
	}

	public int getRowCount() {
		return data.size();
	}

	 //得到表格列名
    public String getColumnName(int col) {
        return columnanmes.get(col);
    }
   //得到指定单元的值
    public Object getValueAt(int row, int col) {
    	//获取row这一行的数据
    	Vector v = (Vector)data.get(row);
    	Object obj = v.get(col);
        return obj;
    }
    //返回指定列的数据类型，不需要调用
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
   //设置单元格是否可修改,系统自动执行
    public boolean isCellEditable(int row, int col) {
        if (col < 2) {
            return false; //不能修改
        } else {
            return true; //可以修改
        }
    }
    //设置单元格的值,不需要调用，系统自动赋值
    public void setValueAt(Object value, int row, int col) {
//        data[row][col] = value;
//    	Vector v = (Vector)data.get(row);
//    	Object obj = v.get(col);
        //更新界面
        fireTableCellUpdated(row, col); 
    }
	
}
}
