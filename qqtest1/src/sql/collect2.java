package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class collect2 {
	public static void main(String[] args) {
//		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
//		String ulr="jdbc:sqlserver://localhost:1433;databasename=student";
//		String name="sa";
//		String password="147235";
		try {
//			Class.forName(driver);
//			System.out.println("ok");
			Connection con=new PDBC().openDB();
			Statement state=con.createStatement();
			String select="select*from km";
			ResultSet result=state.executeQuery(select);
			while(result.next()){
				System.out.println("标号："+result.getInt("标号")+"\t主题："+result.getString("主题")+"\t描述："+result.getString("描述"));
				System.out.println();
				System.out.println();
			}
			result.close();
			state.close();
			con.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
