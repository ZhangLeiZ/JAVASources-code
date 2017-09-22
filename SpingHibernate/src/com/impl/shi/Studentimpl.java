package com.impl.shi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.vo.StudentVo;

public class Studentimpl extends HibernateDaoSupport implements IbaceDAO {

	public void add(Object obj) {
		getHibernateTemplate().save(obj);
	}

	public void del(Object obj) {
		getHibernateTemplate().delete(obj);
	}

	public List liststudy(DetachedCriteria  dc,int startpage,int pagesize) {
		List list = new ArrayList();
		list = getHibernateTemplate().findByCriteria(dc, startpage, pagesize);
		return list;
	}

	public void update(Object obj) {
		getHibernateTemplate().update(obj);

	}

}
