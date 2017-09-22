package com.ajaxdemo;

public class UserVo {
	private int stuno; 
	private String name;
	private String password;
	private int age;
	private String sex;
	private String cadeid;
	private String classname;
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public String getCadeid() {
		return cadeid;
	}
	public void setCadeid(String cadeid) {
		this.cadeid = cadeid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "姓名="+this.name+"年龄="+this.age+"性别="+this.sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
