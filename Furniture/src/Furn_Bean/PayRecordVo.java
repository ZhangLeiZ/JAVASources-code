package Furn_Bean;

import java.util.Date;

public class PayRecordVo {

	private int payrecordid;  
	private int userid;    
	private int homeid;  
	private int payorreturn;  
	private Date paydate;		
	private float paymoney;    
	private int paytype;			
	private String cardnum;     
	private String payer;		
	private String ordernumber;  
	private int paystatus;		
	private int isCash;
	public int getPayrecordid() {
		return payrecordid;
	}
	public void setPayrecordid(int payrecordid) {
		this.payrecordid = payrecordid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getHomeid() {
		return homeid;
	}
	public void setHomeid(int homeid) {
		this.homeid = homeid;
	}
	public int getPayorreturn() {
		return payorreturn;
	}
	public void setPayorreturn(int payorreturn) {
		this.payorreturn = payorreturn;
	}
	public Date getPaydate() {
		return paydate;
	}
	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}
	public float getPaymoney() {
		return paymoney;
	}
	public void setPaymoney(float paymoney) {
		this.paymoney = paymoney;
	}
	public int getPaytype() {
		return paytype;
	}
	public void setPaytype(int paytype) {
		this.paytype = paytype;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public int getPaystatus() {
		return paystatus;
	}
	public void setPaystatus(int paystatus) {
		this.paystatus = paystatus;
	}
	public int getIsCash() {
		return isCash;
	}
	public void setIsCash(int isCash) {
		this.isCash = isCash;
	}			
	
}
