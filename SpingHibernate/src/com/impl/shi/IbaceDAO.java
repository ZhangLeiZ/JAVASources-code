package com.impl.shi;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.vo.StudentVo;

public interface IbaceDAO {

	public abstract void add(Object obj);
	public abstract void del(Object obj);
	public abstract void update(Object obj);
	public abstract List liststudy(DetachedCriteria  dc,int startpage,int pagesize);
}
