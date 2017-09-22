package test;

public class te {
	private String id,name,adress;
	private double price;
	public te() {
		// TODO Auto-generated constructor stub
	}
	public te(String id,String name,double price,String adress) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.adress=adress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
