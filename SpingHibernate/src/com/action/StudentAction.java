package com.action;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.impl.shi.IbaceDAO;
import com.impl.shi.WebApplicationContextUilt;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.StudentVo;
public class StudentAction extends ActionSupport{

	private List<StudentVo> list;
	private StudentVo student;
	@Override
	public String execute() throws Exception {
		IbaceDAO ibace = (IbaceDAO)WebApplicationContextUilt.XmlCreateService("beseDAO");
		StudentVo stud  = new StudentVo();
		DetachedCriteria dc = DetachedCriteria.forClass(StudentVo.class);
		list = ibace.liststudy(dc,0,5);
		for (Object object : list) {
			StudentVo studentvo = (StudentVo)object;
			System.out.println("学号："+studentvo.getSno()+";姓名："+studentvo.getSname()+";年龄："+studentvo.getSage()+";性别："+studentvo.getSsex());
		}
		return SUCCESS;
	}
	
	public StudentVo getStudent() {
		return student;
	}
	public void setStudent(StudentVo student) {
		this.student = student;
	}

	public List<StudentVo> getList() {
		return list;
	}

	public void setList(List<StudentVo> list) {
		this.list = list;
	}
}
