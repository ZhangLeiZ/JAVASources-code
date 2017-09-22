package sql;

import java.util.Vector;

public interface Iuzhuce {
	public void add(zhuceVo use);
	public void delete(String sqldata);
	public void update(zhuceVo use);
	public Vector find(String name,String qq,String sex);
}
