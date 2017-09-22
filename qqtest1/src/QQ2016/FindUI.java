package QQ2016;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

public class FindUI extends JFrame implements ActionListener,MouseListener{
	JLabel lbqqcode,lbnickname,lbonline,lbsex;
	JTextField jtqqcode,jtnickname;
	JComboBox cbsex,cbonline;
	JButton jbfind,jbexit,jbadd;
	String ssex[]={"不限","男","女"};
	String sonline[]={"不限","在线","离线","隐身","忙碌"};
	AccountVO myinfo;
	Vector<String>vhead;
	Vector vdata;
	JTable dataTable;
	JPanel toppan,cenpan,downpan;
	BaseDAO basedao=new BaseDAO();
	
	public FindUI() {

	}
	public FindUI(AccountVO myinfo) {
		super("查找好友");
		this.myinfo=myinfo;
		lbqqcode=new JLabel("QQ号码");
		lbnickname=new JLabel("昵称");
		lbonline=new JLabel("状态");
		lbsex=new JLabel("性别");
		 jtqqcode=new JTextField(15);
		 jtnickname=new JTextField(15);
		 jbfind=new JButton("查找");
		 jbexit=new JButton("退出");
		 jbadd=new JButton("添加");
		 cbonline=new JComboBox(sonline);
		 cbsex=new JComboBox(ssex);
		 toppan=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 toppan.add(lbqqcode);
		 toppan.add(jtqqcode);
		 toppan.add(lbnickname);
		 toppan.add(jtnickname);
		 toppan.add(lbsex);
		 toppan.add(cbsex);
		 toppan.add(lbonline);
		 toppan.add(cbonline);
		 toppan.add(jbfind);
		 vhead=new Vector<String>();
		 String clo[]={"头像","QQ号码","昵称","生日","性别","民族","爱好","状态","备注"};
		 for(int i=0;i<clo.length;i++){
			 vhead.addElement(clo[i]); 
		 }
		 String sql="select headImg,qqCode,nickName,birth,sex,nation,hobit,onlinestatus,remark from account";
		 vdata=basedao.findfriend(sql);
		 dataTable=new JTable(new MyTableModel(vhead,vdata));
		 dataTable.setRowHeight(60);
		 add(new JScrollPane(dataTable));
		 downpan=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		 downpan.add(jbadd);
		 downpan.add(jbexit);
		 add(downpan,BorderLayout.SOUTH);
		 add(toppan,BorderLayout.NORTH);
		 //监听
		 jbfind.addActionListener(this);
		 jbexit.addActionListener(this);
		 jbadd.addActionListener(this);
		 dataTable.addMouseListener(this);
		 setSize(800,500);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 
	}
	
	class MyTableModel extends AbstractTableModel {
    	Vector<String> vHead;
    	Vector data;
        public MyTableModel(Vector<String> vHead,Vector data) {
        	this.vHead = vHead;
        	this.data = data;
        }
        //得到表格列长度
        public int getColumnCount() {
            return vHead.size();
        }
        //得到表格行数
        public int getRowCount() {
            return data.size();
        }
        //得到表格列名
        public String getColumnName(int col) {
          //  System.out.println(" 该列的列名为：" + vHead.get(col));
            return vHead.get(col);
        }
        //得到指定单元的值
        public Object getValueAt(int row, int col) {
        	Vector rowData = (Vector)vdata.get(row);
			if(col==0){//表示头像
				return new ImageIcon(rowData.get(col).toString());
			}else{
				return rowData.get(col);
			}
        }
        //返回指定列的数据类型
        @Override
		public Class<?> getColumnClass(int c) {
        	if(c==0){//表示头像
				return ImageIcon.class;
			}else{
				return super.getColumnClass(c);
			}
        }
        //设置单元格是否可修改
        public boolean isCellEditable(int row, int col) {
            return false;
        }

        //设置单元格的值
        public void setValueAt(Object value, int row, int col) {
        	Vector rowData = (Vector)vdata.get(row);
        	rowData.set(col, value);
            fireTableCellUpdated(row, col);
        }
    }
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbexit){
			dispose();
		}
		if(e.getSource()==jbfind){
			 String sql="select headImg,qqCode,nickName,birth,sex,nation,hobit,onlinestatus,remark from account";
			 sql+=" where 1=1";
			 String qqcode=jtqqcode.getText();
			 String nickname=jtnickname.getText();
			 if(!qqcode.equals("")){
				 sql+=" and qqcode="+qqcode;
			 }
			 if(!nickname.equals("")){
				 sql+=" and nickName like '%"+nickname+"%'";
			 }
			 String sex=ssex[cbsex.getSelectedIndex()];
			 String online=sonline[cbonline.getSelectedIndex()];
			 if(!sex.equals("不限")){
				 sql+=" and sex='"+sex+"'";
			 }
			 if(!online.equals("不限")){
				 sql+=" and onlinestatus='"+online+"'";
			 }
			 sql+=" order by qqcode";
			 vdata=basedao.findfriend(sql);
			 System.out.println(sql);
			 dataTable.setModel(new MyTableModel(vhead,vdata));
		}
		if(e.getSource()==jbadd){
			int index=dataTable.getSelectedRow();
				Vector row=(Vector)vdata.get(index);
				int qqcode=Integer.parseInt(row.get(1).toString());
				if(qqcode==myinfo.getQqCode()){
					JOptionPane.showMessageDialog(this, "你不能添加自己为好友");
					return;
				}
				if(basedao.isfriends(myinfo.getQqCode(), qqcode)){
					JOptionPane.showMessageDialog(this, "你们已经是好友了！");
					return;
				}
				AccountVO friendinfo=basedao.getselectfriends(qqcode);
				System.out.println(myinfo.getNickName());
				String str="是否添加"+friendinfo.getNickName()+"为您的好友";
				if(JOptionPane.showConfirmDialog(this,str,"添加好友",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
					 SendMsg msg=new SendMsg();
					 msg.myinfo=myinfo;
					 msg.cmd=Cmd.CMD_ADDFRI	;
					 msg.friendinfo=friendinfo;
					 
					new  SendCmd().Send(msg);
				}
		}
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==dataTable){
			int index=dataTable.getSelectedRow();
			if(e.getClickCount()==2){
				Vector row=(Vector)vdata.get(index);
				int qqcode=Integer.parseInt(row.get(1).toString());
				AccountVO friendinfo=basedao.getselectfriends(qqcode);
				String str="是否添加"+friendinfo.getNickName()+"为您的好友";
				if(JOptionPane.showConfirmDialog(this,str,"添加好友",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
					 SendMsg msg=new SendMsg();
					 msg.cmd=Cmd.CMD_ADDFRI	;
					 msg.myinfo=myinfo;
					 msg.friendinfo=friendinfo;
					 new SendCmd().Send(msg);
					System.out.println("加好友");
				}
			}
		}
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
