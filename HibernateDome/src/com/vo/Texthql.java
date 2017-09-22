package com.vo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ht.HibernateSessionFactory;

import HibernateDAO.PersonDAOimpl;

public class Texthql {

	public static void main(String[] args) {
		Texthql text = new Texthql();
		//text.hql();
		//text.hql1();
		//text.hql2();
		text.hql3();
	}
	public void hql(){
		PersonDAOimpl per = new PersonDAOimpl();
		DepartmentVo dep = new DepartmentVo();
		String sql="from EmployeeVo e where e.employeeName=? and e.sex=?";
		List<EmployeeVo> list = per.finds(sql, "刘彤", "女");
		for (EmployeeVo e : list) {
			System.out.println("姓名："+e.getEmployeeName()+"编号："+e.getDep().getOid()+"学校："+e.getSchool());
		}
	}
	public void hql1(){
		Session session = HibernateSessionFactory.getSession();
		PersonDAOimpl per = new PersonDAOimpl();
		DepartmentVo dep = new DepartmentVo();
		Query query = session.createQuery("select new EmployeeVo(employeeName,sex,birthday) from EmployeeVo");
		List<EmployeeVo> list = query.list();
		for(int i=0;i<list.size();i++){
			EmployeeVo emp = list.get(i);
			System.out.println(emp);
		}
	}
	public void hql2(){
		Session session = HibernateSessionFactory.getSession();
		PersonDAOimpl per = new PersonDAOimpl();
		DepartmentVo dep = new DepartmentVo();
		Query query = session.createQuery("select e.employeeName from EmployeeVo as e where e.oid=2");
		List list = query.list();
			Object[]emp = (Object[])list.get(0);
			System.out.println(emp[0]);
	}
	public void hql3(){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.clear();
		String sql = "from EmployeeVo e join fetch e.dep d ";
		Query query = session.createQuery(sql);
		List list = query.list();
		Object obj[] = null;
		for(int i=0;i<list.size();i++){
			EmployeeVo emp=(EmployeeVo)list.get(i);
			System.out.println(emp.getEmployeeName());
			
		}
	}
}
