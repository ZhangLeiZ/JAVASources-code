package Paly;

import java.util.TreeSet;

public class UpdateStu implements Comparable<Object> {

	String name;
	long id;
	public UpdateStu(String name,long id) {
		this.name=name;
		this.id=id;
	}
	public int compareTo(Object o) {
	
	UpdateStu upstu = (UpdateStu)o;
	//如果该对象小于，等于或大于指定对象，则分别返回负整数，0或正整数。
	int result = id>upstu.id? 1:(id==upstu.id? 0:-1);
	
		return result;
	}
	public static void main(String[] args) {
		UpdateStu stu1 = new UpdateStu("粉红色",01111);
		UpdateStu stu2 = new UpdateStu("归属感色",01112);
		UpdateStu stu3 = new UpdateStu("粉撒公司",01113);
		UpdateStu stu4 = new UpdateStu("梵蒂冈色",01114);
		UpdateStu stu5 = new UpdateStu("黑进红色",01115);
		UpdateStu stu6 = new UpdateStu("大家都",01116);
		UpdateStu stu7 = new UpdateStu("粉返回色",01117);
		TreeSet<UpdateStu>tee = new TreeSet<UpdateStu>();
		
		
	}
	

}
