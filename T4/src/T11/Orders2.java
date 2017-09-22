package T11;

public class Orders2 {

	private String orderId;
	private String orderName;
	private double price;
	private String address;
	public Orders2() {
		// TODO Auto-generated constructor stub
	}
	public Orders2(String orderId,String orderName,double price,String address) {
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
		this.address = address;
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
