package com.vo;

import java.io.Serializable;

public class AccountVo implements Serializable{

	private int oid;
	private String username;
	private  String password;
	private EmployeeVo employee;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeVo getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeVo employee) {
		this.employee = employee;
	}
}
