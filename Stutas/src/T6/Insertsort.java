package T6;

public class Insertsort {

	int data[];
	public Insertsort() {
		data=new int[]{2,3,1,0,4,11,-1,14,11,17};
	}
	public Insertsort(int data[]){
		this.data=data;
	}
	public void Insert(){
		int leng=data.length;
		int insertemp=0;
		int k=0;
		for(int i=1;i<leng;i++){
			insertemp=data[i];
			k=i-1;
			while(k>=0 && insertemp<data[k]){
				data[k+1]=data[k];
				k--;
			}
			data[k+1]=insertemp;
		}
		System.out.println("排序后");
		for (int t : data) {
			System.out.print(t+"\t");
		}
		System.out.print("");
	}
	public static void main(String[] args) {
		Insertsort insert=new Insertsort();
		insert.Insert();
	}
}
