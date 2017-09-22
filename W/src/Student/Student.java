package Student;

import java.io.Serializable;

/**
 * 凡是要写到对象流中的对象，定义类时必须系列化
 * 实现接口：Serializable
 * 
 * */
public class Student implements Serializable{

	private int studId;
	private String studName;
	private String sex;
	private int age;
	public Student() {
		
	}
	public Student(int studId,String studName,String sex,int age) {
		this.studId = studId;
		this.studName = studName;
		this.sex = sex;
		this.age =age;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
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
		return "studid="+studId +";studname="+studName +";sex="+sex+";age="+age;
	}
}
