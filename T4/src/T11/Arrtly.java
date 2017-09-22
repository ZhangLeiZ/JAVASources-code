package T11;

import java.util.ArrayList;

import java.util.Collections;

public class Arrtly {

	public static void main(String[] args) {
		ArrayList<Integer> arr =new ArrayList<Integer>();
		arr.add(3);
		arr.add(4);
		arr.add(1);
		arr.add(6);
		arr.add(2);
		arr.add(9);
		arr.add(7);
		arr.add(5);
		arr.add(8);
		arr.add(10);
		arr.add(12);
		arr.add(11);
		System.out.println("打印前的数:"+arr.toString());
	    Collections.sort(arr);
		System.out.println("打印后的数:"+arr.toString());
		Collections.max(arr);
		System.out.println("打印后的数:"+arr.hashCode());
		int i =(int)(Math.random()*arr.size());
		System.out.println("随机获取的元素是："+arr.get(i));
		//循环遍历
		for(int j=0;j<arr.size();j++){
			System.out.println(arr.get(j));
		}
		
	}
}
