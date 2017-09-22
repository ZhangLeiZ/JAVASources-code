package ShowDemo;

import java.util.List;

import ShowDemo.Privacebean;

public interface CitySql {

	public abstract List<CityBean> list();
	public abstract void cityupdate(CityBean citybean);
	public abstract List<Privacebean> privacelist();
	public abstract CityBean citybean(String cityid);
	
}
