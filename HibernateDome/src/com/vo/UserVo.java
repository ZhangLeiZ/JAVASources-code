package com.vo;

import java.util.HashSet;
import java.util.Set;

public class UserVo {

	private int userid;
	private String name;
	private String password;
	private Set<AddressVo> address = new HashSet<AddressVo>();
	public UserVo() {
		
	}
	public UserVo(int userid,String name,String password) {
		this.userid = userid;
		this.name = name;
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<AddressVo> getAddress() {
		return address;
	}
	public void setAddress(Set<AddressVo> address) {
		this.address = address;
	}
	
}
