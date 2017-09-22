package T6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Middlesearch2 {

	int data[];
	public Middlesearch2(int size) {
		data = new int[size];
		Random ran = new Random();
		for(int i=0;i<size;i++){
			data[i] =Math.abs(ran.nextInt(10000)); 
		}
		Arrays.sort(data);
		for (int s : data) {
			System.out.print(s+"\t");
		}
		System.out.println("");
	}
	public boolean Middes(int key){
		int left=0;
		int right=data.length-1;
		int mid =0;
		int cont=0;
		while(left<right){
			mid=(left+right)/2;
			cont++;
			if(key==data[left]){
				System.out.println("在位置"+(left+1)+"找到了"+key+"共找了"+cont);
				return true;
			}else if(key==data[right]){
				System.out.println("在位置"+(right+1)+"找到了"+key+"共找了"+cont);
                return true;
			}else if(key==data[mid]){
				System.out.println("在位置"+(mid+1)+"找到了"+key+"共找了"+cont);
				return true;
			}
			
			if(data[mid]>key){
				right=mid-1;
			}else if(data[mid]<key){
				left=mid+1;
			}else{
				System.out.println("在位置"+(left+1)+"找到了"+key+"共找了"+cont);
				return true;
			}
			if(left>right){
				System.out.println("没找到该数");
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Middlesearch2 mid = new Middlesearch2(100);
		while(true){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要查询的数字");
		int in = input.nextInt();
		mid.Middes(in);
		}
	}
}
