package T4A;
/**
 * 编写Java程序，用于显示人的姓名和年龄。 定义一个人类（Person），
 * 该类中应该有两个私有属性，姓名（name）和年龄（age）。定义构造方法，
 * 用来初始化数据成员。再定义显示（display）方法，将姓名和年龄打印出来。
 */
 
public class Person {

	private String name;
	private int age;
	
	public Person(){
		name="张力";
		age=14;
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	public void dispaly(){
		System.out.println("姓名:"+name+"\n"+"年龄:"+age);
	}
	public static void main(String[] args){
		Person person = new Person("利斯",19);
		person.dispaly();
	}
}
