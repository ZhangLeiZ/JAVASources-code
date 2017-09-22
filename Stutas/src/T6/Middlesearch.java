package T6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Middlesearch {
	int data[];
	public Middlesearch() {
		data = new int[10];
		Random ran = new Random();
		for(int i=0;i<data.length;i++){
			data[i] = Math.abs(ran.nextInt(10000)); 
		}
		Arrays.sort(data);
		for (int k : data) {
			System.out.print(k+"\t");
		}
		System.out.println("");
	}
	public Middlesearch(int size) {
		data = new int[size];
		Random ran = new Random();
		for(int i=0;i<data.length;i++){
			data[i] = Math.abs(ran.nextInt(10000)); 
		}
		Arrays.sort(data);
		for (int k : data) {
			System.out.print(k+"\t");
		}
		System.out.println("");
	}
	public boolean Search(int key){
		int left=0;
		int right=data.length-1;
		int mid=0;
		int cnt=0;
		while(left<=right){
			mid=(left+right)/2;
			cnt++;
			System.out.println("left="+(left+1)+";mid="+mid+";right="+right+";a[mid]="+data[mid]);
			if(data[left]==key){
				System.out.println("在"+(left+1)+"个位置找到了"+key+"共找了"+cnt+"次");
                return true;
			}else if(data[right]==key){
				System.out.println("在"+(right+1)+"个位置找到了"+key+"共找了"+cnt+"次");
				return true;
			}else if(data[mid]==key){
				System.out.println("在"+(mid+1)+"个位置找到了"+key+"共找了"+cnt+"次");
				return true;
			}
			if(key>data[mid]){
				left=mid+1;
			}else if(key<data[mid]){
				right=mid-1;
			}else{
				System.out.println("在"+(mid+1)+"个位置找到了"+key+"共找了"+cnt+"次");
				return true;
			}
		}
		if(left>right){
			System.out.println("查无此数");
		}
		return false;
	}
	public static void main(String[] args) {
		Middlesearch search = new Middlesearch(1000);
		while(true){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要查找的数据");
		int key = input.nextInt();
		search.Search(key);
		}
	}
}
