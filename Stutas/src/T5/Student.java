package T5;

import java.io.Serializable;

		/*
		 * 1.实现链表的如下操作：
		创建一个学生类；
		创建节点类，把学生类当做节点的数据域
		创建链表类；
		实现新增节点功能；
		删除节点功能；
		遍历节点功能；
		创建测试类，测试链表的功能；
		
		 * **/
public class Student implements Serializable{
	private int id;
	private String name;
	private int age;
	private String classes;
	public Student(int id,String name,int age,String classes) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.classes=classes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	@Override
	public String toString() {
		return "编号："+this.id+"姓名："+this.name+"年龄："+this.age+"班级："+this.classes;
	}

}
