package jdbc;

import java.util.List;



public interface Userinterface {
	//查询语句
	public abstract List<UserVo> userlist();
	//删除语句
	public abstract void userdel(int userid);
	//更新语句
	public abstract void userupdate(UserVo userbean);
	//添加语句
	public abstract void useradd(UserVo userbean);
	
	//查找总记录条数语句
	public abstract String countuser (String tablename);
	
	public abstract UserVo numberuser(String name);
	
	public abstract UserVo numuser(int id);
	
	public abstract void delall();
	
	public abstract boolean chlick(String name,String pass);
	
}
