package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conllect {
	public static void main(String[] args) {
		String ulr="jdbc:odbc:llhDB";
		String name="sa";
		String password="147235";
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection(ulr,name,password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}	
}
