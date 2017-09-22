package com.vo;

import java.io.Serializable;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class StudentVo implements Serializable,InitializingBean,BeanNameAware{

	private int sno;
	private String sname;
	private String ssex;
	private int sage;
	private String beanname;
	public StudentVo() {
		System.out.println("Spring实例化Bean-------------\n");
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		System.out.println("Spring实行依赖注入关系sno="+this.sno);
		this.sno = sno;
	}
	public String getSname() {
		System.out.println("Spring实行依赖关系sname="+this.sname);
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("Spring实行依赖注入关系sname="+this.sname);
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		System.out.println("Spring实行依赖注入关系ssex="+this.ssex);
		this.ssex = ssex;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		System.out.println("Spring实行依赖注入关系sage="+this.sage);
		this.sage = sage;
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println(beanname+"初始化，调用afterPropertiesSet()函数");
	}
	public void setBeanName(String beanname) {
		this.beanname=beanname;
		System.out.println("回调setBeanName()方法，获得beanname"+beanname);
	}
	public String toString() {
		return "name"+sname+"sage"+sage+"ssex"+ssex;
	}
}
