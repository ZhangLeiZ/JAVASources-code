package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {
	public static void main(String[] args) {
		String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url="jdbc:sqlserver://localhost\\SQL2005:1433;databasename=School";
		String username="sa";
		String password="123456";
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();
			int cut=stmt.executeUpdate("insert into Student values(6,'今天又的','男',24)");
			System.out.println("成功");
			String sql="select*from student";
			ResultSet rs=stmt.executeQuery(sql);
//			while(rs!=null&&rs.next()){
//				System.out.println("sname="+rs.getString("Sname")+"\tage="+rs.getString("Ssex")+"\temail="+rs.getString("Sage"));
//
//			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
