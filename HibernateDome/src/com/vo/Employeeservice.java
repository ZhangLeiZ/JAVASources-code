package com.vo;

import java.util.List;

import HibernateDAO.IBace;

public class Employeeservice implements IBace{

	public List Bydatelist(Object obj) {
		System.out.println("Employeeservice Bydatelist");
		return null;
	}

	public void add(Object obj) {
		System.out.println("Employeeservice add");
		
	}

	public void del(Object obj) {
		System.out.println("Employeeservice del");
		
	}

	public void update(Object obj) {
		System.out.println("Employeeservice UPDATE");		
	}

}
