package com.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class DepartmentVo implements Serializable{

	private int oid;//主键
	private int parentid;//上级部门OID，0为公司
	private String deptName;//部门名称
	private String phone;//电话
	private String email;//email
	private String fax;//传真
	private int manager;//负责人OID
	private String address;//部门地址
	private String zipCode;//邮编
	private String description;//描述
	private DepartmentVo department;
	private Set<EmployeeVo> empset = new HashSet<EmployeeVo>();
	public Set<EmployeeVo> getEmpset() {
		return empset;
	}
	public void setEmpset(Set<EmployeeVo> empset) {
		this.empset = empset;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
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
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public DepartmentVo getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentVo department) {
		this.department = department;
	}

}
