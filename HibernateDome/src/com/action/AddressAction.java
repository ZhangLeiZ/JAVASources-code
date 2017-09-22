package com.action;

import HibernateDAO.PersonDAOimpl;

import com.opensymphony.xwork2.ActionSupport;
import com.vo.AddressVo;
import com.vo.UserVo;

public class AddressAction extends ActionSupport{

	private UserVo user;
	private AddressVo address;
	private PersonDAOimpl impl;
	public PersonDAOimpl getImpl() {
		return impl;
	}
	public void setImpl(PersonDAOimpl impl) {
		this.impl = impl;
	}
	public AddressAction() {
		impl = new PersonDAOimpl();
	}
	@Override
	public String execute() throws Exception {
		 
		impl.save(user);
		impl.save(address);
		return super.execute();
	}

	public UserVo getUser() {
		return user;
	}

	public void setUser(UserVo user) {
		this.user = user;
	}

	public AddressVo getAddress() {
		return address;
	}

	public void setAddress(AddressVo address) {
		this.address = address;
	}
}
