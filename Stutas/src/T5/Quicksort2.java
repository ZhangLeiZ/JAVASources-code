package T5;

public class Quicksort2 {

	int data[];
	public Quicksort2() {
		data=new int[]{4,2,1,7,11,8,16,0,3,20};
	}
	public Quicksort2(int data[]) {
		this.data=data;
	}
	public int printion(int data[],int i,int j,int size){
		int m=data[i];
		while(i<j){
			while(i<j && data[j]>m){
				j--;
			}
			if(i<j){
				data[i++]=data[j];
			}
			while(i<j && data[i]<m){
				i++;
			}
			if(i<j){
				data[j--]=data[i];
			}
		}
		data[i]=m;
		for (int k : data) {
			System.out.println(k+"\t");
		}
		
		return i;
	}
	public void Quicksorts(int data[],int left,int right,int size){
		if(left<right){
			int pos = printion(data, left, right, size);
			Quicksorts(data,left,pos-1,size);
			Quicksorts(data, pos+1, right, size);
		}
	}
	
	public static void main(String[] args) {
		Quicksort2 sort = new Quicksort2();
		sort.Quicksorts(sort.data, 0,sort.data.length-1, sort.data.length);
	}
}
