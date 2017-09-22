package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCdome2 {

	public static void main(String[] args){
		String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url="jdbc:sqlserver://localhost\\:1433;databasename=MyQQ";
		String username="sa";
		String password="123456";
		Connection conn=null;
		
		
			try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url,username,password);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select * from Account");
                while(rs.next()){
                	System.out.println("id"+rs.getInt(1));
                }
			} catch (ClassNotFoundException e){
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
	}
	
}
