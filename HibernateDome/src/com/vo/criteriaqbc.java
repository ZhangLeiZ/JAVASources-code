package com.vo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import HibernateDAO.CriteriaQBCimpl;

import com.ht.HibernateSessionFactory;

public class criteriaqbc {

	public static void main(String[] args) {
		criteriaqbc cr = new criteriaqbc();
		cr.criteria1();
	}
	public void criteria1(){
		Session session = HibernateSessionFactory.getSession();
		Criteria cri = session.createCriteria(EmployeeVo.class);
		cri.add(Restrictions.like("employeeName","小%"));
		List<EmployeeVo> emplist = new ArrayList<EmployeeVo>();
		emplist = cri.list();
		for (EmployeeVo e : emplist) {
			System.out.println(e.getEmployeeName());
		}
	}
	public void criteria2(){
		
		CriteriaQBCimpl criimpl = new CriteriaQBCimpl();
		DetachedCriteria cd = DetachedCriteria.forClass(EmployeeVo.class);
		cd.setFetchMode("dep",FetchMode.JOIN );
		cd.add(Restrictions.like("employeeName","小%"));
		List<EmployeeVo> list= criimpl.findBydetache(cd);
		for (EmployeeVo e : list) {
			System.out.println(e.getEmployeeName());
		}
	}
}
