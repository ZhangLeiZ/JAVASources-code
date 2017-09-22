package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class zhuceImp implements Iuzhuce{

	public void add(zhuceVo use) {
		Connection con=new PDBC().openDB();
		PreparedStatement sta;
		try {
			String sql="insert into userQQ values(?,?,?,?,?,?,?,?)";
			sta = con.prepareStatement(sql);
			int idnex=1;
			sta.setInt(idnex++,use.getUser());
			sta.setString(idnex++,use.getName().trim());
			sta.setString(idnex++,use.getPassword().trim());
			sta.setString(idnex++,use.getSex());
			sta.setString(idnex++,use.getNumber().trim());
			sta.setString(idnex++,use.getQq().trim());
			sta.setString(idnex++,use.getEmail().trim());
			sta.setString(idnex++,use.getMessage().trim());
			sta.executeUpdate();
			JOptionPane.showMessageDialog(null, "注册成功！");
			sta.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "账号已存在！请重新输入");
		}
	}

	public void delete(String sqldata) {
		Connection con=new PDBC().openDB();
		String sql="delete userqq where 账号 = '"+sqldata+"'";
		
		try {
			Statement sta=con.createStatement();
			sta.executeUpdate(sql);

			
			sta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Vector find(String name,String qq,String sex) {
		
		String sql="select*from userqq where 1=1";
		if(!name.equals("")){
			sql+= " and 姓名 like'%"+name+"%'";
		}
		if(!qq.equals("")){
			sql+= " and QQ='"+qq+"'";
		}
		if(!sex.equals("")){
			sql+= " and 性别='"+sex+"'";
		}
		sql+=" order by 姓名";
		System.out.println(sql);
		Connection con=new PDBC().openDB();
		Statement sta;
		Vector v=new Vector();
		try {
			sta = con.createStatement();
			ResultSet rs=sta.executeQuery(sql);
			while(rs.next()){
				Vector v2=new Vector();
				v2.addElement(rs.getString("账号").trim());
				v2.addElement(rs.getString("姓名").trim());
				v2.addElement(rs.getString("密码").trim());
				v2.addElement(rs.getString("性别").trim());
				v2.addElement(rs.getString("电话").trim());
				v2.addElement(rs.getString("QQ").trim());
				v2.addElement(rs.getString("email").trim());
				v2.addElement(rs.getString("说明").trim());
				v.addElement(v2);
			}
			rs.close();
			sta.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}

	public void update(zhuceVo use) {
		
	}

}
