package com.ht.ceshi;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.impl.shi.IbaceDAO;
import com.impl.shi.WebApplicationContextUilt;
import com.vo.StudentVo;

public class Studentceshi {

	IbaceDAO ibaceDAO = (IbaceDAO)WebApplicationContextUilt.XmlCreateService("beseDAO");
	
	public void add(){
		StudentVo stud = new StudentVo();
		stud.setSno(17);
		stud.setSname("小白");
		stud.setSsex("女");
		stud.setSage(23);
		//ibaceDAO.add(stud);
		//ibaceDAO.update(stud);
		//ibace.del(stud);
	}
	public void studlist(){
		DetachedCriteria dc = DetachedCriteria.forClass(StudentVo.class);
		List list = ibaceDAO.liststudy(dc,0,5);
		for (Object object : list) {
			StudentVo studentvo = (StudentVo)object;
			System.out.println("学号："+studentvo.getSno()+";姓名："+studentvo.getSname()+";年龄："+studentvo.getSage()+";性别："+studentvo.getSsex());
		}
	}
	public static void main(String[] args) {
		IbaceDAO ibaceDAO = (IbaceDAO)WebApplicationContextUilt.XmlCreateService("beseDAO");
		Studentceshi stud = new Studentceshi();
		
		//stud.add();
		stud.studlist();
	}
}
