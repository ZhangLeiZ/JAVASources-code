package com.vo;

public class AddressVo {

	private int addressid;
	private String addressinfo;
	public AddressVo() {
		// TODO Auto-generated constructor stub
	}
	public AddressVo(int addressid,String addressinfo) {
		this.addressid = addressid;
		this.addressinfo = addressinfo;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getAddressinfo() {
		return addressinfo;
	}
	public void setAddressinfo(String addressinfo) {
		this.addressinfo = addressinfo;
	}
}
