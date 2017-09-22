package QQ2016;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PDBC {
	static String url="jdbc:sqlserver://192.168.43.60:1433;databasename=student";
	static String name="sa";
	static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //驱动
	static String password="147235";
	static Connection con=null;
	static{
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,name,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection openDB(){
		try {
				if(con.isClosed()){
					
					con=DriverManager.getConnection(url,name,password);
				}
			}catch (SQLException e) {
					e.printStackTrace();
			}
		return con;
	}
}
