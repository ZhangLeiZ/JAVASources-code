package oracleimplement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import Oracle.OracleDome;

import javabean.studentbean;

public class sudoraclestudent implements oracleinterface.Oracleinterface {

	public List<studentbean> selectstu() {
		Connection conn =null;
		OracleDome oracle = new OracleDome();
		List<studentbean> list = new ArrayList<studentbean>();
		studentbean stu=null;
		try{
			conn=oracle.getConn();
			String sql = "select * from student";
			CallableStatement call = conn.prepareCall(sql);
			Statement st = conn.createStatement();
			ResultSet  re = st.executeQuery(sql);
			while(re.next()){
				stu = new studentbean();
				stu.setSno(re.getString("sno"));
				stu.setSname(re.getString("sname"));
				stu.setSage(re.getInt("sage"));
				stu.setSsex(re.getString("ssex"));
				list.add(stu);
			}

			}catch(Exception e){
				e.printStackTrace();
			}
		return list;
	}

}
