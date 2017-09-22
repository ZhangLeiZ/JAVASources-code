package com.vo;

import java.io.Serializable;

public class ClassescVo implements Serializable {
	private int classid;
	private String classname;
	private int majorid;
	private MajorVo majorVo;
	public MajorVo getMajorVo() {
		return majorVo;
	}
	public void setMajorVo(MajorVo majorVo) {
		this.majorVo = majorVo;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getMajorid() {
		return majorid;
	}
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}
}
