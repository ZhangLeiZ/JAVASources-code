package com.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yourcompany.struts.form.UserVoForm;

public class Strutsimpl {
	public boolean selectuser(String name,String password){
		Connection conn = OracleDome.getConn();
		boolean isok=false;
		try {
			Statement stmt = conn.createStatement();
			String sql="select * from users where name='"+name+"' and password='"+password+"'";
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			if(rs!=null && rs.next()){
				isok=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isok;
	}
	public void addstudent(UserVoForm uservo){
		Connection conn = OracleDome.getConn();
		try {
			Statement st = conn.createStatement();
			String sql = "insert into users values(";
			sql+=uservo.getStuno()+",";
			sql+="'"+uservo.getName()+"',";
			sql+="'"+uservo.getPassword()+"',";
			sql+=uservo.getAge()+",";
			sql+="'"+uservo.getSex()+"',";
			sql+=uservo.getCadeid()+",";
			sql+="'"+uservo.getClassname()+"')";
			System.out.println(sql);
			st.executeUpdate(sql);
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<UserVoForm> pageuser(int pagesize,int starlocal){
		Connection conn = OracleDome.getConn();
		List<UserVoForm> list = new ArrayList<UserVoForm>();
		try {
			Statement stmt = conn.createStatement();
			String sql="select * from (select a.*,rownum rn from users a)where rn>="+(starlocal+1)+" and rn<="+(pagesize+starlocal);
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(sql);
			while(rs.next()){
				UserVoForm uservo = new UserVoForm();
				uservo.setStuno(rs.getInt(1));
				uservo.setName(rs.getString(2));
				uservo.setPassword(rs.getString(3));
				uservo.setAge(rs.getInt(4));
				uservo.setSex(rs.getString(5));
				uservo.setCadeid(rs.getString(6));
				uservo.setClassname(rs.getString(7));
				list.add(uservo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public int countuser(String table){
		int sum=0;
		Connection conn = OracleDome.getConn();
		try {
			Statement stmt = conn.createStatement();
			String sql="select count(*) from "+table;
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()){
				sum=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sum;
	}

}
