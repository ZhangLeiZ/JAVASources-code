package IO;

import java.io.Serializable;

public class Studnt implements Serializable{
	private int stuId;
	private String stuname;
	private String sex;
	private int age;
	public Studnt() {
		
	}
	public Studnt(int StuId,String stuname,String sex,int age){
		this.stuId=stuId;
		this.stuname = stuname;
		this.sex=sex;
		this.age=age;
	}
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "学号："+stuId+";名字:"+stuname+";性别:"+sex+";年龄:"+age;
	}

}
