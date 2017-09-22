package com.vo;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;

import HibernateDAO.PersonDAOimpl;

public class TextManytoMany {

	public static void main(String[] args) {
		TextManytoMany text = new TextManytoMany();
		text.textadd();
	}
	public void textadd(){
		PersonDAOimpl dba = new PersonDAOimpl();
		StudentVo stu = (StudentVo)dba.get(StudentVo.class,8);
		DetachedCriteria cd = DetachedCriteria.forClass(CourseVo.class);
		cd.addOrder(Order.asc("courseid"));
		List<CourseVo> list = dba.Detachedcriteria(cd);
		for (CourseVo c : list) {
			stu.getCourseset().add(c);
		}
		dba.saveorUpdate(stu);
	}
}
