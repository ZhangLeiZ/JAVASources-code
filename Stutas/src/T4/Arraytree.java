package T4;

import java.sql.Date;

public class Arraytree {

	int data[];
	int size;
	public Arraytree(int dat) {
		size=33;
		data =new int[size];
		data[1]=dat;
	}
	public Arraytree(int size,int dat) {
		this.size=size;
		data = new int[this.size];
		data[1]=dat;
	}
	public void pushtree(int dat){
		int i=1;
		while(true){
			if(data[i]>dat){
				i=i*2;
				if(data[i]==0){
					data[i]=dat;
					break;
				}
			}else{
				i=i*2+1;
				if(data[i]==0){
					data[i]=dat;
					break;
				}
			}
		}
	}
	public void dispaly(){
		for(int i=0;i<size;i++){
			System.out.println("data["+i+"]"+data[i]);
		}
	}
	public int max(){
		int max=0;
		for(int i=0;i<size;i++){
			if(max<data[i]){
			max=data[i];	
			}
		}
		return max;
	}
	public int min(){
		int min=0;
		for(int i=0;i<size;i++){
			if(min>data[i]){
			min=data[i];	
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Arraytree tree = new Arraytree(10);
		tree.pushtree(8);
		tree.pushtree(7);
		tree.pushtree(20);
		tree.pushtree(90);
		tree.pushtree(100);
		tree.pushtree(3);
		tree.pushtree(6);
		tree.pushtree(1);
		tree.pushtree(-10);
		tree.dispaly();
		System.out.println("最大数="+tree.max());
		System.out.println("最小数="+tree.min());

	}
}
