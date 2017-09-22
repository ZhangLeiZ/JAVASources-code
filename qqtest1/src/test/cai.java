package test;

import java.util.Date;
import java.util.Scanner;

public class cai {
	public static void main(String[] args) {
		int cout=0;
		Scanner can=new Scanner(System.in);
		int b=(int)(Math.random()*100);
		Date d=new Date();
		for(;;){
			int a=can.nextInt();
			cout++;
			if(a<b){
				System.out.println("你猜的小了，再猜");
			}
			if(a>b){
				System.out.println("你猜的大了，再猜");
			}
			else if(a==b){
				Date dd=new Date();
				long time2=dd.getTime()-d.getTime();
				
				System.out.println("你猜中了，共猜了"+cout+"次,花费了"+time2/1000+"分钟");
				break;
			}
		}
	}
}
