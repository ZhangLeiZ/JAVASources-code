package T5;

import java.util.Random;

public class Quicksort {
	
	int data[];
	public Quicksort() {
		data=new int[]{8,3,11,36,14,3,9,16};
	}
	public Quicksort(int data[]){
		this.data=data;
	}
	public int peration2(int q[],int w,int e,int size){
		int m=q[w];
		while(w<e){
			while(w<e && q[e]>=m){
				e--;
			}
			if(w<e){
				q[w++]=q[e];
			}
			while(w<e && q[w]<m){
				w++;
			}
			if(w<e){
				q[e--]=q[w];
			}
		}
		q[w]=m;
		return w;
	}
	public int peration5(int a[],int i,int j,int size){
		int m=a[i];
		while(i<j){
			while(i<j && a[j]>=m){
				j--;
			}
			if(i<j){
				a[i++]=a[j];
			}
			while(i<j && a[i]<m){
				i++;
			}
			if(i<j){
				a[j--]=a[i];
			}
		}
		a[i]=m;
		return i;
	}
	public int peration4(int a[],int i,int j,int size){
		int m =a[i];
		while(i<j){
			while(i<j && a[j]>=m){
				j--;
			}
			if(i<j){
				a[i++]=a[j];
			}
			while(i<j && a[i]<m){
				i++;
			}
			if(i<j){
				a[j--]=a[i];
			}
			
		}
		a[i]=m;
		return i;
	}
	public int peration6(int a[],int i,int j,int size){
		int m=a[i];
		while(i<j){
			while(i<j && a[j]>=m){
				j--;
			}
			if(i<j){
				a[i++]=a[j];
			}
			while(i<j && a[j]<m){
				i++;
			}
			if(i<j){
				a[j--]=a[i];
			}
		}
		a[i]=m;
		return i;
	}
	public int peration3(int a[],int i,int j,int size){
		int m=a[i];
		while(i<j){
			while(i<j && a[j]<=m){
				j--;
			}
			if(i<j){
				a[i++]=a[j];
			}
			while(i<j && a[i]>m){
				i++;
			}
			if(i<j){
				a[j--]=a[i];
			}
		}
		a[i]=m;
		for (int e : a) {
			System.out.print(e+"\t");
			
		}
		System.out.println("2");
		return i;
	}
	public void opener(int a[],int left,int right,int size){
		if(left<right){
			int pos = peration3(a,left,right, size);
			opener(a,left,pos-1,size);
			opener(a,pos+1,right,size);
		}
	}
	public int peratiin7(int a[],int i,int j,int size){
		int m = a[i];
		while(i<j){
			while(i<j && a[j]>=m){
				j--;
			}
			if(i<j){
				a[i++]=a[j];
			}
			while(i<j && a[i]<m){
				i++;
			}
			if(i<j){
				a[j--]=a[i];
			}
		}
		a[i]=m;
		return i;
	}
	public int peration(int a[],int i,int j,int size){
		int m=a[i];
		while(i<j){//条件不成立时跳出循环，返回一个i值
			while(i<j && a[j]>=m){//m从右往左比较，直到左边的a[j]小于m就进入下一个if语句
				j--;
			}
			if(i<j){//左边的下标始终比右边的下标小；
				a[i++]=a[j];//交换位置，把a[j]的值赋给a[i]进入下一个循环
			}
			while(i<j && a[i]<m){//m从左往右比较，这时i的值是m的下标的后一个下标
				i++;             //比较直到a[i]大于m,跳出循环
			}
			if(i<j){
				a[j--]=a[i];//再次交换位置，把此时a[i]的值赋给原先把a[j]的值赋给a[i]的原a[j];
			}               //j--取前一个值的下标
		}
		a[i]=m;//把m的值赋给此时的a[i];
		for (int e : a) {
			System.out.print(e+"\t");
			
		}
		System.out.println("1");
		return i;
		
	}
	
	public void quicksort(int a[],int left,int right,int size){
		if(left<right){
			int pos = peration(a,left,right,size);
			quicksort(a, left, pos-1, size);
			quicksort(a, pos+1, right, size);
		}
		//else{
//			//System.out.println("結束");
//		}
	}
	public static void main(String[] args) {
		Random rand = new Random();
		int datas[]=new int[100];
		int leng=datas.length;
		for(int i=0;i<leng;i++){
			datas[i]=rand.nextInt(10000);
		}
		Quicksort quick = new Quicksort();
		//double begin = System.currentTimeMillis();
		quick.quicksort(quick.data, 0,quick.data.length-1, quick.data.length);
		//double end = System.currentTimeMillis();
		//System.out.println("時間"+(end-begin));
		//quick.opener(quick.data, 0,quick.data.length-1, quick.data.length);
	}
}
