package com.ajaxdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class studentimpl {
	public void addstudent(UserVo uservo){
		Connection conn = OracleDome.getConn();
		try {
			Statement st = conn.createStatement();
			String sql = "insert into stud values(";
			sql+=uservo.getStuno()+",";
			sql+="'"+uservo.getName()+"',";
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
	public List<UserVo> selectstudent(){
		Connection conn = OracleDome.getConn();
		List<UserVo> list = new ArrayList<UserVo>();
		try {
			Statement stmt = conn.createStatement();
			String sql ="select * from stud";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				UserVo uservo = new UserVo();
				uservo.setStuno(rs.getInt(1));
				uservo.setName(rs.getString(2));
				uservo.setAge(rs.getInt(3));
				uservo.setSex(rs.getString(4));
				uservo.setCadeid(rs.getString(5));
				uservo.setClassname(rs.getString(6));
				list.add(uservo);
			}
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public void deletestud(int stuno){
		Connection conn = OracleDome.getConn();
		try {
			Statement stmt = conn.createStatement();
			String sql = "delete stud where stuno="+stuno;
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public UserVo upselectstud(int stuno){
		Connection conn = OracleDome.getConn();
		UserVo uservo = new UserVo();
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from stud where stuno="+stuno;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				uservo.setStuno(rs.getInt(1));
				uservo.setName(rs.getString(2));
				uservo.setAge(rs.getInt(3));
				uservo.setSex(rs.getString(4));
				uservo.setCadeid(rs.getString(5));
				uservo.setClassname(rs.getString(6));
			}
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uservo;
	}
	public void updatestud(UserVo uservo){
		Connection conn = OracleDome.getConn();
		try {
			String sql = "update stud set name='"+uservo.getName()+"',";
				sql+="age="+uservo.getAge()+",";
				sql+="sex='"+uservo.getSex()+"',";
				sql+="cadeid='"+uservo.getCadeid()+"',";
				sql+="classname='"+uservo.getClassname()+"'";
				sql+="where stuno="+uservo.getStuno();
				System.out.println(sql);
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				stmt.close();
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public List<UserVo> Pagestudent(int pagesize,int starlocal){
		Connection conn = OracleDome.getConn();
		List<UserVo> list = new ArrayList<UserVo>();
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from (select a.*,rownum rn from stud a) where rn>="+(starlocal+1)+" and rn<="+(starlocal+pagesize);
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				UserVo uservo = new UserVo();
				uservo.setStuno(rs.getInt(1));
				uservo.setName(rs.getString(2));
				uservo.setAge(rs.getInt(3));
				uservo.setSex(rs.getString(4));
				uservo.setCadeid(rs.getString(5));
				uservo.setClassname(rs.getString(6));
				list.add(uservo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public int sumpagestud(String table){
		Connection conn = OracleDome.getConn();
		int sum =0;
		try {
			Statement stmt = conn.createStatement();
			String sql = "select count(*) from "+table;
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
