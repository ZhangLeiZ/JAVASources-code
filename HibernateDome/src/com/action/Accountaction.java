package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import HibernateDAO.PersonDAOimpl;

import com.opensymphony.xwork2.ActionSupport;
import com.vo.AccountVo;
import com.vo.DepartmentVo;
import com.vo.EmployeeVo;
import com.vo.Pagehibernate;

public class Accountaction extends ActionSupport{

	private AccountVo account;
	private DepartmentVo dep;
	private List<DepartmentVo>deplist;
	private EmployeeVo employee;
	private PersonDAOimpl personDAO;
	private List<EmployeeVo> emplist;
	private List<EmployeeVo> pagelist;
	private int currenpage;
	private String sdate;
	private String edate;
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public Accountaction() {
		personDAO = new PersonDAOimpl(); 
	}
	public String select()throws Exception{
		String sql ="from t.EmployeeVo  from DepartmentVo t where t.oid = detid";
		emplist = personDAO.find(sql);
		for(int i=0;i<emplist.size();i++){
			employee = (EmployeeVo)emplist.get(i);
			System.out.println(employee.getDeptid());
		}
		return null;
	}
	
	public String add() throws Exception {
		account.setEmployee(employee);
		employee.setDep(dep);
		employee.setAccount(account);
		personDAO.saveorUpdate(employee);
		return INPUT;
	}
	public void load(){
		String sql = "from DepartmentVo";
		
		deplist = personDAO.find(sql);
	}
	public String list() throws Exception{
//		String sql = "from EmployeeVo e where 1=1";
//		if(employee!=null && !employee.getEmployeeName().equals("")){
//			sql+=" and e.employeeName = '"+employee.getEmployeeName()+"'";
//		}
		DetachedCriteria cd = DetachedCriteria.forClass(EmployeeVo.class);
		cd.setFetchMode("dep", FetchMode.JOIN);
		cd.createAlias("account", "account");
		if(employee!=null){
			if(employee!=null && !employee.getEmployeeName().equals("")){
				cd.add(Restrictions.like("employeeName","小%"));
			}
			if(!sdate.equals("")&&sdate!=null && !edate.equals("")&&edate!=null){
				SimpleDateFormat simple = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
				Date s1 = simple.parse(sdate);
				Date s2 = simple.parse(edate);
				cd.add(Restrictions.between("birthday", s1, s2));
			}
			if(account.getUsername()!=null){
				cd.add(Restrictions.eq("account.username", account.getUsername()));
			}
		}
		pagelist = personDAO.Detachedcriteria(cd);
		load();
		return SUCCESS;
	}
	public String del() throws Exception {
		account = new AccountVo();
		account.setOid(employee.getOid());
		account.setEmployee(employee);
		employee.setAccount(account);
		personDAO.getdel(employee);
		return "del";
	}
	public String update() throws Exception {
		employee = (EmployeeVo)personDAO.get(EmployeeVo.class, employee.getOid());
		System.out.println(employee);
		account = employee.getAccount();
		dep = employee.getDep();
		return "update";
	}
	
	public String Pagelist()throws Exception{
		Pagehibernate nate = getPagebean(5, currenpage);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("nate", nate);
		pagelist=nate.getList();
		for (EmployeeVo e : pagelist) {
			dep = new DepartmentVo();
			dep.setDepartment(e.getDep());
		}
		load();
		return SUCCESS;
	}
	public Pagehibernate getPagebean(int pagesize , int page){
		
		Pagehibernate bean = new Pagehibernate();
		DetachedCriteria cd = DetachedCriteria.forClass(EmployeeVo.class);
		int result=personDAO.getAllRowcount(cd);
		int totalpages = bean.getTotalPages(pagesize, result);
		int curpage = bean.getCurPage(page);	
		int offset = bean.getCurrentPageOffset(pagesize, curpage);
		List<EmployeeVo> list = personDAO.QueryByPage(offset, pagesize);
		bean.setAllRows(result);
		bean.setCurrentPage(curpage);
		bean.setList(list);
		bean.setTotalPage(totalpages);
		return bean;
	}
	public AccountVo getAccount() {
		return account;
	}
	public void setAccount(AccountVo account) {
		this.account = account;
	}
	public EmployeeVo getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeVo employee) {
		this.employee = employee;
	}
	public PersonDAOimpl getPersonDAO() {
		return personDAO;
	}
	public void setPersonDAO(PersonDAOimpl personDAO) {
		this.personDAO = personDAO;
	}
	public List<EmployeeVo> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<EmployeeVo> emplist) {
		this.emplist = emplist;
	}
	public DepartmentVo getDep() {
		return dep;
	}
	public void setDep(DepartmentVo dep) {
		this.dep = dep;
	}
	public List<DepartmentVo> getDeplist() {
		return deplist;
	}
	public void setDeplist(List<DepartmentVo> deplist) {
		this.deplist = deplist;
	}
	public List<EmployeeVo> getPagelist() {
		return pagelist;
	}
	public void setPagelist(List<EmployeeVo> pagelist) {
		this.pagelist = pagelist;
	}
	public int getCurrenpage() {
		return currenpage;
	}
	public void setCurrenpage(int currenpage) {
		this.currenpage = currenpage;
	}
	
}
