package SQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDome {


	public static void main(String[] args) {
		
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //驱动
		//连接字符串
//		String url = "jdbc:sqlserver://localhost:1433;databasename=HouseSale";
		//databasename=数据库名称，这种方式连接数据库不需要到控制面板创建数据源
		String url = "jdbc:sqlserver://localhost\\SQL2005:1433;databasename=School";
		String username="sa";
		String password="123456";
		try{
			//1.注册一个驱动
			Class.forName(driver);
			//2.连接数据库
			Connection conn = DriverManager.getConnection(url,username,password);
			
			Statement stmt = conn.createStatement();
			String sql = "select * from 客户表";
			//ResultSet保存了执行的结果
			//4.通过陈述对象执行sql语句，并返回结果集ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println("id="+rs.getInt("客户编号")+"\tusername="+rs.getString("客户名称")+"\tpassword="+rs.getString(3));
			}
			//6.关闭连接:后打开的先关闭，先打开的后关闭
			rs.close();
			
			stmt.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
