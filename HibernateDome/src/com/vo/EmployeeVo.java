package com.vo;

import java.io.Serializable;
import java.util.Date;

public class EmployeeVo implements Serializable{

	private int oid;//主键
	private String employeeName;//员工姓名
	private String sex;//性别
	private int deptid;//所属部门OID
	private String jobid;//职务
	private Date birthday;//出生日期
	private String school;//毕业学校
	private String phone;//联系电话
	private String email;//邮箱
	private AccountVo account;
	private DepartmentVo dep;
	public EmployeeVo() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeVo(String employeeName,String sex,Date birthday){
		this.employeeName = employeeName;
		this.sex = sex;
		this.birthday = birthday;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AccountVo getAccount() {
		return account;
	}
	public void setAccount(AccountVo account) {
		this.account = account;
	}
	public DepartmentVo getDep() {
		return dep;
	}
	public void setDep(DepartmentVo dep) {
		this.dep = dep;
	}

}
