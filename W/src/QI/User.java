package QI;

public class User {
	String hongbao;
	String name;
	int age;
	String sex;
	public User(){
		hongbao="抢红包";
		name="张三";
		age=20;
		sex="男";
	}
	public User(String hongbao,String name,int age,String sex){
		this.hongbao=hongbao;
		this.name=name;
		this.age=age;
		this.sex=sex;
		
	}
	public void dispaly(){
		System.out.println("口令"+hongbao+"\tname"+name+"\tage"+age+"\tsex"+sex);
	}
	public static void main(String[] args){
		User a1= new User();
		a1.dispaly();
		User a2=new User("别逼逼","张三",19,"男");
		a2.dispaly();
		
		User p1;
		p1=new User();
		p1.hongbao="掏鸟蛋";
		p1.name="利斯";
	    p1.age=21;
	    p1.sex="女";
	    System.out.println("p1"+p1);
	    p1.dispaly();
	}
	

}
