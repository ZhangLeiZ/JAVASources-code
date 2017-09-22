package Action;

import java.io.Serializable;

public class Nation implements Serializable{

	private int nationid;
	private String nation;
	public Nation() {
		// TODO Auto-generated constructor stub
	}
	public Nation(int nationid,String nation){
		this.nationid=nationid;
		this.nation=nation;
	}
	public int getNationid() {
		return nationid;
	}
	public void setNationid(int nationid) {
		this.nationid = nationid;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
