package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Usersql implements DBCinter {

	
	public void add(UserVo user) {
	Connection conn = DAODBdome.DBdome();
	String sql ="insert into QQuser values(?,?,?,?,?,?,?,?)";
	try {
		PreparedStatement psm = conn.prepareStatement(sql);
		int index=1;
		psm.setString(index++, user.getUsername().trim());
		psm.setString(index++, user.getPassword().trim());
		psm.setString(index++, user.getSex().trim());
		psm.setInt(index++, user.getAge());
		psm.setString(index++, user.getCardno().trim());
		psm.setString(index++, user.getQqcode());
		psm.setString(index++,  user.getEmail().trim());
		psm.setString(index++, user.getRemark().trim());
		psm.executeUpdate();
		psm.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	public void delete(int userid) {
		String sql= "delete from QQuser where id=?";
		Connection conn = DAODBdome.DBdome();
		PreparedStatement psm = null;
		Vector rowdata = new Vector();
		try {
			psm = conn.prepareStatement(sql);
			psm.setInt(1, userid);
			ResultSet rs = psm.executeQuery();
			while(rs.next()){
				//保存一条记录
				Vector row = new Vector();
				row.addElement(rs.getInt("userid"));
				row.addElement(rs.getString("userName").trim());
				row.addElement(rs.getString("password").trim());
				row.addElement(rs.getString("sex").trim());
				row.addElement(rs.getInt("age"));
				row.addElement(rs.getString("cardno").trim());
				row.addElement(rs.getString("qqcode").trim());
				row.addElement(rs.getString("email").trim());
				row.addElement(rs.getString("remark").trim());
				rowdata.addElement(row);
			}
			rs.deleteRow();
			rs.close();
		
		} catch (SQLException e) {
		System.out.println("运行异常");
		}
	
	}
	
	public Vector find(String userName, String sex, String qqCode) {
		String sql = "select * from QQuser where 1=1";
		if(!userName.equals("")){
			sql += " and username like '%"+ userName +"%'";
		}
		if(!sex.equals("")){
			sql += " and sex='"+sex +"'";
		}
		if(!qqCode.equals("")){
			sql += " and qqcode='"+qqCode + "'";
		}
		sql += " order by username";
		
		System.out.println(sql);
		Connection conn = DAODBdome.DBdome();
		Statement stmt;
		Vector rowdata = new Vector();
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				//保存一条记录
				Vector row = new Vector();
				row.addElement(rs.getInt("userid"));
				row.addElement(rs.getString("userName").trim());
				row.addElement(rs.getString("password").trim());
				row.addElement(rs.getString("sex").trim());
				row.addElement(rs.getInt("age"));
				row.addElement(rs.getString("cardno").trim());
				row.addElement(rs.getString("qqcode").trim());
				row.addElement(rs.getString("email").trim());
				row.addElement(rs.getString("remark").trim());
				rowdata.addElement(row);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowdata;
	}

	
    public void update(UserVo user) {
		Connection conn = DAODBdome.DBdome();
		
	}



	
}
