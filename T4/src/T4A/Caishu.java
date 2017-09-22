package T4A;
/**
 * 猜数字游戏：一个类A有一个成员变量v，
 * 有一个初值100。定义一个类，对A类的成员变量v进行猜。
 * 如果大了则提示大了，小了则提示小了。等于则提示猜测成功。  
 * */
import java.util.*;
public class Caishu {
	
	public static void main(String[]args){
		
		int s1=100;
		
		Scanner in = new Scanner(System.in);
		System.out.println("猜一个数");
		int a1 = in.nextInt();
		
		if(s1<a1){
			System.out.println("猜大了");
		}
		else if(s1>a1){
			System.out.println("猜小了");
		}
		else if(s1==a1){
			System.out.println("猜测成功45");
		}
	}     
}
	 