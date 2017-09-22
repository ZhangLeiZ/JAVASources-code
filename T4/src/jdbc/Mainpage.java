package jdbc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Mainpage extends JFrame implements ActionListener,MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel name;
	//JTextArea showuser;
	JButton add,del;
	JTable table;
	DefaultTableModel model;
	
	JRadioButton rbMale,rbRemale;
	JLabel xinxi,user,sex,birthday,phone,address;
	JTextField usertext,birthtext,phonetext,addtext;
	
	JButton updatexinxi,allclose;
	
	JLabel nameselect,numberselect;
	JTextField nametext,numbertext;
	JButton selecter,selectnum;
	Tongxunimple impl = new Tongxunimple();
	int id=0;
	public Mainpage() {
		super("个人信息通讯录");
		JLabel image = new JLabel(new ImageIcon("lu/s2.jpg"));
		image.setLayout(null);
		add(image);
		name = new JLabel("名字");
		name.setBounds(20, 10, 50, 25);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		table.setBounds(20, 30, 130, 260);
		table.setBorder(BorderFactory.createLineBorder(Color.white));
		image.add(new JScrollPane().getViewport().add(table));
		table.addMouseListener(this);
		
		add = new JButton("添加");
		add.setBounds(20, 330, 60, 30);
		
		del = new JButton("删除");
		del.setBounds(120, 330, 60, 30);
		
		image.add(name);
		//image.add(showuser);
		image.add(add);
		image.add(del);
		add.addActionListener(this);
		del.addActionListener(this);
		
		xinxi = new JLabel("个人信息");
		xinxi.setBounds(290, 10, 100, 25);
		
		user = new JLabel("姓名");
		user.setBounds(290, 45, 50, 25);
		usertext = new JTextField(10);
		usertext.setBounds(345, 45, 180, 30);
		
		sex = new JLabel("性别");
		sex.setBounds(290, 105, 50, 25);
		rbMale = new JRadioButton("男",true);
		rbRemale = new JRadioButton("女"); 
		rbMale.setBounds(345, 105, 40, 25);
		rbRemale.setBounds(470, 105, 40, 25);
		image.add(rbMale);
		image.add(rbRemale);
		
		birthday = new JLabel("生日");
		birthday.setBounds(290, 155, 50, 25);
		birthtext = new JTextField(10);
		birthtext.setBounds(345, 155, 180, 30);
		
		phone = new JLabel("电话");
		phone.setBounds(290, 205, 50, 25);
		phonetext = new JTextField(10);
		phonetext.setBounds(345, 205, 180, 30);
		
		address = new JLabel("地址");
		address.setBounds(290, 255, 50, 25);
		addtext = new JTextField(10);
		addtext.setBounds(345, 255, 180, 30);
		
		updatexinxi = new JButton("更新信息");
		updatexinxi.setBounds(290, 330, 100, 30);
		
		allclose = new JButton("全部删除");
		allclose.setBounds(430, 330, 100, 30);
		updatexinxi.addActionListener(this);
		allclose.addActionListener(this);
		
		image.add(allclose);
		image.add(updatexinxi);
		image.add(xinxi);
		image.add(usertext);
		image.add(user);
		image.add(sex);
		image.add(birthday);
		image.add(birthtext);
		image.add(phonetext);
		image.add(phone);
		image.add(address);
		image.add(addtext);
		
		nameselect = new JLabel("按姓名查找用户");
		nameselect.setBounds(110, 450, 150, 25);
		nametext = new JTextField();
		nametext.setBounds(260, 450, 180,30);
		
		numberselect = new JLabel("查询用户个数");
		numberselect.setBounds(110, 500, 150, 25);
		numbertext = new JTextField();
		numbertext.setBounds(260, 500, 180,30);
		
		selecter = new JButton("查找");
		selecter.setBounds(480, 450, 70, 30);
		
		selectnum = new JButton("查询");
		selectnum.setBounds(480, 500, 70, 30);
		selecter.addActionListener(this);
		selectnum.addActionListener(this);
		
		image.add(selecter);
		image.add(selectnum);
		image.add(nametext);
		image.add(numbertext);
		image.add(nameselect);
		image.add(numberselect);
		
		Selectall();
		
		setSize(650,640);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(add)){
			UserVo usersvo = new UserVo();
			usersvo.setUsername(usertext.getText());
			if(rbMale.equals("")&&rbMale==null){
				usersvo.setSex(rbRemale.getText());
			}else{
				usersvo.setSex(rbMale.getText());
			}
			usersvo.setBirthday(birthtext.getText());
			usersvo.setAddress(addtext.getText());
			usersvo.setPhone(phonetext.getText());
			if(usersvo!=null){
				JOptionPane.showConfirmDialog(Mainpage.this, "添加成功！！！");
			}else{
				JOptionPane.showMessageDialog(Mainpage.this, "请添加所需要的数据！！！");
			}
			impl.useradd(usersvo);
			Selectall();
		}else if(e.getSource().equals(del)){
			impl.userdel(id);
			Selectall();
		}else if(e.getSource().equals(updatexinxi)){
			UserVo usersvo = new UserVo();
			usersvo.setUserid(id);
			usersvo.setUsername(usertext.getText());
			if(rbMale.equals("")&&rbMale==null){
				usersvo.setSex(rbRemale.getText());
			}else{
				usersvo.setSex(rbMale.getText());
			}
			usersvo.setBirthday(birthtext.getText());
			usersvo.setAddress(addtext.getText());
			usersvo.setPhone(phonetext.getText());
			impl.userupdate(usersvo);
			Selectall();
		}else if(e.getSource().equals(allclose)){
			JOptionPane.showMessageDialog(Mainpage.this, "你是否确定要清空你的联系人！！！");
			impl.delall();
			model.addColumn("");
		}else if(e.getSource().equals(selecter)){
			UserVo user = impl.numberuser(nametext.getText());
			if(user!=null){
				if(user.getSex()=="男"){
					rbMale.setEnabled(true);
				}else{
					rbRemale.setEnabled(true);
				}
				usertext.setText(user.getUsername());
				birthtext.setText(user.getBirthday());
				phonetext.setText(user.getPhone());
				addtext.setText(user.getAddress());
			}else{
				JOptionPane.showMessageDialog(Mainpage.this, "未找到该联系人");
			}
		}else if(e.getSource().equals(selectnum)){
			String count = impl.countuser("users");
			numbertext.setText(count);
		}
		
	}
	public void Selectall(){
		List<UserVo> list = new ArrayList<UserVo>();
		Vector<Object> columnName = new Vector<Object>();
		Vector<Object> column = new Vector<Object>();
		columnName.add("姓名");
		
		list=impl.userlist();
		String str = "";
			for (UserVo us : list) {
				Vector<String> vec = new Vector<String>();
				str=us.getUsername();
				vec.add(str);
				column.add(vec);
			}
			
		model.setDataVector(column,columnName);
	}
	
	public static void main(String[] args) {
		new Mainpage();
	}
	
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==table){
			if(table.getSelectedColumn()!=-1){
				id = table.getSelectedRow()+1;
				UserVo user = impl.numuser(id);
				if(user!=null){
					if(user.getSex()=="男"){
						rbMale.setEnabled(true);
					}else{
						rbRemale.setEnabled(true);
					}
					usertext.setText(user.getUsername());
					birthtext.setText(user.getBirthday());
					phonetext.setText(user.getPhone());
					addtext.setText(user.getAddress());
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
