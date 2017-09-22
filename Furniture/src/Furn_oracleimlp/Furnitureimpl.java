package Furn_oracleimlp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Furn_Bean.CityBean;
import Furn_Bean.OracleDome;
import Furn_Bean.UserBean;
import Furn_interface.Furnitureinterface;
import Furn_Bean.CityBean;

public class Furnitureimpl implements Furnitureinterface{
	Connection conn=null;
	public void Addusre(UserBean userbean) {
		
		try{
			conn=OracleDome.getConn();
			String sql="insert into users values(ODS_USER.nextval,"+userbean.getUsermobile()+","+userbean.getUserpassword()+","+userbean.getUsername()+","+userbean.getUserface()+","+userbean.getUsersex()+","+userbean.getUserhomeaddress()+","+userbean.getUseremail()+",sysdate,"+userbean.getProvinceid()+","+userbean.getCityid()+","+userbean.getLeibie()+")";
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
			st.close();
		}catch (Exception e) {
			System.out.println("用户新增出错！");
		}
	}

	public void Delectuser(int userid) {
		
		
	}

	public UserBean Selectuser(int userid) {
		UserBean user = new UserBean();
		try {
			conn=OracleDome.getConn();
			String sql="select * from users where userid="+userid;
			Statement st = conn.createStatement();
			ResultSet re = st.executeQuery(sql);
			while(re.next()){
				user.setUserid(re.getInt(1));
				user.setUsermobile(re.getString(2));
				user.setUserpassword(re.getString(3));
				user.setUsername(re.getString(4));
				user.setUserface(re.getString(5));
				user.setUsersex(re.getInt(6));
				user.setUserhomeaddress(re.getString(7));
				user.setUseremail(re.getString(8));
				user.setUserregisterdate(re.getString(9));
				user.setProvinceid(re.getInt(10));
				user.setCityid(re.getInt(11));
				user.setLeibie(re.getInt(12));
			}
		} catch (Exception e) {
			System.out.println("查询用户出错");
		}
		return user;
	}

	public void Updateuser(UserBean userbean) {
		// TODO Auto-generated method stub
		
	}

	public List<CityBean> citylist(int pagebarsize, int startlocal) {
		List<CityBean> list = new ArrayList<CityBean>();
		conn=OracleDome.getConn();
		try {
			Statement st = conn.createStatement();
			String sql = "select * from(select rownum num,u.* from(select * from city) u where rownum<="+startlocal+") where num>="+pagebarsize;
			System.out.println(sql);
			System.out.println(pagebarsize+"  "+startlocal);
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				// 最关键的一步
				CityBean citybean = new CityBean();
				citybean.setCityid(rs.getInt("cityid"));
				citybean.setCityname(rs.getString("cityname"));
				citybean.setProvinceid(rs.getInt("provinceid"));
				//citybean.setProvincename(rs.getString("provincename"));
				list.add(citybean);
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println("分页查询城市语句出错！");
			e.printStackTrace();
		}
		return list;
	}

	public int pagebarsum(String tablename) {
			int barsum=0;
			conn=OracleDome.getConn();
			try {
				Statement st = conn.createStatement();
				String sql ="select count(*) cnt from "+tablename;
				System.out.println(sql);
				ResultSet rs = st.executeQuery(sql);
				if(rs.next()){
					barsum = rs.getInt(1);
					System.out.println(barsum);
				}
				rs.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("查询城市的记录总数出错！");
			}
			return barsum;
		}
}


