package T5;


public class Insertsort {

	public void Insert(int data[]){
		int insertemp=0;
		int j;
		for(int i=1;i<data.length;i++){//从第二个元素开始循环
			insertemp=data[i];//用来保存data[i]的值
			j=i-1;//i的前一个元素的下标
			while(j>=0 && insertemp<data[j]){//判断data[i]的值是否小于data[j]的值，大于或等于0时进入循环
				data[j+1]=data[j];//进入循环将data[j]的值赋给data[i]交换位置，若data[i]前面的值始终小于data[j]
				                  //insertemp保持不变，与data[j]循环比较，直到第一个元素或者是data[i]大于data[j]，退出循环;
				j--;//再次往前找，
			}
			data[j+1]=insertemp;//把原先data[i]的值赋给data[j],while循环内减了1，此时加回=j+1;
		}
		for (int i : data) {
			System.out.println(i+"\t");
		}
	}
	public void Insert2(int data[]){
		int insertemp=0;
		int j=0;
		for(int i=1;i<data.length;i++){
			insertemp=data[1];
			j=i-1;
			while(j>=0 && insertemp<data[j]){
				data[j+1]=data[j];
				j--;
			}
			data[j+1]=insertemp;
		}
	}
	public void Insert3(int data[]){
		int inserttemp=0;
		int j=0;
		for(int i=1;i<data.length;i++){
			inserttemp=data[i];
			j=j-i;
			while(j>=0 && inserttemp<data[j]){
				data[j+1]=data[j];
				j--;
			}
			data[j+1]=inserttemp;
		}
		
	}
	public void Insert4(int data[]){
		int insertemp=0;
		int j=0;
		for(int i=1;i<data.length;i++){
			 insertemp=data[i];
			j=j-i;
			while(j>=0 && insertemp<data[j]){
				data[j+1]=data[j];
				j--;
			}
			data[j+1]=insertemp;
		}
	}
	public static void main(String[] args) {
		int data[]=new int[]{8,-1,11,36,14,3,9,16};
		Insertsort insert = new Insertsort();
		insert.Insert(data);
	}
}
