package SQL;

import java.util.Vector;

public interface DBCinter {

	public void add(UserVo user);
	public void update(UserVo user);
	public void delete(int userid);
	public Vector find(String userName,String sex,String qqCode);
	
}
