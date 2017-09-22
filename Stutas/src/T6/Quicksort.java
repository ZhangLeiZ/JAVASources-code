package T6;

public class Quicksort {

	int data[];
	public Quicksort() {
		data=new int[]{2,3,1,0,4,11,-1,14,11,17};
	}
	public Quicksort(int data[]){
		this.data=data;
	}
	public int quicksort(int i,int j){
		int m=data[i];
		while(i<j){
			while(i<j && data[j]>=m){
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
			System.out.print(k+"\t");
		}
		System.out.println("");
		return i;
	}
	public void pertion (int left,int right){
		if(left<right){
			int pos=quicksort(left,right);
			pertion( left, pos-1);
			pertion(pos+1,right);
		}
	}
	public static void main(String[] args) {
		Quicksort quick = new Quicksort();
		quick.pertion(0, quick.data.length-1);
	}
}
