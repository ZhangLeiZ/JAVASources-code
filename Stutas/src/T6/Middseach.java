package T6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Middseach {

	int data[];
	public Middseach() {
		data=new int[10];
		Random ran = new Random();
		for(int i=0;i<data.length;i++){
			data[i]=Math.abs(ran.nextInt(10000));
		}
		Arrays.sort(data);
		System.out.println("排序后的数");
		for (int k:data) {
			System.out.print(k+"\t");
		}
		System.out.println("");
	}
	public Middseach(int size){
		data = new int[size];
		Random ran = new Random();
		for(int i=0;i<data.length;i++){
			data[i]=Math.abs(ran.nextInt(10000));
		}
		System.out.println("未排序的数");
		Arrays.sort(data);
		System.out.println("排序后的数");
		for (int k:data) {
			System.out.print(k+"\t");
		}
		System.out.println("");
	}
	public void Serch(int key){
		int left=0;
		int right=data.length-1;
		int mid=0;
		int count=0;
		while(left<=right){
			mid=(left+right)/2;
			count++;
			System.out.println("left"+left);
			System.out.println("right"+right);
			System.out.println("mid"+mid);
			if(data[left]==key){
				System.out.println("在"+(left+1)+"个位置找到了"+key+"共找了"+count+"次");
				return;
			}else if(data[mid]==key){
				System.out.println("在"+(mid+1)+"个位置找到了"+key+"共找了"+count+"次");
				return;
			}else if(data[right]==key){
				System.out.println("在"+(right+1)+"个位置找到了"+key+"共找了"+count+"次");
				return;
			}
			if(key>data[mid]){
				left=mid+1;
			}else if(key<data[mid]){
				right=mid-1;
			}else{
				System.out.println("在"+(mid+1)+"个位置找到了"+key+"共找了"+count+"次");
				return;
			}
		}
			System.out.println("查无此数");
	}
	public static void main(String[] args) {
		Middseach midd = new Middseach();
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.println("请输入你要查找的数：");
			int in = input.nextInt();
			midd.Serch(in);
		}
	}
}
