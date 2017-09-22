package Action;

import java.io.Serializable;

public class Classname implements Serializable{
	private int classid;
	private String classname;
	public Classname() {
		// TODO Auto-generated constructor stub
	}
	public Classname(int classid,String classname){
		this.classid=classid;
		this.classname=classname;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
}
