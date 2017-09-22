package Oracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class Procedure {
	OracleDome oracle = new OracleDome();
	public static void main(String[] args) {
		Procedure pro = new Procedure();
		//pro.exeting();
		String a = "s006";
		pro.connstatment();
	}
	public void exeting(){
		Connection conn = null;
		try{
			conn=oracle.getConn();
			System.out.println("9999"+conn);
			String sql="{call oostudent}";
			CallableStatement call = conn.prepareCall(sql);
			call.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception s){
				s.printStackTrace();
			}
		}
	}
	public void connstatment(){
		Connection conn = null;
		try{
			conn=oracle.getConn();
			String sql = "select * from student";
			CallableStatement call = conn.prepareCall(sql);
			Statement st = conn.createStatement();
			ResultSet  re = st.executeQuery(sql);
			while(re.next()){
				String sno = re.getString("sno");
				String sname = re.getString("sname");
				int sage = re.getInt("sage");
				String ssex = re.getString("ssex");
				System.out.println(sno+sname+sage+ssex);
			}
			}catch(Exception e){
				
				e.printStackTrace();
			}
	}
	
}
