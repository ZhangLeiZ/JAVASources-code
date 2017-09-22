package com.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class StudentVo implements Serializable{

	private int sno;
	private String sname;
	private int sage;
	private String ssex;
	private Set<CourseVo> courseset = new HashSet<CourseVo>();
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public Set<CourseVo> getCourseset() {
		return courseset;
	}
	public void setCourseset(Set<CourseVo> courseset) {
		this.courseset = courseset;
	}
	
}
