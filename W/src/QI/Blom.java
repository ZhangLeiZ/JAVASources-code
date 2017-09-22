package QI;
import java.util.*;
public class Blom {
	int a;
	int b;
	public void dispaly(){
		System.out.println("a="+a+"b="+b);
	}
	public Blom(){
		a=10;
		b=20;
	}
	public Blom(int a,int b){
		this.a = a;
		this.b = b;
		
	}
	public int getOver(){
		return a>b?a:b;
	}
	public static void main(String[] args){
		Blom a1;
		Blom a2 = new Blom(23,14);
		a2.dispaly();
		System.out.println("最大数"+a2.getOver());
		a1= new Blom();
		a1.a=14;
		a1.b=24;
		a1.dispaly();
		System.out.println("最大数"+a1.getOver());
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入值");
		int a = in.nextInt();
		System.out.println("请输入值");
		int b = in.nextInt();
		System.out.println("最大值"+new Blom(a,b).getOver());
		
	}
}
