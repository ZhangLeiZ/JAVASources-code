package ShowDemo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ShowDemo.Privacebean;
public class CitySqlimp implements CitySql{
	Connection con = SQLCon.openDB();
	public void cityupdate(CityBean citybean) {
		try {
			Statement st = con.createStatement();
			st.executeUpdate("update city set cityname='"+citybean.getCityname()+"',privaceid="+citybean.getProvinceid()+" where cityid="+citybean.getCityid());
		} catch (SQLException e) {
			System.out.println("更新城市语句出错！");
		}
	}
	public List<CityBean> list() {
		List<CityBean> list = new ArrayList<CityBean>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select c.*,p.privaceName from city c inner join privace p on c.privaceid=p.privaceid order by p.privaceid,c.cityid");
			while (rs.next()) {
				CityBean bean = new CityBean();
				bean.setCityid(rs.getInt("cityid"));
				bean.setCityname(rs.getString("cityName"));
				bean.setProvinceid(rs.getInt("privaceid"));
				bean.setProvincename(rs.getString("privaceName"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println("查询城市语句出错！");
		}
		return list;
	}
	public CityBean citybean(String cityid) {
		CityBean bean = new CityBean();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from  city where cityid="+cityid);
			if (rs.next()) {
				bean.setCityid(rs.getInt("cityid"));
				bean.setCityname(rs.getString("cityname"));
				bean.setProvinceid(rs.getInt("privaceid"));
			}
		} catch (Exception e) {
			System.out.println("查询单个城市语句出错！");
		}
		return bean;
	}
	public List<Privacebean> privacelist() {
		List<Privacebean> list = new ArrayList<Privacebean>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select c.*,p.privaceName from city c inner join privace p on c.privaceid=p.privaceid order by p.privaceid,c.cityid");
			while (rs.next()) {
				Privacebean bean = new Privacebean();
				bean.setPrivaceid(rs.getInt("privaceid"));
				bean.setPrivaceName(rs.getString("privaceName"));
				list.add(bean);
			}
		} catch (Exception e) {
			System.out.println("查询省份语句出错！");
		}
		return list;
	}
}
