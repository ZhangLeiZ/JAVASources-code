package QI;

public class Student {
	String name; 
	int age;
	String sex;
	/*
	 * 构造函数:
	 * 	1.函数名称与类名同名
	 * 	2.函数无返回值，也不能写void关键字；也不能写return语句；
	 * 特点:
	 * 	1.对类进行初始化；
	 * 	2.构造函数是由系统自动调用;
	 * 	3.构造函数是类中运行的第一个函数
	 * 	4.任何类都一定有构造函数，如果没有定义构造函数，系统会自动生成一个默认构造函数;
	 * 	5.构造函数可以重载
	 * */
	//构造函数：无参数的构造函数也叫做默认构造函数
	public Student() {
		name="张三";
		age=0;
		sex="男";
		System.out.println("正在运行Student类的构造函数1....");
	}
	public Student(String name,int age,String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		System.out.println("正在运行Student类的构造函数2....");
	}
	public Student(String name) {
		this.name = name;
		System.out.println("正在运行Student类的构造函数3....");
	}
	public void display(){
		
		System.out.println("name="+name+";age="+age+";sex="+sex);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student("李四",20,"男");
		s2.display();
		Student s3 = new Student("小丽");
		s3.display();
		//构造函数不存在
//		Student s4 = new Student("小s丽",20);
//		s4.display();
	}
}
