package T4A;
/**
 * 定义名为Number的类，其中有两个整型数据成员n1和n2，应声明为私有。编写构造方法，赋予n1和n2初始值，
 * 再为该类定义加（addition）、减（subtration）、乘（multiplication）、除（division）等公有成员方法，
 * 分别对两个成员变量执行加、减、乘、除的运算。 
在main方法中创建Number类的对象，调用各个方法，并显示计算结果。  
 * */
public class Number {

	private int n1;
	private int n2;
	
	public Number(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	public void dispaly(){
		System.out.println("n1="+n1+"\n"+"n2="+n2);
	}
	
	
	private void addition(int n1,int n2) {
		this.n1 += n1;
		this.n2 +=n2;
	}
	
	private void subtration(int n2) {
		this.n2 -= n2;
		
	}
	private void multiplication(int n1) {
		this.n1 *= n1;
	}
	private void division(int n2) {
		this.n2 /= n2;
	}
	public static void main(String[] args){
		Number number=new Number(4,6);
		number.dispaly();
		number.addition(4,3);
		number.dispaly();
	}
	
	
	
	
	
	
}
