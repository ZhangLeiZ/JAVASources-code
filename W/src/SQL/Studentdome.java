package SQL;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Studentdome extends JFrame implements ActionListener{
	
	JLabel username,call;
	JTextField texname,texcall;
	JButton btFrist,btnext,btadd;
	public Studentdome() {
	super("查询");
    JPanel conpanel = new JPanel(new GridLayout(2,2,10,10));
    username = new JLabel("姓名:",JLabel.RIGHT);

	call = new JLabel("年龄:",JLabel.RIGHT);
	texname = new JTextField();
	texcall = new JTextField();
	btFrist = new JButton("上一条(F)");
	btFrist.setMnemonic('F');
	btadd = new JButton("添加(D)");
	btadd.setMnemonic('D');
	btnext = new JButton("下一条(N)");
	btnext.setMnemonic('N');
	conpanel.add(username);
	conpanel.add(texname);
	conpanel.add(call);
	conpanel.add(texcall);
	JPanel conpanel2 = new JPanel();
	conpanel2.add(btFrist);
	conpanel2.add(btadd);
	conpanel2.add(btnext);
	add(conpanel,BorderLayout.CENTER);
	add(conpanel2,BorderLayout.SOUTH);
	btFrist.addActionListener(this);
	btadd.addActionListener(this);
	
	
	
	

	setSize(400,170);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new Studentdome();
		
		}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btadd){
			try {
				Connection conn = new DAODBdome().DBdome();
				String sql="insert into calldome values(?,?)";
				PreparedStatement psm=conn.prepareStatement(sql);
				int index = 1;
				psm.setString(index++, texname.getText().trim());
				psm.setString(index++,texcall.getText().trim());
				psm.executeUpdate();
				JOptionPane.showMessageDialog(this, "添加成功");
				psm.close();
				conn.close();
			} catch (SQLException e1) {
				System.out.println("添加异常....");
				e1.printStackTrace();
			}
			
		}else if(e.getSource()==btFrist){
			Connection conn = new DAODBdome().DBdome();
			
	        try {
	        	Statement stmt = conn.createStatement();
				String sql = "select * from calldome";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.previous()){
					System.out.println("username="+rs.getString("username")+"/call="+rs.getString("call"));
				}
				JOptionPane.showMessageDialog(this, "显示上一条记录异常");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		
	}
	public void adddome(){
		
	}

}
