package Furn_interface;

import java.util.List;

import Furn_Bean.CityBean;
import Furn_Bean.UserBean;
import Furn_Bean.CityBean;

public interface Furnitureinterface {
	public abstract void Addusre(UserBean userbean);
	public abstract void Delectuser(int userid);
	public abstract void Updateuser(UserBean userbean);
	public abstract UserBean Selectuser(int userid);
	
	public List<CityBean> citylist(int pagebarsize, int startlocal);
	public int pagebarsum(String tablename);
}
