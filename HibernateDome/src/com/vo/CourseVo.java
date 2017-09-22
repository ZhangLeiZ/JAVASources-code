package com.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class CourseVo implements Serializable{

	private int courseid;
	private String coursename;
	private int creait;
	private Set<StudentVo> studset = new HashSet<StudentVo>();
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCreait() {
		return creait;
	}
	public void setCreait(int creait) {
		this.creait = creait;
	}
	public Set<StudentVo> getStudset() {
		return studset;
	}
	public void setStudset(Set<StudentVo> studset) {
		this.studset = studset;
	}
	
}
