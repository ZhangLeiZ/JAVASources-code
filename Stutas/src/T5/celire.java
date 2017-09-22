package T5;

import java.util.Random;

public class celire {

	public static void main(String[] args) {
		Random rand = new Random();
		int datas[]=new int[1000];
		int leng=datas.length;
		for(int i=0;i<leng;i++){
			datas[i]=rand.nextInt(10000);
		}
//		Quicksort quick = new Quicksort();
//		double begin = System.currentTimeMillis();
//		//quick.quicksort(datas, 0,leng-1, leng);
//		double end = System.currentTimeMillis();
//		System.out.println("時間"+(end-begin));
		
		Quicksort quick = new Quicksort();
		double begin = System.currentTimeMillis();
		quick.peration(datas, 0,leng-1, leng);
		double end = System.currentTimeMillis();
		System.out.println("時間"+(end-begin)+"毫秒");
		
		Shellsort sort = new  Shellsort();
		double begin1 = System.currentTimeMillis();
		sort.shellsort();
		double end1 = System.currentTimeMillis();
		System.out.println("時間"+(end1-begin1)+"毫秒");
	}
}
