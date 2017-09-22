package T5;

import javax.xml.crypto.Data;


public class Selectionsort {

	public Selectionsort() {
	}
	public void setSelectionsort(int data[]) {
		int temp;
		for(int i=0;i<data.length;i++){
			int index = getminindex(data, i);
			if(index!=i){
				temp=data[i];
				data[i]=data[index];
				data[index]=temp;
			}
		}
		for (int i : data) {
			System.out.println(i+"\t");
		}
	}
	private int getminindex(int data[],int begin){
		int min= data[begin];
		int index = begin;
		for(int i=index;i<data.length;i++){
			if(data[i]<min){
				min=data[i];
				index=i;
			}
		}
		return index;
	}
	private void selectindex(int data[]){
		int temp=0;
		for(int j=0;j<data.length;j++){
		int index=getindex(data,j);
		if(j!=index){
			temp=data[j];
			data[j]=data[index];
			data[j]=temp;
	     	}
		}
	}
	private int getindex(int data[],int begin){
		int index=begin;
		int min=data[begin];
		for(int i=index;i<data.length;i++){
			if(data[i]<min){
				min=data[i];
				index=i;
				break;
			}
		}             
		return index;
	}
	public static void main(String[] args) {
		int data[] = new int[]{8,-1,11,36,14,3,9,16};
		Selectionsort select = new Selectionsort();
		select.setSelectionsort(data);
	}
}
