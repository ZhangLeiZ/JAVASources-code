package T11;

public class Orders {

	private String orderID;
	private String ordername;
	private double ordprice;
	private String ordaddress;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	public Orders(String orderID,String ordername,double ordprice,String ordaddress) {
		this.orderID=orderID;
		this.ordername=ordername;
		this.ordprice=ordprice;
		this.ordaddress=ordaddress;
	}
	
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public double getOrdprice() {
		return ordprice;
	}
	public void setOrdprice(double ordprice) {
		this.ordprice = ordprice;
	}
	public String getOrdaddress() {
		return ordaddress;
	}
	public void setOrdaddress(String ordaddress) {
		this.ordaddress = ordaddress;
	}
	
}
