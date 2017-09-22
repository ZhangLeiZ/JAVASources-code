package com.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleDome {

	public static Connection getConn() {
		Connection conn = null;
		try {
			 String url = "jdbc:oracle:" + "thin:@ZXW-20160904IIU:1521:orcl";
			 String user = "sys as sysdba";
		      String password= "zhanglei";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
