package com.action;

import java.util.List;

import HibernateDAO.PersonDAOimpl;

import com.opensymphony.xwork2.ActionSupport;
import com.vo.ClassescVo;
import com.vo.MajorVo;

public class Majorclassescaction extends ActionSupport {
	private List<MajorVo> majlist;
	private MajorVo majorVo;
	private ClassescVo classz;
	private List<ClassescVo> classlist;
	PersonDAOimpl impl = new PersonDAOimpl();
	@Override
	public String execute() throws Exception {
		String sql = "from MajorVo";
		String sql2 = "from ClassescVo";
		majlist=impl.find(sql);
		classlist=impl.find(sql2);
		return INPUT;
	}
//	public static void main(String[] args) {
//		
//		MajorVo maj = new MajorVo();
//		ClassescVo clas = new ClassescVo();
//		maj.setMajorname("JAVA开发");
//		clas.setClassname("二班");
//		clas.setMajorid(1);
//		clas.setMajorVo(maj);
//		impl.save(clas);
//		
//	}
	public List<MajorVo> getMajlist() {
		return majlist;
	}
	public void setMajlist(List<MajorVo> majlist) {
		this.majlist = majlist;
	}
	public List<ClassescVo> getClasslist() {
		return classlist;
	}
	public void setClasslist(List<ClassescVo> classlist) {
		this.classlist = classlist;
	}
	public MajorVo getMajorVo() {
		return majorVo;
	}
	public void setMajorVo(MajorVo majorVo) {
		this.majorVo = majorVo;
	}
	public ClassescVo getClassz() {
		return classz;
	}
	public void setClassz(ClassescVo classz) {
		this.classz = classz;
	}
}
