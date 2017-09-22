package Furn_Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDome {

	public static Connection getConn() {
		Connection conn = null;
		try {
			String url = "jdbc:oracle:" + "thin:@ZXW-20160904IIU:1521:study";
			 String user = "sys as sysdba";
		      String password= "zhanglei";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// 封装设置Connection自动提交
	 public static void setAutoCommit(Connection conn, Boolean flag) {
	 try {
	 conn.setAutoCommit(flag);
	 } catch (SQLException e) {
	 e.printStackTrace();
	 }
	 }
	 
	 // 设置事务提交
	 public static void commit(Connection conn) {
	 try {
	 conn.commit();
	 } catch (SQLException e) {
	 e.printStackTrace();
	 }
	 }
	 
	 // 封装设置Connection回滚
	 public static void rollBack(Connection conn) {
	 try {
	 conn.rollback();
	 } catch (SQLException e) {
	 e.printStackTrace();
	 }
	 }
}
