package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;

import HibernateDAO.PersonDAOimpl;

import com.opensymphony.xwork2.ActionSupport;
import com.vo.DepartmentVo;
import com.vo.Pagehibernate;

public class DepartmentAction extends ActionSupport{
	private DepartmentVo depa;
	private List<DepartmentVo> list;
	private List pagelist;
	private int currenpage;
	PersonDAOimpl impl = new PersonDAOimpl();
	public String add() throws Exception {
		impl.getadd(depa);
		return SUCCESS;
	}
	public String select() throws Exception {
		list = impl.getselect();
		return SUCCESS;
	}
	public String del() throws Exception {
		return null;
	}
	public String update() throws Exception {
		return null;
	}
	public String Pagelist() throws Exception{
	    Pagehibernate nate = getPagebean(5, currenpage);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("nate", nate);
		pagelist=nate.getList();
		System.out.println("ddddd"+pagelist);
		return SUCCESS;
	}
	public Pagehibernate getPagebean(int pagesize , int page){
	
		Pagehibernate bean = new Pagehibernate();
		DetachedCriteria cd = DetachedCriteria.forClass(DepartmentVo.class);
		int result=impl.getAllRowcount(cd);
		int totalpages = bean.getTotalPages(pagesize, result);
		int curpage = bean.getCurPage(page);	
		int offset = bean.getCurrentPageOffset(pagesize, curpage);
		List<DepartmentVo> list = impl.QueryByPages(offset, pagesize);
		bean.setAllRows(result);
		bean.setCurrentPage(curpage);
		bean.setLists(list);
		bean.setTotalPage(totalpages);
		return bean;
	}
	public List getPagelist() {
		return pagelist;
	}
	public void setPagelist(List pagelist) {
		this.pagelist = pagelist;
	}
	public int getCurrenpage() {
		return currenpage;
	}
	public void setCurrenpage(int currenpage) {
		this.currenpage = currenpage;
	}
	public List<DepartmentVo> getList() {
		return list;
	}
	public void setList(List<DepartmentVo> list) {
		this.list = list;
	}
	public DepartmentVo getDepa() {
		return depa;
	}
	public void setDepa(DepartmentVo depa) {
		this.depa = depa;
	}
}
