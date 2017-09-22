package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Tongxunimple implements Userinterface{

	public String countuser(String tablename) {
		int count=0;
		String str = null;
		Connection conn = DAODBdome.DBdome();
		String sql="select count(*) from "+tablename;
		try {
			Statement statem = conn.createStatement();
			ResultSet rs=statem.executeQuery(sql);
			if(rs.next())
			{
				count=rs.getInt(1);
				str = "总数："+count+"个";
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return str;
	}

	public void useradd(UserVo userbean) {
		// TODO Auto-generated method stub
		
		Connection conn = DAODBdome.DBdome();;
		
		try {
			Statement statem = conn.createStatement();
			String sql="insert into users values('"+userbean.getUsername()+"',";
			sql+="'"+userbean.getSex()+"',";
			sql+="'"+userbean.getBirthday()+"',";
			sql+="'"+userbean.getPhone()+"',";
			sql+="'000000',";
			sql+="'"+userbean.getAddress()+"'";
			sql+=")";
			
			statem.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void userdel(int userid) {
		Connection conn = DAODBdome.DBdome();;
		try {
			String sql="delete users where userid="+userid;
			Statement statem = conn.createStatement();
			statem.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<UserVo> userlist() {
		List<UserVo> userlist= new ArrayList<UserVo>();
		Connection conn = DAODBdome.DBdome();;
		try {
			String sql="select * from users";
			Statement statem = conn.createStatement();
			ResultSet rs=statem.executeQuery(sql);
			while(rs.next())
			{
				UserVo uservo=new UserVo();
				uservo.setUserid(rs.getInt("userid"));
				uservo.setUsername(rs.getString("username"));
				uservo.setSex(rs.getString("sex"));
				uservo.setPhone(rs.getString("phone"));
				uservo.setBirthday(rs.getString("birthday"));
				uservo.setAddress(rs.getString("address"));
				userlist.add(uservo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userlist;
	}

	public void userupdate(UserVo userbean) {
		Connection conn = DAODBdome.DBdome();
		String sql="update users set username='"+userbean.getUsername()+"',sex='"+userbean.getSex()+"',phone='"+userbean.getPhone()+"',birthday='"+userbean.getBirthday()+"',address='"+userbean.getAddress()+"'";
			   sql+=" where userid="+userbean.getUserid();
		try {
			Statement statem = conn.createStatement();
			statem.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public UserVo numberuser(String name) {
		Connection conn = DAODBdome.DBdome();
		UserVo uservo =null;
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from users where username='"+name+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()){
				uservo = new UserVo();
				uservo.setUserid(rs.getInt("userid"));
				uservo.setUsername(rs.getString("username"));
				uservo.setSex(rs.getString("sex"));
				uservo.setPhone(rs.getString("phone"));
				uservo.setBirthday(rs.getString("birthday"));
				uservo.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uservo;
	}

	public void delall() {
		Connection conn = DAODBdome.DBdome();
		try {
			String sql="truncate table users";
			Statement statem = conn.createStatement();
			statem.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean chlick(String name, String pass) {
		Connection conn = DAODBdome.DBdome();
		boolean isok=false;
		try {
			String sql="select * from users where username='"+name+"' and pass='"+pass+"'";
			Statement statem = conn.createStatement();
			ResultSet rs = statem.executeQuery(sql);
			if(rs.next()){
				isok=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isok;
	}

	public UserVo numuser(int id) {
			Connection conn = DAODBdome.DBdome();
			UserVo uservo =null;
			try {
				Statement stmt = conn.createStatement();
				String sql = "select * from users where userid="+id;
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()){
					uservo = new UserVo();
					uservo.setUserid(rs.getInt("userid"));
					uservo.setUsername(rs.getString("username"));
					uservo.setSex(rs.getString("sex"));
					uservo.setPhone(rs.getString("phone"));
					uservo.setBirthday(rs.getString("birthday"));
					uservo.setAddress(rs.getString("address"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return uservo;
		}

}
