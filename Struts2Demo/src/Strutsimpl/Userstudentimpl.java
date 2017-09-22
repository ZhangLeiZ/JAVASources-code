package Strutsimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import StrVo.StudentVo;

public class Userstudentimpl {
	public void Adduserstudent(StudentVo studvo){
		Connection conn = OracleDome.getConn();
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into user_study values(";
			sql+="'"+studvo.getStuid()+"',";
			sql+="'"+studvo.getName()+"',";
			sql+="'"+studvo.getPassword()+"',";
			sql+=studvo.getAge()+",";
			sql+="'"+studvo.getSex()+"',";
			sql+="'"+studvo.getCardno()+"',";
			sql+=studvo.getNationid()+",";
			sql+=studvo.getClassid();
			sql+=")";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<StudentVo> selected(){
		Connection conn = OracleDome.getConn();
		List<StudentVo> list = new ArrayList<StudentVo>();
		try {
			Statement stmt = conn.createStatement();
			String sql="select * from user_study";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				StudentVo study = new StudentVo();
				study.setStuid(rs.getString(1));
				study.setName(rs.getString(2));
				study.setPassword(rs.getString(3));
				study.setAge(rs.getInt(4));
				study.setSex(rs.getString(5));
				study.setCardno(rs.getString(6));
				study.setNationid(rs.getInt(7));
				study.setClassid(rs.getInt(8));
				list.add(study);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public void del(String studid){
		Connection conn = OracleDome.getConn();
			try {
				Statement stmt = conn.createStatement();
				String sql = "DELETE user_study where stuid='"+studid+"'";
				stmt.executeUpdate(sql);
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
