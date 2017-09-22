package com.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MajorVo implements Serializable {

	private int majorid;
	private String majorname;
	private Set<ClassescVo> classlit = new HashSet<ClassescVo>();
	public int getMajorid() {
		return majorid;
	}
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}
	public String getMajorname() {
		return majorname;
	}
	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}
	public Set<ClassescVo> getClasslit() {
		return classlit;
	}
	public void setClasslit(Set<ClassescVo> classlit) {
		this.classlit = classlit;
	}
	
}
